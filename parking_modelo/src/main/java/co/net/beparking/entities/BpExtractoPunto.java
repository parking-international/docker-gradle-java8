package co.net.beparking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the BpExtractoPuntos database table.
 * 
 */
@Entity
@Table(name="BpExtractoPuntos")
@NamedQueries({
@NamedQuery(name="BpExtractoPunto.findAll", query="SELECT b FROM BpExtractoPunto b"),
@NamedQuery(name="BpExtractoPunto.findByCedula", query="SELECT b FROM BpExtractoPunto b where b.cedula=:cedula")
})
public class BpExtractoPunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cedula")
	private String cedula;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	@Column(name="FechaCorte", columnDefinition = "datetime")
	private Date fechaCorte;

	@Column(name="PuntosAcumuladosOtros")
	private int puntosAcumuladosOtros;

	@Column(name="PuntosAcumuladosVentas")
	private int puntosAcumuladosVentas;

	@Column(name="PuntosAVencer")
	private int puntosAVencer;

	@Column(name="PuntosRedimidos")
	private int puntosRedimidos;

	@Column(name="PuntosVencidos")
	private int puntosVencidos;
	
	@Column(name="SALDO")
	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public BpExtractoPunto() {
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	public Date getFechaCorte() {
		return this.fechaCorte;
	}

	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public int getPuntosAcumuladosOtros() {
		return this.puntosAcumuladosOtros;
	}

	public void setPuntosAcumuladosOtros(int puntosAcumuladosOtros) {
		this.puntosAcumuladosOtros = puntosAcumuladosOtros;
	}

	public int getPuntosAcumuladosVentas() {
		return this.puntosAcumuladosVentas;
	}

	public void setPuntosAcumuladosVentas(int puntosAcumuladosVentas) {
		this.puntosAcumuladosVentas = puntosAcumuladosVentas;
	}

	public int getPuntosAVencer() {
		return this.puntosAVencer;
	}

	public void setPuntosAVencer(int puntosAVencer) {
		this.puntosAVencer = puntosAVencer;
	}

	public int getPuntosRedimidos() {
		return this.puntosRedimidos;
	}

	public void setPuntosRedimidos(int puntosRedimidos) {
		this.puntosRedimidos = puntosRedimidos;
	}

	public int getPuntosVencidos() {
		return this.puntosVencidos;
	}

	public void setPuntosVencidos(int puntosVencidos) {
		this.puntosVencidos = puntosVencidos;
	}

}