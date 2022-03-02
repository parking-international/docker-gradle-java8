package co.net.parking.dto;

public class AcumuladoTransaccionesDTO {


	private int totalCalculadoSistema;
	private int facturaInicial;
	private int facturaFinal;
	private int numTransacciones;
	private int totalCalculadoSistemaDatafono;
	private int perdidos;
	
	public int getNumTransacciones() {
		return numTransacciones;
	}
	public void setNumTransacciones(int numTransacciones) {
		this.numTransacciones = numTransacciones;
	}
	public int getTotalCalculadoSistema() {
		return totalCalculadoSistema;
	}
	public void setTotalCalculadoSistema(int totalCalculadoSistema) {
		this.totalCalculadoSistema = totalCalculadoSistema;
	}
	public int getFacturaInicial() {
		return facturaInicial;
	}
	public void setFacturaInicial(int facturaInicial) {
		this.facturaInicial = facturaInicial;
	}
	public int getFacturaFinal() {
		return facturaFinal;
	}
	public void setFacturaFinal(int facturaFinal) {
		this.facturaFinal = facturaFinal;
	}
	public int getTotalCalculadoSistemaDatafono() {
		return totalCalculadoSistemaDatafono;
	}
	public void setTotalCalculadoSistemaDatafono(int totalCalculadoSistemaDatafono) {
		this.totalCalculadoSistemaDatafono = totalCalculadoSistemaDatafono;
	}
	public int getPerdidos() {
		return perdidos;
	}
	public void setPerdidos(int perdidos) {
		this.perdidos = perdidos;
	}
	
	

}