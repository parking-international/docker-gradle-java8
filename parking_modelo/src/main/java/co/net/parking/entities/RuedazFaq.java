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
@Table(name = "RUEDAZ_FAQ")

@NamedQueries({ @NamedQuery(name = "RuedazFaq.findAll", query = "SELECT e FROM RuedazFaq e"),
		@NamedQuery(name = "RuedazFaq.findActive", query = "SELECT e FROM RuedazFaq e where e.estado = 1") })
public class RuedazFaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "pregunta")
	private String pregunta;
	@Column(name = "respuesta")
	private String respuesta;
	@Column(name = "estado")
	private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
}
