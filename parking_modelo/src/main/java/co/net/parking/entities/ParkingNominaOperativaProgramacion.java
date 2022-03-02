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
@Table(name="parking_nomina_operativa_programacion")
@NamedQueries({
@NamedQuery(name = "ParkingNominaOperativaProgramacion.getAll", query = "SELECT e FROM ParkingNominaOperativaProgramacion e order by fecha desc "),
@NamedQuery(name = "ParkingNominaOperativaProgramacion.getByCedula", query = "SELECT e FROM ParkingNominaOperativaProgramacion e where e.cedula=:cedula order by fecha desc "),
@NamedQuery(name = "ParkingNominaOperativaProgramacion.getByParqueadero", query = "SELECT e FROM ParkingNominaOperativaProgramacion e where e.parqueadero=:parqueadero order by fecha desc "),
@NamedQuery(name = "ParkingNominaOperativaProgramacion.getByParqueaderoCedula", query = "SELECT e FROM ParkingNominaOperativaProgramacion e where e.parqueadero=:parqueadero and e.cedula=:cedula order by fecha desc "),
@NamedQuery(name = "ParkingNominaOperativaProgramacion.deleteTurno", query = "DELETE  FROM ParkingNominaOperativaProgramacion e where e.id=:id "),
@NamedQuery(name = "ParkingNominaOperativaProgramacion.updateProgramacion", query = "UPDATE ParkingNominaOperativaProgramacion   SET zona=:zona ,cedula=:cedula, nombre=:nombre, cargo=:cargo, proyecto=:proyecto, centroCostos=:centroCostos, parqueadero=:parqueadero, fecha=:fecha, dia=:dia, semana=:semana, horaEntrada=:horaEntrada, horaSalida=:horaSalida, estado=:estado, observaciones=:observaciones where id=:id ")
})
public class ParkingNominaOperativaProgramacion {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String zona;
	private String cedula;
	private String nombre;
	private String cargo;
	private int proyecto;
	@Column(name = "centro_costos")
	private String centroCostos;
	private String parqueadero;
	private String fecha;
	private String dia;
	private int semana;
	@Column(name = "hora_entrada")
	private String horaEntrada;
	@Column(name = "hora_salida")
	private String horaSalida;
	private int estado;
	@Column(name = "cedula_supervisor")
	private String cedulaSupervisor;
	@Column(name = "nombre_supervisor")
	private String nombreSupervisor;
	private String observaciones;
	@Column(name = "cod_park")
	private String codPark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getProyecto() {
		return proyecto;
	}
	public void setProyecto(int proyecto) {
		this.proyecto = proyecto;
	}
	public String getParqueadero() {
		return parqueadero;
	}
	public void setParqueadero(String parqueadero) {
		this.parqueadero = parqueadero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getSemana() {
		return semana;
	}
	public void setSemana(int semana) {
		this.semana = semana;
	}
	
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	public String getCedulaSupervisor() {
		return cedulaSupervisor;
	}
	public void setCedulaSupervisor(String cedulaSupervisor) {
		this.cedulaSupervisor = cedulaSupervisor;
	}
	public String getNombreSupervisor() {
		return nombreSupervisor;
	}
	public void setNombreSupervisor(String nombreSupervisor) {
		this.nombreSupervisor = nombreSupervisor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getCodPark() {
		return codPark;
	}
	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}
	public String getCentroCostos() {
		return centroCostos;
	}
	public void setCentroCostos(String centroCostos) {
		this.centroCostos = centroCostos;
	}
	
	
	
}
