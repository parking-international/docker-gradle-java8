package co.net.beparking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BpConfiguraciones database table.
 * 
 */
@Entity
@Table(name="BpConfiguraciones")
@NamedQueries({
	@NamedQuery(name="BpConfiguraciones.findAll", query="SELECT b FROM BpConfiguraciones b"),
	@NamedQuery(name="BpConfiguraciones.findById", query="SELECT b FROM BpConfiguraciones b where id=:id"),
	@NamedQuery(name="BpConfiguraciones.findByTipo", query="SELECT b FROM BpConfiguraciones b where tipo=:tipo or tipo='todos' and estado=1"),
	@NamedQuery(name="BpConfiguraciones.findByItem", query="SELECT b FROM BpConfiguraciones b where item=:item and estado=1"),
	@NamedQuery(name="BpConfiguraciones.findByTipoByCategoria", query="SELECT b FROM BpConfiguraciones b where tipo=:tipo and estado=1 and categoria=:categoria or tipo='todos'"),
	@NamedQuery(name="BpConfiguraciones.findByCategoria", query="SELECT b FROM BpConfiguraciones b where categoria=:categoria and estado=1 or tipo='todos'"),
	@NamedQuery(name="BpConfiguraciones.findByOnlyCategoria", query="SELECT b FROM BpConfiguraciones b where categoria=:categoria and estado=1"),
})

public class BpConfiguraciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String categoria;

	private String detalle;

	private int estado;

	private String fecha;

	private String item;

	private String tipo;

	public BpConfiguraciones() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}