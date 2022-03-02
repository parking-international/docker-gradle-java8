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
 * The persistent class for the new_tipo_resolucion database table.
 * 
 */
@Entity
@Table(name = "new_tipo_resolucion")

@NamedQueries({@NamedQuery(name = "NewTipoResolucion.findAll", query = "SELECT e FROM NewTipoResolucion e"),
	@NamedQuery(name = "NewTipoResolucion.findById", query = "SELECT e FROM NewTipoResolucion e where id = :id")})
public class NewTipoResolucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Column(name = "nombre") private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
