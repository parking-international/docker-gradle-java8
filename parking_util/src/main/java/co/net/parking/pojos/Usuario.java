/**
 *
 */
package co.net.parking.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import co.net.parking.enums.RolEnum;

/**
 * <b>Descripcion:</b> Clase que representa el usuario logueado<br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@XmlRootElement
public class Usuario implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -1L;

    private String idUsuario;
    private String nombre;
    private List<RolEnum> roles;

    /**
     *
     */
    public Usuario() {
        roles = new ArrayList<RolEnum>();
    }
      
    

    /**
     * Devuelve el valor de idUsuario
     * @return El valor de idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }



    /**
     * Establece el valor de idUsuario
     * @param idUsuario El valor por establecer para idUsuario
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }



    /**
     * Devuelve el valor de nombre
     * @return El valor de nombre
     */
    public String getNombre() {
        return nombre;
    }



    /**
     * Establece el valor de nombre
     * @param nombre El valor por establecer para nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    /**
     * Devuelve el valor de roles
     * @return El valor de roles
     */
    public List<RolEnum> getRoles() {
        return roles;
    }



    /**
     * Establece el valor de roles
     * @param roles El valor por establecer para roles
     */
    public void setRoles(List<RolEnum> roles) {
        this.roles = roles;
    }



    public void addRol(RolEnum rol){
        roles.add(rol);
    }
}
