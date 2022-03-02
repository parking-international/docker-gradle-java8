package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plus_categoria_servicio database table.
 * 
 */
@Entity
@Table(name="plus_categoria_servicio")
@NamedQuery(name="PlusCategoriaServicio.findAll", query="SELECT p FROM PlusCategoriaServicio p")
public class PlusCategoriaServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String categoria;

	private int estado;

	public PlusCategoriaServicio() {
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

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}