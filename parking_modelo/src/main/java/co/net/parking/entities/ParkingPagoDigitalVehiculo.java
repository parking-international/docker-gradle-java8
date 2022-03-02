package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_pago_digital_vehiculo")
@NamedQueries({ 

	@NamedQuery(name = "consultaVehiculos", query = "SELECT r FROM ParkingPagoDigitalVehiculo r WHERE r.idPagoDigitalUsuario=:idPagoDigitalUsuario AND estado=1 "),
	@NamedQuery(name = "consultaVehiculosPlaca", query = "SELECT r FROM ParkingPagoDigitalVehiculo r WHERE r.placa=:placa AND estado=1 "),

	@NamedQuery(name = "getListaPlacas", query = "SELECT t FROM ParkingPagoDigitalVehiculo t WHERE estado in (1,0) ")

	})  

public class ParkingPagoDigitalVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "tipo_vehiculo")
	private int tipoVehiculo;
	
	@Column(name = "id_pago_digital_usuario")
	private int idPagoDigitalUsuario;
	
	private String placa;
	
	private String marca;

	private String  qr;
	private int estado;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getIdPagoDigitalUsuario() {
		return idPagoDigitalUsuario;
	}

	public void setIdPagoDigitalUsuario(int idPagoDigitalUsuario) {
		this.idPagoDigitalUsuario = idPagoDigitalUsuario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getQr() {
		return qr;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}