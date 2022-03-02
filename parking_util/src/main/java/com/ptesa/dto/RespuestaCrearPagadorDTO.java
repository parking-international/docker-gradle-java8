package com.ptesa.dto;


public class RespuestaCrearPagadorDTO extends RespuestaBaseDTO {
	
		private String numeroContrato;
		private String codigoRespuesta;
		
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
		public String getNumeroAuditoria() {
			return numeroAuditoria;
		}
		public void setNumeroAuditoria(String numeroAuditoria) {
			this.numeroAuditoria = numeroAuditoria;
		}
		private String mensajeRespuesta;
		
		private String numeroAuditoria;
		public String getNumeroContrato() {
			return numeroContrato;
		}
		public void setNumeroContrato(String numeroContrato) {
			this.numeroContrato = numeroContrato;
		}
}