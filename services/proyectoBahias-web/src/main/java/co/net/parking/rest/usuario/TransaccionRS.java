package co.net.parking.rest.usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

import co.net.beparking.entities.BpCliente;
import co.net.beparking.entities.BpExtractoPunto;
import co.net.parking.beans.ErrorLogBean;
import co.net.parking.beans.TransaccionBean;
import co.net.parking.beans.UsuarioBean;

import co.net.parking.dto.ComprobantePerdidoDTO;
import co.net.parking.dto.DataComprobantePerdidoDTO;

import co.net.parking.dto.ExtractoBeparkingDTO;

import co.net.parking.dto.RespuestaGeneralDTO;
import co.net.parking.dto.RespuestaTransDTO;
import co.net.parking.dto.RespuestaTransaccionBahiasDTO;
import co.net.parking.dto.TransaccionComprobantePerdidoDTO;
import co.net.parking.dto.TransaccionDTO;

@Path("transaccion")
public class TransaccionRS {
	
	@EJB(name = "TransaccionBean")
	private TransaccionBean transaccionBean;
	
	@EJB(name = "ErrorLogBean")
	private ErrorLogBean errorLogBean;
	RespuestaGeneralDTO respuestaGeneral=new RespuestaGeneralDTO();
	
	
	@GET
	@Path("/test")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response test() {
		
		return Response.status(Status.OK).entity("ingreso servicio pago digital").build();
	}
	
	@POST
	@Path("insertarTransaccion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response insertTransaccion(TransaccionDTO transaccion) {
		Gson gson = new Gson();
		System.out.println("---objeto enviado--");
		System.out.println(gson.toJson(transaccion));
		System.out.println("-------");
		RespuestaTransDTO response = new RespuestaTransDTO();
		respuestaGeneral.setEstado(false);
		try {
			RespuestaTransaccionBahiasDTO respuesta= transaccionBean.insertaTransaccion(transaccion);
			
			if(respuesta.isEstado()) {
				response.setNumFactura(respuesta.getNumFactura());
				response.setPlaca(respuesta.getPlaca());
				response.setFechaEntrada(respuesta.getFechaEntrada());
				response.setFechaSalida(respuesta.getFechaSalida());
				response.setDuracion(respuesta.getDuracionMinutos());
				response.setValorServicio(respuesta.getValorServicio());
				response.setValorPerdido(respuesta.getValorComprobantePerdido());
				response.setSubTotal(respuesta.getValorServicio()+respuesta.getValorComprobantePerdido());
				response.setIva(respuesta.getIva());
				response.setTotal(respuesta.getTotal());
				response.setExtracto(respuesta.getExtracto());
				respuestaGeneral.setEstado(true);
				respuestaGeneral.setMensaje("Transaccion insertada correctamente");
				 SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		            String fecha2 = dateFormat.format(new Date());
		            Date date1 = dateFormat.parse("2021-01-01");
		            Date date2 = dateFormat.parse(fecha2);
		            
		            if(!date1.after(date2)){
		            	response.setContribuyentes("NO SOMOS GRANDES CONTRIBUYENTES DE ACUERDO AL ARTICULO-4 DE LA RESOLUCION 000105 DEL 23 DE NOVIEMBRE DE 2020-NO SOMOS AGENTE RETENEDOR DE IVA");    
		            } else {
		            	response.setContribuyentes("SOMOS GRANDES CONTRIBUYENTES SEGUN RESOLUCION-012635 DE DICIEMBRE 2018-Somos agentes de retencion del impuesto sobre las ventas");
		            }
				respuestaGeneral.setData(response);
				return Response.status(Status.OK).entity(respuestaGeneral).build();
			}else {
				if(respuesta.getMensaje().equals("NO FECHA")) {
					respuestaGeneral.setMensaje("No se pudo obtener datos de entrada");
					return Response.status(Status.BAD_REQUEST).entity(respuestaGeneral).build();
				}else {
					if(respuesta.getMensaje().equals("NO FACTURA")) {
						respuestaGeneral.setMensaje("No se pudo obtener datos de numero de facturacion");
						return Response.status(Status.BAD_REQUEST).entity(respuestaGeneral).build();
					}else {
						if(respuesta.getMensaje().equals("NO ENTRADA")) {
							respuestaGeneral.setMensaje("No existe entrada para el barcode");
							return Response.status(Status.BAD_REQUEST).entity(respuestaGeneral).build();
						}else {
						respuestaGeneral.setMensaje("Error insertando factura ");
						return Response.status(Status.BAD_REQUEST).entity(respuestaGeneral).build();
						}
					}
				}
			}
			
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(),ErrorLogBean.getNombreMetodo(),"Bahia");
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}	
	}

	@POST
	@Path("/guardarComprobantePerdido")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response guardarComprobantePerdido(TransaccionComprobantePerdidoDTO comprobantePerdido) {
		try {
			DataComprobantePerdidoDTO  dataComprobantePerdidoDTO=transaccionBean.insertaTransaccionComprobantePerdido(comprobantePerdido);
			if(dataComprobantePerdidoDTO==null) {
				respuestaGeneral.setEstado(false);
				respuestaGeneral.setMensaje("La placa no se encuentra registrada");
				return Response.status(Status.OK).entity(respuestaGeneral).build();
			}
			if(dataComprobantePerdidoDTO.getMensaje()!= null && dataComprobantePerdidoDTO.getMensaje().equals("OUT")) {
				respuestaGeneral.setEstado(false);
				respuestaGeneral.setMensaje("La placa  ya registra una salida");
				return Response.status(Status.OK).entity(respuestaGeneral).build();
			}
			dataComprobantePerdidoDTO.setDireccion(comprobantePerdido.getDireccion());
			dataComprobantePerdidoDTO.setIdentificacion(comprobantePerdido.getIdentificacion());
			dataComprobantePerdidoDTO.setMensaje("El   suscrito   usuario   del  servicio  de  parqueadero manifiesto: Que  extravio  la  boleta  de  registro  de  ingreso del   vehiculo que conduzco.\r\n" + 
					"para  retirar  el  vehiculo  presento  copia  de la tarjeta  de  propiedad,  copia  del seguro  obligatorio y copia de mi documento de identidad. \r\n" + 
					"Por lo tanto, declaro que        PARKING INTERNATIONAL S.A.S, no es responsable frente al suscrito, al propietario del vehiculo, ni frente a terceros en\r\n" + 
					"materia civil, penal o policiva  por reclamaciones judiciales o extrajudiciales que sobrevengan por este hecho.\r\n" + 
					"El vehiculo que retiro tiene las siguientes caracteristicas:");
			dataComprobantePerdidoDTO.setNombre(comprobantePerdido.getNombreCliente());
			dataComprobantePerdidoDTO.setPlaca(comprobantePerdido.getPlaca());
			dataComprobantePerdidoDTO.setTelefono(comprobantePerdido.getTelefono());
			transaccionBean.guardarDataComprobantePerdido(comprobantePerdido);
			RespuestaGeneralDTO respuesta = new RespuestaGeneralDTO();
			respuesta.setEstado(true);
			respuesta.setMensaje("Datos del comprobante perdido validados exitosamente");
			respuesta.setData(dataComprobantePerdidoDTO);
			return Response.status(Status.OK).entity(respuesta).build();
		} catch (Exception e) {
			errorLogBean.addErrorLog(e.getMessage(), ErrorLogBean.getNombreMetodo(), "Bahia");
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}

	}	
	
	

}
