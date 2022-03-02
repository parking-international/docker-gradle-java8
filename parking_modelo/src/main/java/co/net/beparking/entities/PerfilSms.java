package co.net.beparking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 */
@Entity
@Table(name = "perfil_sms")
@NamedQueries({@NamedQuery(name = "PerfilSms.findAllId", query = " SELECT u.id FROM PerfilSms u WHERE u.estado = 1 "),
	@NamedQuery(name = "PerfilSms.findAll", query = " SELECT u FROM PerfilSms u "),
	@NamedQuery(name = "PerfilSms.findById", query = " SELECT u FROM PerfilSms u where u.id = :id")})
public class PerfilSms implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") private int id;

	@Column(name = "usuario") private String usuario;

	@Column(name = "contrasena") private String contrasena;

	@Column(name = "descripcion") private String descripcion;

	@Column(name = "fecha_creacion") private Date fecha_creacion;

	@Column(name = "fecha_actualizacion") private Date fecha_actualizacion;

	@Column(name = "estado") private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_actualizacion() {
		return fecha_actualizacion;
	}

	public void setFecha_actualizacion(Date fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}


}
