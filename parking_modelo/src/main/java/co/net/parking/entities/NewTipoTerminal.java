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
 * The persistent class for the new_tipo_terminal database table.
 * 
 */
@Entity
@Table(name = "new_tipo_terminal")

@NamedQueries({@NamedQuery(name = "NewTipoTerminal.findAll", query = "SELECT e FROM NewTipoTerminal e"),})
public class NewTipoTerminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Column(name = "tipo_terminal") private String tipoTerminal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoTerminal() {
		return tipoTerminal;
	}

	public void setTipoTerminal(String tipoTerminal) {
		this.tipoTerminal = tipoTerminal;
	}

}
