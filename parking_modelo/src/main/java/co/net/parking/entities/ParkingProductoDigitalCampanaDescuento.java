package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_producto_digital_campana_descuento")
@NamedQueries({ 

//	@NamedQuery(name = "consultaVehiculos", query = "SELECT r FROM ParkingPagoDigitalVehiculo r WHERE r.idPagoDigitalUsuario=:idPagoDigitalUsuario AND estado=1 "),
//
//	@NamedQuery(name = "getListaPlacas", query = "SELECT t FROM ParkingPagoDigitalVehiculo t WHERE estado in (1,0) ")

	})  

public class ParkingProductoDigitalCampanaDescuento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "valor_descontado")
	private int valorDescontado;
	private String identificacion;
	private String fecha;
	private String  detalle;
	@Column(name = "cod_terminal")
	private String codTerminal;
	private int aplicado;
	@Column(name = "cod_empleado")
	private String codEmpleado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValorDescontado() {
		return valorDescontado;
	}
	public void setValorDescontado(int valorDescontado) {
		this.valorDescontado = valorDescontado;
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
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public int getAplicado() {
		return aplicado;
	}
	public void setAplicado(int aplicado) {
		this.aplicado = aplicado;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}