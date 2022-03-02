package co.net.beparking.entities;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the BpTransaccion database table.
 * 
 */
@Entity
@NamedQueries({ 
@NamedQuery(name="BpTransaccionByCedula", query="SELECT b FROM BpTransaccion b WHERE b.codBeparking=:cedula order by fechaFinal desc"),
@NamedQuery(name="BpTransaccionFactura", query="SELECT b FROM BpTransaccion b WHERE b.numFactura=:numFactura AND b.codTerminal=:codTerminal")
})
public class BpTransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IdTrans")
	private String idTrans;

	@Column(name="CodBeparking")
	private String codBeparking;

	@Column(name="CodEmpleado")
	private String codEmpleado;

	@Column(name="CodPark")
	private String codPark;

	@Column(name="CodTerminal")
	private String codTerminal;

	@Column(name="Duracion")
	private int duracion;

	@Column(name="FechaFinal")
	private String fechaFinal;

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

	@Column(name="FechaInicial")
	private String fechaInicial;

	@Column(name="FormaPago")
	private short formaPago;

	@Column(name="IdCliente")
	private String idCliente;

	@Column(name="NumFactura")
	private int numFactura;

	@Column(name="NumTarjetaPp")
	private String numTarjetaPp;

	@Column(name="NumTarjetaPpChip")
	private String numTarjetaPpChip;

	@Column(name="Perdido")
	private short perdido;

	@Column(name="Placa")
	private String placa;

	@Column(name="Procesado")
	private short procesado;

	@Column(name="TipoTrans")
	private short tipoTrans;

	@Column(name="Total")
	private int total;

	@Column(name="ValorCheque")
	private int valorCheque;

	@Column(name="ValorDatafono")
	private int valorDatafono;

	@Column(name="ValorEf")
	private int valorEf;

	@Column(name="ValorPp")
	private int valorPp;
	
	@Column(name="Puntos")
	private int puntos;
	
	@Column(name="nivel")
	private String nivel;

	private int idConvenio;

	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public BpTransaccion() {
	}

	public String getIdTrans() {
		return this.idTrans;
	}

	public void setIdTrans(String idTrans) {
		this.idTrans = idTrans;
	}

	public String getCodBeparking() {
		return this.codBeparking;
	}

	public void setCodBeparking(String codBeparking) {
		this.codBeparking = codBeparking;
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

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public short getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(short formaPago) {
		this.formaPago = formaPago;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
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

	public short getProcesado() {
		return this.procesado;
	}

	public void setProcesado(short procesado) {
		this.procesado = procesado;
	}

	public short getTipoTrans() {
		return this.tipoTrans;
	}

	public void setTipoTrans(short tipoTrans) {
		this.tipoTrans = tipoTrans;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
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

	public int getValorPp() {
		return this.valorPp;
	}

	public void setValorPp(int valorPp) {
		this.valorPp = valorPp;
	}

	public int getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	


}