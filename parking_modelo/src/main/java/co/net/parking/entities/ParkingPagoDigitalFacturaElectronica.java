package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parking_pago_digital_factura_electronica")
public class ParkingPagoDigitalFacturaElectronica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="cod_park")
	private String codPark;
	@Column(name="cod_terminal")
	private String codTerminal;
	
	private String identificacion;
	@Column(name="nombre_usuario")
	private String nombreUsuario;
	
	private String placa;

	private String telefono;
	
	private String ciudad;
	
	private String direccion;
	@Column(name="fecha_entrada")
	private String fechaEntrada;
	
	@Column(name="fecha_salida")
	private String fechaSalida;
	@Column(name="tiempo_total")
	private Integer tiempoTotal;
	@Column(name="valor_total")
	private Integer valorTotal;
	@Column(name="num_recibo_caja")
	private Integer numReciboCaja;
	
	@Column(name="nivel_beparking")
	private String nivelBeparking;
	
	@Column(name="procesado_BP")
	private int procesadoBP;
	
	
	public ParkingPagoDigitalFacturaElectronica() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public Integer getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(Integer tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public Integer getNumReciboCaja() {
		return numReciboCaja;
	}

	public void setNumReciboCaja(Integer numReciboCaja) {
		this.numReciboCaja = numReciboCaja;
	}

	public String getNivelBeparking() {
		return nivelBeparking;
	}

	public void setNivelBeparking(String nivelBeparking) {
		this.nivelBeparking = nivelBeparking;
	}

	public int getProcesadoBP() {
		return procesadoBP;
	}

	public void setProcesadoBP(int procesadoBP) {
		this.procesadoBP = procesadoBP;
	}
	
	
}
