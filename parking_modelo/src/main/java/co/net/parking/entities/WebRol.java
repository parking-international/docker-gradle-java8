package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the web_roles database table.
 * 
 */
@Entity
@Table(name="web_roles")
@NamedQuery(name="WebRol.findAll", query="SELECT r FROM WebRol r")
public class WebRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rol")
	private int idRol;

	private String descripcion;

	private String nombre;

	public WebRol() {
	}

	public int getIdRol() {
		return this.idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}