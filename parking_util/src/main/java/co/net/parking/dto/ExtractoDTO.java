package co.net.parking.dto;

public class ExtractoDTO {

	private String cedula;
	
	private String valor;

	public boolean isAcumula() {
		return acumula;
	}

	public void setAcumula(boolean acumula) {
		this.acumula = acumula;
	}

	private boolean acumula;

	

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	
	
}
