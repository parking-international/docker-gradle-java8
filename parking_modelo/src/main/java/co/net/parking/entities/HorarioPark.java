package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the horario_parqueadero2 database table.
 * 
 */
@Entity
@Table(name="horario_parqueadero2")

public class HorarioPark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="cod_park")
	private String codPark;

	private short consecutivo;

	private short dia;

	@Column(name="dia_mysql")
	private int diaMysql;

	private short estado;

	@Column(name="fecha_final")
	private Object fechaFinal;

	@Column(name="fecha_inicial")
	private Object fechaInicial;

	@Column(name="hora_final")
	private String horaFinal;

	@Column(name="hora_inicial")
	private String horaInicial;

	public HorarioPark() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public short getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(short consecutivo) {
		this.consecutivo = consecutivo;
	}

	public short getDia() {
		return this.dia;
	}

	public void setDia(short dia) {
		this.dia = dia;
	}

	public int getDiaMysql() {
		return this.diaMysql;
	}

	public void setDiaMysql(int diaMysql) {
		this.diaMysql = diaMysql;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public Object getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(Object fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Object getFechaInicial() {
		return this.fechaInicial;
	}

	public void setFechaInicial(Object fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getHoraFinal() {
		return this.horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String getHoraInicial() {
		return this.horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

}