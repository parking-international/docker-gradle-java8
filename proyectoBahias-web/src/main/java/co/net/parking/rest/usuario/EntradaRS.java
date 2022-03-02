package co.net.parking.rest.usuario;

import java.util.List;

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

import co.net.parking.beans.EntradaBean;
import co.net.parking.beans.ErrorLogBean;
import co.net.parking.beans.UsuarioBean;
import co.net.parking.dto.EntradaDTO;
import co.net.parking.dto.ListaEntradasParqueaderoDTO;
import co.net.parking.dto.OcupacionParqueaderoDTO;
import co.net.parking.dto.RespuestaEntradaPlacaDTO;
import co.net.parking.dto.RespuestaGeneralDTO;

@Path("entrada")
public class EntradaRS {
	@EJB(name = "EntradaBean")
	private EntradaBean entradaBean;

	@EJB(name = "ErrorLogBean")
	private ErrorLogBean errorLogBean;
	RespuestaGeneralDTO respuestaGeneral = new RespuestaGeneralDTO();

	@POST
	@Path("/insertarEntrada")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertarEntrada(EntradaDTO dto) {
		RespuestaGeneralDTO respuesta = new RespuestaGeneralDTO();
		RespuestaEntradaPlacaDTO res = new RespuestaEntradaPlacaDTO();
		boolean flag = false;
		try {
			res = entradaBean.insertaEntrada(dto);
			if (res.isEstado()) {
				respuesta.setEstado(true);
				respuesta.setMensaje("Entrada de placa: "+ dto.getPlaca() +" insertada correctamente");
				return Response.status(Status.OK).entity(respuesta).build();
			} else {
				if(res.getMensaje().equals("ERROR")) {
				respuesta.setEstado(false);
				respuesta.setMensaje("Error insertando entrada");
				return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
				}else {
					if(res.getMensaje().equals("EXISTE")) {
				respuesta.setEstado(false);
				respuesta.setMensaje("La placa "+dto.getPlaca()+" ya tiene una entrada");
				return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
					}else {
						if(res.getMensaje().equals("SEGURIDAD")) {
							respuesta.setEstado(false);
							respuesta.setMensaje("La placa: "+dto.getPlaca()+" reporta como bloqueada");
							return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
						}else {
							if(res.getMensaje().equals("BICI")) {
								respuesta.setEstado(false);
								respuesta.setMensaje("No se registro nombre o cedula");
								return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
							}
						}
					}
				}
			}

		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Pbahias");
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
		respuesta.setEstado(false);
		respuesta.setMensaje("Error insertando entrada");
		return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
	}
	@GET
	@Path("/entradasParqueadero/{codPark}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultaEntradasParqueadero(@PathParam("codPark") String codPark) {
		RespuestaGeneralDTO respuesta=new RespuestaGeneralDTO();
		List<ListaEntradasParqueaderoDTO> entradasParqueadero=entradaBean.consultaEntradasParqueadero(codPark);
		try {
		if(entradasParqueadero!=null&&entradasParqueadero.size()>0) {
			respuesta.setEstado(true);
			respuesta.setMensaje("consulta de entradas exitosa");
			respuesta.setData(entradasParqueadero);
		return Response.status(Status.OK).entity(respuesta).build();
		}else {
			respuesta.setEstado(true);
			respuesta.setMensaje("no hay vehiculos dentro del parqueadero");
			return Response.status(Status.OK).entity(respuesta).build();
		}
	}catch (Exception e) {
		errorLogBean.addErrorLog(e.getMessage(),ErrorLogBean.getNombreMetodo(),"Bahia");
		return Response.status(Status.INTERNAL_SERVER_ERROR).build();
	}
}
	@GET
	@Path("/ocupacionParqueadero/{codPark}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultarCuposParqueadero(@PathParam("codPark") String codPark) {
		RespuestaGeneralDTO respuesta=new RespuestaGeneralDTO();
		OcupacionParqueaderoDTO ocupacionParqueadero=entradaBean.consultarCuposParqueadero(codPark);
		try {
		if(ocupacionParqueadero!=null) {
			respuesta.setEstado(true);
			respuesta.setMensaje("consulta de ocupacion exitosa");
			respuesta.setData(ocupacionParqueadero);
		return Response.status(Status.OK).entity(respuesta).build();
		}else {
			respuesta.setEstado(true);
			respuesta.setMensaje("no hay vehiculos dentro del parqueadero");
			return Response.status(Status.OK).entity(respuesta).build();
		}
	}catch (Exception e) {
		errorLogBean.addErrorLog(e.getMessage(),ErrorLogBean.getNombreMetodo(),"Bahia");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
	}
}
}
