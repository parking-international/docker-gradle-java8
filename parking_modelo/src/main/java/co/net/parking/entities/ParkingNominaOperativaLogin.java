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
@Table(name="parking_nomina_operativa_login")
@NamedQueries({
@NamedQuery(name = "ParkingNominaOperativaLogin.getAll", query = "SELECT e FROM ParkingNominaOperativaLogin e  "),
@NamedQuery(name = "ParkingNominaOperativaLogin.updateTurno", query = "UPDATE ParkingNominaOperativaLogin SET fechaSalida=:fecha WHERE codPark=:codPark and cedula=:cedula and fechaSalida is null  " )
})
public class ParkingNominaOperativaLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name= "cod_park")
	private String codPark;
	@Column(name = "cod_terminal")
	private String codTerminal;
	private String usuario;
	private String cedula;
	@Column(name = "nombre_apellido")
	private String nombreApellido;
	private String cargo;
	@Column(name = "fecha_ingreso")
	private String fechaIngreso;
	@Column(name = "fecha_salida")
	private String fechaSalida;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodPark() {
		return codPark;
	}
	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	


}
