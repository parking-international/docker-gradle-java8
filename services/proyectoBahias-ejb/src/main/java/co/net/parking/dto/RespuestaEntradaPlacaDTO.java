package co.net.parking.dto;

public class RespuestaEntradaPlacaDTO {
	
	private boolean estado;
	private String mensaje;
	
	public RespuestaEntradaPlacaDTO() {}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	

}
