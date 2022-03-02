/**
 *
 */
package co.net.parking.rest.usuario;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import co.net.parking.beans.CierreTurnoBean;
import co.net.parking.dto.CierreTurnoDTO;
import co.net.parking.dto.RespuestaCierreTurnoDTO;
import co.net.parking.dto.RespuestaGeneralDTO;

/**
 *
 * @author kayala <kayala@heinsohn.com.co>
 */
@Path("cierreTurno")
public class CierreTurnoRS {

	@EJB(name = "CierreTurnoBean")
	private CierreTurnoBean cierreTurnoBean;


	@POST
	@Path("cierre")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response setTransaccionCierreTurno(CierreTurnoDTO cierreTurnodto) { /*CierreTurno cierreTurno*/		
		try {
			Gson gson=new Gson();
			String json=gson.toJson(cierreTurnodto);
			System.out.print(json);
			
			RespuestaCierreTurnoDTO respuestaCierreTurno=cierreTurnoBean.armarCiereTurno(cierreTurnodto);
			RespuestaGeneralDTO respuesta=new RespuestaGeneralDTO();
			respuesta.setEstado(true);
			respuesta.setMensaje("Cierre de turno exitoso");
			respuesta.setData(respuestaCierreTurno);
			return Response.status(Response.Status.OK).entity(respuesta).build();
		}
		catch (Exception e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Error", e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error persistiendo los datos")
					.build();
		}

	}
	
	
	@POST
	@Path("test")
	public Response setTransaccionCierreTurn() { /*CierreTurno cierreTurno*/

		try {

			System.out.println("llego");
			return Response.status(Response.Status.OK).entity("Transaccion correcta").build();
		}
		catch (Exception e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Error", e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error persistiendo los datos")
					.build();
		}

	}
}
