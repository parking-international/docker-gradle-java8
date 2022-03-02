/**
 *
 */
package co.net.parking.config;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@ApplicationPath("/rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.net.parking.rest.seguridad.AutenticacionRS.class);
        resources.add(co.net.parking.filter.AuthorizationFilter.class);
        resources.add(co.net.parking.filter.ResponseFilter.class);
        resources.add(co.net.parking.rest.usuario.UsuarioRS.class);
        resources.add(co.net.parking.rest.usuario.EntradaRS.class);
        resources.add(co.net.parking.rest.usuario.TerminalRS.class);
        resources.add(co.net.parking.rest.usuario.CierreTurnoRS.class);
        resources.add(co.net.parking.rest.usuario.TransaccionRS.class);

    }


}