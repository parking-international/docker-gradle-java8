package co.net.parking.dto;

import java.util.UUID;



public class TransaccionMensualDTO {
	//@Type(type = "uuid-char")
	private UUID idTransaccion;
	
	private Integer astickers;

	private String barcode;

	private String beParking;

	private String codEmpleado;

	private String codPark;

	private String codTerminal;

	private Integer concepto;

	private Integer contrato;

	private short controlf;

	private String detalle;

	private short estado;

	private String fechaFinal;

	private String fechaInicial;

	private short formaPago;

	private String grandesSuper;

	private String idCliente;

	private Integer idConvenio;

	private Integer idInicioTurno;

	private Integer iva;

	private String nombreUsaConvenio;

	private Integer numComprobante;

	private Integer numFactura;

	private String numTarjetaPp;

	private String numTarjetaPpChip;

	private String numeroCheque;

	private Integer pConvenio;

	private Integer pPrepark;

	private short perdido;

	private String placa;

	private String placa2;
	
	private String placa3;

	private Integer subtotal;

	private long tiempoFinal;

	private long tiempoInicial;

	private long tiempoTotal;

	private short tipoTrans;

	private Integer tipoVehiculo;

	private Integer total;

	private Integer vconvenio;

	private Integer vcuarto;

	private Integer vplana;

	private Integer vpleno;

	private Integer vsticker;

	private Integer valorBr;

	private Integer valorCheque;

	private Integer valorCuponatic;

	private Integer valorDatafono;

	private Integer valorEf;

	private Integer valorGp;

	private Integer valorLifemiles;

	private Integer valorNc;

	private Integer valorPp;

	private Integer transmitido;

	private int auditado;

	public TransaccionMensualDTO() {
	}

	public UUID getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(UUID idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Integer getAstickers() {
		return astickers;
	}

	public void setAstickers(Integer astickers) {
		this.astickers = astickers;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBeParking() {
		return beParking;
	}

	public void setBeParking(String beParking) {
		this.beParking = beParking;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public Integer getConcepto() {
		return concepto;
	}

	public void setConcepto(Integer concepto) {
		this.concepto = concepto;
	}

	public Integer getContrato() {
		return contrato;
	}

	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}

	public short getControlf() {
		return controlf;
	}

	public void setControlf(short controlf) {
		this.controlf = controlf;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public short getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(short formaPago) {
		this.formaPago = formaPago;
	}

	public String getGrandesSuper() {
		return grandesSuper;
	}

	public void setGrandesSuper(String grandesSuper) {
		this.grandesSuper = grandesSuper;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(Integer idConvenio) {
		this.idConvenio = idConvenio;
	}

	public Integer getIdInicioTurno() {
		return idInicioTurno;
	}

	public void setIdInicioTurno(Integer idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public String getNombreUsaConvenio() {
		return nombreUsaConvenio;
	}

	public void setNombreUsaConvenio(String nombreUsaConvenio) {
		this.nombreUsaConvenio = nombreUsaConvenio;
	}

	public Integer getNumComprobante() {
		return numComprobante;
	}

	public void setNumComprobante(Integer numComprobante) {
		this.numComprobante = numComprobante;
	}

	public Integer getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(Integer numFactura) {
		this.numFactura = numFactura;
	}

	public String getNumTarjetaPp() {
		return numTarjetaPp;
	}

	public void setNumTarjetaPp(String numTarjetaPp) {
		this.numTarjetaPp = numTarjetaPp;
	}

	public String getNumTarjetaPpChip() {
		return numTarjetaPpChip;
	}

	public void setNumTarjetaPpChip(String numTarjetaPpChip) {
		this.numTarjetaPpChip = numTarjetaPpChip;
	}

	public String getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public Integer getpConvenio() {
		return pConvenio;
	}

	public void setpConvenio(Integer pConvenio) {
		this.pConvenio = pConvenio;
	}

	public Integer getpPrepark() {
		return pPrepark;
	}

	public void setpPrepark(Integer pPrepark) {
		this.pPrepark = pPrepark;
	}

	public short getPerdido() {
		return perdido;
	}

	public void setPerdido(short perdido) {
		this.perdido = perdido;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca2() {
		return placa2;
	}

	public void setPlaca2(String placa2) {
		this.placa2 = placa2;
	}

	public Integer getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Integer subtotal) {
		this.subtotal = subtotal;
	}

	public long getTiempoFinal() {
		return tiempoFinal;
	}

	public void setTiempoFinal(long tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}

	public long getTiempoInicial() {
		return tiempoInicial;
	}

	public void setTiempoInicial(long tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public long getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(long tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public short getTipoTrans() {
		return tipoTrans;
	}

	public void setTipoTrans(short tipoTrans) {
		this.tipoTrans = tipoTrans;
	}

	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getVconvenio() {
		return vconvenio;
	}

	public void setVconvenio(Integer vconvenio) {
		this.vconvenio = vconvenio;
	}

	public Integer getVcuarto() {
		return vcuarto;
	}

	public void setVcuarto(Integer vcuarto) {
		this.vcuarto = vcuarto;
	}

	public Integer getVplana() {
		return vplana;
	}

	public void setVplana(Integer vplana) {
		this.vplana = vplana;
	}

	public Integer getVpleno() {
		return vpleno;
	}

	public void setVpleno(Integer vpleno) {
		this.vpleno = vpleno;
	}

	public Integer getVsticker() {
		return vsticker;
	}

	public void setVsticker(Integer vsticker) {
		this.vsticker = vsticker;
	}

	public Integer getValorBr() {
		return valorBr;
	}

	public void setValorBr(Integer valorBr) {
		this.valorBr = valorBr;
	}

	public Integer getValorCheque() {
		return valorCheque;
	}

	public void setValorCheque(Integer valorCheque) {
		this.valorCheque = valorCheque;
	}

	public Integer getValorCuponatic() {
		return valorCuponatic;
	}

	public void setValorCuponatic(Integer valorCuponatic) {
		this.valorCuponatic = valorCuponatic;
	}

	public Integer getValorDatafono() {
		return valorDatafono;
	}

	public void setValorDatafono(Integer valorDatafono) {
		this.valorDatafono = valorDatafono;
	}

	public Integer getValorEf() {
		return valorEf;
	}

	public void setValorEf(Integer valorEf) {
		this.valorEf = valorEf;
	}

	public Integer getValorGp() {
		return valorGp;
	}

	public void setValorGp(Integer valorGp) {
		this.valorGp = valorGp;
	}

	public Integer getValorLifemiles() {
		return valorLifemiles;
	}

	public void setValorLifemiles(Integer valorLifemiles) {
		this.valorLifemiles = valorLifemiles;
	}

	public Integer getValorNc() {
		return valorNc;
	}

	public void setValorNc(Integer valorNc) {
		this.valorNc = valorNc;
	}

	public Integer getValorPp() {
		return valorPp;
	}

	public void setValorPp(Integer valorPp) {
		this.valorPp = valorPp;
	}

	public Integer getTransmitido() {
		return transmitido;
	}

	public void setTransmitido(Integer transmitido) {
		this.transmitido = transmitido;
	}

	public int getAuditado() {
		return auditado;
	}

	public void setAuditado(int auditado) {
		this.auditado = auditado;
	}

	public String getPlaca3() {
		return placa3;
	}

	public void setPlaca3(String placa3) {
		this.placa3 = placa3;
	}
}
