package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name = "RUEDAZ_USUARIO")
@NamedQueries({
		@NamedQuery(name = "RuedazUsuario.findByDocument", query = "SELECT r FROM RuedazUsuario r WHERE r.identificacion=:identificacion"),
		@NamedQuery(name = "RuedazLoginCedula", query = "SELECT r FROM RuedazUsuario r WHERE r.identificacion=:identificacion"),
		@NamedQuery(name = "RuedazConsultaPreRegistro", query = "SELECT r FROM RuedazUsuario r WHERE r.identificacion=:identificacion AND r.estado=2"),
		@NamedQuery(name = "RuedazLoginCedulaPassword", query = "SELECT c FROM RuedazUsuario c WHERE c.identificacion=:identificacion AND c.contrasena=:contrasena"),
		@NamedQuery(name = "RuedazConsultaCelular", query = "SELECT t FROM RuedazUsuario t where t.celular=:celular AND t.estado=1"),
		@NamedQuery(name = "RuedazConsultaEmail", query = "SELECT t FROM RuedazUsuario t where t.correoElectronico=:correoElectronico AND t.estado=1"),
		@NamedQuery(name = "RuedazCodigo", query = "SELECT t FROM RuedazUsuario t where t.codigoSeguridad=:codigoSeguridad AND t.estado=1"),
		@NamedQuery(name = "RuedazUsuario.findByCode", query = "SELECT r FROM RuedazUsuario r WHERE r.codigoSeguridad= :codigo") })
public class RuedazUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "IDENTIFICACION")
	private String identificacion;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO")
	private String apellido;

	@Column(name = "FECHA_NACIMIENTO")
	private String fechaNacimiento;

	@Column(name = "CELULAR")
	private String celular;

	@Column(name = "CORREO_ELECTRONICO")
	private String correoElectronico;

	@Column(name = "CONTRASENA")
	private String contrasena;

	@Column(name = "CODIGO_SEGURIDAD")
	private String codigoSeguridad;

	@Column(name = "ACEPTACION_TERMINOS")
	private String aceptacionTerminos;

	@Column(name = "ESTADO")
	private int estado;

	@Column(name = "FECHA_CREACION")
	private String fechaCreacion;

	@Column(name = "DIRECCION")
	private String direccion;

	@Column(name = "CIUDAD")
	private String ciudad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	public String getAceptacionTerminos() {
		return aceptacionTerminos;
	}

	public void setAceptacionTerminos(String aceptacionTerminos) {
		this.aceptacionTerminos = aceptacionTerminos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}	
}