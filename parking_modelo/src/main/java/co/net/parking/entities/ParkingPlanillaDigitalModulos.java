package co.net.parking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="parking_planilla_digital_modulos")
@NamedQueries({ 
	@NamedQuery(name = "submodulos.all.consulta.planilla", query = "SELECT m FROM ParkingPlanillaDigitalModulos m "),
	@NamedQuery(name = "submodulos.consulta.planilla", query = "SELECT m FROM ParkingPlanillaDigitalModulos m  where m.id_categoria=:idCategoria")
}) 
public class ParkingPlanillaDigitalModulos
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer numero_modulo;
	
	private String nombre_modulo;
	
	private int id_categoria;
	
	private String path;
	
	
	public ParkingPlanillaDigitalModulos() {}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero_modulo() {
		return numero_modulo;
	}

	public void setNumero_modulo(Integer numero_modulo) {
		this.numero_modulo = numero_modulo;
	}

	public String getNombre_modulo() {
		return nombre_modulo;
	}

	public void setNombre_modulo(String nombre_modulo) {
		this.nombre_modulo = nombre_modulo;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}
	
	

}
