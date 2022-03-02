package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="parking_inventario_ti_dispositivo_log")
@NamedQueries({ 
	@NamedQuery(name = "inventario.consulta.logDispositivos", query = "SELECT t FROM ParkingInventarioTiLogDispositivos t order by t.id asc"),
}) 
public class ParkingInventarioTiLogDispositivos 
{
	@Id
	@Column
	private Integer id;
	
	@Column
	private String nombre_columna;
	
	@Column
	private String dato_original;
	
	@Column
	private String dato_modificado;
	
	@Column
	private String cedula_usuario;
	
	@Column
	private String fecha_log;
	
	@Column
	private String opreacion_realizada;
	
	@Column
	private String usuario_db;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre_columna() {
		return nombre_columna;
	}
	public void setNombre_columna(String nombre_columna) {
		this.nombre_columna = nombre_columna;
	}
	public String getDato_original() {
		return dato_original;
	}
	public void setDato_original(String dato_original) {
		this.dato_original = dato_original;
	}
	public String getDato_modificado() {
		return dato_modificado;
	}
	public void setDato_modificado(String dato_modificado) {
		this.dato_modificado = dato_modificado;
	}
	public String getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getFecha_log() {
		return fecha_log;
	}
	public void setFecha_log(String fecha_log) {
		this.fecha_log = fecha_log;
	}
	public String getOpreacion_realizada() {
		return opreacion_realizada;
	}
	public void setOpreacion_realizada(String opreacion_realizada) {
		this.opreacion_realizada = opreacion_realizada;
	}
	public String getUsuario_db() {
		return usuario_db;
	}
	public void setUsuario_db(String usuario_db) {
		this.usuario_db = usuario_db;
	}
	
}
