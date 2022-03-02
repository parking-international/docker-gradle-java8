package co.net.parking.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The persistent class for the trans_v130 database table.
 * 
 */
@Entity
@Table(name = "trans_v130")
@NamedQueries({ @NamedQuery(name = "TransV130.findAll", query = "SELECT t FROM TransV130 t"),
		@NamedQuery(name = "TransV130.consultaPorTerminalPorFactura", query = "SELECT t FROM TransV130 t where codTerminal=:codTerminal and numFactura=:numFactura and numeroCheque=:numeroCheque "),
		@NamedQuery(name = "TransV130.consultaTerminalFactura", query = "SELECT t FROM TransV130 t where codTerminal=:codTerminal and numFactura=:numFactura"),
		@NamedQuery(name = "TransV130.consultaPorTerminalPorTransaccion", query = "SELECT t FROM TransV130 t where codTerminal=:codTerminal and idTransaccion=:numTransaccion"),
		@NamedQuery(name = "TransV130.consultaPorTerminalPorFacturaPorFechaPorValor", query = "SELECT t FROM TransV130 t where t.codTerminal=:codTerminal and t.numFactura=:numFactura and t.fechaFinal=:fechaFinal and t.total= :total"),
		@NamedQuery(name = "PrimeraFacturaIdTurno", query = "SELECT t FROM TransV130 t where codTerminal=:codTerminal and idInicioTurno=:idInicioTurno and tipo_trans<>4 and num_factura<>0 ORDER BY fecha_final ASC "),
		@NamedQuery(name = "UltimaFacturaIdTurno", query = "SELECT t FROM TransV130 t where codTerminal=:codTerminal and idInicioTurno=:idInicioTurno and tipo_trans<>4 and num_factura<>0 ORDER BY fecha_final DESC"),
		@NamedQuery(name = "TotalEfectivoCierreTurno", query = "SELECT t FROM TransV130 t where codTerminal=:codTerminal and idInicioTurno=:idInicioTurno and tipo_trans<>4 and num_factura<>0  and formaPago=1" ),
		@NamedQuery(name = "TotalDatafonoCierreTurno", query = "SELECT t FROM TransV130 t where codTerminal=:codTerminal and idInicioTurno=:idInicioTurno and tipo_trans<>4 and num_factura<>0  and formaPago=3" ),
		@NamedQuery(name = "NumFacturaTrans", query = "SELECT t FROM TransV130 t WHERE tipoTrans<>4 and numFactura<>0 and codTerminal=:codTerminal ORDER by numFactura desc")

		
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransV130 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	// @GeneratedValue(generator = "generator")
	@Column(name = "id_transaccion")
	@Type(type = "uuid-char")
	private UUID idTransaccion;

	private int astickers;

	private String barcode;

	@Column(name = "be_parking")
	private String beParking;

	@Column(name = "cod_empleado")
	private String codEmpleado;

	@Column(name = "cod_park")
	private String codPark;

	@Column(name = "cod_terminal")
	private String codTerminal;

	private int concepto;

	private int contrato;

	private short controlf;

	private String detalle;

	private short estado;

	@Column(name = "fecha_final")
	private String fechaFinal;

	@Column(name = "fecha_inicial")
	private String fechaInicial;

	@Column(name = "forma_pago")
	private short formaPago;

	@Column(name = "grandes_super")
	private String grandesSuper;

	@Column(name = "id_cliente")
	private String idCliente;

	@Column(name = "id_convenio")
	private int idConvenio;

	@Column(name = "id_inicio_turno")
	private int idInicioTurno;

	private int iva;

	@Column(name = "nombre_usa_convenio")
	private String nombreUsaConvenio;

	@Column(name = "num_comprobante")
	private int numComprobante;

	@Column(name = "num_factura")
	private int numFactura;

	@Column(name = "num_tarjeta_pp")
	private String numTarjetaPp;

	@Column(name = "num_tarjeta_pp_chip")
	private String numTarjetaPpChip;

	@Column(name = "numero_cheque")
	private String numeroCheque;

	@Column(name = "p_convenio")
	private int pConvenio;

	@Column(name = "p_prepark")
	private int pPrepark;

	private short perdido;

	private String placa;

	private String placa2;

	private int subtotal;

	@Column(name = "tiempo_final")
	private long tiempoFinal;

	@Column(name = "tiempo_inicial")
	private long tiempoInicial;

	@Column(name = "tiempo_total")
	private long tiempoTotal;

	@Column(name = "tipo_trans")
	private short tipoTrans;

	@Column(name = "tipo_vehiculo")
	private int tipoVehiculo;

	private int total;

	@Column(name = "v_convenio")
	private int vconvenio;

	@Column(name = "v_cuarto")
	private int vcuarto;

	@Column(name = "v_plana")
	private int vplana;

	@Column(name = "v_pleno")
	private int vpleno;

	@Column(name = "v_sticker")
	private int vsticker;

	@Column(name = "valor_br")
	private int valorBr;

	@Column(name = "valor_cheque")
	private int valorCheque;

	@Column(name = "valor_cuponatic")
	private int valorCuponatic;

	@Column(name = "valor_datafono")
	private int valorDatafono;

	@Column(name = "valor_ef")
	private int valorEf;

	@Column(name = "valor_gp")
	private int valorGp;

	@Column(name = "valor_lifemiles")
	private int valorLifemiles;

	@Column(name = "valor_nc")
	private int valorNc;

	@Column(name = "valor_pp")
	private int valorPp;

	@Transient
	private int transmitido;

	@Transient
	private int auditado;

	public TransV130() {
	}

	public UUID getIdTransaccion() {
		return this.idTransaccion;
	}

	public void setIdTransaccion(UUID idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public int getAstickers() {
		return this.astickers;
	}

	public void setAstickers(int astickers) {
		this.astickers = astickers;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBeParking() {
		return this.beParking;
	}

	public void setBeParking(String beParking) {
		this.beParking = beParking;
	}

	public String getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getConcepto() {
		return this.concepto;
	}

	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}

	public int getContrato() {
		return this.contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public short getControlf() {
		return this.controlf;
	}

	public void setControlf(short controlf) {
		this.controlf = controlf;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicial() {
		return this.fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public short getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(short formaPago) {
		this.formaPago = formaPago;
	}

	public String getGrandesSuper() {
		return this.grandesSuper;
	}

	public void setGrandesSuper(String grandesSuper) {
		this.grandesSuper = grandesSuper;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdConvenio() {
		return this.idConvenio;
	}

	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	public int getIdInicioTurno() {
		return this.idInicioTurno;
	}

	public void setIdInicioTurno(int idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}

	public int getIva() {
		return this.iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public String getNombreUsaConvenio() {
		return this.nombreUsaConvenio;
	}

	public void setNombreUsaConvenio(String nombreUsaConvenio) {
		this.nombreUsaConvenio = nombreUsaConvenio;
	}

	public int getNumComprobante() {
		return this.numComprobante;
	}

	public void setNumComprobante(int numComprobante) {
		this.numComprobante = numComprobante;
	}

	public int getNumFactura() {
		return this.numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public String getNumTarjetaPp() {
		return this.numTarjetaPp;
	}

	public void setNumTarjetaPp(String numTarjetaPp) {
		this.numTarjetaPp = numTarjetaPp;
	}

	public String getNumTarjetaPpChip() {
		return this.numTarjetaPpChip;
	}

	public void setNumTarjetaPpChip(String numTarjetaPpChip) {
		this.numTarjetaPpChip = numTarjetaPpChip;
	}

	public String getNumeroCheque() {
		return this.numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public int getPConvenio() {
		return this.pConvenio;
	}

	public void setPConvenio(int pConvenio) {
		this.pConvenio = pConvenio;
	}

	public int getPPrepark() {
		return this.pPrepark;
	}

	public void setPPrepark(int pPrepark) {
		this.pPrepark = pPrepark;
	}

	public short getPerdido() {
		return this.perdido;
	}

	public void setPerdido(short perdido) {
		this.perdido = perdido;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca2() {
		return this.placa2;
	}

	public void setPlaca2(String placa2) {
		this.placa2 = placa2;
	}

	public int getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public long getTiempoFinal() {
		return this.tiempoFinal;
	}

	public void setTiempoFinal(long tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}

	public long getTiempoInicial() {
		return this.tiempoInicial;
	}

	public void setTiempoInicial(long tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public long getTiempoTotal() {
		return this.tiempoTotal;
	}

	public void setTiempoTotal(long tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public short getTipoTrans() {
		return this.tipoTrans;
	}

	public void setTipoTrans(short tipoTrans) {
		this.tipoTrans = tipoTrans;
	}

	public int getTipoVehiculo() {
		return this.tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getvconvenio() {
		return this.vconvenio;
	}

	public void setVConvenio(int vConvenio) {
		this.vconvenio = vConvenio;
	}

	public int getVCuarto() {
		return this.vcuarto;
	}

	public void setVCuarto(int vCuarto) {
		this.vcuarto = vCuarto;
	}

	public int getvplana() {
		return this.vplana;
	}

	public void setvplana(int vPlana) {
		this.vplana = vPlana;
	}

	public int getvpleno() {
		return this.vpleno;
	}

	public void setvpleno(int vPleno) {
		this.vpleno = vPleno;
	}

	public int getvsticker() {
		return this.vsticker;
	}

	public void setvsticker(int vSticker) {
		this.vsticker = vSticker;
	}

	public int getValorBr() {
		return this.valorBr;
	}

	public void setValorBr(int valorBr) {
		this.valorBr = valorBr;
	}

	public int getValorCheque() {
		return this.valorCheque;
	}

	public void setValorCheque(int valorCheque) {
		this.valorCheque = valorCheque;
	}

	public int getValorCuponatic() {
		return this.valorCuponatic;
	}

	public void setValorCuponatic(int valorCuponatic) {
		this.valorCuponatic = valorCuponatic;
	}

	public int getValorDatafono() {
		return this.valorDatafono;
	}

	public void setValorDatafono(int valorDatafono) {
		this.valorDatafono = valorDatafono;
	}

	public int getValorEf() {
		return this.valorEf;
	}

	public void setValorEf(int valorEf) {
		this.valorEf = valorEf;
	}

	public int getValorGp() {
		return this.valorGp;
	}

	public void setValorGp(int valorGp) {
		this.valorGp = valorGp;
	}

	public int getValorLifemiles() {
		return this.valorLifemiles;
	}

	public void setValorLifemiles(int valorLifemiles) {
		this.valorLifemiles = valorLifemiles;
	}

	public int getValorNc() {
		return this.valorNc;
	}

	public void setValorNc(int valorNc) {
		this.valorNc = valorNc;
	}

	public int getValorPp() {
		return this.valorPp;
	}

	public void setValorPp(int valorPp) {
		this.valorPp = valorPp;
	}

	public int getTransmitido() {
		return transmitido;
	}

	public void setTransmitido(int transmitido) {
		this.transmitido = transmitido;
	}

	public int getAuditado() {
		return auditado;
	}

	public void setAuditado(int auditado) {
		this.auditado = auditado;
	}

}