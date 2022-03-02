package com.ptesa.dto;

/**
 * DTO que se usa para recibir los datos desde la App
 * @author kayala
 *
 */
public class MedioPagoBasicoDTO {

	private String franquicia;
	
	private String numeroTarjeta;
	
	private String fechaVencimiento;
	
	private String cedula;
	
	private String numeroContrato;
	
	private String idMedioPago;
	
	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}


	public String getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getIdMedioPago() {
		return idMedioPago;
	}

	public void setIdMedioPago(String idMedioPago) {
		this.idMedioPago = idMedioPago;
	}
	
	
	
}
