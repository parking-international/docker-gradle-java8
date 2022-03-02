package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the wp_app_quejas_reclamos database table.
 * 
 */
@Entity
@Table(name = "wp_app_quejas_reclamos")
@NamedQueries({
		@NamedQuery(name = "WpAppQuejas", query = "SELECT w FROM WpAppQuejasReclamos w")
})

public class WpAppQuejasReclamos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String identificacion;
	@Column(name = "fecha_reclamo")
	private String fechaReclamo;
	private String descripcion;
	private String categoria;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getFechaReclamo() {
		return fechaReclamo;
	}
	public void setFechaReclamo(String fechaReclamo) {
		this.fechaReclamo = fechaReclamo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	
	}