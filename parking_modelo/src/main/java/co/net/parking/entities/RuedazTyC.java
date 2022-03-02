package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the RUEDAZ_FAQ database table.
 * 
 */
@Entity
@Table(name = "RUEDAZ_TYC")

@NamedQueries({ @NamedQuery(name = "RuedazTyC.findAll", query = "SELECT e FROM RuedazTyC e"),
		@NamedQuery(name = "RuedazTyC.findActive", query = "SELECT e FROM RuedazTyC e where e.estado = 1") })
public class RuedazTyC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "tipo")
	private int tipo;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "estado")
	private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
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
}
