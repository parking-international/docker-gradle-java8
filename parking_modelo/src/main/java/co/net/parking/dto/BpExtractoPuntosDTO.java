package co.net.parking.dto;

public class BpExtractoPuntosDTO {

	private String Cedula;
	private Integer PuntosAcumuladosVentas;
	private Integer PuntosAcumuladosOtros;
	private Integer PuntosRedimidos;
	private Integer PuntosVencidos;
	private Integer PuntosAVencer;
	private String FechaCorte;

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public Integer getPuntosAcumuladosVentas() {
		return PuntosAcumuladosVentas;
	}

	public void setPuntosAcumuladosVentas(Integer puntosAcumuladosVentas) {
		PuntosAcumuladosVentas = puntosAcumuladosVentas;
	}

	public Integer getPuntosAcumuladosOtros() {
		return PuntosAcumuladosOtros;
	}

	public void setPuntosAcumuladosOtros(Integer puntosAcumuladosOtros) {
		PuntosAcumuladosOtros = puntosAcumuladosOtros;
	}

	public Integer getPuntosRedimidos() {
		return PuntosRedimidos;
	}

	public void setPuntosRedimidos(Integer puntosRedimidos) {
		PuntosRedimidos = puntosRedimidos;
	}

	public Integer getPuntosVencidos() {
		return PuntosVencidos;
	}

	public void setPuntosVencidos(Integer puntosVencidos) {
		PuntosVencidos = puntosVencidos;
	}

	public Integer getPuntosAVencer() {
		return PuntosAVencer;
	}

	public void setPuntosAVencer(Integer puntosAVencer) {
		PuntosAVencer = puntosAVencer;
	}

	public String getFechaCorte() {
		return FechaCorte;
	}

	public void setFechaCorte(String fechaCorte) {
		FechaCorte = fechaCorte;
	}

	

}
