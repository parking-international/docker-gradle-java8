package co.net.parking.dto;

public class TransaccionComprobantePerdidoDTO {
	
	private String placa;
	private String codEmpleado;
	private String codTerminal;
	private String codPark;
	private int idInicioTurno;
	private int valor;
	private String nombreCliente;
	private String identificacion;
	private String direccion;
	private String telefono;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
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
	public int getIdInicioTurno() {
		return idInicioTurno;
	}
	public void setIdInicioTurno(int idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
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