package co.net.parking.rest.seguridad;

import java.security.Principal;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import co.net.parking.config.Secured;
import co.net.parking.enums.RolEnum;
import co.net.parking.pojos.Credenciales;
import co.net.parking.pojos.Usuario;
import co.net.parking.util.TokenUtil;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@parking.com.co>
 */
@Path("autenticacion")
public class AutenticacionRS {

    @GET
    @Secured({RolEnum.SIP_OPERARIO,RolEnum.SIP_SISTEMAS})
    public Response autenticarUsuario(@Context SecurityContext securityContext){
     Principal principal = securityContext.getUserPrincipal();
     String username = principal.getName();
     System.out.println(username);
     return Response.status(Status.OK).entity("metodo seguro").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response authenticateUser(Credenciales credenciales) {
        LoginRC loginRc = new LoginRC();
        Usuario user = loginRc.loginParkingWeb(credenciales);
        if(user != null){
            String token = TokenUtil.generarToken(user,720);
            return Response.status(Status.OK).entity(token).header("Authorization", "      "+token).build();
        }else{
            return Response.status(Status.UNAUTHORIZED).entity("No se pudo autenticar el usuario").build();
        }
    }


}
