package co.net.parking.dto;

public class RespuestaCierreTurnoDTO {

	private String fechaInicioTurno;
	private String fechaFinTurno;
	private String facturaInicial;
	private String facturaFinal;
	private String efectivoCalculadoSistema;
	private String efectivoReportado;
	private String efectivoAEntregar;
	private String datafonoCalculadoSistema;
	public String getFechaInicioTurno() {
		return fechaInicioTurno;
	}
	public void setFechaInicioTurno(String fechaInicioTurno) {
		this.fechaInicioTurno = fechaInicioTurno;
	}
	public String getFechaFinTurno() {
		return fechaFinTurno;
	}
	public void setFechaFinTurno(String fechaFinTurno) {
		this.fechaFinTurno = fechaFinTurno;
	}
	public String getFacturaInicial() {
		return facturaInicial;
	}
	public void setFacturaInicial(String facturaInicial) {
		this.facturaInicial = facturaInicial;
	}
	public String getFacturaFinal() {
		return facturaFinal;
	}
	public void setFacturaFinal(String facturaFinal) {
		this.facturaFinal = facturaFinal;
	}
	public String getEfectivoCalculadoSistema() {
		return efectivoCalculadoSistema;
	}
	public void setEfectivoCalculadoSistema(String efectivoCalculadoSistema) {
		this.efectivoCalculadoSistema = efectivoCalculadoSistema;
	}
	public String getEfectivoReportado() {
		return efectivoReportado;
	}
	public void setEfectivoReportado(String efectivoReportado) {
		this.efectivoReportado = efectivoReportado;
	}
	public String getEfectivoAEntregar() {
		return efectivoAEntregar;
	}
	public void setEfectivoAEntregar(String efectivoAEntregar) {
		this.efectivoAEntregar = efectivoAEntregar;
	}
	public String getDatafonoCalculadoSistema() {
		return datafonoCalculadoSistema;
	}
	public void setDatafonoCalculadoSistema(String datafonoCalculadoSistema) {
		this.datafonoCalculadoSistema = datafonoCalculadoSistema;
	}
	
	
}