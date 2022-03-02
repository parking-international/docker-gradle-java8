package co.net.parking.dto;

public class RedimirBonoDTO {

	private String codBono;
	private String numFactura;
	private String codTerminal;

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getCodBono() {
		return codBono;
	}

	public void setCodBono(String codBono) {
		this.codBono = codBono;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

}
