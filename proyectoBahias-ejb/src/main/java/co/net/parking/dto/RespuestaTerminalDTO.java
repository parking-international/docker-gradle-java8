package co.net.parking.dto;

public class RespuestaTerminalDTO {
	
	private String codTerminal;
	private String codPark;
	private String nombrePark;
	private String direccion;
	private String horario;
	private int baseCaja;
	private String resolucion;
	private String mensajeResolucion;
	private String rangoInicial;
	private String rangoFinal;
	private String fechaInicialResolucion;
	private String fechaFinalResolucion;
	private String poliza;
	private int tarifaCarro;
	private int tarifaMoto;
	private int tarifaBici;
	private int tipoTarifa;
	private int tiempoGracia;
	
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
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getNombrePark() {
		return nombrePark;
	}
	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}
	public int getBaseCaja() {
		return baseCaja;
	}
	public void setBaseCaja(int baseCaja) {
		this.baseCaja = baseCaja;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getRangoInicial() {
		return rangoInicial;
	}
	public void setRangoInicial(String rangoInicial) {
		this.rangoInicial = rangoInicial;
	}
	public String getRangoFinal() {
		return rangoFinal;
	}
	public void setRangoFinal(String rangoFinal) {
		this.rangoFinal = rangoFinal;
	}
	public String getPoliza() {
		return poliza;
	}
	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}
	public String getFechaInicialResolucion() {
		return fechaInicialResolucion;
	}
	public void setFechaInicialResolucion(String fechaInicialResolucion) {
		this.fechaInicialResolucion = fechaInicialResolucion;
	}
	public String getFechaFinalResolucion() {
		return fechaFinalResolucion;
	}
	public void setFechaFinalResolucion(String fechaFinalResolucion) {
		this.fechaFinalResolucion = fechaFinalResolucion;
	}
	
	
	
	public int getTipoTarifa() {
		return tipoTarifa;
	}
	public void setTipoTarifa(int tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	public int getTarifaCarro() {
		return tarifaCarro;
	}
	public void setTarifaCarro(int tarifaCarro) {
		this.tarifaCarro = tarifaCarro;
	}
	public int getTarifaMoto() {
		return tarifaMoto;
	}
	public void setTarifaMoto(int tarifaMoto) {
		this.tarifaMoto = tarifaMoto;
	}
	public int getTarifaBici() {
		return tarifaBici;
	}
	public void setTarifaBici(int tarifaBici) {
		this.tarifaBici = tarifaBici;
	}
	public int getTiempoGracia() {
		return tiempoGracia;
	}
	public void setTiempoGracia(int tiempoGracia) {
		this.tiempoGracia = tiempoGracia;
	}
	public String getMensajeResolucion() {
		return mensajeResolucion;
	}
	public void setMensajeResolucion(String mensajeResolucion) {
		this.mensajeResolucion = mensajeResolucion;
	}
	
	

}
