/**
 *
 */
package co.net.parking.filter;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

import com.auth0.jwt.JWTExpiredException;
import com.sun.jersey.core.util.Priority;
import co.net.parking.config.Secured;
import co.net.parking.enums.RolEnum;
import co.net.parking.pojos.Usuario;
import co.net.parking.util.TokenUtil;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */

@Provider
@Secured
@Priority(4000)
public class AuthorizationFilter implements ContainerRequestFilter {

    @Context
    private ResourceInfo resourceInfo;

    private Usuario user;

    @Context
    private SecurityContext securityContext;

    private Logger LOGGER = Logger.getLogger(AuthorizationFilter.class.getName());


    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        String autenticacionHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION );

        if (autenticacionHeader == null || !autenticacionHeader.startsWith("Bearer")) {
            throw new NotAuthorizedException("Error de autenticación");
        }

       String token = autenticacionHeader.substring("Bearer".length()).trim();
       requestContext.getHeaders().putSingle("Authorization", "Bearer "+token);

        try {
            user = TokenUtil.validarToken(token);
        } catch (JWTExpiredException e) {
            requestContext.abortWith(
                    Response.status(Response.Status.UNAUTHORIZED).entity("token expirado").build());
            return;
        }catch (Exception e) {
            requestContext.abortWith(
                    Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error validando el token").build());
            return;
        }

        if( user == null){
            requestContext.abortWith(
                    Response.status(Response.Status.UNAUTHORIZED).entity("Usuario no autenticado").build());
            return;
        }
        requestContext.setProperty("usuario", user);


        requestContext.setSecurityContext(new SecurityContext() {

            @Override
            public Principal getUserPrincipal() {

                return new Principal() {

                    @Override
                    public String getName() {
                        return user.getIdUsuario();
                    }
                };
            }

            @Override
            public boolean isUserInRole(String role) {
               return true;
            }

            @Override
            public boolean isSecure() {
                return false;
            }

            @Override
            public String getAuthenticationScheme() {
                return null;
            }
        });

        Class<?> resourceClass = resourceInfo.getResourceClass();
        List<RolEnum> classRoles = extractRoles(resourceClass);

        java.lang.reflect.Method resourceMethod = resourceInfo.getResourceMethod();
        List<RolEnum> methodRoles = extractRoles(resourceMethod);
        try {

            boolean tienePermiso = false;
            if (methodRoles.isEmpty()) {
                tienePermiso = checkPermissions(classRoles);
            } else {
                tienePermiso = checkPermissions(methodRoles);
            }

            if(!tienePermiso){
                requestContext.abortWith(
                        Response.status(Response.Status.FORBIDDEN).build());
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE,"Error validando permisos",e);
            requestContext.abortWith(
                Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build());
        }
    }

    private List<RolEnum> extractRoles(AnnotatedElement annotatedElement) {
        if (annotatedElement == null) {
            return new ArrayList<RolEnum>();
        } else {
            Secured secured = annotatedElement.getAnnotation(Secured.class);
            if (secured == null) {
                return new ArrayList<RolEnum>();
            } else {
                RolEnum[] allowedRoles = secured.value();
                return Arrays.asList(allowedRoles);
            }
        }
    }

    private boolean checkPermissions(List<RolEnum> allowedRoles) throws Exception {
        if(user != null){
            List<RolEnum> rolesUsuario = user.getRoles();
            if(rolesUsuario != null){
                for (RolEnum roleMethod : allowedRoles) {
                    for (RolEnum rolUser : rolesUsuario) {
                        if(rolUser.equals(roleMethod)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
