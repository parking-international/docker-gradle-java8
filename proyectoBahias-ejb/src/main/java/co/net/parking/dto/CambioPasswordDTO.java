package co.net.parking.dto;

public class CambioPasswordDTO {
	private String usuario;
	private String passwordAntigua;
	private String passwordNueva;


	public String getPasswordAntigua() {
		return passwordAntigua;
	}
	public void setPasswordAntigua(String passwordAntigua) {
		this.passwordAntigua = passwordAntigua;
	}
	public String getPasswordNueva() {
		return passwordNueva;
	}
	public void setPasswordNueva(String passwordNueva) {
		this.passwordNueva = passwordNueva;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
