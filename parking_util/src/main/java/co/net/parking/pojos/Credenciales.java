/**
 *
 */
package co.net.parking.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@XmlRootElement
public class Credenciales implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 5300974726061863893L;
    private String usuarioAplicacion;
    private String claveAplicacion;
    private String usuario;
    private String clave;


    /**
     * Devuelve el valor de usuarioAplicacion
     * @return El valor de usuarioAplicacion
     */
    public String getUsuarioAplicacion() {
        return usuarioAplicacion;
    }
    /**
     * Establece el valor de usuarioAplicacion
     * @param usuarioAplicacion El valor por establecer para usuarioAplicacion
     */
    public void setUsuarioAplicacion(String usuarioAplicacion) {
        this.usuarioAplicacion = usuarioAplicacion;
    }
    /**
     * Devuelve el valor de claveAplicacion
     * @return El valor de claveAplicacion
     */
    public String getClaveAplicacion() {
        return claveAplicacion;
    }
    /**
     * Establece el valor de claveAplicacion
     * @param claveAplicacion El valor por establecer para claveAplicacion
     */
    public void setClaveAplicacion(String claveAplicacion) {
        this.claveAplicacion = claveAplicacion;
    }
    /**
     * Devuelve el valor de usuario
     * @return El valor de usuario
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Establece el valor de usuario
     * @param usuario El valor por establecer para usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Devuelve el valor de clave
     * @return El valor de clave
     */
    public String getClave() {
        return clave;
    }
    /**
     * Establece el valor de clave
     * @param clave El valor por establecer para clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }


}
