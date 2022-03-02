package co.net.parking.dto;

public class SumatoriaTurnosDTO {



	private String totalTransacciones;
	private String totalEfectivo;
	private String totalTurnos;
	private int estadoTurnos;
	
	public int getEstadoTurnos() {
		return estadoTurnos;
	}
	public void setEstadoTurnos(int estadoTurnos) {
		this.estadoTurnos = estadoTurnos;
	}
	private int sobrante;
	private int faltante;
	
	public int getSobrante() {
		return sobrante;
	}
	public void setSobrante(int sobrante) {
		this.sobrante = sobrante;
	}
	public int getFaltante() {
		return faltante;
	}
	public void setFaltante(int faltante) {
		this.faltante = faltante;
	}
	private String totalReportado;
	
	public String getTotalTransacciones() {
		return totalTransacciones;
	}
	public void setTotalTransacciones(String totalTransacciones) {
		this.totalTransacciones = totalTransacciones;
	}
	public String getTotalEfectivo() {
		return totalEfectivo;
	}
	public void setTotalEfectivo(String totalEfectivo) {
		this.totalEfectivo = totalEfectivo;
	}
	public String getTotalTurnos() {
		return totalTurnos;
	}
	public void setTotalTurnos(String totalTurnos) {
		this.totalTurnos = totalTurnos;
	}
	public String getTotalReportado() {
		return totalReportado;
	}
	public void setTotalReportado(String totalReportado) {
		this.totalReportado = totalReportado;
	}

	
}