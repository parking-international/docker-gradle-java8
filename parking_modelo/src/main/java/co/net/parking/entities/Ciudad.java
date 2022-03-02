package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ciudad database table.
 * 
 */
@Entity
@Table(name="ciudad")
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c order by nombre")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_ciudad")
	private String codCiudad;

	@Column(name="cod_depto")
	private String codDepto;

	private String nombre;

	public Ciudad() {
	}

	public String getCodCiudad() {
		return this.codCiudad;
	}

	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
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