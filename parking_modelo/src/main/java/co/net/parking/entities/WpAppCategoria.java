package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the wp_app_quejas_reclamos database table.
 * 
 */
@Entity
@Table(name = "wp_app_categoria")
@NamedQueries({
		@NamedQuery(name = "WpAppCategoria", query = "SELECT w FROM WpAppCategoria w WHERE estado=1")
})

public class WpAppCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tipo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	private String estado;
	}