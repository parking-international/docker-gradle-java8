package co.net.parking.beans;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.google.gson.Gson;

import co.net.beparking.entities.BpBono;
import co.net.beparking.entities.BpCliente;
import co.net.parking.dto.BeParkingDTO;
import co.net.parking.dto.BonoBeParkingDTO;
import co.net.parking.dto.CambioPasswordDTO;
import co.net.parking.dto.LoginUsuarioDTO;
import co.net.parking.dto.RedimirBonoDTO;
import co.net.parking.dto.RespuestaGeneralDTO;
import co.net.parking.dto.RespuestaLoginUsuarioDTO;
import co.net.parking.entities.CierreDia;
import co.net.parking.entities.Empleado;
import co.net.parking.entities.InicioDia;
import co.net.parking.entities.InicioTurno;
import co.net.parking.util.FechaUtil;
import co.net.parking.util.Util;

@Stateless
public class UsuarioBean {

	@PersistenceContext(unitName = Util.UP_TRANSACCION_PARKING)
	private EntityManager em;

	@PersistenceContext(unitName = Util.UP_BEPARKING_BP) 
	private EntityManager em2;

	private ErrorLogBean errorLogBean = new ErrorLogBean();
	private Gson gson = new Gson();





	public RespuestaLoginUsuarioDTO auteticarUsuario(LoginUsuarioDTO login) {
		RespuestaLoginUsuarioDTO respuestaLogin=this.validarLogin(login);
		if(respuestaLogin!=null) {
			int idInicioTurno=this.guardarInicioTurno(login.getCodTerminal(),respuestaLogin.getCodEmpleado());
			respuestaLogin.setIdInicioTurno(String.valueOf(idInicioTurno));
		}
		return respuestaLogin;
		
	}

