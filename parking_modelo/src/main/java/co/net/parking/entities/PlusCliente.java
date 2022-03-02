package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the plus_cliente database table.
 * 
 */
@Entity
@Table(name="plus_cliente")
@NamedQueries({
	@NamedQuery(name = "PlusCliente.consultaPorPlacaCedula", query = "SELECT t FROM PlusCliente t where t.placa=:placa and t.estadoPlus=1"),
	@NamedQuery(name = "PlusCliente.consultaPorPlaca", query = "SELECT t FROM PlusCliente t where t.placa = :placa and t.estadoPlus=1"),
	@NamedQuery(name = "ConsultaPlacaSinEstado", query = "SELECT t FROM PlusCliente t where t.placa = :placa"),
	@NamedQuery(name = "PlusCliente.PlusPlacaCedula", query = "SELECT t FROM PlusCliente t where t.cedula=:cedula and t.estadoPlus=1 order by fechaVencimiento desc"),
	@NamedQuery(name = "PlusCliente.activo", query = "SELECT t FROM PlusCliente t where t.cedula=:cedula AND t.estadoPlus=1"),
	@NamedQuery(name = "PlusCliente.PlusPlaca", query = "SELECT t FROM PlusCliente t where t.cedula=:cedula and  t.placa=:placa and t.estadoPlus=1 order by fechaVencimiento desc")
})
public class PlusCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String cedula;

	private int estadoPlus;

	private String fechaCompra;

	private String fechaRenovacion;

	private String fechaVencimiento;

	private String origenVenta;

	private String placa;

	private int renovar;

	private int transmitido;
	
	private int tipoVehiculo;
	
	private String QR;
	

	public PlusCliente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEstadoPlus() {
		return this.estadoPlus;
	}

	public void setEstadoPlus(int estadoPlus) {
		this.estadoPlus = estadoPlus;
	}

	

	public String getOrigenVenta() {
		return this.origenVenta;
	}

	public void setOrigenVenta(String origenVenta) {
		this.origenVenta = origenVenta;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getRenovar() {
		return this.renovar;
	}

	public void setRenovar(int renovar) {
		this.renovar = renovar;
	}

	public int getTransmitido() {
		return this.transmitido;
	}

	public void setTransmitido(int transmitido) {
		this.transmitido = transmitido;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getFechaRenovacion() {
		return fechaRenovacion;
	}

	public void setFechaRenovacion(String fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getQR() {
		return QR;
	}

	public void setQR(String qR) {
		QR = qR;
	}

}