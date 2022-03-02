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
@Table(name="parking_inventario_ti_cluster")
@NamedQueries({ 
	@NamedQuery(name = "inventario.consulta.clusteres", query = "SELECT t FROM ParkingInventarioTiCluster t"),
	@NamedQuery(name = "inventario.update.cluster", query = "update ParkingInventarioTiCluster  set cod_terminal=:cod_terminal,nombre_responsable_operacion=:nombre_responsable_operacion, estado=:estado,fecha_actualizacion=:fecha_actualizacion, id_tipo=:id_tipo, id_dispositivo=:id_dispositivo, cedula_usuario=:cedula_usuario, cod_park=:cod_park, id_asignacion=:id_asignacion, ip=:ip where id=:id"),
	@NamedQuery(name = "inventario.delete.id.cluster", query = "delete ParkingInventarioTiCluster where id=:id"),
	@NamedQuery(name = "inventario.consulta.id.cluster", query = "SELECT t FROM ParkingInventarioTiCluster t where id=:id"),
	@NamedQuery(name = "inventario.consulta.idispositivo.cluster", query = "SELECT t FROM ParkingInventarioTiCluster t where id_dispositivo=:id_dispositivo and estado=1"),
	@NamedQuery(name = "inventario.update.estado.cluster", query = "update ParkingInventarioTiCluster set estado=:estado where id=:id")
}) 

public class ParkingInventarioTiCluster
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String  cod_terminal;
	
	@Column
	private String nombre_responsable_operacion;
	
	@Column
	private Integer estado;
	
	@Column
	private String fecha_instalacion;
	
	@Column
	private String fecha_actualizacion;
	
	@Column
	private Integer id_tipo;
	
	@Column
	private Integer id_dispositivo;
	
	@Column
	private String cedula_usuario;
	
	@Column
	private String cod_park;
	
	@Column
	private Integer id_asignacion;
	
	@Column
	private String ip;
	

	public ParkingInventarioTiCluster(){}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCod_terminal() {
		return cod_terminal;
	}
	public void setCod_terminal(String cod_terminal) {
		this.cod_terminal = cod_terminal;
	}
	public String getNombre_responsable_operacion() {
		return nombre_responsable_operacion;
	}
	public void setNombre_responsable_operacion(String nombre_responsable_operacion) {
		this.nombre_responsable_operacion = nombre_responsable_operacion;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getFecha_instalacion() {
		return fecha_instalacion;
	}
	public void setFecha_instalacion(String fecha_instalacion) {
		this.fecha_instalacion = fecha_instalacion;
	}
	public String getFecha_actualizacion() {
		return fecha_actualizacion;
	}
	public void setFecha_actualizacion(String fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	public Integer getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(Integer id_tipo) {
		this.id_tipo = id_tipo;
	}
	public Integer getId_dispositivo() {
		return id_dispositivo;
	}
	public void setId_dispositivo(Integer id_dispositivo) {
		this.id_dispositivo = id_dispositivo;
	}
	public String getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getCod_park() {
		return cod_park;
	}
	public void setCod_park(String cod_park) {
		this.cod_park = cod_park;
	}

	public Integer getId_asignacion() {
		return id_asignacion;
	}

	public void setId_asignacion(Integer id_asignacion) {
		this.id_asignacion = id_asignacion;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
