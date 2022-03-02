package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cierre_dia database table.
 * 
 */
@Entity
@Table(name="cierre_dia")
@NamedQueries({
@NamedQuery(name="ConsultarCierreDia", query="SELECT c FROM CierreDia c WHERE c.codTerminal=:codTerminal order by fechaFinal desc")
})

public class CierreDia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cierre_dia")
	private int idCierreDia;

	private int asticker;

	private int bonificaciones;

	private int cantBonosBancolombia;


	private int cbigpass;

	@Column(name="ccambio_prepark")
	private int ccambioPrepark;

	private int ccheque;

	private int cconvenio;

	private int cdatafono;

	private int cefectivo;

	private int cgroupon;

	@Column(name="cierre_valet")
	private short cierreValet;

	private int clifemiles;

	private int cmensuales;

	@Column(name="cod_empleado")
	private String codEmpleado;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="cod_terminal")
	private String codTerminal;

	@Column(name="cperiodo_gracia")
	private int cperiodoGracia;

	private int cprepark;

	private int cpropietario;

	@Column(name="crecarga_prepark")
	private int crecargaPrepark;

	@Column(name="csin_cobro")
	private int csinCobro;

	private int csticker;

	@Column(name="ctarjeta_b")
	private int ctarjetaB;

	private int ctaxicard;

	@Column(name="cventa_mensuales")
	private int cventaMensuales;

	@Column(name="cventa_prepark")
	private int cventaPrepark;

	private int cvip;

	@Column(name="descuentos_nomina")
	private int descuentosNomina;

	private short estado;

	@Column(name="factura_fin")
	private String facturaFin;

	@Column(name="factura_ini")
	private String facturaIni;

	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

	@Column(name="fecha_mda")
	private String fechaMda;

	@Column(name="id_inicio_dia")
	private int idInicioDia;

	@Column(name="id_planilla")
	private String idPlanilla;

	@Column(name="iva_cheque")
	private int ivaCheque;

	@Column(name="iva_datafono")
	private int ivaDatafono;

	@Column(name="iva_efectivo")
	private int ivaEfectivo;

	@Column(name="iva_groupon")
	private int ivaGroupon;

	@Column(name="iva_lifemiles")
	private int ivaLifemiles;

	@Column(name="iva_prepark")
	private int ivaPrepark;

	@Column(name="num_resolucion")
	private String numResolucion;

	@Column(name="Observacion")
	private String observacion;

	@Column(name="recibo_caja_fin")
	private int reciboCajaFin;

	@Column(name="recibo_caja_ini")
	private int reciboCajaIni;

	private int subtotal;

	@Column(name="tiempo_final")
	private long tiempoFinal;

	@Column(name="tiempo_inicial")
	private long tiempoInicial;

	@Column(name="tiempo_total")
	private long tiempoTotal;

	private int total;

	@Column(name="total_br")
	private int totalBr;

	@Column(name="total_cambio_pp")
	private int totalCambioPp;

	@Column(name="total_cheque")
	private int totalCheque;

	@Column(name="total_cuponatic")
	private int totalCuponatic;

	@Column(name="total_donacion")
	private int totalDonacion;

	@Column(name="total_ef_valet_park")
	private int totalEfValetPark;

	@Column(name="total_efectivo")
	private int totalEfectivo;

	@Column(name="total_efectivo_dia")
	private int totalEfectivoDia;

	@Column(name="total_efectivo_valet")
	private int totalEfectivoValet;

	@Column(name="total_gp")
	private int totalGp;

	@Column(name="total_lifemiles")
	private int totalLifemiles;

	@Column(name="total_mensuales_ch")
	private int totalMensualesCh;

	@Column(name="total_mensuales_ef")
	private int totalMensualesEf;

	@Column(name="total_mensuales_tc")
	private int totalMensualesTc;

	@Column(name="total_notas_credito")
	private int totalNotasCredito;

	@Column(name="total_num_comprobante")
	private int totalNumComprobante;

	@Column(name="total_pp")
	private int totalPp;

	@Column(name="total_recarga_pp_ch")
	private int totalRecargaPpCh;

	@Column(name="total_recarga_pp_ef")
	private int totalRecargaPpEf;

	@Column(name="total_recarga_pp_tc")
	private int totalRecargaPpTc;

	@Column(name="total_tc")
	private int totalTc;

	@Column(name="total_tc_valet")
	private int totalTcValet;

	@Column(name="total_valores_bigpass")
	private int totalValoresBigpass;

	@Column(name="total_venta_pp_ch")
	private int totalVentaPpCh;

	@Column(name="total_venta_pp_ef")
	private int totalVentaPpEf;

	@Column(name="total_venta_pp_tc")
	private int totalVentaPpTc;

	@Column(name="total_venta_ts")
	private int totalVentaTs;

	private int transacciones;

	private short transmitido;

	private short turnos;
	
	@Transient
	private int sobrante;

	@Transient
	private int faltante;

	public CierreDia() {
	}

	public int getIdCierreDia() {
		return this.idCierreDia;
	}

	public void setIdCierreDia(int idCierreDia) {
		this.idCierreDia = idCierreDia;
	}

	public int getAsticker() {
		return this.asticker;
	}

	public void setAsticker(int asticker) {
		this.asticker = asticker;
	}

	public int getBonificaciones() {
		return this.bonificaciones;
	}

	public void setBonificaciones(int bonificaciones) {
		this.bonificaciones = bonificaciones;
	}

	public int getCantBonosBancolombia() {
		return this.cantBonosBancolombia;
	}

	public void setCantBonosBancolombia(int cantBonosBancolombia) {
		this.cantBonosBancolombia = cantBonosBancolombia;
	}

	public int getCbigpass() {
		return this.cbigpass;
	}

	public void setCbigpass(int cbigpass) {
		this.cbigpass = cbigpass;
	}

	public int getCcambioPrepark() {
		return this.ccambioPrepark;
	}

	public void setCcambioPrepark(int ccambioPrepark) {
		this.ccambioPrepark = ccambioPrepark;
	}

	public int getCcheque() {
		return this.ccheque;
	}

	public void setCcheque(int ccheque) {
		this.ccheque = ccheque;
	}

	public int getCconvenio() {
		return this.cconvenio;
	}

	public void setCconvenio(int cconvenio) {
		this.cconvenio = cconvenio;
	}

	public int getCdatafono() {
		return this.cdatafono;
	}

	public void setCdatafono(int cdatafono) {
		this.cdatafono = cdatafono;
	}

	public int getCefectivo() {
		return this.cefectivo;
	}

	public void setCefectivo(int cefectivo) {
		this.cefectivo = cefectivo;
	}

	public int getCgroupon() {
		return this.cgroupon;
	}

	public void setCgroupon(int cgroupon) {
		this.cgroupon = cgroupon;
	}

	public short getCierreValet() {
		return this.cierreValet;
	}

	public void setCierreValet(short cierreValet) {
		this.cierreValet = cierreValet;
	}

	public int getClifemiles() {
		return this.clifemiles;
	}

	public void setClifemiles(int clifemiles) {
		this.clifemiles = clifemiles;
	}

	public int getCmensuales() {
		return this.cmensuales;
	}

	public void setCmensuales(int cmensuales) {
		this.cmensuales = cmensuales;
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

	public int getCperiodoGracia() {
		return this.cperiodoGracia;
	}

	public void setCperiodoGracia(int cperiodoGracia) {
		this.cperiodoGracia = cperiodoGracia;
	}

	public int getCprepark() {
		return this.cprepark;
	}

	public void setCprepark(int cprepark) {
		this.cprepark = cprepark;
	}

	public int getCpropietario() {
		return this.cpropietario;
	}

	public void setCpropietario(int cpropietario) {
		this.cpropietario = cpropietario;
	}

	public int getCrecargaPrepark() {
		return this.crecargaPrepark;
	}

	public void setCrecargaPrepark(int crecargaPrepark) {
		this.crecargaPrepark = crecargaPrepark;
	}

	public int getCsinCobro() {
		return this.csinCobro;
	}

	public void setCsinCobro(int csinCobro) {
		this.csinCobro = csinCobro;
	}

	public int getCsticker() {
		return this.csticker;
	}

	public void setCsticker(int csticker) {
		this.csticker = csticker;
	}

	public int getCtarjetaB() {
		return this.ctarjetaB;
	}

	public void setCtarjetaB(int ctarjetaB) {
		this.ctarjetaB = ctarjetaB;
	}

	public int getCtaxicard() {
		return this.ctaxicard;
	}

	public void setCtaxicard(int ctaxicard) {
		this.ctaxicard = ctaxicard;
	}

	public int getCventaMensuales() {
		return this.cventaMensuales;
	}

	public void setCventaMensuales(int cventaMensuales) {
		this.cventaMensuales = cventaMensuales;
	}

	public int getCventaPrepark() {
		return this.cventaPrepark;
	}

	public void setCventaPrepark(int cventaPrepark) {
		this.cventaPrepark = cventaPrepark;
	}

	public int getCvip() {
		return this.cvip;
	}

	public void setCvip(int cvip) {
		this.cvip = cvip;
	}

	public int getDescuentosNomina() {
		return this.descuentosNomina;
	}

	public void setDescuentosNomina(int descuentosNomina) {
		this.descuentosNomina = descuentosNomina;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getFacturaFin() {
		return this.facturaFin;
	}

	public void setFacturaFin(String facturaFin) {
		this.facturaFin = facturaFin;
	}

	public String getFacturaIni() {
		return this.facturaIni;
	}

	public void setFacturaIni(String facturaIni) {
		this.facturaIni = facturaIni;
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

	public String getFechaMda() {
		return this.fechaMda;
	}

	public void setFechaMda(String fechaMda) {
		this.fechaMda = fechaMda;
	}

	public int getIdInicioDia() {
		return this.idInicioDia;
	}

	public void setIdInicioDia(int idInicioDia) {
		this.idInicioDia = idInicioDia;
	}

	public String getIdPlanilla() {
		return this.idPlanilla;
	}

	public void setIdPlanilla(String idPlanilla) {
		this.idPlanilla = idPlanilla;
	}

	public int getIvaCheque() {
		return this.ivaCheque;
	}

	public void setIvaCheque(int ivaCheque) {
		this.ivaCheque = ivaCheque;
	}

	public int getIvaDatafono() {
		return this.ivaDatafono;
	}

	public void setIvaDatafono(int ivaDatafono) {
		this.ivaDatafono = ivaDatafono;
	}

	public int getIvaEfectivo() {
		return this.ivaEfectivo;
	}

	public void setIvaEfectivo(int ivaEfectivo) {
		this.ivaEfectivo = ivaEfectivo;
	}

	public int getIvaGroupon() {
		return this.ivaGroupon;
	}

	public void setIvaGroupon(int ivaGroupon) {
		this.ivaGroupon = ivaGroupon;
	}

	public int getIvaLifemiles() {
		return this.ivaLifemiles;
	}

	public void setIvaLifemiles(int ivaLifemiles) {
		this.ivaLifemiles = ivaLifemiles;
	}

	public int getIvaPrepark() {
		return this.ivaPrepark;
	}

	public void setIvaPrepark(int ivaPrepark) {
		this.ivaPrepark = ivaPrepark;
	}

	public String getNumResolucion() {
		return this.numResolucion;
	}

	public void setNumResolucion(String numResolucion) {
		this.numResolucion = numResolucion;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getReciboCajaFin() {
		return this.reciboCajaFin;
	}

	public void setReciboCajaFin(int reciboCajaFin) {
		this.reciboCajaFin = reciboCajaFin;
	}

	public int getReciboCajaIni() {
		return this.reciboCajaIni;
	}

	public void setReciboCajaIni(int reciboCajaIni) {
		this.reciboCajaIni = reciboCajaIni;
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

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalBr() {
		return this.totalBr;
	}

	public void setTotalBr(int totalBr) {
		this.totalBr = totalBr;
	}

	public int getTotalCambioPp() {
		return this.totalCambioPp;
	}

	public void setTotalCambioPp(int totalCambioPp) {
		this.totalCambioPp = totalCambioPp;
	}

	public int getTotalCheque() {
		return this.totalCheque;
	}

	public void setTotalCheque(int totalCheque) {
		this.totalCheque = totalCheque;
	}

	public int getTotalCuponatic() {
		return this.totalCuponatic;
	}

	public void setTotalCuponatic(int totalCuponatic) {
		this.totalCuponatic = totalCuponatic;
	}

	public int getTotalDonacion() {
		return this.totalDonacion;
	}

	public void setTotalDonacion(int totalDonacion) {
		this.totalDonacion = totalDonacion;
	}

	public int getTotalEfValetPark() {
		return this.totalEfValetPark;
	}

	public void setTotalEfValetPark(int totalEfValetPark) {
		this.totalEfValetPark = totalEfValetPark;
	}

	public int getTotalEfectivo() {
		return this.totalEfectivo;
	}

	public void setTotalEfectivo(int totalEfectivo) {
		this.totalEfectivo = totalEfectivo;
	}

	public int getTotalEfectivoDia() {
		return this.totalEfectivoDia;
	}

	public void setTotalEfectivoDia(int totalEfectivoDia) {
		this.totalEfectivoDia = totalEfectivoDia;
	}

	public int getTotalEfectivoValet() {
		return this.totalEfectivoValet;
	}

	public void setTotalEfectivoValet(int totalEfectivoValet) {
		this.totalEfectivoValet = totalEfectivoValet;
	}

	public int getTotalGp() {
		return this.totalGp;
	}

	public void setTotalGp(int totalGp) {
		this.totalGp = totalGp;
	}

	public int getTotalLifemiles() {
		return this.totalLifemiles;
	}

	public void setTotalLifemiles(int totalLifemiles) {
		this.totalLifemiles = totalLifemiles;
	}

	public int getTotalMensualesCh() {
		return this.totalMensualesCh;
	}

	public void setTotalMensualesCh(int totalMensualesCh) {
		this.totalMensualesCh = totalMensualesCh;
	}

	public int getTotalMensualesEf() {
		return this.totalMensualesEf;
	}

	public void setTotalMensualesEf(int totalMensualesEf) {
		this.totalMensualesEf = totalMensualesEf;
	}

	public int getTotalMensualesTc() {
		return this.totalMensualesTc;
	}

	public void setTotalMensualesTc(int totalMensualesTc) {
		this.totalMensualesTc = totalMensualesTc;
	}

	public int getTotalNotasCredito() {
		return this.totalNotasCredito;
	}

	public void setTotalNotasCredito(int totalNotasCredito) {
		this.totalNotasCredito = totalNotasCredito;
	}

	public int getTotalNumComprobante() {
		return this.totalNumComprobante;
	}

	public void setTotalNumComprobante(int totalNumComprobante) {
		this.totalNumComprobante = totalNumComprobante;
	}

	public int getTotalPp() {
		return this.totalPp;
	}

	public void setTotalPp(int totalPp) {
		this.totalPp = totalPp;
	}

	public int getTotalRecargaPpCh() {
		return this.totalRecargaPpCh;
	}

	public void setTotalRecargaPpCh(int totalRecargaPpCh) {
		this.totalRecargaPpCh = totalRecargaPpCh;
	}

	public int getTotalRecargaPpEf() {
		return this.totalRecargaPpEf;
	}

	public void setTotalRecargaPpEf(int totalRecargaPpEf) {
		this.totalRecargaPpEf = totalRecargaPpEf;
	}

	public int getTotalRecargaPpTc() {
		return this.totalRecargaPpTc;
	}

	public void setTotalRecargaPpTc(int totalRecargaPpTc) {
		this.totalRecargaPpTc = totalRecargaPpTc;
	}

	public int getTotalTc() {
		return this.totalTc;
	}

	public void setTotalTc(int totalTc) {
		this.totalTc = totalTc;
	}

	public int getTotalTcValet() {
		return this.totalTcValet;
	}

	public void setTotalTcValet(int totalTcValet) {
		this.totalTcValet = totalTcValet;
	}

	public int getTotalValoresBigpass() {
		return this.totalValoresBigpass;
	}

	public void setTotalValoresBigpass(int totalValoresBigpass) {
		this.totalValoresBigpass = totalValoresBigpass;
	}

	public int getTotalVentaPpCh() {
		return this.totalVentaPpCh;
	}

	public void setTotalVentaPpCh(int totalVentaPpCh) {
		this.totalVentaPpCh = totalVentaPpCh;
	}

	public int getTotalVentaPpEf() {
		return this.totalVentaPpEf;
	}

	public void setTotalVentaPpEf(int totalVentaPpEf) {
		this.totalVentaPpEf = totalVentaPpEf;
	}

	public int getTotalVentaPpTc() {
		return this.totalVentaPpTc;
	}

	public void setTotalVentaPpTc(int totalVentaPpTc) {
		this.totalVentaPpTc = totalVentaPpTc;
	}

	public int getTotalVentaTs() {
		return this.totalVentaTs;
	}

	public void setTotalVentaTs(int totalVentaTs) {
		this.totalVentaTs = totalVentaTs;
	}

	public int getTransacciones() {
		return this.transacciones;
	}

	public void setTransacciones(int transacciones) {
		this.transacciones = transacciones;
	}

	public short getTransmitido() {
		return this.transmitido;
	}

	public void setTransmitido(short transmitido) {
		this.transmitido = transmitido;
	}

	public short getTurnos() {
		return this.turnos;
	}

	public void setTurnos(short turnos) {
		this.turnos = turnos;
	}

	public int getSobrante() {
		return sobrante;
	}

	public void setSobrante(int sobrante) {
		this.sobrante = sobrante;
	}

	public int getFaltante() {
		return faltante;
	}

	public void setFaltante(int faltante) {
		this.faltante = faltante;
	}

}