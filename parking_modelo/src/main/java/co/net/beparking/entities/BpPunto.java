package co.net.beparking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the BpPuntos database table.
 * 
 */
@Entity
@Table(name="BpPuntos")
@NamedQueries({
@NamedQuery(name="BpPunto.findAll", query="SELECT b FROM BpPunto b"),
@NamedQuery(name="BpPunto.findByCedula", query="SELECT b FROM BpPunto b where b.cedula=:cedula order by fechaGeneracion desc ")})
public class BpPunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CodigoPunto")
	private int codigoPunto;

	@Column(name="Cedula")
	private String cedula;

	@Column(name="CodigoCampana")
	private Integer codigoCampana;

	@Column(name="CodigoEstadoPunto")
	private String codigoEstadoPunto;

	@Column(name="CodigoFuentePuntos")
	private String codigoFuentePuntos;

	@Column(name="CodigoReferenciaPunto")
	private String codigoReferenciaPunto;

	@Column(name="Descripcion")
	private String descripcion;

	@Column(name="FechaGeneracion")
	private String fechaGeneracion;

	@Column(name="FechaProcesamiento")
	private String fechaProcesamiento;

	@Column(name="FechaVencimiento")
	private String fechaVencimiento;

	@Column(name="Puntos")
	private Integer puntos;

	@Column(name="ValorDatafono")
	private Integer valorDatafono;

	@Column(name="ValorEfectivo")
	private Integer valorEfectivo;

	public BpPunto() {
	}

	public int getCodigoPunto() {
		return codigoPunto;
	}

	public void setCodigoPunto(int codigoPunto) {
		this.codigoPunto = codigoPunto;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Integer getCodigoCampana() {
		return codigoCampana;
	}

	public void setCodigoCampana(Integer codigoCampana) {
		this.codigoCampana = codigoCampana;
	}

	public String getCodigoEstadoPunto() {
		return codigoEstadoPunto;
	}

	public void setCodigoEstadoPunto(String codigoEstadoPunto) {
		this.codigoEstadoPunto = codigoEstadoPunto;
	}

	public String getCodigoFuentePuntos() {
		return codigoFuentePuntos;
	}

	public void setCodigoFuentePuntos(String codigoFuentePuntos) {
		this.codigoFuentePuntos = codigoFuentePuntos;
	}

	public String getCodigoReferenciaPunto() {
		return codigoReferenciaPunto;
	}

	public void setCodigoReferenciaPunto(String codigoReferenciaPunto) {
		this.codigoReferenciaPunto = codigoReferenciaPunto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(String fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public String getFechaProcesamiento() {
		return fechaProcesamiento;
	}

	public void setFechaProcesamiento(String fechaProcesamiento) {
		this.fechaProcesamiento = fechaProcesamiento;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Integer getValorDatafono() {
		return valorDatafono;
	}

	public void setValorDatafono(Integer valorDatafono) {
		this.valorDatafono = valorDatafono;
	}

	public Integer getValorEfectivo() {
		return valorEfectivo;
	}

	public void setValorEfectivo(Integer valorEfectivo) {
		this.valorEfectivo = valorEfectivo;
	}

	

}