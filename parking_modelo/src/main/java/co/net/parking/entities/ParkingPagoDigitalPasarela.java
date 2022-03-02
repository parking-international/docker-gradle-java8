package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;



 
@Entity
@Table(name="parking_pago_digital_pasarela")
@NamedQueries({
    })
public class ParkingPagoDigitalPasarela implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "id_pago_digital_usuario")
	private int idPagoDigitalUsuario;

	@Column(name = "id_pago_digital_medio_pago")
	private int idPagoDigitalMedioPago;
	
	private String concepto;
	
	private int valor;
	
	private String numeroAprobacion;
	
	
	private String estado;
	
	private String descripcion;
	

	private String fecha;
	
	private int reciboCaja;

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

	public int getIdPagoDigitalMedioPago() {
		return idPagoDigitalMedioPago;
	}

	public void setIdPagoDigitalMedioPago(int idPagoDigitalMedioPago) {
		this.idPagoDigitalMedioPago = idPagoDigitalMedioPago;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNumeroAprobacion() {
		return numeroAprobacion;
	}

	public void setNumeroAprobacion(String numeroAprobacion) {
		this.numeroAprobacion = numeroAprobacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getReciboCaja() {
		return reciboCaja;
	}

	public void setReciboCaja(int reciboCaja) {
		this.reciboCaja = reciboCaja;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}