package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tarjeta_a database table.
 * 
 */
@Entity
@Table(name="tarjeta_a")
@NamedQuery(name="TarjetaA.findByCedulaPin", query="SELECT t FROM TarjetaA t WHERE t.idTercero=:id")
public class TarjetaA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String bc;

	private int beneficio;

	private short estado;
	
	
	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

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

	public String getFechaMod() {
		return fechaMod;
	}

	public void setFechaMod(String fechaMod) {
		this.fechaMod = fechaMod;
	}

	public String getFechaUso() {
		return fechaUso;
	}

	public void setFechaUso(String fechaUso) {
		this.fechaUso = fechaUso;
	}

	@Column(name="fecha_mod")
	private String fechaMod;

	@Column(name="fecha_uso")
	private String fechaUso;
	


	@Column(name="id_tercero")
	private String idTercero;

	private String pin;

	public TarjetaA() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBc() {
		return this.bc;
	}

	public void setBc(String bc) {
		this.bc = bc;
	}

	public int getBeneficio() {
		return this.beneficio;
	}

	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}


	public String getIdTercero() {
		return this.idTercero;
	}

	public void setIdTercero(String idTercero) {
		this.idTercero = idTercero;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}