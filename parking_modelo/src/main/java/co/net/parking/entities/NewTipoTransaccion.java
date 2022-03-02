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
 * The persistent class for the new_tipo_transaccion database table.
 * 
 */
@Entity
@Table(name = "new_tipo_transaccion")

@NamedQueries({
	@NamedQuery(name = "NewTipoTransaccion.findAll", query = "SELECT e FROM NewTipoTransaccion e"),
	@NamedQuery(name = "NewTipoTransaccion.findById", query = "SELECT e FROM NewTipoTransaccion e where id = :id")
})
public class NewTipoTransaccion implements Serializable {
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
