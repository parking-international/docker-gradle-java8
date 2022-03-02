package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mensuales_control database table.
 * 
 */
@Entity
@Table(name="mensuales_control") @NamedQueries({
@NamedQuery(name="CantidadMensualesActivas",query="SELECT sum(mc.cupos) FROM MensualesControl mc WHERE mc.codPark=:codPark AND mc.tipoVehiculo=:tipoVehiculo AND mc.estado=:estado"),
@NamedQuery(name = "ConsultaMensualesControlCodPark", query = "SELECT cm FROM MensualesControl cm WHERE cm.codPark=:codPark and cm.estado=1") })
public class MensualesControl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cod_park")
	private String codPark;

	private Integer contrato;

	private Integer cupos;

	private String dias;

	private short estado;

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

	@Column(name="hora_final")
	private String horaFinal;

	@Column(name="hora_inicial")
	private String horaInicial;

	private Integer horario;

	private Integer ocupacion;

	@Column(name="tipo_asignacion")
	private Short tipoAsignacion;

	@Column(name="tipo_mensualidad")
	private Short tipoMensualidad;

	@Column(name="tipo_vehiculo")
	private Integer tipoVehiculo;

	public MensualesControl() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public Integer getContrato() {
		return contrato;
	}

	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}

	public Integer getCupos() {
		return cupos;
	}

	public void setCupos(Integer cupos) {
		this.cupos = cupos;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}


	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}

	public Integer getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Integer ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Short getTipoAsignacion() {
		return tipoAsignacion;
	}

	public void setTipoAsignacion(Short tipoAsignacion) {
		this.tipoAsignacion = tipoAsignacion;
	}

	public Short getTipoMensualidad() {
		return tipoMensualidad;
	}

	public void setTipoMensualidad(Short tipoMensualidad) {
		this.tipoMensualidad = tipoMensualidad;
	}

	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	}