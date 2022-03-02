package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parking_nomina_operativa_programacion_log_modificacion")
public class ParkingNominaOperativaProgramacionLogModificacion {

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
	private int centroCostos;
	private String parqueadero;
	private String fecha;
	private String dia;
	private int semana;
	@Column(name = "hora_entrada")
	private String horaEntrada;
	@Column(name = "hora_salida")
	private String horaSalida;
	private int estado;
	private String observaciones;
	@Column(name = "usuario_modifica")
	private String usuarioModifica;
	@Column(name = "id_programacion")
	private int idProgramacion;
	@Column(name = "fecha_modificacion")
	private String fechaModificacion;
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
	public int getCentroCostos() {
		return centroCostos;
	}
	public void setCentroCostos(int centroCostos) {
		this.centroCostos = centroCostos;
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
	public String getUsuarioModifica() {
		return usuarioModifica;
	}
	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	public int getIdProgramacion() {
		return idProgramacion;
	}
	public void setIdProgramacion(int idProgramacion) {
		this.idProgramacion = idProgramacion;
	}
	public String getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
}
