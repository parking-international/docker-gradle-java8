package co.net.parking.rest.usuario;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import co.net.parking.beans.ErrorLogBean;
import co.net.parking.beans.TerminalBean;
import co.net.parking.dto.InformacionTerminalBahiasDTO;
import co.net.parking.dto.RespuestaGeneralDTO;

@Path("terminal")
public class TerminalRS {

	@EJB(name = "TerminalBean")
	private TerminalBean terminalBean;

	@EJB(name = "ErrorLogBean")
	private ErrorLogBean errorLogBean;
	

	@SuppressWarnings("unused")
	@GET
	@Path("getInformacionTerminal/{codTerminal}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getInformacionTerminal(@PathParam("codTerminal") String codTerminal) {
		RespuestaGeneralDTO respuesta = new RespuestaGeneralDTO();
	//	RespuestaTerminalDTO terminal = new RespuestaTerminalDTO();
		InformacionTerminalBahiasDTO terminal = new InformacionTerminalBahiasDTO();
		
		try {
			//terminal = terminalBean.getInformacionTerminalValidacion(codTerminal);
			terminal = terminalBean.getInfoTerminal(codTerminal);
			if(terminal!=null) {
				if(terminal.getCodTerminal().equals("NO TERMINAL")) {
					terminal.setCodTerminal(null);
					respuesta.setEstado(false);
					respuesta.setMensaje("No existe terminal");
					return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
				}else {
					if(terminal.getCodTerminal().equals("NO RANGO")) {
						terminal.setCodTerminal(null);
						respuesta.setEstado(false);
						respuesta.setMensaje("No existe informacion de facturacion");
						return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
					}else {
						if(terminal.getCodTerminal().equals("NO RESOLUCION")) {
							terminal.setCodTerminal(null);
							respuesta.setEstado(false);
							respuesta.setMensaje("No existe informacion de resolucion");
							return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
						}else {
							if(terminal.getCodTerminal().equals("NO TARIFAS")) {
								terminal.setCodTerminal(null);
								respuesta.setEstado(false);
								respuesta.setMensaje("No existe informacion de tarifas");
								return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
							}else {
								if(terminal.getCodTerminal().equals("NO POLIZA")) {
									terminal.setCodTerminal(null);
									respuesta.setEstado(false);
									respuesta.setMensaje("No existe informacion de poliza");
									return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
								}else {
									if(terminal.getCodTerminal().equals("NO HORARIO")) {
										terminal.setCodTerminal(null);
										respuesta.setEstado(false);
										respuesta.setMensaje("No existe informacion de horario");
										return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
									}else {
									respuesta.setEstado(true);
									respuesta.setMensaje("Informacion de terminal OK");
								   
						            respuesta.setData(terminal);
									return Response.status(Status.OK).entity(respuesta).build();
									}
								}
							}
						}
					}
				}
					

			}else {
			respuesta.setEstado(false);
			respuesta.setMensaje("No se pudo obtener informacion de terminal");
			return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
			}
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Pbahias");
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}
