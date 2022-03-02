package co.net.parking.dto;


/**
 * Clase que contiene informacion de la reposicion de la tarjeta Mensual
 * @author kayala
 *
 */
public class ReposicionMensualDTO {
	
	private String serial;
	private String codigoTarjetaNueva;
	private String codigoTarjetaAntigua;
	private String identificacionTercero;
	private String codigoTerminal;
	private String codigoParqueadero;
	private TransaccionMensualDTO transaccionDTO;
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getCodigoTarjetaNueva() {
		return codigoTarjetaNueva;
	}
	public void setCodigoTarjetaNueva(String codigoTarjetaNueva) {
		this.codigoTarjetaNueva = codigoTarjetaNueva;
	}
	public String getCodigoTarjetaAntigua() {
		return codigoTarjetaAntigua;
	}
	public void setCodigoTarjetaAntigua(String codigoTarjetaAntigua) {
		this.codigoTarjetaAntigua = codigoTarjetaAntigua;
	}
	public String getIdentificacionTercero() {
		return identificacionTercero;
	}
	public void setIdentificacionTercero(String identificacionTercero) {
		this.identificacionTercero = identificacionTercero;
	}
	public String getCodigoTerminal() {
		return codigoTerminal;
	}
	public void setCodigoTerminal(String codigoTerminal) {
		this.codigoTerminal = codigoTerminal;
	}
	public String getCodigoParqueadero() {
		return codigoParqueadero;
	}
	public void setCodigoParqueadero(String codigoParqueadero) {
		this.codigoParqueadero = codigoParqueadero;
	}
	public TransaccionMensualDTO getTransaccionDTO() {
		return transaccionDTO;
	}
	public void setTransaccionDTO(TransaccionMensualDTO transaccionDTO) {
		this.transaccionDTO = transaccionDTO;
	}
	
	
}
