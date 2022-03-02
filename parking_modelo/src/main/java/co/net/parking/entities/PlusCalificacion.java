package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plus_calificacion database table.
 * 
 */
@Entity
@Table(name="plus_calificacion")
@NamedQuery(name="PlusCalificacion.findAll", query="SELECT p FROM PlusCalificacion p")
public class PlusCalificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String cedula;

	private int idPlusCategoriaServicio;

	private int idPlusTransaccion;

	private String observacion;

	private int puntaje;

	public PlusCalificacion() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getIdPlusCategoriaServicio() {
		return this.idPlusCategoriaServicio;
	}

	public void setIdPlusCategoriaServicio(int idPlusCategoriaServicio) {
		this.idPlusCategoriaServicio = idPlusCategoriaServicio;
	}

	public int getIdPlusTransaccion() {
		return this.idPlusTransaccion;
	}

	public void setIdPlusTransaccion(int idPlusTransaccion) {
		this.idPlusTransaccion = idPlusTransaccion;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

}