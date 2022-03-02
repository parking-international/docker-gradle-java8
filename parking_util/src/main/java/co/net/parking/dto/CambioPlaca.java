package co.net.parking.dto;

public class CambioPlaca {
	
	private String placaAntigua;
	
	private String placaNueva;
	
	private String documentoCliente;
	
	private String usuarioModifica;
	
	private String nuevoQR;
	
	private String origen;
	
	private Integer tipoVehiculo;

	public String getPlacaAntigua() {
		return placaAntigua;
	}

	public void setPlacaAntigua(String placaAntigua) {
		this.placaAntigua = placaAntigua;
	}

	public String getPlacaNueva() {
		return placaNueva;
	}

	public void setPlacaNueva(String placaNueva) {
		this.placaNueva = placaNueva;
	}

	public String getDocumentoCliente() {
		return documentoCliente;
	}

	public void setDocumentoCliente(String documentoCliente) {
		this.documentoCliente = documentoCliente;
	}

	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public String getNuevoQR() {
		return nuevoQR;
	}

	public void setNuevoQR(String nuevoQR) {
		this.nuevoQR = nuevoQR;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
}
