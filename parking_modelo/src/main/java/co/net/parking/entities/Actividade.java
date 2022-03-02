package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the actividades database table.
 * 
 */
@Entity
@Table(name="actividades")
@NamedQuery(name="Actividade.findAll", query="SELECT a FROM Actividade a order by nombre")
public class Actividade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_actividad")
	private int idActividad;

	private String nombre;

	public Actividade() {
	}

	public int getIdActividad() {
		return this.idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}