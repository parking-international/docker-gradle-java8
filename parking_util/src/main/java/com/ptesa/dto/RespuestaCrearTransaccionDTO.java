package com.ptesa.dto;

public class RespuestaCrearTransaccionDTO {

 private String codigoRespuesta;
 private String	mensajeRespuesta;
 private String codigoAutEntidadFinanciera;
 private String	codigoAutorizacion;
 private String	codigoRtaEntidadFinanciera;
 private String	mensajeRtaEntidadFinanciera;
 private String	numeroTransaccion;
 private String	valorTransaccion;
 private String	fechaTransaccion;
 private String	numeroAuditoria;	
 private String referenciaTx;
 
 public String getReferenciaTx() {
	return referenciaTx;
}
public void setReferenciaTx(String referenciaTx) {
	this.referenciaTx = referenciaTx;
}
public String getCodigoRespuesta() {
	return codigoRespuesta;
}
public void setCodigoRespuesta(String codigoRespuesta) {
	this.codigoRespuesta = codigoRespuesta;
}
public String getMensajeRespuesta() {
	return mensajeRespuesta;
}
public void setMensajeRespuesta(String mensajeRespuesta) {
	this.mensajeRespuesta = mensajeRespuesta;
}
public String getCodigoAutEntidadFinanciera() {
	return codigoAutEntidadFinanciera;
}
public void setCodigoAutEntidadFinanciera(String codigoAutEntidadFinanciera) {
	this.codigoAutEntidadFinanciera = codigoAutEntidadFinanciera;
}
public String getCodigoAutorizacion() {
	return codigoAutorizacion;
}
public void setCodigoAutorizacion(String codigoAutorizacion) {
	this.codigoAutorizacion = codigoAutorizacion;
}
public String getCodigoRtaEntidadFinanciera() {
	return codigoRtaEntidadFinanciera;
}
public void setCodigoRtaEntidadFinanciera(String codigoRtaEntidadFinanciera) {
	this.codigoRtaEntidadFinanciera = codigoRtaEntidadFinanciera;
}
public String getMensajeRtaEntidadFinanciera() {
	return mensajeRtaEntidadFinanciera;
}
public void setMensajeRtaEntidadFinanciera(String mensajeRtaEntidadFinanciera) {
	this.mensajeRtaEntidadFinanciera = mensajeRtaEntidadFinanciera;
}
public String getNumeroTransaccion() {
	return numeroTransaccion;
}
public void setNumeroTransaccion(String numeroTransaccion) {
	this.numeroTransaccion = numeroTransaccion;
}
public String getValorTransaccion() {
	return valorTransaccion;
}
public void setValorTransaccion(String valorTransaccion) {
	this.valorTransaccion = valorTransaccion;
}
public String getFechaTransaccion() {
	return fechaTransaccion;
}
public void setFechaTransaccion(String fechaTransaccion) {
	this.fechaTransaccion = fechaTransaccion;
}
public String getNumeroAuditoria() {
	return numeroAuditoria;
}
public void setNumeroAuditoria(String numeroAuditoria) {
	this.numeroAuditoria = numeroAuditoria;
}
}
