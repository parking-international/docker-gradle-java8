package co.net.parking.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import co.net.parking.dto.EntradaDTO;
import co.net.parking.dto.ListaEntradasParqueaderoDTO;
import co.net.parking.dto.OcupacionParqueaderoDTO;
import co.net.parking.dto.RespuestaEntradaPlacaDTO;
import co.net.parking.entities.EntradaV126;
import co.net.parking.entities.IngresoBicicletas;
import co.net.parking.util.Util;

@Stateless
public class EntradaBean {

	@PersistenceContext(unitName = Util.UP_TRANSACCION_PARKING)
	private EntityManager em;

	private ErrorLogBean errorLogBean = new ErrorLogBean();

	public RespuestaEntradaPlacaDTO insertaEntrada(EntradaDTO entrada) {

		RespuestaEntradaPlacaDTO respuesta = new RespuestaEntradaPlacaDTO();
		respuesta.setEstado(false);
		respuesta.setMensaje("ERROR");

		try {
//			if (this.isBicicleta(entrada.getPlaca())) {
//				respuesta.setEstado(false);
//				respuesta.setMensaje("BICI");
//
//			} else {
			if (this.seguridad(entrada.getPlaca())) {
				respuesta.setEstado(false);
				respuesta.setMensaje("SEGURIDAD");
			} else {
				if (this.existeEntradaPlaca(entrada)) {
					respuesta.setEstado(false);
					respuesta.setMensaje("EXISTE");
				} else {
					if(entrada.getTipoVehiculo()==1 || entrada.getTipoVehiculo()==2) {
					em.persist(this.getEntrada(entrada));
					}
					if (entrada.getTipoVehiculo() == 100) {
						em.persist(this.getEntrada(entrada));
						if (entrada.getCedula() != null && entrada.getNombre() != null) {
							em.persist(this.getIngresoBicicletas(entrada));
						}else {
							respuesta.setEstado(false);
							respuesta.setMensaje("BICI");
							return respuesta;
						}
					}

					respuesta.setEstado(true);
					respuesta.setMensaje("OK");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	public EntradaV126 getEntrada(EntradaDTO entrada) {
		EntradaV126 e126 = new EntradaV126();
		e126.setBarcode(entrada.getBarcode());
		e126.setCodPark(entrada.getCodPark());
		e126.setCodTerminal(entrada.getCodTerminal());
		e126.setContrato(0);
		e126.setEstado((short) entrada.getEstado());
		e126.setFechaHora(entrada.getFechaHora());
		e126.setHoraFinal("00:00:00");
		e126.setHoraInicial("00:00:00");
		e126.setIdEntrada(this.idEntrada());
		e126.setMensual("0");
		e126.setPerdido((short) 0);
		e126.setPlaca(entrada.getPlaca());
		e126.setTiempoInicial(0l);
		e126.setTipoVehiculo((short) entrada.getTipoVehiculo());
		e126.setTransmitido((short) 1);
		e126.setValet((short) 0);
		return e126;
	}

	public IngresoBicicletas getIngresoBicicletas(EntradaDTO entrada) {
		IngresoBicicletas bici = new IngresoBicicletas();
		bici.setPlacaBicicleta(entrada.getPlaca());
		bici.setCedula(entrada.getCedula());
		bici.setNombre(entrada.getNombre());
		bici.setFechaIngreso(entrada.getFechaHora());
		bici.setCodTerminal(entrada.getCodTerminal());
		bici.setFacturaTransaccion(null);
		bici.setTransmitido(1);

		return bici;
	}

	public String idEntrada() {
		java.util.UUID uuid = java.util.UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		return randomUUIDString;
	}

	public boolean existeEntradaPlaca(EntradaDTO entry) {
		List<EntradaV126> entrada = new ArrayList<EntradaV126>();
		boolean var = true;
		try {
			entrada = em.createNamedQuery("EntradaV126.findPlaca", EntradaV126.class)
					.setParameter("placa", entry.getPlaca()).setParameter("codPark", entry.getCodPark())
					.getResultList();
			if (!entrada.isEmpty()) {
				var = true;
			} else {
				var = false;
			}
		} catch (NoResultException e) {
		} catch (Exception ex) {
		}

		return var;
	}

	public boolean seguridad(String placa) {
		boolean var = false;
		try {
			String query = " select id from seguridad where estado=1 and  placa='" + placa + "'";
			Object resultado = (Object) em.createNativeQuery(query).getResultList();
			if (resultado != null && !resultado.toString().equals("[]")) {
				var = true;
			}
		} catch (NoResultException e) {
			var = true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return var;
	}

	public boolean isBicicleta(String placa) {
		boolean var = false;
		try {
			if (placa.contains("BICI")) {
				var = true;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return var;
	}

	public List<ListaEntradasParqueaderoDTO> consultaEntradasParqueadero(String codPark) {
		List<ListaEntradasParqueaderoDTO> listaEntradas = new ArrayList<ListaEntradasParqueaderoDTO>();
		short estado = 1;
		List<EntradaV126> listaEntradaV126 = new ArrayList<EntradaV126>();
		listaEntradaV126 = em.createNamedQuery("EntradaV126.findCodPark", EntradaV126.class)
				.setParameter("codPark", codPark).setParameter("estado", estado).getResultList();
		if (!listaEntradaV126.isEmpty()) {
			for (EntradaV126 entrada : listaEntradaV126) {
				ListaEntradasParqueaderoDTO entradasParqueadero = new ListaEntradasParqueaderoDTO();
				entradasParqueadero.setPlaca(entrada.getPlaca());
				entradasParqueadero.setFechaEntrada(entrada.getFechaHora());
				entradasParqueadero.setTipoVehiculo(entrada.getTipoVehiculo());
				listaEntradas.add(entradasParqueadero);

			}
		}
		return listaEntradas;

	}

	public OcupacionParqueaderoDTO consultarCuposParqueadero(String codPark) {
		OcupacionParqueaderoDTO ocupacion = new OcupacionParqueaderoDTO();
		int ocupacionMoto = 0;
		int ocupacionCarro = 0;
		int ocupacionBicicleta = 0;
		int totalCupos = 0;
		int ocupados = 0;
		int disponibles = 0;

		try {
			String query = " select plazas_carro,plazas_moto,plazas_bicicleta from parqueadero" + " where cod_park='"
					+ codPark + "'";

			Object[] resultado = (Object[]) em.createNativeQuery(query).getSingleResult();
			if (resultado != null) {
				if (resultado[0] == null) {
					resultado[0] = 0;
				}
				if (resultado[1] == null) {
					resultado[1] = 0;
				}
				if (resultado[2] == null) {
					resultado[2] = 0;
				}
				ocupacion.setPlazasCarro(Integer.parseInt(resultado[0].toString()));
				ocupacion.setPlazasMoto(Integer.parseInt(resultado[1].toString()));
				ocupacion.setPlazasBici(Integer.parseInt(resultado[2].toString()));
			}
		} catch (NoResultException e) {
			ocupacion = null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		List<ListaEntradasParqueaderoDTO> listaEntradas = this.consultaEntradasParqueadero(codPark);
		if (listaEntradas != null) {
			for (ListaEntradasParqueaderoDTO listaEntradasParqueaderoDTO : listaEntradas) {
				if (listaEntradasParqueaderoDTO.getTipoVehiculo() == 1) {
					ocupacionCarro += 1;

				} else if (listaEntradasParqueaderoDTO.getTipoVehiculo() == 2) {
					ocupacionMoto += 1;
				} else if (listaEntradasParqueaderoDTO.getTipoVehiculo() == 100) {
					ocupacionBicicleta += 1;
				}
			}
		}
		ocupacion.setOcupacionCarro(ocupacionCarro);
		ocupacion.setOcupacionMoto(ocupacionMoto);
		ocupacion.setOcupacionBicicleta(ocupacionBicicleta);

		totalCupos = ocupacion.getPlazasCarro() + ocupacion.getPlazasMoto() + ocupacion.getPlazasBici();
		ocupados = ocupacionCarro + ocupacionMoto + ocupacionBicicleta;
		disponibles = totalCupos - ocupados;
		if (disponibles < 0) {
			disponibles = 0;
		}
		ocupacion.setTotalCupos(totalCupos);
		ocupacion.setOcupados(ocupados);
		ocupacion.setDisponibles(disponibles);
		return ocupacion;

	}

}
