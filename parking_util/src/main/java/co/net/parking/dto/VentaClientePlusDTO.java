package co.net.parking.dto;

public class VentaClientePlusDTO {

	private String cedula;

	private String placa;

	private String origenVenta;

	private int valorCobro;

	private String codigo;

	private int tipoVehiculo;

	private String qr;

	private int renovar;

	private String token;

	private String ip;
	
	private String direccion;
	
	private String ciudad;
	
	private int periodoGratis;

	public int getPeriodoGratis() {
		return periodoGratis;
	}

	public void setPeriodoGratis(int periodoGratis) {
		this.periodoGratis = periodoGratis;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getOrigenVenta() {
		return origenVenta;
	}

	public void setOrigenVenta(String origenVenta) {
		this.origenVenta = origenVenta;
	}

	public String getQr() {
		return qr;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}

	public int getValorCobro() {
		return valorCobro;
	}

	public void setValorCobro(int valorCobro) {
		this.valorCobro = valorCobro;
	}

	public int getRenovar() {
		return renovar;
	}

	public void setRenovar(int renovar) {
		this.renovar = renovar;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
