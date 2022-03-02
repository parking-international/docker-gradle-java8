package co.net.beparking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the BpTipoBono database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="BpTipoBono.findAll", query="SELECT b FROM BpTipoBono b"),
@NamedQuery(name="BpTipoBono.findByCodTipoBono", query="SELECT b FROM BpTipoBono b WHERE codTipoBono=:codTipoBono AND estado='A'")})
public class BpTipoBono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodTipoBono")
	private int codTipoBono;

	@Column(name="Acumulable")
	private String acumulable;

	@Column(name="Descripcion")
	private String descripcion;

	@Column(name="Duracion")
	private int duracion;

	@Column(name="Estado")
	private String estado;

	@Column(name="FechaActualizacion")
	private String fechaActualizacion;

	@Column(name="FechaCreacion")
	private String fechaCreacion;

	@Column(name="MinimoStock")
	private int minimoStock;

	@Column(name="Prioridad")
	private int prioridad;

	public BpTipoBono() {
	}

	public int getCodTipoBono() {
		return this.codTipoBono;
	}

	public void setCodTipoBono(int codTipoBono) {
		this.codTipoBono = codTipoBono;
	}

	public String getAcumulable() {
		return this.acumulable;
	}

	public void setAcumulable(String acumulable) {
		this.acumulable = acumulable;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getMinimoStock() {
		return this.minimoStock;
	}

	public void setMinimoStock(int minimoStock) {
		this.minimoStock = minimoStock;
	}

	public int getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}