package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the informacion_terminal database table.
 * 
 */
@Entity
@Table(name="auditoria_terminal")
@NamedQuery(name="AuditoriaTerminal.findAll", query="SELECT i FROM AuditoriaTerminal i")
public class AuditoriaTerminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="cod_terminal")
	private String codTerminal;

	@Column(name="punto_servicio")
	private String puntoServicio;

	@Column(name="categoria")
	private String categoria;

	@Column(name="descripcion")
	private String descripcion;

	@Column(name="tipo")
	private String tipo;
	
	
	@Column(name="fecha")
	private String fecha;
	
	
	@Column(name="estado")
	private int estado;

	public AuditoriaTerminal() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getPuntoServicio() {
		return puntoServicio;
	}

	public void setPuntoServicio(String puntoServicio) {
		this.puntoServicio = puntoServicio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}