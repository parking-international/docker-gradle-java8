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
@Table(name="parking_gopass_transaccion")
public class GopassTransaccion implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="cod_park")
	private String codPark;
	
	@Column(name="cod_terminal")
	private String codTerminal;
	
	private String identificacion;
	
	private String placa;

	@Column(name="fecha_entrada")
	private String fechaEntrada;
	
	@Column(name="fecha_salida")
	private String fechaSalida;
	
	private int total_tiempo;
	
	private int total_valor;
	
	private int num_recibo_caja;
	
	private String num_aprobacion;
	
	private String estado;
	
	private String error_pasarela;
	
	private String autorizacion;

	private String bono_beparking;

	private int procesadoBP;
	
	private int creadoSAP;
	
	@Column(name="fecha_envio_transaccion")
	private String fechaEnvioTransaccion;


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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public String getBono_beparking() {
		return bono_beparking;
	}

	public void setBono_beparking(String bono_beparking) {
		this.bono_beparking = bono_beparking;
	}

	public int getProcesadoBP() {
		return procesadoBP;
	}

	public void setProcesadoBP(int procesadoBP) {
		this.procesadoBP = procesadoBP;
	}

	public int getCreadoSAP() {
		return creadoSAP;
	}

	public void setCreadoSAP(int creadoSAP) {
		this.creadoSAP = creadoSAP;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getFechaEnvioTransaccion() {
		return fechaEnvioTransaccion;
	}

	public void setFechaEnvioTransaccion(String fechaEnvioTransaccion) {
		this.fechaEnvioTransaccion = fechaEnvioTransaccion;
	}
	
	
}