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
@Table(name="parking_inventario_ti_dispositivos")
@NamedQueries({ 
	@NamedQuery(name = "inventario.consulta.dispositivos", query = "SELECT t FROM ParkingInventarioTiDispositivo t"),
	@NamedQuery(name = "inventario.consulta.dispositivo", query = "SELECT t FROM ParkingInventarioTiDispositivo t where t.id=:id"),
	@NamedQuery(name = "inventario.consulta.dispositivoSerialActivo", query = "SELECT t FROM ParkingInventarioTiDispositivo t where t.activo=:activo and t.serial=:serial"),
	@NamedQuery(name = "inventario.update.estado.dispositivo", query = "update ParkingInventarioTiDispositivo set estado=:nuevoEstado where id=:id"),
	@NamedQuery(name = "inventario.update.dispositivo", query = "update ParkingInventarioTiDispositivo set activo=:numero_activo, remision_proveedor=:numero_remision_proveedor, serial=:serial, numero_declaracion_importacion=:numero_declaracion_importacion, valor=:valor, estado=:estado, id_componente=:id_componente, id_proveedor=:id_proveedor,id_clasificacion=:id_clasificacion,cedula_usuario=:usuario, observaciones=:observaciones where id=:id"),
	@NamedQuery(name = "inventario.delete.dispositivo", query = "DELETE ParkingInventarioTiDispositivo where id=:id"),
	@NamedQuery(name = "inventario.existe.dispositivo", query = "SELECT t FROM ParkingInventarioTiDispositivo t where t.serial=:serial or t.activo=:numero_activo")
//	@NamedQuery(name = "inventario.existe.proveedor", query = "SELECT t FROM ParkingInventarioTiDispositivo t WHERE t.id=:id")
}) 
public class ParkingInventarioTiDispositivo
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String activo;
	
	@Column
	private String remision_proveedor;
	
	@Column
	private String serial;
	
	@Column
	private String numero_declaracion_importacion;
	
	@Column
	private Double valor;
	
	@Column
	private Integer estado;
	
	@Column
	private String observaciones;
	
	@Column
	private String fecha_registro;
	
	@Column
	private Integer id_componente;
	
	@Column
	private Integer id_proveedor;
	
	@Column
	private Integer id_clasificacion;
	
	@Column
	private String cedula_usuario;
	
	
	public ParkingInventarioTiDispositivo() 
	{

	}
	
	public ParkingInventarioTiDispositivo(String activo, String remision_proveedor, String serial,String numero_declaracion_importacion, Double valor, Integer estado, String observaciones,String fecha_registro, Integer id_componente, Integer id_proveedor, Integer id_clasificacion)
	{
		this.activo = activo;
		this.remision_proveedor = remision_proveedor;
		this.serial = serial;
		this.numero_declaracion_importacion = numero_declaracion_importacion;
		this.valor = valor;
		this.estado = estado;
		this.observaciones = observaciones;
		this.fecha_registro = fecha_registro;
		this.id_componente = id_componente;
		this.id_proveedor = id_proveedor;
		this.id_clasificacion = id_clasificacion;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public String getRemision_proveedor() {
		return remision_proveedor;
	}
	public void setRemision_proveedor(String remision_proveedor) {
		this.remision_proveedor = remision_proveedor;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getNumero_declaracion_importacion() {
		return numero_declaracion_importacion;
	}
	public void setNumero_declaracion_importacion(String numero_declaracion_importacion) {
		this.numero_declaracion_importacion = numero_declaracion_importacion;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public Integer getId_componente() {
		return id_componente;
	}
	public void setId_componente(Integer id_componente) {
		this.id_componente = id_componente;
	}
	public Integer getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(Integer id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public Integer getId_clasificacion() {
		return id_clasificacion;
	}
	public void setId_clasificacion(Integer id_clasificacion) {
		this.id_clasificacion = id_clasificacion;
	}

	public String getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

}
