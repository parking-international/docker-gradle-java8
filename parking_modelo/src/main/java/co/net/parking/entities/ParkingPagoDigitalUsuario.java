package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="parking_pago_digital_usuario")
@NamedQueries({ 
	@NamedQuery(name = "usuario.findByIdentificacion", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.identificacion=:identificacion AND t.estado=1"),
	@NamedQuery(name = "usuario.PaswordIdentificacion", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.identificacion=:identificacion AND t.password=:password AND  t.estado=1"),
	@NamedQuery(name = "usuario.login", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.email=:email AND t.password=:password AND t.estado=1"),
	@NamedQuery(name = "usuario.findByEmail", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.email=:email AND t.estado=1")
})  

public class ParkingPagoDigitalUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "tipo_identificacion")
	private int tipoIdentificacion;
	
	private String identificacion;
	
	private String nombre;

	private String apellido;

	private String  email;

	private String celular;
	
	private String password;

	private String direccion;
	
	private String ciudad;
	
	private int estado;
	
	private int renovar;
	
	@Column(name = "fecha_creacion")
	private String fechaCreacion;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public int getRenovar() {
		return renovar;
	}

	public void setRenovar(int renovar) {
		this.renovar = renovar;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}