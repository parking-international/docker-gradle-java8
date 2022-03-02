package com.ptesa.dto;


public class RespuestaBaseDTO {
	
	
		private String codigoRespuesta;
		
		private String mensajeRespuesta;
		
		private String numeroAuditoria;
		

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
	}