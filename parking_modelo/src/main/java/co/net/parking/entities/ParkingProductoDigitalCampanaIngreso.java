package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_producto_digital_campana_ingreso")
@NamedQueries({ 

	@NamedQuery(name = "consultaUsuarioBeneficio", query = "SELECT r FROM ParkingProductoDigitalCampanaIngreso r WHERE r.identificacion=:identificacion "),
//
//	@NamedQuery(name = "getListaPlacas", query = "SELECT t FROM ParkingPagoDigitalVehiculo t WHERE estado in (1,0) ")

	})  

public class ParkingProductoDigitalCampanaIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "valor_recargado")
	private int valorRecargado;
	private String identificacion;
	private String nombre;
	private String apellido;
	private String celular;
	private String fecha;
	private String  detalle;
	private int aplicado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValorRecargado() {
		return valorRecargado;
	}
	public void setValorRecargado(int valorRecargado) {
		this.valorRecargado = valorRecargado;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getAplicado() {
		return aplicado;
	}
	public void setAplicado(int aplicado) {
		this.aplicado = aplicado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
}
	