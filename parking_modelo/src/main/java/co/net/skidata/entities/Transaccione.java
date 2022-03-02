package co.net.skidata.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transacciones database table.
 * 
 */
@Entity
@Table(name="transacciones")

@NamedQueries({ 
@NamedQuery(name="TransaccionFacturaSki", query="SELECT b FROM Transaccione b WHERE b.numFactura=:numFactura AND b.codTerminal=:codTerminal and b.tipoTrans not in (100,101) ")
})

public class Transaccione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_transaccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTransaccion;

	private int astickers;

	private String barcode;

	@Column(name="be_parking")
	private String beParking;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="cod_terminal")
	private String codTerminal;

	private int contrato;

	private String empleado;

	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

	@Column(name="id_cliente")
	private String idCliente;

	@Column(name="id_convenio")
	private int idConvenio;

	private int iva;

	@Column(name="num_factura")
	private int numFactura;

	@Column(name="numero_cheque")
	private String numeroCheque;

	private String placa;

	private String placa2;

	private int subtotal;

	@Column(name="tiempo_total")
	private long tiempoTotal;

	@Column(name="tipo_trans")
	private short tipoTrans;

	@Column(name="tipo_vehiculo")
	private int tipoVehiculo;

	private int total;

	@Column(name="v_convenio")
	private int vConvenio;

	@Column(name="v_cuarto")
	private int vCuarto;

	@Column(name="v_pleno")
	private int vPleno;

	@Column(name="v_sticker")
	private int vSticker;

	@Column(name="valor_beparking")
	private int valorBeparking;

	private int valor_Bigpass;

	@Column(name="valor_cheque")
	private int valorCheque;

	@Column(name="valor_datafono")
	private int valorDatafono;

	@Column(name="valor_ef")
	private int valorEf;

	@Column(name="valor_prepark")
	private int valorPrepark;

	@Column(name="valor_renault")
	private int valorRenault;

	public Transaccione() {
	}

	public int getIdTransaccion() {
		return this.idTransaccion;
	}

	public void setIdTransaccion(int idTransaccion) {
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

	public String getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
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

	public int getvConvenio() {
		return vConvenio;
	}

	public void setvConvenio(int vConvenio) {
		this.vConvenio = vConvenio;
	}

	public int getvCuarto() {
		return vCuarto;
	}

	public void setvCuarto(int vCuarto) {
		this.vCuarto = vCuarto;
	}

	public int getvPleno() {
		return vPleno;
	}

	public void setvPleno(int vPleno) {
		this.vPleno = vPleno;
	}

	public int getvSticker() {
		return vSticker;
	}

	public void setvSticker(int vSticker) {
		this.vSticker = vSticker;
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

	public int getIva() {
		return this.iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getNumFactura() {
		return this.numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public String getNumeroCheque() {
		return this.numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
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

	public int getValorBeparking() {
		return this.valorBeparking;
	}

	public void setValorBeparking(int valorBeparking) {
		this.valorBeparking = valorBeparking;
	}

	public int getValor_Bigpass() {
		return this.valor_Bigpass;
	}

	public void setValor_Bigpass(int valor_Bigpass) {
		this.valor_Bigpass = valor_Bigpass;
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

	public int getValorPrepark() {
		return this.valorPrepark;
	}

	public void setValorPrepark(int valorPrepark) {
		this.valorPrepark = valorPrepark;
	}

	public int getValorRenault() {
		return this.valorRenault;
	}

	public void setValorRenault(int valorRenault) {
		this.valorRenault = valorRenault;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transaccione [idTransaccion=");
		builder.append(idTransaccion);
		builder.append(", astickers=");
		builder.append(astickers);
		builder.append(", barcode=");
		builder.append(barcode);
		builder.append(", beParking=");
		builder.append(beParking);
		builder.append(", codPark=");
		builder.append(codPark);
		builder.append(", codTerminal=");
		builder.append(codTerminal);
		builder.append(", contrato=");
		builder.append(contrato);
		builder.append(", empleado=");
		builder.append(empleado);
		builder.append(", fechaFinal=");
		builder.append(fechaFinal);
		builder.append(", fechaInicial=");
		builder.append(fechaInicial);
		builder.append(", idCliente=");
		builder.append(idCliente);
		builder.append(", idConvenio=");
		builder.append(idConvenio);
		builder.append(", iva=");
		builder.append(iva);
		builder.append(", numFactura=");
		builder.append(numFactura);
		builder.append(", numeroCheque=");
		builder.append(numeroCheque);
		builder.append(", placa=");
		builder.append(placa);
		builder.append(", placa2=");
		builder.append(placa2);
		builder.append(", subtotal=");
		builder.append(subtotal);
		builder.append(", tiempoTotal=");
		builder.append(tiempoTotal);
		builder.append(", tipoTrans=");
		builder.append(tipoTrans);
		builder.append(", tipoVehiculo=");
		builder.append(tipoVehiculo);
		builder.append(", total=");
		builder.append(total);
		builder.append(", vConvenio=");
		builder.append(vConvenio);
		builder.append(", vCuarto=");
		builder.append(vCuarto);
		builder.append(", vPleno=");
		builder.append(vPleno);
		builder.append(", vSticker=");
		builder.append(vSticker);
		builder.append(", valorBeparking=");
		builder.append(valorBeparking);
		builder.append(", valor_Bigpass=");
		builder.append(valor_Bigpass);
		builder.append(", valorCheque=");
		builder.append(valorCheque);
		builder.append(", valorDatafono=");
		builder.append(valorDatafono);
		builder.append(", valorEf=");
		builder.append(valorEf);
		builder.append(", valorPrepark=");
		builder.append(valorPrepark);
		builder.append(", valorRenault=");
		builder.append(valorRenault);
		builder.append("]");
		return builder.toString();
	}

}