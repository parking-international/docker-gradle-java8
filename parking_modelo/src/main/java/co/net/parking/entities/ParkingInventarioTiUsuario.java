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
@Table(name="parking_inventario_ti_usuarios")
@NamedQueries({ 
	@NamedQuery(name = "inventario.login.usuario", query = "SELECT t FROM ParkingInventarioTiUsuario t where t.identificacion=:cedula and t.password=:pass and t.estado=1"),
	@NamedQuery(name = "inventario.consulta.usuarios", query = "SELECT t FROM ParkingInventarioTiUsuario t"),
	@NamedQuery(name = "inventario.consulta.usuario", query = "SELECT t FROM ParkingInventarioTiUsuario t where t.identificacion=:cedula and t.estado=:estado"),
	@NamedQuery(name = "inventario.validar.usuario", query = "SELECT t FROM ParkingInventarioTiUsuario t where t.identificacion=:cedula"),
	@NamedQuery(name = "inventario.update.usuario", query = "update ParkingInventarioTiUsuario set  identificacion=:identificacion, nombre=:nombre, apellido=:apellido, estado=:estado where id=:id"),
	@NamedQuery(name = "inventario.bloqueo.usuario", query = "update ParkingInventarioTiUsuario set estado=:estado where identificacion=:identificacion and id=:id")
}) 

public class ParkingInventarioTiUsuario
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String identificacion;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String password;
	
	@Column
	private Integer estado;
	

	public ParkingInventarioTiUsuario() 
	{

	}

	public ParkingInventarioTiUsuario(String identificacion, String nombre, String apellido, String password,Integer estado)
	{
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.estado = estado;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	

}
