package co.net.parking.dto;

public class VentaClientePlusParkingDTO {


	private String cedula;
	
	private String placa;
	
	private String origenVenta;
	
	private int renovar;
	
	private String medioPago;
	
	private String valorPlus;
	
	private int tipoVehiculo;
	
	private String qr;
	

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

	public int getRenovar() {
		return renovar;
	}

	public void setRenovar(int renovar) {
		this.renovar = renovar;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public String getValorPlus() {
		return valorPlus;
	}

	public String getQr() {
		return qr;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}

	public void setValorPlus(String valorPlus) {
		this.valorPlus = valorPlus;
	}
	
	
	
}