package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the terminales database table.
 * 
 */
@Entity
@Table(name="terminales")
@NamedQueries({
    @NamedQuery(name="Terminal.findAll", query="SELECT t FROM Terminal t"),
    @NamedQuery(name="Terminal.findByActive", query="SELECT t FROM Terminal t WHERE t.estado=1 AND t.tipoT<>'VALET' AND t.handheld<>1 AND t.cajero<>1 AND t.codPark=:codPark" ),
    @NamedQuery(name="Terminal.findAllTerminal", query="SELECT t FROM Terminal t WHERE t.estado=1 AND t.tipoT<>'VALET' AND t.handheld<>1 AND t.cajero<>1")
})

public class Terminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_terminal")
	private String codTerminal;

	private String actualizar;

	@Column(name="ajuste_turno")
	private short ajusteTurno;

	@Column(name="base_caja")
	private int baseCaja;

	private boolean cajero;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="consola_entrada")
	private boolean consolaEntrada;

	@Column(name="consola_salida")
	private boolean consolaSalida;

	private int contrato;

	private short estado;

	private int factura;

	@Column(name="fecha_final")
	private Date fechaFinal;

	@Column(name="fecha_inicial")
	private Date fechaInicial;

	@Column(name="fecha_mod")
	private String fechaMod;

	private short handheld;

	private int identificador;

	@Column(name="ip_privada")
	private String ipPrivada;

	@Column(name="mpls_ifx")
	private boolean mplsIfx;

	@Column(name="ms_sql")
	private short msSql;

	@Column(name="punto_pago")
	private String puntoPago;

	@Column(name="recibo_caja")
	private int reciboCaja;

	private short red;

	@Column(name="servidor_local")
	private short servidorLocal;

	@Column(name="tipo_t")
	private String tipoT;

	private String version;

	@Column(name="version_scoip")
	private String versionScoip;
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="cod_park",nullable=false,insertable=false, updatable=false)
    private Parqueadero parqueadero;

	public Terminal() {
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getActualizar() {
		return this.actualizar;
	}

	public void setActualizar(String actualizar) {
		this.actualizar = actualizar;
	}

	public short getAjusteTurno() {
		return this.ajusteTurno;
	}

	public void setAjusteTurno(short ajusteTurno) {
		this.ajusteTurno = ajusteTurno;
	}

	public int getBaseCaja() {
		return this.baseCaja;
	}

	public void setBaseCaja(int baseCaja) {
		this.baseCaja = baseCaja;
	}

	public boolean getCajero() {
		return this.cajero;
	}

	public void setCajero(boolean cajero) {
		this.cajero = cajero;
	}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public boolean getConsolaEntrada() {
		return this.consolaEntrada;
	}

	public void setConsolaEntrada(boolean consolaEntrada) {
		this.consolaEntrada = consolaEntrada;
	}

	public boolean getConsolaSalida() {
		return this.consolaSalida;
	}

	public void setConsolaSalida(boolean consolaSalida) {
		this.consolaSalida = consolaSalida;
	}

	public int getContrato() {
		return this.contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public int getFactura() {
		return this.factura;
	}

	public void setFactura(int factura) {
		this.factura = factura;
	}

	public Date getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Date getFechaInicial() {
		return this.fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaMod() {
		return this.fechaMod;
	}

	public void setFechaMod(String fechaMod) {
		this.fechaMod = fechaMod;
	}

	public short getHandheld() {
		return this.handheld;
	}

	public void setHandheld(short handheld) {
		this.handheld = handheld;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getIpPrivada() {
		return this.ipPrivada;
	}

	public void setIpPrivada(String ipPrivada) {
		this.ipPrivada = ipPrivada;
	}

	public boolean getMplsIfx() {
		return this.mplsIfx;
	}

	public void setMplsIfx(boolean mplsIfx) {
		this.mplsIfx = mplsIfx;
	}

	public short getMsSql() {
		return this.msSql;
	}

	public void setMsSql(short msSql) {
		this.msSql = msSql;
	}

	public String getPuntoPago() {
		return this.puntoPago;
	}

	public void setPuntoPago(String puntoPago) {
		this.puntoPago = puntoPago;
	}

	public int getReciboCaja() {
		return this.reciboCaja;
	}

	public void setReciboCaja(int reciboCaja) {
		this.reciboCaja = reciboCaja;
	}

	public short getRed() {
		return this.red;
	}

	public void setRed(short red) {
		this.red = red;
	}

	public short getServidorLocal() {
		return this.servidorLocal;
	}

	public void setServidorLocal(short servidorLocal) {
		this.servidorLocal = servidorLocal;
	}

	public String getTipoT() {
		return this.tipoT;
	}

	public void setTipoT(String tipoT) {
		this.tipoT = tipoT;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersionScoip() {
		return this.versionScoip;
	}

	public void setVersionScoip(String versionScoip) {
		this.versionScoip = versionScoip;
	}

}