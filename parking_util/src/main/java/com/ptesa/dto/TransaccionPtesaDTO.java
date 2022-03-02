package com.ptesa.dto;


public class TransaccionPtesaDTO {
	
	private String canal;
	private String codigoVerificacion;
	private String idOrganizacion;
	private String usuario;
	private String origen;
	private String idMedioPago;
	private  String conceptoRecaudo;
	private boolean esTxRecurrente;
	private String numeroContrato;
	private String numeroIdentificacion; 
	private String tipoIdentificacion;
	private String numeroTransaccionTerminal;
	private String valorTransaccion;
	
	
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getNumeroAuditoria() {
		return numeroAuditoria;
	}
	public void setNumeroAuditoria(String numeroAuditoria) {
		this.numeroAuditoria = numeroAuditoria;
	}
	public String getIdMedioPago() {
		return idMedioPago;
	}
	public void setIdMedioPago(String idMedioPago) {
		this.idMedioPago = idMedioPago;
	}
	public String getConceptoRecaudo() {
		return conceptoRecaudo;
	}
	public void setConceptoRecaudo(String conceptoRecaudo) {
		this.conceptoRecaudo = conceptoRecaudo;
	}
	
	public boolean isEsTxRecurrente() {
		return esTxRecurrente;
	}
	public void setEsTxRecurrente(boolean esTxRecurrente) {
		this.esTxRecurrente = esTxRecurrente;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getNumeroTransaccionTerminal() {
		return numeroTransaccionTerminal;
	}
	public void setNumeroTransaccionTerminal(String numeroTransaccionTerminal) {
		this.numeroTransaccionTerminal = numeroTransaccionTerminal;
	}
	public String getValorTransaccion() {
		return valorTransaccion;
	}
	public void setValorTransaccion(String valorTransaccion) {
		this.valorTransaccion = valorTransaccion;
	}
	private String numeroAuditoria;
	
}