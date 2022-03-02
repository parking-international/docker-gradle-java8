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
@Table(name="parking_inventario_ti_asignacion")
@NamedQueries({
	@NamedQuery(name = "inventario.consulta.asignaciones", query = "SELECT t FROM ParkingInventarioTiAsignacion t"),
	@NamedQuery(name = "inventario.update.asignacion", query = "update ParkingInventarioTiAsignacion set  nombre=:nombre where id=:id"),
	@NamedQuery(name = "inventario.delete.asignacion", query = "DELETE FROM ParkingInventarioTiAsignacion t WHERE t.id=:id")
})
public class ParkingInventarioTiAsignacion 
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nombre;

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
