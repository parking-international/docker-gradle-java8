/**
 *
 */
package co.net.parking.rest.seguridad;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import co.net.parking.pojos.Credenciales;
import co.net.parking.pojos.Usuario;
import co.net.parking.util.ConstantesUtil;


/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
public class LoginRC {

    private WebResource recurso;
    /**
     *
     */
    public LoginRC() {
        ClientConfig config = new DefaultClientConfig();
        ((DefaultClientConfig) config).getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client cliente = Client.create(config);
        recurso = cliente.resource(ConstantesUtil.URL_RC_SEGURIDAD);
    }

    public Usuario loginSip(Credenciales credenciales){
        Usuario user = null;
        recurso = recurso.path("sip");
        ClientResponse response = recurso.type(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, credenciales);


        if(response.getStatus() ==  ClientResponse.Status.OK.getStatusCode()){
            user = response.getEntity(Usuario.class);
        }

        return user;
    }

    public Usuario loginBeParking(Credenciales credenciales){
        Usuario user = null;
        recurso = recurso.path("beParking");
        ClientResponse response = recurso.type(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, credenciales);


        if(response.getStatus() ==  ClientResponse.Status.OK.getStatusCode()){
            user = response.getEntity(Usuario.class);
        }

        return user;
    }

    public Usuario loginAplicacion(Credenciales credenciales){
        Usuario user = null;
        recurso = recurso.path("aplicacion");
        ClientResponse response = recurso.type(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, credenciales);

        if(response.getStatus() ==  ClientResponse.Status.OK.getStatusCode()){
            user = response.getEntity(Usuario.class);
        }

        return user;
    }
    
    public Usuario loginParkingWeb(Credenciales credenciales){
        Usuario user = null;
        recurso = recurso.path("parkingWeb");
        ClientResponse response = recurso.type(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, credenciales);

        if(response.getStatus() ==  ClientResponse.Status.OK.getStatusCode()){
            user = response.getEntity(Usuario.class);
        }

        return user;
    }

}
