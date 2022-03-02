package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;




/**
 * The persistent class for the mensuales_tipos database table.
 * 
 */
@Entity
@Table(name="mensuales_tipos")
@NamedQueries({ @NamedQuery(name="MensualesTipos.findById", query="SELECT m FROM MensualesTipo m WHERE id=:idTipoMensual"),
	@NamedQuery(name="MensualesTipos.ConsultaPorTipoVehiculo", query="SELECT m FROM MensualesTipo m WHERE m.codPark=:codPark AND m.tipoVehiculo=:tipoVehiculo AND m.estado=:estado")
})

public class MensualesTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="cod_park")
	private String codPark;

	private String dias;

	private String duracion;

	private short estado;

	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

	@Column(name="hora_final")
	private String horaFinal;

	@Column(name="hora_inicial")
	private String horaInicial;

	private short horario;

	@Column(name="mostrar_wp")
	private short mostrarWp;

	private String nombre;

	private short tipo;

	@Column(name="tipo_vehiculo")
	private int tipoVehiculo;

	private int valor;

	public MensualesTipo() {
	}

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

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
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


	public short getHorario() {
		return horario;
	}

	public void setHorario(short horario) {
		this.horario = horario;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public short getMostrarWp() {
		return mostrarWp;
	}

	public void setMostrarWp(short mostrarWp) {
		this.mostrarWp = mostrarWp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public short getTipo() {
		return tipo;
	}

	public void setTipo(short tipo) {
		this.tipo = tipo;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}