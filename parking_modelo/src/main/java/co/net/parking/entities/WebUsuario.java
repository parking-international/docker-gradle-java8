/**
 * 
 */
package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
@Table(name = "web_usuarios")
@NamedQueries({
		@NamedQuery(name = "WebUsuario.login", query = "SELECT u FROM WebUsuario u WHERE u.username=:username AND u.password=:password AND u.estado=1"),
		@NamedQuery(name = "WebUsuario.findById", query = "SELECT u FROM WebUsuario u WHERE u.idusuario=:id"),
		@NamedQuery(name = "WebUsuario.findAll", query = "SELECT u FROM WebUsuario u") })
public class WebUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idusuario;

	@Column(length = 100)
	private String nombre;

	@Column(length = 100)
	private String apellido;

	@Column(length = 200)
	private String email;

	@Column(length = 15)
	private String username;

	@Column(length = 300)
	private String password;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_rol")
	private WebRol rol;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

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
	 * @param idusuario
	 *            El valor por establecer para idusuario
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
	 * @param nombre
	 *            El valor por establecer para nombre
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
	 * @param apellido
	 *            El valor por establecer para apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @param email
	 *            El valor por establecer para email
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @param username
	 *            El valor por establecer para username
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @param password
	 *            El valor por establecer para password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Devuelve el valor de rol
	 * 
	 * @return El valor de rol
	 */
	public WebRol getRol() {
		return rol;
	}

	/**
	 * Establece el valor de rol
	 * 
	 * @param rol
	 *            El valor por establecer para rol
	 */
	public void setRol(WebRol rol) {
		this.rol = rol;
	}

	/**
	 * Devuelve el valor de fechaCreacion
	 * 
	 * @return El valor de fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Establece el valor de fechaCreacion
	 * 
	 * @param fechaCreacion
	 *            El valor por establecer para fechaCreacion
	 */
	public void setFechaCreacion(Date fechaCreacion) {
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
	 * @param estado
	 *            El valor por establecer para estado
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
