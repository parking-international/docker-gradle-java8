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
 * The persistent class for the new_tipo_tarifa database table.
 * 
 */
@Entity
@Table(name = "new_tipo_tarifa")

@NamedQueries({@NamedQuery(name = "NewTipoTarifa.findAll", query = "SELECT e FROM NewTipoTarifa e"),
	@NamedQuery(name = "NewTipoTarifa.findById", query = "SELECT e FROM NewTipoTarifa e where id = :id")})
public class NewTipoTarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Column(name = "nombre") private String nombre;
	
	@Column(name = "tipo_tarifa") private int tipoTarifa;

	@Column(name = "estado") private int estado;

	
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

	public int getTipoTarifa() {
		return tipoTarifa;
	}

	public void setTipoTarifa(int tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
