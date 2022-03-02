package co.net.parking.beans;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.net.beparking.entities.BpCliente;
import co.net.beparking.entities.BpExtractoPunto;
import co.net.parking.dto.CierreDiaDTO;

import co.net.parking.dto.ComprobantePerdidoDTO;
import co.net.parking.dto.DataComprobantePerdidoDTO;
import co.net.parking.dto.RespuestaGeneralDTO;

import co.net.parking.dto.ClienteBeparkingDTO;
import co.net.parking.dto.ExtractoBeparkingDTO;

import co.net.parking.dto.RespuestaTransaccionBahiasDTO;
import co.net.parking.dto.SumatoriaTurnosDTO;
import co.net.parking.dto.TransaccionComprobantePerdidoDTO;
import co.net.parking.dto.TransaccionDTO;
import co.net.parking.entities.CierreDia;
import co.net.parking.entities.CierreTurno;
import co.net.parking.entities.EntradaV126;
import co.net.parking.entities.IngresoBicicletas;
import co.net.parking.entities.InicioDia;
import co.net.parking.entities.InicioTurno;
import co.net.parking.entities.RangoFactura2;
import co.net.parking.entities.RegCompPerdido;
import co.net.parking.entities.ReimpresionComprobante;
import co.net.parking.entities.TransDatafono;
import co.net.parking.entities.TransV130;
import co.net.parking.util.Util;

@Stateless
public class TransaccionBean {



	@PersistenceContext(unitName = Util.UP_TRANSACCION_PARKING)
	private EntityManager em;
	
	@PersistenceContext(unitName = Util.UP_BEPARKING_BP)
	private EntityManager em2;

	private ErrorLogBean errorLogBean=new ErrorLogBean();
	
 
	
