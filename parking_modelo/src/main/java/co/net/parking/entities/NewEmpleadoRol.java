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
 * The persistent class for the new_empleado_rol database table.
 * 
 */
@Entity
@Table(name = "new_empleado_rol")

@NamedQueries({@NamedQuery(name = "NewEmpleadoRol.findAll", query = "SELECT e FROM NewEmpleadoRol e"),})
public class NewEmpleadoRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Column(name = "cod_empleado") private String codEmpleado;

	@Column(name = "id_rol") private Long idRol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

}
