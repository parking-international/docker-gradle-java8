package com.ptesa.dto;


public class ConsultarMedioPagoDto {
	
	private String franquicia;
	private String idMedioPago;
	private String numeroCuenta;
	private String numeroTarjeta;
	private String tipoMedio;
	private String codigoBanco;
	
	public String getFranquicia() {
		return franquicia;
	}
	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}
	public String getIdMedioPago() {
		return idMedioPago;
	}
	public void setIdMedioPago(String idMedioPago) {
		this.idMedioPago = idMedioPago;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getTipoMedio() {
		return tipoMedio;
	}
	public void setTipoMedio(String tipoMedio) {
		this.tipoMedio = tipoMedio;
	}
	public String getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
}