	private static final String ACTIVO = "ACTIVO";
	private static final String PENDIENTE = "PENDIENTE";
	private static final String INACTIVO = "INACTIVO";



	

public int getTotalMinutosDiferencia(Date FechaIni,Date FechaFin){
	int diffMinutes=0;

	// Crear 2 instancias de Calendar
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();

	cal1.setTime(FechaIni);
	cal2.setTime(FechaFin);

	// conseguir la representacion de la fecha en milisegundos
	long milis1 = cal1.getTimeInMillis();
	long milis2 = cal2.getTimeInMillis();

	// calcular la diferencia en milisengundos
	long diff = milis2 - milis1;

	// calcular la diferencia en minutos
	diffMinutes = (int)Math.ceil(diff/1000.0/60.0);

	return diffMinutes;
}

public Date toDateLong2(String fecha){
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try {
        return (Date) format.parse(fecha);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return null;
}

public UUID get_id_transaccionUUID() {
	java.util.UUID uuid = java.util.UUID.randomUUID();
	return uuid;
}



	public InicioTurno consultarInicioTurno(String codTerminal, String idTurno) {
		InicioTurno inicioTurno = new InicioTurno();
		try {
			List<InicioTurno> listaInicioTurno = em.createNamedQuery("ConsultarInicioTurno", InicioTurno.class)
					.setParameter("idInicioTurno", Integer.parseInt(idTurno)).setParameter("codTerminal", codTerminal).getResultList();
			if (!listaInicioTurno.isEmpty()) {
				for (InicioTurno inicioTur : listaInicioTurno) {
					inicioTurno = inicioTur;
				}
				return inicioTurno;
			} else {
				return null;
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return null;
		}

	}
	
	public int primeraFacturaTurno(String codTerminal, String idTurno) {
		int primeraFactura=0;
		try {
			List<TransV130> listaTransaccion = em.createNamedQuery("PrimeraFacturaIdTurno",TransV130.class).setParameter("codTerminal", codTerminal).setParameter("idInicioTurno", Integer.parseInt(idTurno)).setMaxResults(1).getResultList();
			if (!listaTransaccion.isEmpty()) {
				for (TransV130 transV130 : listaTransaccion) {
					primeraFactura = transV130.getNumFactura();
				}
				return primeraFactura;
			} else {
				return 0;
			}
		
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return 0;
		}

	}

	public int ultimaFacturaTurno(String codTerminal, String idTurno) {
		int primeraFactura=0;
		try {
			List<TransV130> listaTransaccion = em.createNamedQuery("UltimaFacturaIdTurno",TransV130.class).setParameter("codTerminal", codTerminal).setParameter("idInicioTurno", Integer.parseInt(idTurno)).setMaxResults(1).getResultList();
			if (!listaTransaccion.isEmpty()) {
				for (TransV130 transV130 : listaTransaccion) {
					primeraFactura = transV130.getNumFactura();
				}
				return primeraFactura;
			} else {
				return 0;
			}
		
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return 0;
		}

	}
	
	public int calculaTotalEfectivoCierreTurno(String codTerminal, String idTurno) {
		int valorEfectivo=0;
		try {
			List<TransV130> listaTransaccion = em.createNamedQuery("TotalEfectivoCierreTurno",TransV130.class).setParameter("codTerminal", codTerminal).setParameter("idInicioTurno", Integer.parseInt(idTurno)).getResultList();
			if (!listaTransaccion.isEmpty()) {
				for (TransV130 transV130 : listaTransaccion) {
					valorEfectivo = valorEfectivo+ transV130.getValorEf();
				}
				return valorEfectivo;
			} else {
				return 0;
			}
		
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return 0;
		}

	}
	
	public int totalTransaccionesTurno(String codTerminal, String idTurno) {
		int totalTransaciones=0;
		try {
			List<TransV130> listaTransaccion = em.createNamedQuery("TotalEfectivoCierreTurno",TransV130.class).setParameter("codTerminal", codTerminal).setParameter("idInicioTurno", Integer.parseInt(idTurno)).getResultList();
			if (!listaTransaccion.isEmpty()) {
				for (TransV130 transV130 : listaTransaccion) {
					totalTransaciones +=1; 
				}
				return totalTransaciones;
			} else {
				return 0;
			}
		
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return 0;
		}

	}
	
	public int actualizaInicioTurno(String idInicioTurno, String codTerminal,String fechaFinal) {
		int actualizaInicioTurno=0;
		try {
				String updateInicioTurno =
					"UPDATE InicioTurno set estado =0, fechaFinal=:fechaFinal WHERE codTerminal=:codTerminal AND idInicioTurno=:idInicioTurno";
				 actualizaInicioTurno =	em.createQuery(updateInicioTurno).setParameter("fechaFinal",fechaFinal)
						.setParameter("codTerminal",codTerminal).setParameter("idInicioTurno",Integer.parseInt(idInicioTurno)).executeUpdate();
			return actualizaInicioTurno;
				
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return actualizaInicioTurno;
		}

	}
	
	public int turnoCuadrado(int total, int reportado) {
		int cuadrado=total-reportado;
		return cuadrado;
		}
		
	
	public CierreDia insertaCierraDia(CierreDiaDTO cierreDiaDTO) throws Exception  {
		try {
			CierreDia cierreDia=new  CierreDia();
			cierreDia.setCodTerminal(cierreDiaDTO.getCodTerminal().toUpperCase());
			cierreDia.setCodPark(cierreDiaDTO.getCodPark());
			cierreDia.setCodEmpleado(cierreDiaDTO.getCodEmpleado());
		    InicioTurno inicioTurnoFinal=this.consultarInicioTurno(cierreDiaDTO.getCodTerminal(), cierreDiaDTO.getIdInicioTurno());
		    InicioTurno inicioTurnoInicial=this.consultarInicioTurnoInicial(cierreDiaDTO.getCodTerminal(),String.valueOf(inicioTurnoFinal.getId_inicio_dia()));
			cierreDia.setFechaInicial(inicioTurnoInicial.getFechaIncial());
			Date now=new Date();
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String fechaFinal = format1.format(now);
			cierreDia.setFechaFinal(fechaFinal);
			cierreDia.setFechaMda("NULL");
			cierreDia.setTiempoInicial(0);
			cierreDia.setTiempoFinal(0);
			cierreDia.setTiempoTotal(0);
			int primeraFactura=this.primeraFacturaCierreDia(cierreDiaDTO.getCodTerminal(),String.valueOf(inicioTurnoInicial.getIdInicioTurno()));
			int ultimaFactura=this.ultimaFacturaCierreDia(cierreDiaDTO.getCodTerminal(), String.valueOf(inicioTurnoFinal.getIdInicioTurno()));
			cierreDia.setFacturaIni(String.valueOf(primeraFactura));
			cierreDia.setFacturaFin(String.valueOf(ultimaFactura));
			cierreDia.setReciboCajaIni(0);
			cierreDia.setReciboCajaFin(0);
			SumatoriaTurnosDTO sumatoriaTurnos=this.sumaTurnosDia(cierreDiaDTO.getCodTerminal(),String.valueOf(inicioTurnoFinal.getId_inicio_dia())); 
			if(sumatoriaTurnos!=null&&sumatoriaTurnos.getTotalTransacciones()!=null) {
			cierreDia.setTransacciones(Integer.parseInt(sumatoriaTurnos.getTotalTransacciones()));
			cierreDia.setTurnos(Short.parseShort(sumatoriaTurnos.getTotalTurnos()));
			cierreDia.setTotalEfectivo(Integer.parseInt(sumatoriaTurnos.getTotalEfectivo()));
			cierreDia.setTotalEfectivoDia(Integer.parseInt(sumatoriaTurnos.getTotalReportado()));
			cierreDia.setCefectivo(Integer.parseInt(sumatoriaTurnos.getTotalTransacciones()));
			cierreDia.setEstado((short) sumatoriaTurnos.getEstadoTurnos());
			cierreDia.setFaltante(sumatoriaTurnos.getFaltante());
			cierreDia.setSobrante(sumatoriaTurnos.getSobrante());
			}else {
				cierreDia.setTransacciones(0);
				cierreDia.setTurnos((short) 0);
				cierreDia.setTotalEfectivo(0);
				cierreDia.setTotalEfectivoDia(0);
				cierreDia.setCefectivo(0);
				cierreDia.setEstado((short)1);
				cierreDia.setFaltante(0);
				cierreDia.setSobrante(0);
			}
			cierreDia.setTotalPp(0);
			cierreDia.setTotalBr(0);
			cierreDia.setTotalTc(0);
			cierreDia.setTotalCheque(0);
			cierreDia.setTotalMensualesEf(0);
			cierreDia.setTotalMensualesTc(0);
			cierreDia.setTotalMensualesCh(0);
			cierreDia.setTotalVentaPpEf(0);
			cierreDia.setTotalVentaPpTc(0);
			cierreDia.setTotalVentaPpTc(0);
			cierreDia.setTotalCambioPp(0);
			cierreDia.setTotalValoresBigpass(0);
			cierreDia.setTotalNotasCredito(0);
		
			cierreDia.setCprepark(0);
			cierreDia.setCdatafono(0);
			cierreDia.setCmensuales(0);
			cierreDia.setCvip(0);
			cierreDia.setCconvenio(0);
			cierreDia.setCsticker(0);
			cierreDia.setCventaPrepark(0);
	        cierreDia.setCrecargaPrepark(0);
	        cierreDia.setCcambioPrepark(0);
	        cierreDia.setCventaMensuales(0);
	        cierreDia.setCsinCobro(0);
	        cierreDia.setCcheque(0);
	        cierreDia.setCbigpass(0);
	        cierreDia.setAsticker(0);
  			int subtotal = 0;
  			int iva = 0;
  			int total=0;
	        if(cierreDia.getTotalEfectivo()!=0) {
	         total=cierreDia.getTotalEfectivo();
			 subtotal = (int) Math.round((total / 1.19));
			 iva = total - subtotal;
	        }
			cierreDia.setSubtotal(subtotal);
			cierreDia.setIvaEfectivo(iva);
			cierreDia.setIvaPrepark(0);
			cierreDia.setIvaDatafono(0);
			cierreDia.setIvaCheque(0);
			cierreDia.setTotal(total);
			short estado=1;
		    cierreDia.setEstado(estado);
		    cierreDia.setTransmitido(estado);
			cierreDia.setCpropietario(0);
			cierreDia.setCtaxicard(0);
			cierreDia.setCperiodoGracia(0);
			cierreDia.setTotalRecargaPpEf(0);
			cierreDia.setTotalRecargaPpTc(0);
			cierreDia.setTotalRecargaPpCh(0);
		
			cierreDia.setCtarjetaB(0);
			cierreDia.setIdInicioDia(inicioTurnoFinal.getId_inicio_dia());
			cierreDia.setIdPlanilla("-");
			cierreDia.setBonificaciones(0);
			cierreDia.setDescuentosNomina(0);
			cierreDia.setTotalNumComprobante(0);
			cierreDia.setTotalVentaTs(0);
			cierreDia.setTotalEfectivoValet(0);
			cierreDia.setTotalTcValet(0);
			cierreDia.setNumResolucion("0");
			cierreDia.setTotalEfValetPark(0);
			cierreDia.setObservacion("BAHIAS");
			cierreDia.setCgroupon(0);
			cierreDia.setIvaGroupon(0);
			cierreDia.setTotalGp(0);
			cierreDia.setClifemiles(0);
			cierreDia.setTotalLifemiles(0);
			cierreDia.setIvaLifemiles(0);
			cierreDia.setTotalCuponatic(0);
			cierreDia.setCantBonosBancolombia(0);
			
			em.persist(cierreDia);
			return cierreDia;
		}catch (Exception e) { 
			
			return null;

		}

	}
	
	public CierreDia consultarCierreDia(String codTerminal) {
		CierreDia cierreDia = new CierreDia();
		try {
			String query="SELECT c FROM CierreDia c WHERE cod_terminal=:codTerminal AND CONVERT(varchar(10), fecha_final, 103) = CONVERT(varchar(10), GETDATE(), 103) order by fecha_final desc";
			List<CierreDia> listaCierreDia = em.createQuery(query, CierreDia.class).setParameter("codTerminal", codTerminal).setMaxResults(1).getResultList();
			if (!listaCierreDia.isEmpty()) {
				for (CierreDia cierreD : listaCierreDia) {
					cierreDia = cierreD;
				}
				return cierreDia;
			} else {
				return null;
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return null;
		}
	}
	
	public InicioDia consultarCierreDiaAnterior(String codTerminal) {
			InicioDia inicioDia = new InicioDia();
		try {
			String query="SELECT c FROM InicioDia c WHERE cod_terminal=:codTerminal AND estado=1 AND CONVERT(date, fecha_hora) < CONVERT(date, GETDATE()) order by fecha_hora desc";
			List<InicioDia> listaInicioDia = em.createQuery(query, InicioDia.class).setParameter("codTerminal", codTerminal).setMaxResults(1).getResultList();
			if (!listaInicioDia.isEmpty()) {
				for (InicioDia inicioD : listaInicioDia) {
					inicioDia = inicioD;
				}
				return inicioDia;
			} else {
				return null;
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return null;
		}
	}

	
	public int actualizaInicioDia(String idInicioTurno, String codTerminal) {
		int actualizaInicioTurno=0;
		try {
			InicioTurno inicioTurno=this.consultarInicioTurno(codTerminal, idInicioTurno);
			String idInicioDia=String.valueOf(inicioTurno.getId_inicio_dia());
			Date now=new Date();
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String fechaHora = format1.format(now);
				String updateInicioTurno =
					"UPDATE InicioDia set estado =0, fechaHora=:fechaHora WHERE codTerminal=:codTerminal AND id=:idInicioDia";
				 actualizaInicioTurno =	em.createQuery(updateInicioTurno).setParameter("fechaHora",fechaHora).setParameter("codTerminal",codTerminal).setParameter("idInicioDia",Integer.parseInt(idInicioDia)).executeUpdate();
			return actualizaInicioTurno;
				
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return actualizaInicioTurno;
		}

	}
	

	public InicioTurno consultarInicioTurnoInicial(String codTerminal, String idInicioDia) {
		InicioTurno inicioTurno = new InicioTurno();
		try {
			List<InicioTurno> listaInicioTurno = em.createNamedQuery("ConsultarInicioTurnoInicial", InicioTurno.class)
					.setParameter("idInicioDia", Integer.parseInt(idInicioDia)).setParameter("codTerminal", codTerminal).setMaxResults(1).getResultList();
			if (!listaInicioTurno.isEmpty()) {
				for (InicioTurno inicioTur : listaInicioTurno) {
					inicioTurno = inicioTur;
				}
				return inicioTurno;
			} else {
				return null;
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return null;
		}

	}
	
	public SumatoriaTurnosDTO sumaTurnosDia(String codTerminal, String idInicioDia) {
		SumatoriaTurnosDTO turnos = new SumatoriaTurnosDTO();
		int cantTurnos = 0;
		int totalEfectivo = 0;
		int totalTransacciones = 0;
		int totalReportado = 0;
		int estado=1;
		int sobrante=0;
		int faltante=0;
		try {
			List<CierreTurno> listaTurnos = em.createNamedQuery("TurnosEnDia", CierreTurno.class)
					.setParameter("codTerminal", codTerminal).setParameter("idInicioDia", Integer.parseInt(idInicioDia))
					.getResultList();
			if (!listaTurnos.isEmpty()) {
				for (CierreTurno cierreTurno : listaTurnos) {
					cantTurnos += 1;
					totalEfectivo += cierreTurno.getTotalEfectivo();
					totalTransacciones += cierreTurno.getTransacciones();
					totalReportado += cierreTurno.getReportado();
					
					if(cierreTurno.getTotalEfectivo()>cierreTurno.getReportado()) {
						int falta=cierreTurno.getTotalEfectivo()-cierreTurno.getReportado();
						faltante+=falta;
					}else {
						int sobra=cierreTurno.getReportado()-cierreTurno.getTotalEfectivo();
						sobrante+=sobra;
					}
					
					if(cierreTurno.getEstado()==2) {
						estado=2;
					}

				}
				turnos.setTotalEfectivo(String.valueOf(totalEfectivo));
				turnos.setTotalTransacciones(String.valueOf(totalTransacciones));
				turnos.setTotalTurnos(String.valueOf(cantTurnos));
				turnos.setTotalReportado(String.valueOf(totalReportado));
				turnos.setEstadoTurnos(estado);
				turnos.setSobrante(sobrante);
				turnos.setFaltante(faltante);
				return turnos;
			} else {
				return null;
			}

		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return null;
		}

	}
	
	public InicioTurno consultarInicioTurnoFinal(String codTerminal, String idInicioDia) {
		InicioTurno inicioTurno = new InicioTurno();
		try {
			List<InicioTurno> listaInicioTurno = em.createNamedQuery("ConsultarInicioTurnoFinal", InicioTurno.class)
					.setParameter("idInicioDia", Integer.parseInt(idInicioDia)).setParameter("codTerminal", codTerminal).setMaxResults(1).getResultList();
			if (!listaInicioTurno.isEmpty()) {
				for (InicioTurno inicioTur : listaInicioTurno) {
					inicioTurno = inicioTur;
				}
				return inicioTurno;
			} else {
				return null;
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),
					this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"BAHIAS");
			return null;
		}

	}
	
	public RangoFactura2 rangoFacturacion(String codTerminal) {
		RangoFactura2 rangoFactura = null;
		List<RangoFactura2> listaRangoFactruras = em
				.createNamedQuery("RangoFactura2.byCodTerminal", RangoFactura2.class)
				.setParameter("codTerminal", codTerminal).getResultList();
		if (!listaRangoFactruras.isEmpty()) {
			for (RangoFactura2 rango : listaRangoFactruras) {
				rangoFactura = rango;
			}
		} else {
			return null;
		}
		return rangoFactura;
	}
	
	
	
	
//}
//=======
//	@PersistenceContext(unitName = Util.UP_TRANSACCION_PARKING)
//	private EntityManager em;
//	private ErrorLogBean errorLogBean = new ErrorLogBean();

	public RespuestaTransaccionBahiasDTO insertaTransaccion(TransaccionDTO dto) {
		RespuestaTransaccionBahiasDTO res = new RespuestaTransaccionBahiasDTO();
		EntradaV126 entrada = new EntradaV126();
		try {
			entrada=  em.createNamedQuery("EntradaV126.findBarcode2", EntradaV126.class).setParameter("barcode", dto.getBarcode()).setParameter("codPark", dto.getCodPark()).setMaxResults(1).getSingleResult();
		} catch (NoResultException e) {
			entrada=null;
			res.setEstado(false);
			res.setMensaje("NO ENTRADA");
			return res;
		}
		if(entrada==null) {
			res.setEstado(false);
			res.setMensaje("NO ENTRADA");
			return res;
		}
		TransV130 transaccion = this.getTransaccion(dto,entrada);
		transaccion.setNumeroCheque(dto.getNumeroCheque());
		try {
		if (transaccion.getNumFactura() != 0) {
			if (!transaccion.getFechaInicial().isEmpty() && transaccion.getFechaInicial() != null) {
				em.persist(transaccion);
				if(transaccion.getTipoVehiculo()==100) {
					this.updateIngresoBicicleta(transaccion);
				}if(transaccion.getFormaPago()==3){
					em.persist(this.getTransDatafono(transaccion, dto));
				}
				this.updateEstadoEntrada(dto,entrada);
				//this.guardarDataComprobantePerdido(comprobantePerdidoString, numFactura);
			if(transaccion.getPerdido()==1) {
				this.guardarDataregCompPerdido2(dto, transaccion.getFechaFinal(), transaccion.getNumFactura());
			}
				
				res.setEstado(true);
				res.setValorComprobantePerdido(this.getValorSubtotal(dto.getValorPerdido()));
				res.setNumFactura(transaccion.getNumFactura());
				res.setPlaca(transaccion.getPlaca());
				res.setFechaEntrada(transaccion.getFechaInicial());
				res.setFechaSalida(transaccion.getFechaFinal());
				res.setDuracionMinutos(this.tiempoMinutosFormato(transaccion.getFechaInicial(), transaccion.getFechaFinal()));
				if(dto.getFormaPago()==3) {
					res.setValorServicio(this.getValorSubtotal((transaccion.getValorDatafono())-dto.getValorPerdido()));
					res.setIva((transaccion.getIva()));
					res.setTotal(transaccion.getValorDatafono());
				}else {
				res.setValorServicio(this.getValorSubtotal((transaccion.getValorEf())-dto.getValorPerdido()));
				res.setIva((transaccion.getIva()));
				res.setTotal(transaccion.getValorEf());
				}
				if(!dto.getBeParking().equals("0")) {
				res.setExtracto(this.consultaExtracto(dto));
				}
				res.setMensaje("OK");
			}else {
				res.setEstado(false);
				res.setMensaje("NO FECHA");
			}
		} else {
			res.setEstado(false);
			res.setMensaje("NO FACTURA");
		}
		}catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
			res.setEstado(false);
			res.setMensaje("ERROR");
		}

		return res;
	}
	public DataComprobantePerdidoDTO insertaTransaccionComprobantePerdido(TransaccionComprobantePerdidoDTO dto) {
		DataComprobantePerdidoDTO dataComprobantePerdido = new DataComprobantePerdidoDTO();
		EntradaV126 entrada = new EntradaV126();
		try {
			entrada=  em.createNamedQuery("EntradaV126.findPlaca2", EntradaV126.class).setParameter("placa", dto.getPlaca()).setParameter("codTerminal", dto.getCodTerminal()).setMaxResults(1).getSingleResult();
		} catch (NoResultException e) {
			dataComprobantePerdido=null;
			return dataComprobantePerdido;
			
		}
		if(entrada.getEstado()==0) {
			dataComprobantePerdido.setMensaje("OUT");
			return dataComprobantePerdido;
		}
		
//		TransaccionDTO transaccionDTO=new TransaccionDTO();
//		transaccionDTO.setBarcode(entrada.getBarcode());
//		transaccionDTO.setCodEmpleado(dto.getCodEmpleado());
//		transaccionDTO.setCodPark(dto.getCodPark());
//		transaccionDTO.setCodTerminal(dto.getCodTerminal());
//		Date now=new Date();
//		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String fechaFinal = format1.format(now);
//		transaccionDTO.setFechaFinal(fechaFinal);
//		transaccionDTO.setFormaPago((short)1);
//		transaccionDTO.setIdInicioTurno(dto.getIdInicioTurno());
//		transaccionDTO.setTipoTrans((short)8);
//		transaccionDTO.setValor(dto.getValor());
		
//		TransV130 transaccion = this.getTransaccion(transaccionDTO,entrada);
		try {
//		if (transaccion.getNumFactura() != 0) {
//			if (!transaccion.getFechaInicial().isEmpty() && transaccion.getFechaInicial() != null) {
//				em.persist(transaccion);
				if(entrada.getTipoVehiculo()==1) {
					dataComprobantePerdido.setAutomotor("CARRO");
					}else if(entrada.getTipoVehiculo()==2) {
						dataComprobantePerdido.setAutomotor("MOTO");
					}else {
						dataComprobantePerdido.setAutomotor("BICICLETA");
					}
				dataComprobantePerdido.setCertificacion("Certifico que la anterior informacion es veridica por haber entregado copia de los documentos ya mencionados al funcionario de PARKING INTERNATIONAL S.A.S");
//				dataComprobantePerdido.setNumFactura(String.valueOf(transaccion.getNumFactura()));
//				dataComprobantePerdido.setTotal(transaccion.getValorEf());
//				dataComprobantePerdido.setIva(transaccion.getIva());
//				dataComprobantePerdido.setSubtotal(transaccion.getSubtotal());		
			//	dataComprobantePerdido.setFecha(transaccion.getFechaFinal());
				dataComprobantePerdido.setBarcode(entrada.getBarcode());
				
	//		}
	//	} 
		}catch (Exception e) {
			e.printStackTrace();
		errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
		}

		return dataComprobantePerdido;
	}
	public TransV130 getTransaccion(TransaccionDTO trans, EntradaV126 entrada) {
		TransV130 transaccion = new TransV130();
		transaccion.setIdTransaccion(this.getIdTransaccion());
		transaccion.setTipoTrans(trans.getTipoTrans());
		transaccion.setNumFactura(this.getNumFactura(trans));
		transaccion.setPlaca(entrada.getPlaca());
		transaccion.setPlaca2(null);
		transaccion.setTiempoInicial(0);
		transaccion.setTiempoFinal(0);
		transaccion.setFechaInicial(entrada.getFechaHora());
		transaccion.setFechaFinal(trans.getFechaFinal());
		transaccion.setTiempoTotal(0);
		if(trans.getFormaPago()==1) {
		transaccion.setValorEf(trans.getValor()+trans.getValorPerdido());
		}else {
			transaccion.setValorEf(0);	
		}
		transaccion.setValorPp(0);
		transaccion.setValorBr(0);
		if(trans.getFormaPago()==3) {
		transaccion.setValorDatafono(trans.getValor()+trans.getValorPerdido());
		}else {
			transaccion.setValorEf(trans.getValor()+trans.getValorPerdido());
		}
		transaccion.setValorCheque(0);
		transaccion.setSubtotal(this.getValorSubtotal(trans.getValor()+trans.getValorPerdido()));
		transaccion.setIva((trans.getValor()+trans.getValorPerdido())-transaccion.getSubtotal());
		transaccion.setTotal(trans.getValor()+trans.getValorPerdido());
		transaccion.setFormaPago(trans.getFormaPago());
		transaccion.setNumComprobante(0);
		transaccion.setNumTarjetaPp("");
		transaccion.setNumTarjetaPpChip("");
		transaccion.setNumeroCheque("");
		transaccion.setIdConvenio(trans.getIdConvenio());
		transaccion.setIdCliente("");
		transaccion.setCodEmpleado(trans.getCodEmpleado());
		transaccion.setCodTerminal(trans.getCodTerminal());
		transaccion.setCodPark(trans.getCodPark());
		transaccion.setAstickers(0);
		transaccion.setBarcode(trans.getBarcode());
		transaccion.setPerdido((short) trans.getPerdido());
		transaccion.setEstado((short) 1);
		transaccion.setControlf((short) 0);
		transaccion.setGrandesSuper("");
		transaccion.setDetalle("Transaccion Bahias");
		transaccion.setValorNc(0);
		transaccion.setConcepto(0);
		transaccion.setIdInicioTurno(trans.getIdInicioTurno());
		transaccion.setIdConvenio(trans.getIdConvenio());
		transaccion.setPPrepark(0);
		transaccion.setVConvenio(0);
		transaccion.setvsticker(0);
		transaccion.setvplana(0);
		transaccion.setvpleno(0);
		transaccion.setVCuarto(0);
		transaccion.setTipoVehiculo(entrada.getTipoVehiculo());
		transaccion.setContrato(0);
		if(trans.getBeParking()!=null) {
			if(trans.getBeParking().equals("0")) {
			transaccion.setBeParking("");
			}else {
				transaccion.setBeParking(trans.getBeParking());
			}
		}else {
			transaccion.setBeParking("");
		}
		
		transaccion.setValorGp(0);
		transaccion.setNombreUsaConvenio("");
		transaccion.setValorLifemiles(0);
		transaccion.setValorCuponatic(0);
		return transaccion;
	}
	
	
	public TransDatafono getTransDatafono(TransV130 trans, TransaccionDTO dto) {
		TransDatafono td = new TransDatafono();
		
		td.setTipoTrans(String.valueOf(trans.getTipoTrans()));
		td.setCodPark(trans.getCodPark());
		td.setCodTerminal(trans.getCodTerminal());
		td.setIdTurno(trans.getIdInicioTurno());
		td.setNumero(String.valueOf(trans.getNumFactura()));
		td.setFecha(new Date());
		td.setNumAutorizacion(dto.getComprobante());
		td.setNumRecibo(0);
		td.setValor(dto.getValor());
		td.setIva(trans.getIva());
		td.setCodEmpleado(trans.getCodEmpleado());
		td.setEstado("1");
		td.setTipoTarjeta("NORMAL");
		td.setIdCliente(trans.getIdCliente());
		td.setNombreCliente("");
		td.setValorDescuento(0);
		return td;
		
	}

	public int getValorSubtotal(int valor) {
		int valorSubtotal = (int) (valor / 1.19);
		return valorSubtotal;
	}
	
	public int tiempoMinutos(String fechaInicial, String fechaFinal) throws ParseException {
		int tiempoMinutos=0;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date fechaIni=format.parse(fechaInicial);
		Date fechaFin= format.parse(fechaFinal);
		tiempoMinutos= (int)  this.diferenciaEnMinutos(fechaIni, fechaFin);
		return tiempoMinutos;
	}
	
	public  long diferenciaEnMinutos(Date a, Date b) {
		long ta = a.getTime();
		long tb = b.getTime();
		// 1 minuto =  60000 ms
		double dt = ((tb - ta) / 60000.);
		long dt2 = (long) Math.ceil(dt);
		return dt2;
	}
	
	
	public String tiempoMinutosFormato(String fechaInicial, String fechaFinal) throws ParseException {
		String tiempoMinutos=null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date fechaIni=format.parse(fechaInicial);
		Date fechaFin= format.parse(fechaFinal);
		tiempoMinutos= this.tiempoParqueo(fechaIni, fechaFin);
		return tiempoMinutos;
	}
	
	public String tiempoParqueo(Date a, Date b) {
		String time=null;
	long diff = b.getTime() - a.getTime();
	long diffSeconds = diff / 1000 % 60;  
	long diffMinutes = diff / (60 * 1000) % 60; 
	long diffHours = diff / (60 * 60 * 1000);                      
	
	time=diffHours+":"+diffMinutes+":"+diffSeconds;
	
	return time;
	}

//	public String getFechaEntrada(TransaccionDTO trans) {
//		String fechaEntrada = null;
//		try {
//			Query sql = em.createQuery(
//					"SELECT t.fechaHora FROM EntradaV126 t WHERE t.placa=:pPlaca and t.codPark=:pCodPark and t.estado=1");
//			fechaEntrada = (String) sql.setParameter("pPlaca", trans.getPlaca())
//					.setParameter("pCodPark", trans.getCodPark()).getSingleResult();
//
//		} catch (NoResultException ex) {
//			errorLogBean.addErrorLog(ex.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
//		} catch (Exception e) {
//			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
//		}
//		return fechaEntrada;
//	}
	
	
	
	public boolean updateEstadoEntrada(TransaccionDTO trans,EntradaV126 entrada) {
		boolean var = true;
		int retorno =0;
		try {
			Query sql = em.createQuery("UPDATE EntradaV126 set estado=0 WHERE placa=:pPlaca and codPark=:pCodPark and idEntrada=:idEntrada  and estado=1");
			retorno=sql.setParameter("pPlaca", entrada.getPlaca())
			.setParameter("pCodPark", trans.getCodPark()).setParameter("idEntrada", entrada.getIdEntrada()).executeUpdate();
			if(retorno>0) {
				var=true;
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
		}
		return var;
	}
	
	public boolean updateIngresoBicicleta(TransV130 transaccion) {
		boolean var = true;
		int retorno=0;
		try {
			Query sql = em.createQuery("UPDATE IngresoBicicletas set facturaTransaccion=:numFactura, codTerminal=:codTerminal WHERE placaBicicleta=:placa and facturaTransaccion is null");
			retorno = sql.setParameter("numFactura",Integer.toString(transaccion.getNumFactura())).setParameter("codTerminal", transaccion.getCodTerminal()).setParameter("placa", transaccion.getPlaca()).executeUpdate();
		if(retorno>0) {
			var=true;
		}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
		}
		return var;
	}

	public java.util.UUID getIdTransaccion() {
		java.util.UUID uuid = java.util.UUID.randomUUID();
		// String randomUUIDString = uuid.toString();
		return uuid;
	}

	public int getNumFactura(TransaccionDTO trans) {
		int numFactura = 0;
		try {
			Query sql = em.createQuery(
					"SELECT t.numFactura FROM TransV130 t WHERE t.codTerminal=:pCodTerminal ORDER BY t.numFactura desc");
			numFactura = (int) sql.setParameter("pCodTerminal", trans.getCodTerminal()).setMaxResults(1)
					.getSingleResult() + 1;
			if (numFactura == 0) {
				Query sql2 = em.createQuery(
						"SELECT t.rangoInicial FROM RangoFactura2 t WHERE t.codTerminal=:pCodTerminal and t.estado=1");
				numFactura = (int) sql2.setParameter("pCodTerminal", trans.getCodTerminal()).getSingleResult();
			}
		}catch(NoResultException ex) {
			System.out.println("no existe factura para terminal " +trans.getCodTerminal());
			Query sql2 = em.createQuery(
					"SELECT t.rangoInicial FROM RangoFactura2 t WHERE t.codTerminal=:pCodTerminal and t.estado=1");
			numFactura = (int) sql2.setParameter("pCodTerminal", trans.getCodTerminal()).getSingleResult();
		}
		catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
			numFactura = 0;
		}
		return numFactura;
	}

	public RespuestaGeneralDTO guardarDataComprobantePerdido(TransaccionComprobantePerdidoDTO comprobantePerdidoString) throws Exception {

		ReimpresionComprobante reimpresionComprobante=new ReimpresionComprobante();
		RespuestaGeneralDTO respuestaGeneralDTO = new RespuestaGeneralDTO();
		try {
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String fechaString = format.format(new Date());
			reimpresionComprobante.setFechaHora(fechaString);
			reimpresionComprobante.setFechaReimpresion(fechaString);
			reimpresionComprobante.setLlaveMotivo("PERDIDO");
			reimpresionComprobante.setTipoReimpresion(2);
			reimpresionComprobante.setCodTerminal(comprobantePerdidoString.getCodTerminal().toUpperCase());
			reimpresionComprobante.setDireccion(comprobantePerdidoString.getDireccion());
			reimpresionComprobante.setIdentificacion(comprobantePerdidoString.getIdentificacion());
			reimpresionComprobante.setIdTurno((long) comprobantePerdidoString.getIdInicioTurno());
			reimpresionComprobante.setNombreCliente(comprobantePerdidoString.getNombreCliente());
			reimpresionComprobante.setPlaca(comprobantePerdidoString.getPlaca().toUpperCase());
			reimpresionComprobante.setTelefono(comprobantePerdidoString.getTelefono());

			em.persist(reimpresionComprobante);
		} catch (Exception e) {
			throw new Exception("Error guardando reimpresion de comprobante");

		}
		return respuestaGeneralDTO;
	}

		public RespuestaGeneralDTO guardarDataregCompPerdido(TransaccionComprobantePerdidoDTO comprobantePerdidoString, String fecha, long numFactura) throws Exception {

			RegCompPerdido regCompPerdido=new RegCompPerdido();
			RespuestaGeneralDTO respuestaGeneralDTO = new RespuestaGeneralDTO();
			try {
				
				regCompPerdido.setCodTerminal(comprobantePerdidoString.getCodTerminal());
				regCompPerdido.setEstado(1);
				regCompPerdido.setFecha(fecha);
				regCompPerdido.setIdTurno((long) comprobantePerdidoString.getIdInicioTurno());
				regCompPerdido.setNumFactura(numFactura);
				regCompPerdido.setValorDatafono((long) 0);
				regCompPerdido.setValorEfectivo((long) comprobantePerdidoString.getValor());
				regCompPerdido.setValorPrepark((long) 0);
				
				em.persist(regCompPerdido);
				respuestaGeneralDTO.setEstado(true);
				respuestaGeneralDTO.setMensaje("Comprobante generado exitosamente");
			} catch (Exception e) {
				throw new Exception("Error guardando reimpresion de comprobante");

			}
		respuestaGeneralDTO.setEstado(true);
		respuestaGeneralDTO.setMensaje("Comprobante generado exitosamente");
		return respuestaGeneralDTO;
	}
	
		public RespuestaGeneralDTO guardarDataregCompPerdido2(TransaccionDTO comprobantePerdidoString, String fecha, int numFactura) throws Exception {

			RegCompPerdido regCompPerdido=new RegCompPerdido();
			RespuestaGeneralDTO respuestaGeneralDTO = new RespuestaGeneralDTO();
			try {
				
				regCompPerdido.setCodTerminal(comprobantePerdidoString.getCodTerminal());
				regCompPerdido.setEstado(1);
				regCompPerdido.setFecha(fecha);
				regCompPerdido.setIdTurno((long) comprobantePerdidoString.getIdInicioTurno());
				regCompPerdido.setNumFactura((long)numFactura);
				if(comprobantePerdidoString.getFormaPago()==3) {
					regCompPerdido.setValorDatafono((long) comprobantePerdidoString.getValorPerdido());
					regCompPerdido.setValorEfectivo((long) 0);
				}else {
				regCompPerdido.setValorDatafono((long) 0);
				regCompPerdido.setValorEfectivo((long) comprobantePerdidoString.getValorPerdido());
				}
				regCompPerdido.setValorPrepark((long) 0);
				
				em.persist(regCompPerdido);
				respuestaGeneralDTO.setEstado(true);
				respuestaGeneralDTO.setMensaje("Comprobante generado exitosamente");
			} catch (Exception e) {
				throw new Exception("Error guardando reimpresion de comprobante");

			}
		respuestaGeneralDTO.setEstado(true);
		respuestaGeneralDTO.setMensaje("Comprobante generado exitosamente");
		return respuestaGeneralDTO;
	}
	
	public ExtractoBeparkingDTO consultaExtracto(TransaccionDTO transaccion) {
		ExtractoBeparkingDTO bpExtractoPuntosDTO = new ExtractoBeparkingDTO();
		List<BpExtractoPunto> lista = new ArrayList<BpExtractoPunto>();
		String nivelBeparking="";
		int puntosTrans=0;
		try {
			if (!transaccion.getBeParking().equals("0")) {
				nivelBeparking = this.nivelClienteBeparking(transaccion.getBeParking());
				lista = this.getByCedula(transaccion.getBeParking());
				ClienteBeparkingDTO cliente=this.estadoUsuarioBeparking(transaccion.getBeParking());
				if(lista.size()>0) {
					for (BpExtractoPunto lista_ : lista) {
					
						if(!transaccion.getBeParking().equals("0")) {
						puntosTrans=this.calculaPuntosTransaccion(Integer.toString(transaccion.getValor()),nivelBeparking);
						}else {
						puntosTrans=0;
						}
						if(cliente!=null && cliente.getNombreCliente().length()>0) {
							bpExtractoPuntosDTO.setNombre(cliente.getNombreCliente());
						}
						bpExtractoPuntosDTO.setPuntosTransaccion(puntosTrans);
						bpExtractoPuntosDTO.setCedula(lista_.getCedula());
						if(lista_.getPuntosAcumuladosOtros()<0) {
							lista_.setPuntosAcumuladosOtros(0);
						}
						if(lista_.getPuntosAcumuladosVentas()<0) {
							lista_.setPuntosAcumuladosVentas(0);
						}
						if(lista_.getPuntosAVencer()<0) {
							lista_.setPuntosAVencer(0);
						}
						if(lista_.getPuntosRedimidos()<0) {
							lista_.setPuntosRedimidos(0);
						}
						if(lista_.getPuntosVencidos()<0) {
							lista_.setPuntosVencidos(0);
						}
						
						bpExtractoPuntosDTO.setCategoria(nivelBeparking);
						int necesarioParaBono=0;
						if(lista_.getSaldo()>0) {
						bpExtractoPuntosDTO.setPuntosAcumulados(lista_.getSaldo());
						necesarioParaBono=500-lista_.getSaldo();
						if(necesarioParaBono<0) {
							necesarioParaBono=500;
						}
						}else {
							necesarioParaBono=500;
							bpExtractoPuntosDTO.setPuntosAcumulados(0);
						}
						bpExtractoPuntosDTO.setPuntosFaltantesParaBono(necesarioParaBono);
						
						
					}
				}
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),this.getClass().getName()+" metodo: "+ErrorLogBean.getNombreMetodo(),"SKI");
		}
	
		if(lista.size()>0) {
		return bpExtractoPuntosDTO;
		}else {
			return bpExtractoPuntosDTO;
		}
	
	}
	
	public String nivelClienteBeparking(String cedula) {
		List<BpCliente> cliente = new ArrayList<BpCliente>();
		String nivel="GREEN";
		try {
			cliente = em2.createNamedQuery("BpCliente.consultaPorCedula", BpCliente.class)
					.setParameter("cedula", cedula).getResultList();
			if(cliente!=null && !cliente.isEmpty()) {
				for (BpCliente bpCliente : cliente) {
				if(bpCliente.getNivel()==null) {
					nivel="GREEN";
				}else {
				nivel=bpCliente.getNivel().toUpperCase();
				}
				}
			}else {
				
				nivel="";
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nivel;
	}
	
	public ClienteBeparkingDTO estadoUsuarioBeparking(String identificacion) {
		BpCliente cliente = new BpCliente();
		ClienteBeparkingDTO clienteBeparkingDTO = new ClienteBeparkingDTO();
		String estado = "";
		try {
			cliente = em2.createNamedQuery("BpCliente.consultaPorCedula", BpCliente.class)
					.setParameter("cedula", identificacion).getSingleResult();

			estado = this.estadoCliente(cliente.getEstadoAfiliado());
			clienteBeparkingDTO.setNombreCliente(cliente.getNombre() + " " + cliente.getApellido());
			clienteBeparkingDTO.setEstado(estado);

		} catch (NoResultException e) {
			return null;
		}
		return clienteBeparkingDTO;

	}
	
	public String estadoCliente(String estado) {
		String est = "NO EXISTE";
		switch (estado) {
		case "P":
			est = PENDIENTE;
			break;
		case "A":
			est = ACTIVO;
			break;
		case "I":
			est = INACTIVO;
			break;
		default:
			est = "NO EXISTE";
			break;
		}
		return est;

	}
	
	public List<BpExtractoPunto> getByCedula(String cedula) {
		List<BpExtractoPunto> data = new ArrayList<BpExtractoPunto>();
		try {
			data = em2.createNamedQuery("BpExtractoPunto.findByCedula", BpExtractoPunto.class)
					.setParameter("cedula", cedula).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public int calculaPuntosTransaccion(String valor, String nivel) {
		int puntosGenerados=0;
		int value=Integer.parseInt(valor);
		if(nivel.equalsIgnoreCase("GREEN")) {
			
			puntosGenerados=value/100;
			
		}else if(nivel.equalsIgnoreCase("BLUE")){
			puntosGenerados=value*2/100;
		}
		else {
			puntosGenerados=0;
		}
		return puntosGenerados;
		
	}
	
	public int ultimaFacturaCierreDia(String cod_terminal, String idInicioTurno) {
		int numFactura=0;
		try {
		String query="select top 1 t.num_factura from trans_v130 t\r\n" + 
				"where id_inicio_turno in\r\n" + 
				"(select id_inicio_turno from inicio_turno\r\n" + 
				"where id_inicio_dia in(select id_inicio_dia from inicio_turno"
				+ " where id_inicio_turno='"+idInicioTurno+"' and cod_terminal='"+cod_terminal+"' )\r\n" + 
				"and cod_terminal='"+cod_terminal+"' ) order by fecha_final desc";

		Integer resultado = (Integer) em.createNativeQuery(query).getSingleResult();
		if(resultado==null) {
			resultado=0;
		}
		numFactura=resultado;
	}catch (Exception e) {
		
		numFactura=0;
		
	}
	
	return numFactura;
		
	}

	public int primeraFacturaCierreDia(String cod_terminal, String idInicioTurno) {
		int numFactura=0;
		try {
		String query="select top 1 t.num_factura from trans_v130 t\r\n" + 
				"where id_inicio_turno in\r\n" + 
				"(select id_inicio_turno from inicio_turno\r\n" + 
				"where id_inicio_dia in(select id_inicio_dia from inicio_turno"
				+ " where id_inicio_turno='"+idInicioTurno+"' and cod_terminal='"+cod_terminal+"' )\r\n" + 
				"and cod_terminal='"+cod_terminal+"' ) order by fecha_final asc";

		Integer resultado = (Integer) em.createNativeQuery(query).getSingleResult();
		if(resultado==null) {
			resultado=0;
		}
		numFactura=resultado;
		}catch (Exception e) {
		
			numFactura=0;
			
		}
		
		return numFactura;
		
	}
	
}