	public RespuestaLoginUsuarioDTO validarLogin(LoginUsuarioDTO login) {
		RespuestaLoginUsuarioDTO respuestaLoginUsuario=new RespuestaLoginUsuarioDTO();
		try {
			String passwordMD5 = getStringMessageDigest(login.getPassword(), "MD5");
			String query = " select top (1) e.nombre, e.apellido, e.cod_empleado " + " from empleados e "
				+ " where e.login = '" + login.getUsuario() + "' and e.password = '" + passwordMD5
				+ " ' and e.estado = 1";
	
				Object[] resultado = (Object[]) em.createNativeQuery(query).getSingleResult();
				respuestaLoginUsuario.setNombre(resultado[0].toString());
				respuestaLoginUsuario.setApellido(resultado[1].toString());
				respuestaLoginUsuario.setCodEmpleado(resultado[2].toString());
			} catch (NoResultException e) {
				respuestaLoginUsuario=null;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
				return respuestaLoginUsuario;
			
	}
	public static String getStringMessageDigest(String message, String algorithm) throws Exception {
		try {
			byte[] digest = null;
			byte[] buffer = message.getBytes();
			MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
			messageDigest.reset();
			messageDigest.update(buffer);
			digest = messageDigest.digest();
			return toHexadecimal(digest);
		} catch (Exception e) {
			throw e;
		}
	}
	/***
	 * Convierte un arreglo de bytes a String usando valores hexadecimales
	 *
	 * @param digest arreglo de bytes a convertir
	 * @return String creado a partir de <code>digest</code>
	 * @throws Exception
	 */
	private static String toHexadecimal(byte[] digest) throws Exception {
		try {
			String hash = "";
			for (byte aux : digest) {
				int b = aux & 0xff;
				if (Integer.toHexString(b).length() == 1)
					hash += "0";
				hash += Integer.toHexString(b);
			}
			return hash;
		} catch (Exception e) {
			throw e;
		}
	}
			public int guardarInicioTurno(String codTerminal,String codEmpleado) {
				int idInicioTurno = 0;
				try {

					int idInicioDia = this.consultarInicioDia(codTerminal);
					
					InicioTurno inicioTurno = new InicioTurno();
					inicioTurno.setCodEmpleado(codEmpleado);
					Date now = new Date();
					SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String fechaHora = format1.format(now);
					inicioTurno.setFechaIncial(fechaHora);
					inicioTurno.setTiempoInicial(0);
					inicioTurno.setCodTerminal(String.valueOf(codTerminal).toUpperCase());
					inicioTurno.setIdInicioTurno(this.asignarIdInicioTurno(String.valueOf(codTerminal)));
					inicioTurno.setEstado(1);
					inicioTurno.setTurno(1);
					inicioTurno.setId_inicio_dia(idInicioDia);
					inicioTurno.setTipoEmpleado(1);
					inicioTurno.setTipoTurno(1);
					inicioTurno.setFechaFinal("2000-01-01 00:00:00");
					inicioTurno.setTiempoFinal(0);
					inicioTurno.setAfiliaciones(0);
					inicioTurno.setClientesPotenciales(0);
					inicioTurno.setMetaFinal(0);

					em.persist(inicioTurno);
					idInicioTurno = inicioTurno.getIdInicioTurno();
					return idInicioTurno;

				} catch (Exception e) {
					return 0;
				}
			}
			

			public int asignarIdInicioTurno(String codTerminal) {
				List<InicioTurno> listaInicioTurno = new ArrayList<InicioTurno>();
				int num = 0;
				listaInicioTurno =
					em.createNamedQuery("idInicioTurnoQuery", InicioTurno.class).setParameter("codTerminal", codTerminal).setMaxResults(1).getResultList();
				if (!listaInicioTurno.isEmpty()) {
					for (InicioTurno idTurno : listaInicioTurno) {
						num = idTurno.getIdInicioTurno() + 1;

					}
				}
				return num;
			}

			
			public int consultarInicioDia(String codTerminal) {
				int inicioDia = 0;
				try {

					List<InicioDia> listaInicioDia =
						em.createNamedQuery("idInicioDia", InicioDia.class).setParameter("codTerminal",codTerminal).setMaxResults(1).getResultList();

					if (!listaInicioDia.isEmpty()) {
						for (InicioDia idInicioDia : listaInicioDia) {
							inicioDia = idInicioDia.getId();

						}

					}else {
						InicioDia inicioD=this.guardarInicioDia(codTerminal);
						inicioDia=inicioD.getId();
					}
					
				} catch (Exception e) {
					inicioDia = 0;
				}
				return inicioDia;

			}
			
			public InicioDia guardarInicioDia(String codTerminal ) {
				InicioDia inicioDia = new InicioDia();
				try {
					inicioDia.setCodTerminal(String.valueOf(codTerminal).toUpperCase());
					Date now = new Date();
					SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String fechaHora = format1.format(now);
					inicioDia.setFechaHora(fechaHora);
					inicioDia.setTiempoInicial(0);
					inicioDia.setTurnos(0);
					inicioDia.setEstado(1);

					em.persist(inicioDia);


				} catch (Exception e) {
					return null;
				}


				return inicioDia;
			
			}

			public String encriptarPassword(String source) {
				String md5 = null;
				try {
					MessageDigest mdEnc = MessageDigest.getInstance("MD5"); // Encryption algorithm
					mdEnc.update(source.getBytes(), 0, source.length());
					md5 = new BigInteger(1, mdEnc.digest()).toString(16); // Encrypted string
				} catch (Exception ex) {
					return null;
				}
				return md5;
			}
			
			public RespuestaGeneralDTO cambioPassword(CambioPasswordDTO pass) {
				RespuestaGeneralDTO respuesta= new RespuestaGeneralDTO();
				try {
				/** PASSWORD VIEJA**/
				String passAntigua=this.encriptarPassword(pass.getPasswordAntigua());
				/** PASSWORD NUEVA**/
				String passNueva=this.encriptarPassword(pass.getPasswordNueva());
				
				Query q = em.createNamedQuery("Empleado.login");
				@SuppressWarnings("unchecked")
				List<Empleado> listaEmpleado=q.setParameter("password", passAntigua)
				.setParameter("username", pass.getUsuario()).getResultList();
				
				if(listaEmpleado!=null && listaEmpleado.size()>0) {
				String updateEmpleado = "UPDATE empleados set password=:password  where login =:login";
				em.createNativeQuery(updateEmpleado).setParameter("password", passNueva)
						.setParameter("login", pass.getUsuario()).executeUpdate();
					respuesta.setEstado(true);
					respuesta.setMensaje("Password cambiado exitosamente");
				}else {
					respuesta.setEstado(false);
					respuesta.setMensaje("Usuario o password incorrecto");
				
				
				} 
				}catch (Exception e) {
					errorLogBean.addErrorLog(e.getMessage(),
							this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(), "BAHIAS");
				}
				
				return respuesta;
				
				
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
			public RespuestaGeneralDTO consultarClienteOperacion(String identificacion) throws Exception {
				try {
					RespuestaGeneralDTO respuesta = new RespuestaGeneralDTO();
					Gson gson = new Gson();
					if (identificacion == null || identificacion.trim().isEmpty()) {
						respuesta.setEstado(false);
						respuesta.setMensaje( "Identificador no recibido");
						return respuesta;
					}
					BpCliente cliente;
					try {
						cliente =
								em2.createNamedQuery("BpCliente.consultaPorCedula", BpCliente.class).setParameter("cedula", identificacion).getSingleResult();
					} catch (NoResultException e) {
						cliente = null;
					} catch (NonUniqueResultException e) {
						respuesta.setEstado(false);
						respuesta.setMensaje( "Documento duplicado" + identificacion);
						return respuesta;
						
					}
					if (cliente == null) {
						respuesta.setEstado(false);
						respuesta.setMensaje("Cliente no encontrado con identificador: " + identificacion);
						return respuesta;
					}
					if (cliente.getEstadoAfiliado().equals("I")) {
						respuesta.setEstado(false);
						respuesta.setMensaje("Cliente Inactivo: " + identificacion);
						return respuesta;
					}
					if (cliente.getEstadoAfiliado().equals("P")) {
						respuesta.setEstado(false);
						respuesta.setMensaje("Cliente Pre-Afiliado: " + identificacion);
						return respuesta;
					}
					List<BonoBeParkingDTO> bonos = new ArrayList<BonoBeParkingDTO>();
					String query =
						"select t.acumulable, b.codBono, t.descripcion, (t.duracion * 15) as duracion, b.estado, b.fechaFinalVigencia, b.fechaInicialVigencia, t.prioridad, b.codTipoBono "
							+ " from BpBono b, BpTipoBono t " + " where b.codTipoBono = t.codTipoBono and b.cedula = '" + identificacion
							+ "' and b.estado = 'S' " + " order by b.fechaFinalVigencia desc ";
					@SuppressWarnings("unchecked")
					ArrayList<Object[]> listaBonos = (ArrayList<Object[]>) em2.createNativeQuery(query).getResultList();
					for (int i = 0; i < listaBonos.size(); i++) {
						BonoBeParkingDTO bono = new BonoBeParkingDTO();
						Object[] lista = listaBonos.get(i);
						bono.setCodBono(lista[1].toString());
						bono.setDescripcionTipoBono(lista[2].toString());
						bono.setDuracion((int) lista[3]);
						bonos.add(bono);
					}
					BeParkingDTO clienteBp = new BeParkingDTO();
					clienteBp.setNombreCliente(cliente.getNombre()+" "+cliente.getApellido());
					clienteBp.Bonos = bonos;
				//	String jsonResult = gson.toJson(clienteBp).replace("ó", "o").replace("ñ", "n");
					respuesta.setEstado(true);
					respuesta.setMensaje("Usuario beparkig");
					respuesta.setData(clienteBp);
					return respuesta;
				} catch (Exception e) {
					errorLogBean.addErrorLog(e.getMessage(), this.getClass().getName() + " metodo: " + ErrorLogBean.getNombreMetodo(),"Bahia");
					throw e;
				}
			}
			/**
			 * metodo que consulta un bono por codigo
			 * 
			 * @param bonoCodigo
			 * @return
			 */
			public BpBono consultaBonoCodigo(String bonoCodigo) {
				BpBono bono = new BpBono();

				try {
					List<BpBono> listaBonos = em2.createNamedQuery("BpBono.findByCodBono", BpBono.class)
							.setParameter("codBono", bonoCodigo).getResultList();

					for (BpBono bpBono : listaBonos) {
						bono = bpBono;
					}

				} catch (NoResultException e) {
					bono=null;
					return bono;
				}

				return bono;
			}
			
			public RespuestaGeneralDTO redimirBono(RedimirBonoDTO redimirBonoDTO) {
				RespuestaGeneralDTO respuestaGeneral= new RespuestaGeneralDTO();
				String cambiarEstadoBono = "UPDATE BpBono set Estado = :estado, idTrans=:idTrans,FechaActualizacion=:fechaActualizacion where CodBono = :codBono and Estado=:estadoActivo";
				// El estado R referencia que el bono esta redimido
				String estado = "R";
				int query = em2.createQuery(cambiarEstadoBono).setParameter("estado", estado)
						.setParameter("idTrans",
								"bahi"+redimirBonoDTO.getNumFactura() + "-" + redimirBonoDTO.getCodTerminal())
						.setParameter("fechaActualizacion", FechaUtil.datetoString(new Date()))
						.setParameter("codBono", redimirBonoDTO.getCodBono()).setParameter("estadoActivo", "S")
						.executeUpdate();
				if (query != 0) {
					respuestaGeneral.setEstado(true);
					respuestaGeneral.setMensaje("BONO REDIMIDO EXITOSAMENTE");
				} else {
					respuestaGeneral.setEstado(false);
					respuestaGeneral.setMensaje("NO SE PUDO REDIMIR BONO");
					errorLogBean.addErrorLog(respuestaGeneral.getMensaje() + " bono no se pudo redimir: " + redimirBonoDTO.getCodBono() + " factura: "
							+ redimirBonoDTO.getNumFactura(), this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"	Bahia");
							
				}
			return respuestaGeneral;

		}
			
}