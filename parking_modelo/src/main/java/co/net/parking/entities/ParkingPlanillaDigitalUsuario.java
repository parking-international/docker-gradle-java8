package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="parking_planilla_digital_usuario")
@NamedQueries({ 
	@NamedQuery(name = "usuario.login.planillas", query = "SELECT t FROM ParkingPlanillaDigitalUsuario t where t.cedula=:cedula AND t.password=:password AND t.estado=1"),
	@NamedQuery(name = "usuarios.consulta.planillas", query = "SELECT t FROM ParkingPlanillaDigitalUsuario t"),
	@NamedQuery(name = "usuario.update.planillas", query = "update ParkingPlanillaDigitalUsuario set nombre=:nuevoNombre,apellido=:nuevoApellido, estado=:nuevoEstado Where cedula=:cedula"),
	@NamedQuery(name = "usuario.consulta.planillas", query = "SELECT t FROM ParkingPlanillaDigitalUsuario t where t.cedula=:cedula"),
	@NamedQuery(name = "usuario.estado.update.planillas", query = "update ParkingPlanillaDigitalUsuario set estado=:nuevoEstado Where cedula=:cedula")

})  
public class ParkingPlanillaDigitalUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;

	private String apellido;

	private String  cedula;
	
	private String password;
	
	private int estado;
	
	
	@Column(name = "fecha_registro")
	private String fechaCreacion;
	
	public ParkingPlanillaDigitalUsuario() {
		
	}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	
	
}
