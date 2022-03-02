package co.net.parking.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name="parking_pago_digital_medio_pago")
@NamedQueries({
	@NamedQuery(name = "parkingMedioPagoId", query = "SELECT t FROM ParkingPagoDigitalMedioPago t where t.idPagoDigitalUsuario=:idPagoDigitalUsuario AND t.estado=1 ORDER BY fecha desc"),
	@NamedQuery(name = "parkingMedioPagoIdTarjeta", query = "SELECT t FROM ParkingPagoDigitalMedioPago t where t.idPagoDigitalUsuario=:idPagoDigitalUsuario AND t.customerID=:customerID AND t.estado=1")
    })
public class ParkingPagoDigitalMedioPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "id_pago_digital_usuario")
	private int idPagoDigitalUsuario;

	@Column(name = "token")
	private String token;
	
	@Column(name = "marca_tarjeta")
	private String marcaTarjeta;
	
	@Column(name = "num_tarjeta")
	private String numTarjeta;
	
	@Column(name = "estado")
	private int estado;
	
	@Column(name = "nombre_usuario_tarjeta")
	private String nombreUsuarioTarjeta;
	
	@Column(name = "customer_id")
	private String customerID;
	
	private String fecha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPagoDigitalUsuario() {
		return idPagoDigitalUsuario;
	}

	public void setIdPagoDigitalUsuario(int idPagoDigitalUsuario) {
		this.idPagoDigitalUsuario = idPagoDigitalUsuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMarcaTarjeta() {
		return marcaTarjeta;
	}

	public void setMarcaTarjeta(String marcaTarjeta) {
		this.marcaTarjeta = marcaTarjeta;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombreUsuarioTarjeta() {
		return nombreUsuarioTarjeta;
	}

	public void setNombreUsuarioTarjeta(String nombreUsuarioTarjeta) {
		this.nombreUsuarioTarjeta = nombreUsuarioTarjeta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}