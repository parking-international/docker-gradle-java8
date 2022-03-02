package co.net.parking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="parking_planilla_digital_usuario_permisos")
@NamedQueries
({ 
	@NamedQuery(name = "permiso.delete.planillas", query = "DELETE FROM ParkingPlanillaDigitalPermiso p where p.cedula=:cedula"),
//	@NamedQuery(name = "permiso.insert.planillas", query = "INSERT INTO ParkingPlanillaDigitalPermiso(cedula,modulo,actividad) VALUES (:cedula, :modulo, :actividad)")
}) 
public class ParkingPlanillaDigitalPermiso 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String cedula;
	
	private int modulo;
	
	private int actividad;

	public ParkingPlanillaDigitalPermiso() 
	{
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getModulo() {
		return modulo;
	}
	public void setModulo(int modulo) {
		this.modulo = modulo;
	}
	public int getActividad() {
		return actividad;
	}
	public void setActividad(int actividad) {
		this.actividad = actividad;
	}

}
