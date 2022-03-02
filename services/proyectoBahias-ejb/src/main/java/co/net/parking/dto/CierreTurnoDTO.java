package co.net.parking.dto;

public class CierreTurnoDTO {


	private String codTerminal;
	private String codPark;
	private String codEmpleado;
	private Integer reportado;
	private Integer idInicioTurno;

	public Integer getIdInicioTurno() {
		return idInicioTurno;
	}

	public void setIdInicioTurno(Integer idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
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

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Integer getReportado() {
		return reportado;
	}

	public void setReportado(Integer reportado) {
		this.reportado = reportado;
	}

	private CierreTurnoDTO() {
		
	}
	
	
	
}
