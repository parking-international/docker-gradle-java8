package co.net.parking.dto;

public class ConveniosBahiasDTO {
	
	private int id;
	private String tipo;
	private String nombreConvenio;
	private String tiempoDescuento;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombreConvenio() {
		return nombreConvenio;
	}
	public void setNombreConvenio(String nombreConvenio) {
		this.nombreConvenio = nombreConvenio;
	}
	public String getTiempoDescuento() {
		return tiempoDescuento;
	}
	public void setTiempoDescuento(String tiempoDescuento) {
		this.tiempoDescuento = tiempoDescuento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}