package co.net.parking.dto;

public class ExtractoBeparkingDTO {

	private String cedula;
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private Integer puntosTransaccion;
	private String categoria;
	private Integer puntosFaltantesParaBono;
	private Integer puntosAcumulados;
	
	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}
	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}
	public Integer getPuntosFaltantesParaBono() {
		return puntosFaltantesParaBono;
	}
	public void setPuntosFaltantesParaBono(Integer puntosFaltantesParaBono) {
		this.puntosFaltantesParaBono = puntosFaltantesParaBono;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Integer getPuntosTransaccion() {
		return puntosTransaccion;
	}
	public void setPuntosTransaccion(Integer puntosTransaccion) {
		this.puntosTransaccion = puntosTransaccion;
	}
	
	
	
}
