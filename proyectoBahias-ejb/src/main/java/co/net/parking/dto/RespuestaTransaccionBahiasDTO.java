package co.net.parking.dto;

public class RespuestaTransaccionBahiasDTO {
	
	private boolean estado;
	private String mensaje;
	private int numFactura;
	private String placa;
	private String fechaEntrada;
	private String fechaSalida;
	private String duracionMinutos;
	private double valorServicio;
	private double valorComprobantePerdido;
	private double iva;
	private double total;
	private ExtractoBeparkingDTO extracto;
	private String contriyentes;

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

	
	public String getDuracionMinutos() {
		return duracionMinutos;
	}
	public void setDuracionMinutos(String duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
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
	public double getValorComprobantePerdido() {
		return valorComprobantePerdido;
	}
	public void setValorComprobantePerdido(double valorComprobantePerdido) {
		this.valorComprobantePerdido = valorComprobantePerdido;
	}
	public String getContriyentes() {
		return contriyentes;
	}
	public void setContriyentes(String contriyentes) {
		this.contriyentes = contriyentes;
	}
	
	

}
