package co.net.parking.dto;

public class RespuestaTransDTO {

	private int numFactura;
	private String placa;
	private String fechaEntrada;
	private String fechaSalida;
	private String duracion;
	private double valorServicio;
	private double valorPerdido;
	private double subTotal;
	private double iva;
	private double total;
	private String contribuyentes;
	
	private ExtractoBeparkingDTO extracto;
	
	public RespuestaTransDTO() {
		
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public double getValorServicio() {
		return valorServicio;
	}

	public void setValorServicio(double valorServicio) {
		this.valorServicio = valorServicio;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public ExtractoBeparkingDTO getExtracto() {
		return extracto;
	}

	public void setExtracto(ExtractoBeparkingDTO extracto) {
		this.extracto = extracto;
	}

	public double getValorPerdido() {
		return valorPerdido;
	}

	public void setValorPerdido(double valorPerdido) {
		this.valorPerdido = valorPerdido;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public String getContribuyentes() {
		return contribuyentes;
	}

	public void setContribuyentes(String contribuyentes) {
		this.contribuyentes = contribuyentes;
	}
	
	
	
}
