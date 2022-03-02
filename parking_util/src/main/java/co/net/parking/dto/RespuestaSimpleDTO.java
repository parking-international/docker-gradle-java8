package co.net.parking.dto;

public class RespuestaSimpleDTO {

	private Boolean estado;

	private String mensaje;

	public RespuestaSimpleDTO() {

	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
