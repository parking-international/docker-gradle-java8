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
@Table(name="parking_inventario_ti_componente")
@NamedQueries({ 
	@NamedQuery(name = "inventario.consulta.componentes", query = "SELECT t FROM ParkingInventarioTiComponente t"),
	@NamedQuery(name = "inventario.update.componente", query = "update ParkingInventarioTiComponente set  nombre=:nombre where id=:id"),
	@NamedQuery(name = "inventario.delete.componente", query = "DELETE FROM ParkingInventarioTiComponente t WHERE t.id=:id")
})
public class ParkingInventarioTiComponente
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nombre;

	
	public ParkingInventarioTiComponente() {}

	public ParkingInventarioTiComponente(Integer id, String nombre) 
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
