package co.net.parking.dto;

public class TerminalesDTO {
	private String codTerminal;
	private String codPark;
	private String nombrePark;
	private String poliza;
	private int tarifa;
	
	
	public TerminalesDTO() {
		
	}


	public String getCodTerminal() {
		return codTerminal;
	}


	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}


	public String getCodPark() {
		return codPark;
	}


	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}


	public String getNombrePark() {
		return nombrePark;
	}


	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}


	public String getPoliza() {
		return poliza;
	}


	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}


	public int getTarifa() {
		return tarifa;
	}


	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	
	
	
}