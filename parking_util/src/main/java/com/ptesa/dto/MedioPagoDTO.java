package com.ptesa.dto;

/**
 * DTO que permite ARMAR EL OBJETO de datos que recibe PTESA para crear un medio de pago 
 * @author kayala
 *
 */
public class MedioPagoDTO {

	/**
	 * parametros base para todas las solicitudes
	 */
	private String canal;
	private String codigoVerificacion;
	private String idOrganizacion;
	private String usuario;
	private String origen;
	private String fechaVencimiento;
	private String franquicia;
	private String numeroContrato;
	private String numeroIdentificacion;
	private String numeroTarjeta;
	private String tipoMedio;
	private int tipoIdentificacion;
	private String idMedioPago;
	
	public String getIdMedioPago() {
		return idMedioPago;
	}
	public void setIdMedioPago(String idMedioPago) {
		this.idMedioPago = idMedioPago;
	}
	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getCodigoVerificacion() {
		return codigoVerificacion;
	}
	public void setCodigoVerificacion(String codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}
	public String getIdOrganizacion() {
		return idOrganizacion;
	}
	public void setIdOrganizacion(String idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getFranquicia() {
		return franquicia;
	}
	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
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
	
	
}