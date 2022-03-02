package co.net.parking.dto;

public class ComprobantePerdidoDTO {

	 private String codTerminal;
	 private String placa;
	 private String nombreCliente;
	 private String identificacion;
	 private String direccion;
	 private String telefono;
	 private String idInicioTurno;
	 
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getIdInicioTurno() {
		return idInicioTurno;
	}
	public void setIdInicioTurno(String idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}