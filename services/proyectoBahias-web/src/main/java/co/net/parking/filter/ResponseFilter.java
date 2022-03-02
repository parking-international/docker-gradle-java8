/**
 *
 */
package co.net.parking.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;


/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@Provider
public class ResponseFilter implements ContainerResponseFilter{

    /* (non-Javadoc)
     * @see javax.ws.rs.container.ContainerResponseFilter#filter(javax.ws.rs.container.ContainerRequestContext, javax.ws.rs.container.ContainerResponseContext)
     */
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
    	responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        responseContext.getHeaders().add("Access-Control-Allow-Methods","GET,POST,PUT,DELETE,PATCH,OPTIONS");
        responseContext.getHeaders().add("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept, Authorization");
        responseContext.getHeaders().add("Access-Control-Expose-Headers","Authorization,Access-Control-Allow-Origin,Access-Control-Allow-Headers,Access-Control-Allow-Methods,content-type");

        String token = requestContext.getHeaderString("Authorization");
        responseContext.getHeaders().add("Authorization",token);

    }

}
