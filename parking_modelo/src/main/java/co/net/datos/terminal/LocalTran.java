package co.net.datos.terminal;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the local_trans database table.
 * 
 */
@Entity
@Table(name="local_trans")
@NamedQueries({
    @NamedQuery(name="LocalTran.findAll", query="SELECT l FROM LocalTran l"),
    @NamedQuery(name="LocalTran.findByFactura",query="SELECT l FROM LocalTran l WHERE l.codPark=:codPark AND l.codTerminal=:codTerminal AND l.numFactura=:numFactura")
})
public class LocalTran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY  )
    private int idRegistro;	
	
	private String id;

	private short astickers;

	private String barcode;

	@Column(name="be_parking")
	private String beParking;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="cod_terminal")
	private String codTerminal;

	private int contrato;

	private short controlf;

	private short estado;

	@Column(name="fecha_final")
	private Timestamp fechaFinal;

	@Column(name="fecha_inicial")
	private Timestamp fechaInicial;

	@Column(name="forma_pago")
	private short formaPago;

	@Column(name="grandes_super")
	private String grandesSuper;

	@Column(name="id_cliente")
	private String idCliente;

	@Column(name="id_convenio")
	private int idConvenio;

	@Column(name="id_turno")
	private int idTurno;

	private int iva;

	@Column(name="nombre_usa_convenio")
	private String nombreUsaConvenio;

	@Column(name="num_comprobante")
	private int numComprobante;

	@Column(name="num_factura")
	private int numFactura;

	@Column(name="num_tarjeta_pp")
	private String numTarjetaPp;

	@Column(name="num_tarjeta_pp_chip")
	private String numTarjetaPpChip;

	@Column(name="numero_cheque")
	private String numeroCheque;

	@Column(name="p_convenio")
	private int pConvenio;

	@Column(name="p_prepark")
	private int pPrepark;

	private short perdido;

	private String placa;

	private String placa2;

	private int subtotal;

	@Column(name="tiempo_final")
	private long tiempoFinal;

	@Column(name="tiempo_inicial")
	private long tiempoInicial;

	@Column(name="tiempo_total")
	private int tiempoTotal;

	@Column(name="tipo_trans")
	private short tipoTrans;

	@Column(name="tipo_vehiculo")
	private int tipoVehiculo;

	private int total;

	private short transmitido;

	@Column(name="v_convenio")
	private int vConvenio;

	@Column(name="v_cuarto")
	private int vCuarto;

	@Column(name="v_plana")
	private int vPlana;

	@Column(name="v_pleno")
	private int vPleno;

	@Column(name="v_sticker")
	private int vSticker;

	@Column(name="valor_cheque")
	private int valorCheque;

	@Column(name="valor_datafono")
	private int valorDatafono;

	@Column(name="valor_ef")
	private int valorEf;

	@Column(name="valor_gp")
	private int valorGp;

	@Column(name="valor_pp")
	private int valorPp;

	public LocalTran() {
	}
	
	

	/**
     * Devuelve el valor de idRegistro
     * @return El valor de idRegistro
     */
    public int getIdRegistro() {
        return idRegistro;
    }



    /**
     * Establece el valor de idRegistro
     * @param idRegistro El valor por establecer para idRegistro
     */
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }



    public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public short getAstickers() {
		return this.astickers;
	}

	public void setAstickers(short astickers) {
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

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public Timestamp getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(Timestamp fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Timestamp getFechaInicial() {
		return this.fechaInicial;
	}

	public void setFechaInicial(Timestamp fechaInicial) {
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

	public int getIdTurno() {
		return this.idTurno;
	}

	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
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

	public int getTiempoTotal() {
		return this.tiempoTotal;
	}

	public void setTiempoTotal(int tiempoTotal) {
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

	public short getTransmitido() {
		return this.transmitido;
	}

	public void setTransmitido(short transmitido) {
		this.transmitido = transmitido;
	}

	public int getVConvenio() {
		return this.vConvenio;
	}

	public void setVConvenio(int vConvenio) {
		this.vConvenio = vConvenio;
	}

	public int getVCuarto() {
		return this.vCuarto;
	}

	public void setVCuarto(int vCuarto) {
		this.vCuarto = vCuarto;
	}

	public int getVPlana() {
		return this.vPlana;
	}

	public void setVPlana(int vPlana) {
		this.vPlana = vPlana;
	}

	public int getVPleno() {
		return this.vPleno;
	}

	public void setVPleno(int vPleno) {
		this.vPleno = vPleno;
	}

	public int getVSticker() {
		return this.vSticker;
	}

	public void setVSticker(int vSticker) {
		this.vSticker = vSticker;
	}

	public int getValorCheque() {
		return this.valorCheque;
	}

	public void setValorCheque(int valorCheque) {
		this.valorCheque = valorCheque;
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

	public int getValorPp() {
		return this.valorPp;
	}

	public void setValorPp(int valorPp) {
		this.valorPp = valorPp;
	}

}