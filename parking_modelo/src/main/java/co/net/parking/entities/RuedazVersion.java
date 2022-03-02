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
 * The persistent class for the new_terminal database table.
 * 
 */
@Entity
@Table(name = "RUEDAZ_VERSION")

@NamedQueries({ @NamedQuery(name = "RuedazVersion.findByEstado", query = "SELECT r FROM RuedazVersion r WHERE r.estado=1")})
public class RuedazVersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="ID")
	private int id;
	
	@Column(name = "NUM_VERSION")
	private String numVersion;
	
	@Column(name = "FECHA")
	private String fecha;
	
	@Column(name = "OBLIGATORIEDAD")
	private int obligatoiedad;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "ESTADO")
	private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumVersion() {
		return numVersion;
	}

	public void setNumVersion(String numVersion) {
		this.numVersion = numVersion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getObligatoiedad() {
		return obligatoiedad;
	}

	public void setObligatoiedad(int obligatoiedad) {
		this.obligatoiedad = obligatoiedad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}