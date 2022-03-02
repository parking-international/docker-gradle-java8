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

/**
 * The persistent class for the Redencion_BpBono database table.
 * 
 */
@Entity
@Table(name = "Redencion_BpBono")
@NamedQueries({@NamedQuery(name = "RedencionBpBono.findAll", query = " SELECT b FROM RedencionBpBono b "),
	@NamedQuery(name = "RedencionBpBono.findByParam", query = " SELECT b FROM RedencionBpBono b WHERE :param = :value ")})
public class RedencionBpBono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Id") private int id;

	@Column(name = "CodBono") private String codBono;

	@Column(name = "CodTipoBono") private int codTipoBono;

	@Column(name = "NombrePark") private String nombrePark;

	@Column(name = "CodTerminal") private String codTerminal;

	@Column(name = "Estado") private int estado;

	@Column(name = "NumFactura") private int numFactura;

	@Column(name = "ValorConsumo") private int valorConsumo;
	
	@Column(name = "FechaUtilizacion") private Date fechaUtilizacion;

	public RedencionBpBono() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodBono() {
		return codBono;
	}

	public void setCodBono(String codBono) {
		this.codBono = codBono;
	}

	public int getCodTipoBono() {
		return codTipoBono;
	}

	public void setCodTipoBono(int codTipoBono) {
		this.codTipoBono = codTipoBono;
	}

	public String getNombrePark() {
		return nombrePark;
	}

	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public int getValorConsumo() {
		return valorConsumo;
	}

	public void setValorConsumo(int valorConsumo) {
		this.valorConsumo = valorConsumo;
	}

	public Date getFechaUtilizacion() {
		return fechaUtilizacion;
	}

	public void setFechaUtilizacion(Date fechaUtilizacion) {
		this.fechaUtilizacion = fechaUtilizacion;
	}
	
	
}
