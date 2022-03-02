package co.net.parking.dto;

public class TransaccionDTO {
	
	private short tipoTrans;
	private String barcode;
	private String fechaFinal;
	private short formaPago;
	private String codEmpleado;
	private String codTerminal;
	private String codPark;
	private int idInicioTurno;
	private int valor;
	private int valorPerdido;
	private String beParking;
	private String comprobante;
	private int perdido;
	private int idConvenio;
	private String numeroCheque;
	public short getTipoTrans() {
		return tipoTrans;
	}
	public void setTipoTrans(short tipoTrans) {
		this.tipoTrans = tipoTrans;
	}

	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public short getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(short formaPago) {
		this.formaPago = formaPago;
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
	public String getBeParking() {
		return beParking;
	}
	public void setBeParking(String beParking) {
		this.beParking = beParking;
	}
	public String getComprobante() {
		return comprobante;
	}
	public void setComprobante(String comprobante) {
		this.comprobante = comprobante;
	}
	public int getPerdido() {
		return perdido;
	}
	public void setPerdido(int perdido) {
		this.perdido = perdido;
	}
	public int getValorPerdido() {
		return valorPerdido;
	}
	public void setValorPerdido(int valorPerdido) {
		this.valorPerdido = valorPerdido;
	}
	public int getIdConvenio() {
		return idConvenio;
	}
	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}
	public String getNumeroCheque() {
		return numeroCheque;
	}
	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	
	
}
