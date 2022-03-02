package com.ptesa.dto;

import co.net.parking.util.ConstantesPtesaUtil;

public class BaseDTO {
	
	/**
	 * parametros base para todas las solicitudes
	 */
	private String origen;
	private String usuario;
	private String canal;
	private String codigoVerificacion;
	private String idOrganizacion;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = ConstantesPtesaUtil.ORIGEN;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = ConstantesPtesaUtil.USUARIO;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = ConstantesPtesaUtil.CANAL;
	}

	public String getCodigoVerificacion() {
		return codigoVerificacion;
	}

	public void setCodigoVerificacion(String codigoVerificacion) {
		this.codigoVerificacion = ConstantesPtesaUtil.CODIGO_VERIFICACION;
	}

	public String getIdOrganizacion() {
		return idOrganizacion;
	}

	public void setIdOrganizacion(String idOrganizacion) {
		this.idOrganizacion = ConstantesPtesaUtil.ID_ORGANIZACION;
	}

}
