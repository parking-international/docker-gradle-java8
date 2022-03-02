package co.net.parking.rest.usuario;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

import co.net.beparking.entities.BpBono;
import co.net.parking.beans.EntradaBean;
import co.net.parking.beans.ErrorLogBean;
import co.net.parking.beans.TransaccionBean;
import co.net.parking.beans.UsuarioBean;
import co.net.parking.dto.CambioPasswordDTO;
import co.net.parking.dto.CierreDiaDTO;
import co.net.parking.dto.ComprobantePerdidoDTO;
import co.net.parking.dto.LoginUsuarioDTO;
import co.net.parking.dto.RedimirBonoDTO;
import co.net.parking.dto.RespuestaCierreDiaDTO;
import co.net.parking.dto.RespuestaGeneralDTO;
import co.net.parking.dto.RespuestaLoginUsuarioDTO;
import co.net.parking.entities.CierreDia;

@Path("usuario")
public class UsuarioRS {

	@EJB(name = "UsuarioBean")
	private UsuarioBean usuarioBean;
	
	@EJB(name = "EntradaBean")
	private EntradaBean entradaBean;
	
	@EJB(name = "TransaccionBean")
	private TransaccionBean transaccionBean;
	
	Gson gson= new Gson();
	
	
	
	@EJB(name = "ErrorLogBean")
	private ErrorLogBean errorLogBean;
	RespuestaGeneralDTO respuestaGeneral=new RespuestaGeneralDTO();
	
	
	
	
	@POST
	@Path("/cambiarPassword")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response cambiarPassword(CambioPasswordDTO pass) {
		try {
			RespuestaGeneralDTO respuesta = usuarioBean.cambioPassword(pass);
			return Response.status(Status.OK).entity(respuesta).build();
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "PagoD");
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}

	}

	
	@GET
	@Path("/prueba")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response test() {
		
		return Response.status(Status.OK).entity("ingreso servicio pago digital").build();
	}
	
		@POST
		@Path("/login")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response loguin(LoginUsuarioDTO loginUsuario){
			try {
			RespuestaLoginUsuarioDTO usuarioData=usuarioBean.auteticarUsuario(loginUsuario);
			if(usuarioData!=null) {
			respuestaGeneral.setEstado(true);
			respuestaGeneral.setMensaje("Login correcto");
			respuestaGeneral.setData(usuarioData);
			return Response.status(Status.OK).entity(respuestaGeneral).build();
			}else {
				respuestaGeneral.setEstado(false);
				respuestaGeneral.setMensaje("Usuario o password incorrecto");
				return Response.status(Status.OK).entity(respuestaGeneral).build();
			}
			
			}catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),ErrorLogBean.getNombreMetodo(),"Bahia");
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
		}
		
		@POST
		@Path("/cierreDia")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response cierreDia(CierreDiaDTO cierreDiaDTO) {
			try {
				CierreDia cierreDia = usuarioBean.consultarCierreDia(cierreDiaDTO.getCodTerminal());
				if (cierreDia == null) {
					CierreDia cierreD = transaccionBean.insertaCierraDia(cierreDiaDTO);
					RespuestaCierreDiaDTO respuesta=new RespuestaCierreDiaDTO();
					respuesta.setApertura(cierreD.getFechaInicial());
					respuesta.setCierre(cierreD.getFechaFinal());
					respuesta.setCantidadTurnos(String.valueOf(cierreD.getTurnos()));
					respuesta.setFacturaInicial(cierreD.getFacturaIni());
					respuesta.setFacturaFinal(cierreD.getFacturaFin());
					respuesta.setEfectivoTotal(String.valueOf(cierreD.getTotalEfectivo()));
					respuesta.setSubtotal(String.valueOf(cierreD.getSubtotal()));
					respuesta.setIva(String.valueOf(cierreD.getIvaEfectivo()));
					respuesta.setTotal(String.valueOf(cierreD.getTotal()));
					respuesta.setEfectivoReportado(String.valueOf(cierreD.getTotalEfectivoDia()));
					int calculo=cierreD.getTotalEfectivo()-cierreD.getTotalEfectivoDia();
					respuesta.setEfectivoAEntregar("0");
					respuesta.setFaltante(String.valueOf(cierreD.getFaltante()));
					respuesta.setSobrante(String.valueOf(cierreD.getSobrante()));
					if(calculo<0) {
					respuesta.setEfectivoAEntregar(String.valueOf(cierreD.getTotalEfectivoDia()));
					}else {
						respuesta.setEfectivoAEntregar(String.valueOf(cierreD.getTotalEfectivo()));
					}
					transaccionBean.actualizaInicioDia(cierreDiaDTO.getIdInicioTurno(),cierreDiaDTO.getCodTerminal());
					
					RespuestaGeneralDTO respuestaGeneral=new RespuestaGeneralDTO();
					respuestaGeneral.setEstado(true);
					respuestaGeneral.setMensaje("Cierre de dia registrado exitosamente");
					respuestaGeneral.setData(respuesta);
						return Response.status(Status.OK).entity(respuestaGeneral).build();

				}else {
					respuestaGeneral.setEstado(false);
					respuestaGeneral.setMensaje("El dia ya se encuentra cerrado, fecha cierre "+ cierreDia.getFechaFinal());
					return Response.status(Status.OK).entity(respuestaGeneral).build();
				}
			}catch(Exception e)
		{
			respuestaGeneral.setEstado(false);
			respuestaGeneral.setMensaje(String.valueOf("No se pudo realizar el cierre de dia" + e.getMessage()));
			respuestaGeneral.setDetalle("");
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(respuestaGeneral).build();
		}
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/consultaBeparking/{identificacion}")
		public Response consultarClienteOperacion(@PathParam("identificacion") String identificacion) {
			try {
				RespuestaGeneralDTO JsonResult = usuarioBean.consultarClienteOperacion(identificacion);
				if (JsonResult != null) {
					return Response.status(Status.OK).entity(JsonResult).build();
				} else {
					return Response.status(Status.OK).entity("NO SE ENCONTRARON DATOS").build();
				}
			} catch (Exception e) {
				ByteArrayOutputStream os = new ByteArrayOutputStream();
				PrintStream ps = new PrintStream(os);
				e.printStackTrace(ps);
				ps.flush();
				errorLogBean.addErrorLog(new String(os.toByteArray()), this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(), "Bahia");
				return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
			}
		}
		@POST
		@Path("/redimirBonos")
		@Produces(MediaType.APPLICATION_JSON)
		public RespuestaGeneralDTO redimirBono(RedimirBonoDTO redimirBonoDTO) {
			RespuestaGeneralDTO respuestaGeneral=new RespuestaGeneralDTO();
			boolean datosCompleatos = this.validarCamposRedencion(redimirBonoDTO);
			if (datosCompleatos) {
				try {
					BpBono bono = usuarioBean.consultaBonoCodigo(redimirBonoDTO.getCodBono());
					if (bono.getCedula() != null) {
						if (bono.getEstado().equals("S")) {
							
							
						respuestaGeneral=usuarioBean.redimirBono(redimirBonoDTO);
							
						} else {
							respuestaGeneral.setEstado(false);
							respuestaGeneral.setMensaje("BONO YA FUE UTILIZADO");
						}
					} else {
						respuestaGeneral.setEstado(false);
						respuestaGeneral.setMensaje("BONO NO EXISTE");
					}

				} catch (Exception e) {
					respuestaGeneral.setEstado(false);
					respuestaGeneral.setMensaje("NO SE PUDO REDIMIR BONO");
					errorLogBean.addErrorLog(respuestaGeneral.getMensaje() + "-" + gson.toJson(redimirBonoDTO), this.getClass().getName() + " metodo : " + ErrorLogBean.getNombreMetodo(),"Bahia");
					
				}
			} else {
				respuestaGeneral.setEstado(false);
				respuestaGeneral.setMensaje("DATOS INCOMPLETOS");
				errorLogBean.addErrorLog(respuestaGeneral.getMensaje() + "-" + gson.toJson(redimirBonoDTO),
						this.getClass().getName() + " metodo: " + ErrorLogBean.getNombreMetodo(),"Bahia");
			}

			return respuestaGeneral;

		}

		/**
		 * metodo que valida los campos obligatorios para redimir un bono
		 * 
		 * @param redimirBonoDTO
		 * @return
		 */
		public boolean validarCamposRedencion(RedimirBonoDTO redimirBonoDTO) {
			boolean completos = true;
			try {
				if (redimirBonoDTO.getCodBono() == null || redimirBonoDTO.getCodTerminal() == null
						|| redimirBonoDTO.getNumFactura() == null) {
					completos = false;
				} else if (redimirBonoDTO.getCodBono().isEmpty() || redimirBonoDTO.getCodTerminal().isEmpty()
						|| redimirBonoDTO.getNumFactura().isEmpty()) {
					completos = false;
				}
			} catch (Exception e) {
				errorLogBean.addErrorLog(e.getMessage() + " Error validando campos",
						this.getClass().getName() + " metodo: " + ErrorLogBean.getNombreMetodo(),"Bahia");
			}

			return completos;

		}
		
		
}