package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parking_parametros_campaña_descuento database table.
 * 
 */
@Entity
@Table(name="parking_codigos_descuento_campaña")
@NamedQueries({ 
	@NamedQuery(name = "consultaCodigoNumFactura", query = "SELECT r FROM ParkingCodigosDescuentoCampana r WHERE r.codigo=:codigo AND r.numFactura=:numFactura"),
	@NamedQuery(name = "consultaCodigo", query = "SELECT r FROM ParkingCodigosDescuentoCampana r WHERE r.codigo=:codigo ")
	})  

public class ParkingCodigosDescuentoCampana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String codigo;
	
	private String porcentaje;
	
	@Column(name = "num_factura")
	private int numFactura;

	@Column(name = "cod_terminal")
	private String  codTerminal;

	@Column(name = "cod_park")
	private String codPark;
	
	@Column(name = "num_celular")
	private String numCelular;
	
	@Column(name = "estado_SMS")
	private int estadoSMS;
	
	
	@Column(name = "fecha_generacion")
	private String fechaGeneracion;
	
	private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(String fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCodPark() {
		return codPark;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getEstadoSMS() {
		return estadoSMS;
	}

	public void setEstadoSMS(int estadoSMS) {
		this.estadoSMS = estadoSMS;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	

	
}