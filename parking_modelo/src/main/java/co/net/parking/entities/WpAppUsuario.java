package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the wp_app_usuario database table.
 * 
 */
@Entity
@Table(name = "wp_app_usuario")
@NamedQueries({
		@NamedQuery(name = "WpAppUsuario.findAll", query = "SELECT w FROM WpAppUsuario w"),
		@NamedQuery(name = "WpAppUsuario.findByIdentificacion", query = "SELECT w FROM WpAppUsuario w where w.identificacion=:identificacion"),	
		@NamedQuery(name = "WpAppUsuario.findByEmail", query = "SELECT w FROM WpAppUsuario w where w.email=:email") })

public class WpAppUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String apellido;

	private String celular;

	private String email;

	private short estado;

	@Column(name = "fecha_nacimiento")
	private String fechaNacimiento;

	@Column(name = "fecha_registro")
	private String fechaRegistro;

	private String genero;

	private String identificacion;

	@Column(name = "marca_vehiculo")
	private String marcaVehiculo;

	@Column(name = "modelo_vehiculo")
	private String modeloVehiculo;

	private String nombre;

	private String password;

	private String placas;
	
	private String direccion;
	
	@Column(name = "cod_ciudad_residencia")
	private String codCiudadResidencia;
	
	@Column(name = "codigo_aceptacion")
	private String codigoAceptacion;

	public WpAppUsuario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getMarcaVehiculo() {
		return this.marcaVehiculo;
	}

	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}

	public String getModeloVehiculo() {
		return this.modeloVehiculo;
	}

	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlacas() {
		return this.placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodCiudadResidencia() {
		return codCiudadResidencia;
	}

	public void setCodCiudadResidencia(String codCiudadResidencia) {
		this.codCiudadResidencia = codCiudadResidencia;
	}

	public String getCodigoAceptacion() {
		return codigoAceptacion;
	}

	public void setCodigoAceptacion(String codigoAceptacion) {
		this.codigoAceptacion = codigoAceptacion;
	}
	
	

}