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
 * The persistent class for the new_parqueadero database table.
 * 
 */
@Entity
@Table(name = "MensualActualizaTerminal")

@NamedQueries({
		@NamedQuery(name = "MensualActualizaTerminal.findAll", query = "SELECT e FROM MensualActualizaTerminal e") })
public class MensualActualizaTerminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "codTerminal")
	private String codTerminal;

	@Column(name = "idMensualPlaca")
	private Long idMensualPlaca;

	@Column(name = "trasmitido")
	private Long trasmitido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public Long getIdMensualPlaca() {
		return idMensualPlaca;
	}

	public void setIdMensualPlaca(Long idMensualPlaca) {
		this.idMensualPlaca = idMensualPlaca;
	}

	public Long getTrasmitido() {
		return trasmitido;
	}

	public void setTrasmitido(Long trasmitido) {
		this.trasmitido = trasmitido;
	}
}
