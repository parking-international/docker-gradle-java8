/**
 * 
 */
package co.net.parking.dto;

import java.io.Serializable;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
public class WebUsuarioDto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idusuario;

	private String nombre;

	private String apellido;

	private String username;

	private String email;

	private String password;

	private String passwordCheck;

	private Integer idRol;

	private String fechaCreacion;

	private Integer estado;

	/**
	 * Devuelve el valor de idusuario
	 * 
	 * @return El valor de idusuario
	 */
	public Integer getIdusuario() {
		return idusuario;
	}

	/**
	 * Establece el valor de idusuario
	 * 
	 * @param idusuario El valor por establecer para idusuario
	 */
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	/**
	 * Devuelve el valor de nombre
	 * 
	 * @return El valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el valor de nombre
	 * 
	 * @param nombre El valor por establecer para nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor de apellido
	 * 
	 * @return El valor de apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Establece el valor de apellido
	 * 
	 * @param apellido El valor por establecer para apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Devuelve el valor de username
	 * 
	 * @return El valor de username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Establece el valor de username
	 * 
	 * @param username El valor por establecer para username
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/**
	 * Devuelve el valor de email
	 * 
	 * @return El valor de email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Establece el valor de email
	 * 
	 * @param email El valor por establecer para email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Devuelve el valor de password
	 * 
	 * @return El valor de password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Establece el valor de password
	 * 
	 * @param password El valor por establecer para password
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * Devuelve el valor de passwordCheck
	 * 
	 * @return El valor de passwordCheck
	 */
	public String getPasswordCheck() {
		return passwordCheck;
	}

	/**
	 * Establece el valor de passwordCheck
	 * 
	 * @param passwordCheck El valor por establecer para passwordCheck
	 */
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	/**
	 * Devuelve el valor de idRol
	 * 
	 * @return El valor de idRol
	 */
	public Integer getIdRol() {
		return idRol;
	}

	/**
	 * Establece el valor de idRol
	 * 
	 * @param idRol El valor por establecer para idRol
	 */
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	/**
	 * Devuelve el valor de fechaCreacion
	 * 
	 * @return El valor de fechaCreacion
	 */
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Establece el valor de fechaCreacion
	 * 
	 * @param fechaCreacion El valor por establecer para fechaCreacion
	 */
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Devuelve el valor de estado
	 * 
	 * @return El valor de estado
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * Establece el valor de estado
	 * 
	 * @param estado El valor por establecer para estado
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}



}
