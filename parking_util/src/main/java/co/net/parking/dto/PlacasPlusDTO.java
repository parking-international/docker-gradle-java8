package co.net.parking.dto;

public class PlacasPlusDTO {

	private String placa;
	private String fechaVigencia;
	private String QR;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	private int estado;
	
	
	public String getQR() {
		return QR;
	}
	public void setQR(String qR) {
		QR = qR;
	}
	

}