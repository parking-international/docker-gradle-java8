package co.net.beparking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@Entity
@NamedQueries({@NamedQuery(name = "BpCiudad.findAll", query = "SELECT b FROM BpCiudad b"),
	@NamedQuery(name = "BpCiudad.findById", query = "SELECT b FROM BpCiudad b where codCiudad=:codCiudad"),
	@NamedQuery(name = "BpCiudad.findByDepto", query = "SELECT b FROM BpCiudad b where codDepto=:codDepto"),
	@NamedQuery(name = "BpCiudad.findByNombre", query = "SELECT b FROM BpCiudad b where nombre=:nombre")})

public class BpCiudad {

	@Id @Column(name = "cod_ciudad") private String codCiudad;

	@Column(name = "cod_depto") private String codDepto;

	private String nombre;

	public String getCodCiudad() {
		return codCiudad;
	}

	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}

	public String getCodDepto() {
		return codDepto;
	}

	public void setCodDepto(String codDepto) {
		this.codDepto = codDepto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
