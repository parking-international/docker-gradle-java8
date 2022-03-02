package co.net.parking.dto;

public class RangoFacturaDTO {

	private int id;

	private String codPark;

	private String codTerminal;

	private short estado;

	private boolean estadoActualizacion;

	private String fechaModificacion;

	private String fraseResolucion;

	private String resolucion;

	private int rangoFinal;

	private int rangoInicial;
	
	private Integer ultima;
	
	private String nombrePark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public boolean isEstadoActualizacion() {
		return estadoActualizacion;
	}

	public void setEstadoActualizacion(boolean estadoActualizacion) {
		this.estadoActualizacion = estadoActualizacion;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getFraseResolucion() {
		return fraseResolucion;
	}

	public void setFraseResolucion(String fraseResolucion) {
		this.fraseResolucion = fraseResolucion;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public int getRangoFinal() {
		return rangoFinal;
	}

	public void setRangoFinal(int rangoFinal) {
		this.rangoFinal = rangoFinal;
	}

	public int getRangoInicial() {
		return rangoInicial;
	}

	public void setRangoInicial(int rangoInicial) {
		this.rangoInicial = rangoInicial;
	}

	public Integer getUltima() {
		return ultima;
	}

	public void setUltima(Integer ultima) {
		this.ultima = ultima;
	}

	public String getNombrePark() {
		return nombrePark;
	}

	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}
	
	
	

}
