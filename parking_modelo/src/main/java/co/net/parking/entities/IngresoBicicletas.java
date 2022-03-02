package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ingreso_bicicletas")
public class IngresoBicicletas {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="placa_bicicleta")
	private String placaBicicleta;
	
	private String cedula;
	
	private String nombre;
	
	@Column(name="fecha_ingreso")
	private String fechaIngreso;
	
	@Column(name="factura_transaccion")
	private String facturaTransaccion;
	
	@Column(name="cod_terminal_transaccion")
	private String codTerminal;
	
	private int transmitido;

	public String getPlacaBicicleta() {
		return placaBicicleta;
	}

	public void setPlacaBicicleta(String placaBicicleta) {
		this.placaBicicleta = placaBicicleta;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getFacturaTransaccion() {
		return facturaTransaccion;
	}

	public void setFacturaTransaccion(String facturaTransaccion) {
		this.facturaTransaccion = facturaTransaccion;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getTransmitido() {
		return transmitido;
	}

	public void setTransmitido(int transmitido) {
		this.transmitido = transmitido;
	}

	
	
	

}
