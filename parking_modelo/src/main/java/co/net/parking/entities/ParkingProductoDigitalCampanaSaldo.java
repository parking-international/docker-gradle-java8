package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_producto_digital_campana_saldo")
@NamedQueries({ 

	@NamedQuery(name = "consultaIdentificacionBeneficio", query = "SELECT r FROM ParkingProductoDigitalCampanaSaldo r WHERE r.identificacion=:identificacion AND estado=1 AND valor>0 "),
//
//	@NamedQuery(name = "getListaPlacas", query = "SELECT t FROM ParkingPagoDigitalVehiculo t WHERE estado in (1,0) ")

	})  

public class ParkingProductoDigitalCampanaSaldo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String identificacion;
	private int valor;
	private int estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}