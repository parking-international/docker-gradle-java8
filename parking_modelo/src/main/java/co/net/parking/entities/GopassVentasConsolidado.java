package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jesus.gomez
 *
 */
@Entity
@Table(name="parking_gopass_ventas_consolidado")
public class GopassVentasConsolidado implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String codPark;
	
	private String codTerminal;
	
	private String identificacion;
	
	private String nombres;
	
	private String apellidos;
	
	private String email;
	
	private String placa;

	private String telefono;
	
	private String ciudad;
	
	private String direccion;
	
	private String fechaEntrada;

	private String fechaSalida;
	
	private int total_tiempo;
	
	private int total_valor;
	
	private int num_recibo_caja;
	
	private String num_aprobacion;
	
	private String estado;
	
	private String error_pasarela;
	
	private String autorizacion;
	
	private String cedula_beparking;
	
	private String bono_beparking;
	@Column(name="nivel_beparking")
	private String nivelBeparking;
	@Column(name="procesado_BP")
	private int procesadoBP;
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
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public int getTotal_tiempo() {
		return total_tiempo;
	}
	public void setTotal_tiempo(int total_tiempo) {
		this.total_tiempo = total_tiempo;
	}
	public int getTotal_valor() {
		return total_valor;
	}
	public void setTotal_valor(int total_valor) {
		this.total_valor = total_valor;
	}
	public int getNum_recibo_caja() {
		return num_recibo_caja;
	}
	public void setNum_recibo_caja(int num_recibo_caja) {
		this.num_recibo_caja = num_recibo_caja;
	}
	public String getNum_aprobacion() {
		return num_aprobacion;
	}
	public void setNum_aprobacion(String num_aprobacion) {
		this.num_aprobacion = num_aprobacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getError_pasarela() {
		return error_pasarela;
	}
	public void setError_pasarela(String error_pasarela) {
		this.error_pasarela = error_pasarela;
	}
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}
	public String getCedula_beparking() {
		return cedula_beparking;
	}
	public void setCedula_beparking(String cedula_beparking) {
		this.cedula_beparking = cedula_beparking;
	}
	public String getBono_beparking() {
		return bono_beparking;
	}
	public void setBono_beparking(String bono_beparking) {
		this.bono_beparking = bono_beparking;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

}
