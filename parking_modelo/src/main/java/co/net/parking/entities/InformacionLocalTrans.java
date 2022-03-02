package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informacion_local_trans")
public class InformacionLocalTrans {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "id_local_trans")
	private String idLocalTrans;

	@Column(name = "cod_terminal")
	private String codTerminal;

	@Column(name = "cod_empleado")
	private String codEmpleado;

	@Column(name = "id_turno")
	private Integer idTurno;

	@Column(name = "tipo_trans")
	private Integer tipoTrans;

	@Column(name = "num_factura")
	private Integer numFactura;

	@Column(name = "placa")
	private String placa;

	@Column(name = "placa2")
	private String placa2;

	@Column(name = "tiempo_inicial")
	private Integer tiempoInicial;

	@Column(name = "tiempo_final")
	private Integer tiempoFinal;

	@Column(name = "fecha_inicial")
	private String fechaInicial;

	@Column(name = "fecha_final")
	private String fechaFinal;

	@Column(name = "tiempo_total")
	private Integer tiempoTotal;

	@Column(name = "valor_ef")
	private Integer valorEf;

	@Column(name = "valor_pp")
	private Integer valorPp;

	@Column(name = "valor_datafono")
	private Integer valorDatafono;

	@Column(name = "valor_cheque")
	private Integer valorCheque;

	@Column(name = "subtotal")
	private Integer subTotal;

	@Column(name = "iva")
	private Integer iva;

	@Column(name = "total")
	private Integer total;

	@Column(name = "forma_pago")
	private Integer formaPago;

	@Column(name = "num_comprobante")
	private Integer numComprobante;

	@Column(name = "num_tarjeta_pp")
	private String numTarjetaPp;

	@Column(name = "num_tarjeta_pp_chip")
	private String numTarjetaPpChip;

	@Column(name = "numero_cheque")
	private String numeroCheque;

	@Column(name = "id_convenio")
	private Integer id_convenio;

	@Column(name = "id_cliente")
	private String id_cliente;

	@Column(name = "astickers")
	private Integer astickers;

	@Column(name = "barcode")
	private String barcode;

	@Column(name = "perdido")
	private Integer perdido;

	@Column(name = "estado")
	private Integer estado;

	@Column(name = "transmitido")
	private Integer transmitido;

	@Column(name = "controlf")
	private Integer controlf;

	@Column(name = "grandes_super")
	private String grandesSuper;

	@Column(name = "p_convenio")
	private Integer pConvenio;

	@Column(name = "p_prepark")
	private Integer pPrepark;

	@Column(name = "v_convenio")
	private Integer vConvenio;

	@Column(name = "v_sticker")
	private Integer vSticker;

	@Column(name = "v_plana")
	private Integer vPlana;

	@Column(name = "v_pleno")
	private Integer vPleno;

	@Column(name = "v_cuarto")
	private Integer vCuarto;

	@Column(name = "tipo_vehiculo")
	private Integer tipoVehiculo;

	@Column(name = "contrato")
	private Integer contrato;

	@Column(name = "be_parking")
	private String beParking;

	@Column(name = "valor_gp")
	private Integer valorGp;

	@Column(name = "nombre_usa_convenio")
	private String nombreUsaConvenio;

	@Column(name = "valor_lifemiles")
	private Integer valorLifemiles;

	@Column(name = "valor_cuponatic")
	private Integer valorCuponatic;

	@Column(name = "auditado")
	private Integer auditado;

	public InformacionLocalTrans() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdLocalTrans() {
		return idLocalTrans;
	}

	public void setIdLocalTrans(String idLocalTrans) {
		this.idLocalTrans = idLocalTrans;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public Integer getTipoTrans() {
		return tipoTrans;
	}

	public void setTipoTrans(Integer tipoTrans) {
		this.tipoTrans = tipoTrans;
	}

	public Integer getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(Integer numFactura) {
		this.numFactura = numFactura;
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

	public Integer getTiempoInicial() {
		return tiempoInicial;
	}

	public void setTiempoInicial(Integer tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public Integer getTiempoFinal() {
		return tiempoFinal;
	}

	public void setTiempoFinal(Integer tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Integer getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(Integer tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public Integer getValorEf() {
		return valorEf;
	}

	public void setValorEf(Integer valorEf) {
		this.valorEf = valorEf;
	}

	public Integer getValorPp() {
		return valorPp;
	}

	public void setValorPp(Integer valorPp) {
		this.valorPp = valorPp;
	}

	public Integer getValorDatafono() {
		return valorDatafono;
	}

	public void setValorDatafono(Integer valorDatafono) {
		this.valorDatafono = valorDatafono;
	}

	public Integer getValorCheque() {
		return valorCheque;
	}

	public void setValorCheque(Integer valorCheque) {
		this.valorCheque = valorCheque;
	}

	public Integer getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(Integer formaPago) {
		this.formaPago = formaPago;
	}

	public Integer getNumComprobante() {
		return numComprobante;
	}

	public void setNumComprobante(Integer numComprobante) {
		this.numComprobante = numComprobante;
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

	public Integer getId_convenio() {
		return id_convenio;
	}

	public void setId_convenio(Integer id_convenio) {
		this.id_convenio = id_convenio;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
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

	public Integer getPerdido() {
		return perdido;
	}

	public void setPerdido(Integer perdido) {
		this.perdido = perdido;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getTransmitido() {
		return transmitido;
	}

	public void setTransmitido(Integer transmitido) {
		this.transmitido = transmitido;
	}

	public Integer getControlf() {
		return controlf;
	}

	public void setControlf(Integer controlf) {
		this.controlf = controlf;
	}

	public String getGrandesSuper() {
		return grandesSuper;
	}

	public void setGrandesSuper(String grandesSuper) {
		this.grandesSuper = grandesSuper;
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

	public Integer getvConvenio() {
		return vConvenio;
	}

	public void setvConvenio(Integer vConvenio) {
		this.vConvenio = vConvenio;
	}

	public Integer getvSticker() {
		return vSticker;
	}

	public void setvSticker(Integer vSticker) {
		this.vSticker = vSticker;
	}

	public Integer getvPlana() {
		return vPlana;
	}

	public void setvPlana(Integer vPlana) {
		this.vPlana = vPlana;
	}

	public Integer getvPleno() {
		return vPleno;
	}

	public void setvPleno(Integer vPleno) {
		this.vPleno = vPleno;
	}

	public Integer getvCuarto() {
		return vCuarto;
	}

	public void setvCuarto(Integer vCuarto) {
		this.vCuarto = vCuarto;
	}

	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Integer getContrato() {
		return contrato;
	}

	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}

	public String getBeParking() {
		return beParking;
	}

	public void setBeParking(String beParking) {
		this.beParking = beParking;
	}

	public Integer getValorGp() {
		return valorGp;
	}

	public void setValorGp(Integer valorGp) {
		this.valorGp = valorGp;
	}

	public String getNombreUsaConvenio() {
		return nombreUsaConvenio;
	}

	public void setNombreUsaConvenio(String nombreUsaConvenio) {
		this.nombreUsaConvenio = nombreUsaConvenio;
	}

	public Integer getValorLifemiles() {
		return valorLifemiles;
	}

	public void setValorLifemiles(Integer valorLifemiles) {
		this.valorLifemiles = valorLifemiles;
	}

	public Integer getValorCuponatic() {
		return valorCuponatic;
	}

	public void setValorCuponatic(Integer valorCuponatic) {
		this.valorCuponatic = valorCuponatic;
	}

	public Integer getAuditado() {
		return auditado;
	}

	public void setAuditado(Integer auditado) {
		this.auditado = auditado;
	}

}
