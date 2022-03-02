package co.net.parking.dto;

public class CierreDiaDTO {



	private String codTerminal;
	private String codPark;
	private String codEmpleado;
	private String idInicioTurno;

	
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

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getIdInicioTurno() {
		return idInicioTurno;
	}

	public void setIdInicioTurno(String idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}

}