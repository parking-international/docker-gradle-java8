package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="parking_inventario_ti_clasificacion")
@NamedQueries({ 
	@NamedQuery(name = "inventario.consulta.clasificaciones", query = "SELECT t FROM ParkingInventarioTiClasificacion t"),
	@NamedQuery(name = "inventario.delete.clasificacion", query = "DELETE FROM ParkingInventarioTiClasificacion t WHERE t.id=:id")
}) 
public class ParkingInventarioTiClasificacion 
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nombre;

	public ParkingInventarioTiClasificacion() {}

	public ParkingInventarioTiClasificacion(Integer id, String nombre) 
	{
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
