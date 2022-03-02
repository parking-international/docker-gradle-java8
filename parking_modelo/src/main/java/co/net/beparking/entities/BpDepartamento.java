package co.net.beparking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BpDepartamento database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="BpDepartamento.findAll", query="SELECT b FROM BpDepartamento b"),
@NamedQuery(name="BpDepartamento.findByDepto", query="SELECT b FROM BpDepartamento b where b.codDepto=:codDepto"),
@NamedQuery(name="BpDepartamento.findByNombre", query="SELECT b FROM BpDepartamento b where b.nombre=:nombre")
})
public class BpDepartamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name="cod_depto")
	private String codDepto;

	private String nombre;

	public BpDepartamento() {
	}

	public String getCodDepto() {
		return this.codDepto;
	}

	public void setCodDepto(String codDepto) {
		this.codDepto = codDepto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}