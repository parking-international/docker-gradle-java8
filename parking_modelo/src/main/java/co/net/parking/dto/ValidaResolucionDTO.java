package co.net.parking.dto;

public class ValidaResolucionDTO {

	private String codTerminal;
	private long resolucion;
	private long numFactura;
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public long getResolucion() {
		return resolucion;
	}
	public void setResolucion(long resolucion) {
		this.resolucion = resolucion;
	}
	public long getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(long numFactura) {
		this.numFactura = numFactura;
	}

	
}