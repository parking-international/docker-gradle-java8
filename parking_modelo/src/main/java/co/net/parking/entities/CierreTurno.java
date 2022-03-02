package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kayala <kayala@heinsohn.com.co>
 */
@Entity
@Table(name = "cierre_turno")
@XmlRootElement
@NamedQueries({
       @NamedQuery(name="TurnosEnDia",query="SELECT b FROM CierreTurno b WHERE b.codTerminal=:codTerminal AND b.id_inicio_dia=:idInicioDia"),
       @NamedQuery(name="consultaCierreTurno",query="SELECT b FROM CierreTurno b WHERE b.codTerminal=:codTerminal AND b.fechaIncial=:fechaIncial AND b.fechaFinal=:fechaFinal")
})
public class CierreTurno implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = -4785785852988008589L;

	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
	@Column(name = "cod_terminal")
	private String codTerminal;

	@Column(name = "cod_park")
	private String codPark;

	@Column(name = "cod_empleado")
	private String codEmpleado;

	@Column(name = "fecha_inicial")
	private String fechaIncial;

	@Column(name = "fecha_final")
	private String fechaFinal;

	@Column(name = "tiempo_inicial")
	private long tiempoInicial;

	@Column(name = "tiempo_final")
	private long tiempoFinal;
	
	@Column(name = "tiempo_total")
	private long tiempoTotal;

	@Column(name = "factura_ini")
	private Integer facturaInicial;

	@Column(name = "factura_fin")
	private Integer facturaFinal;

	@Column(name = "recibo_caja_ini")
	private Integer reciboCajaInicial;

	@Column(name = "recibo_caja_fin")
	private Integer reciboCajaFinal;

	@Column(name = "total_efectivo")
	private Integer totalEfectivo;

	@Column(name = "total_pp")
	private Integer totalPrepark;

	@Column(name = "total_br")
	private Integer totalBonoRegalo;

	@Column(name = "total_tc")
	private Integer totalDatafono;

	@Column(name = "total_cheque")
	private Integer totalCheque;

	@Column(name = "total_mensuales_ef")
	private Integer totalMensualesEfectivo;

	@Column(name = "total_mensuales_tc")
	private Integer totalMensualesDatafono;
	

	@Column(name = "total_mensuales_ch")
	private Integer totalMensualesCheque;

	@Column(name = "total_venta_pp_ef")
	private Integer totalVentaPreparkEfectivo;

	@Column(name = "total_venta_pp_tc")
	private Integer totalVentaPreparkDatafono;

	@Column(name = "total_venta_pp_ch")
	private Integer totalVentaPreparkCheque;

	@Column(name = "total_cambio_pp")
	private Integer totalCambioPrepark;

	@Column(name = "total_valores_bigpass")
	private Integer totalValoresBigpass;

	@Column(name = "plazas_disp")
	private Integer plazasDisponibles;

	@Column(name = "plazas_ocu")
	private Integer plazasOcupadas;

	@Column(name = "transacciones")
	private Integer transacciones;

	@Column(name = "cefectivo")
	private Integer cantidadEfectivo;

	@Column(name = "cprepark")
	private Integer cantidadPrepark;

	@Column(name = "cdatafono")
	private Integer cantidadDatafono;

	@Column(name = "cmensuales")
	private Integer cantidadMensuales;

	@Column(name = "cvip")
	private Integer cantidadVip;

	@Column(name = "cconvenio")
	private Integer cantidadConvenio;

	@Column(name = "csticker")
	private Integer cantidadStickers;

	@Column(name = "cventa_prepark")
	private Integer cantidadVentaPrepark;

	@Column(name = "crecarga_prepark")
	private Integer cantidadRecargaPrepark;

	@Column(name = "ccambio_prepark")
	private Integer cantidadCambioPrepark;

	@Column(name = "cventa_mensuales")
	private Integer cantidadVentaMensuales;

	@Column(name = "csin_cobro")
	private Integer cantidadSinCobro;

	@Column(name = "ccheque")
	private Integer cantidadCheque;

	@Column(name = "cbigpass")
	private Integer cantidadBigpass;

	@Column(name = "asticker")
	private Integer asticker;

	@Column(name = "estado")
	private Integer estado;

	@Column(name = "subtotal")
	private Integer subtotal;

	@Column(name = "iva_efectivo")
	private Integer ivaEfectivo;

	@Column(name = "iva_prepark")
	private Integer ivaPrepark;

	@Column(name = "iva_datafono")
	private Integer ivaDatafono;

	@Column(name = "iva_cheque")
	private Integer ivaCheque;

	@Column(name = "total")
	private Integer total;

	@Column(name = "reportado")
	private Integer reportado;

	@Column(name = "transmitido")
	private Integer transmitido;

	@Column(name = "acumulado")
	private Integer acumulado;

	@Column(name = "cpropietario")
	private Integer cpropietario;

	@Column(name = "ctaxicard")
	private Integer ctaxicard;

	@Column(name = "cperiodo_gracia")
	private Integer cperiodoGracia;

	@Column(name = "total_recarga_pp_ef")
	private Integer total_recarga_pp_ef;

	@Column(name = "total_recarga_pp_tc")
	private Integer total_recarga_pp_tc;

	@Column(name = "total_recarga_pp_ch")
	private Integer total_recarga_pp_ch;

	@Column(name = "notas_credito")
	private Integer notas_credito;

	@Column(name = "id_inicio_turno")
	private Integer id_inicio_turno;

	@Column(name = "ctarjeta_b")
	private Integer ctarjeta_b;
	
	@Column(name = "id_inicio_dia")
	private Integer id_inicio_dia;

	@Column(name = "cnum_comprobante")
	private Integer cnum_comprobante;

	@Column(name = "total_venta_ts")
	private Integer total_venta_ts;

	@Column(name = "total_transOff")
	private Integer total_transOff;

	@Column(name = "total_reimpresion")
	private Integer total_reimpresion;

	@Column(name = "total_efectivo_valet")
	private Integer total_efectivo_valet;

	@Column(name = "total_tc_valet")
	private Integer total_tc_valet;

	@Column(name = "total_donacion")
	private Integer total_donacion;

	@Column(name = "total_ef_valet_park")
	private Integer total_ef_valet_park;

	@Column(name = "justificacion")
	private String justificacion;

	@Column(name = "cgroupon")
	private Integer cgroupon;

	@Column(name = "iva_groupon")
	private Integer iva_groupon;

	@Column(name = "total_gp")
	private Integer total_gp;
	
	
	@Column(name = "clifemiles")
	private Integer clifemiles;

	@Column(name = "iva_lifemiles")
	private Integer iva_lifemiles;

	@Column(name = "total_lifemiles")
	private Integer total_lifemiles;
	
	@Column(name = "total_cuponatic")
	private Integer total_cuponatic;
	
	@Column(name = "cantBonosBancolombia")
	private Integer cantBonosBancolombia;
	
	@Transient
	private int tipoTurno;

	@Transient
	private int tipoEmpleado;
	

	public int getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(int tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public int getTipoTurno() {
		return tipoTurno;
	}

	public void setTipoTurno(int tipoTurno) {
		this.tipoTurno = tipoTurno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getFechaIncial() {
		return fechaIncial;
	}

	public void setFechaIncial(String fechaIncial) {
		this.fechaIncial = fechaIncial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public long getTiempoInicial() {
		return tiempoInicial;
	}

	public void setTiempoInicial(long tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public long getTiempoFinal() {
		return tiempoFinal;
	}

	public void setTiempoFinal(long tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}

	public Integer getFacturaInicial() {
		return facturaInicial;
	}

	public void setFacturaInicial(Integer facturaInicial) {
		this.facturaInicial = facturaInicial;
	}

	public Integer getFacturaFinal() {
		return facturaFinal;
	}

	public void setFacturaFinal(Integer facturaFinal) {
		this.facturaFinal = facturaFinal;
	}

	public Integer getReciboCajaInicial() {
		return reciboCajaInicial;
	}

	public void setReciboCajaInicial(Integer reciboCajaInicial) {
		this.reciboCajaInicial = reciboCajaInicial;
	}

	public Integer getReciboCajaFinal() {
		return reciboCajaFinal;
	}

	public void setReciboCajaFinal(Integer reciboCajaFinal) {
		this.reciboCajaFinal = reciboCajaFinal;
	}

	public Integer getTotalEfectivo() {
		return totalEfectivo;
	}

	public void setTotalEfectivo(Integer totalEfectivo) {
		this.totalEfectivo = totalEfectivo;
	}

	public Integer getTotalPrepark() {
		return totalPrepark;
	}

	public void setTotalPrepark(Integer totalPrepark) {
		this.totalPrepark = totalPrepark;
	}

	public Integer getTotalBonoRegalo() {
		return totalBonoRegalo;
	}

	public void setTotalBonoRegalo(Integer totalBonoRegalo) {
		this.totalBonoRegalo = totalBonoRegalo;
	}

	public Integer getTotalDatafono() {
		return totalDatafono;
	}

	public void setTotalDatafono(Integer totalDatafono) {
		this.totalDatafono = totalDatafono;
	}

	public Integer getTotalCheque() {
		return totalCheque;
	}

	public void setTotalCheque(Integer totalCheque) {
		this.totalCheque = totalCheque;
	}

	public Integer getTotalMensualesEfectivo() {
		return totalMensualesEfectivo;
	}

	public void setTotalMensualesEfectivo(Integer totalMensualesEfectivo) {
		this.totalMensualesEfectivo = totalMensualesEfectivo;
	}

	public Integer getTotalMensualesDatafono() {
		return totalMensualesDatafono;
	}

	public void setTotalMensualesDatafono(Integer totalMensualesDatafono) {
		this.totalMensualesDatafono = totalMensualesDatafono;
	}

	public Integer getTotalMensualesCheque() {
		return totalMensualesCheque;
	}

	public void setTotalMensualesCheque(Integer totalMensualesCheque) {
		this.totalMensualesCheque = totalMensualesCheque;
	}

	public Integer getTotalVentaPreparkEfectivo() {
		return totalVentaPreparkEfectivo;
	}

	public void setTotalVentaPreparkEfectivo(Integer totalVentaPreparkEfectivo) {
		this.totalVentaPreparkEfectivo = totalVentaPreparkEfectivo;
	}

	public Integer getTotalVentaPreparkDatafono() {
		return totalVentaPreparkDatafono;
	}

	public void setTotalVentaPreparkDatafono(Integer totalVentaPreparkDatafono) {
		this.totalVentaPreparkDatafono = totalVentaPreparkDatafono;
	}

	public Integer getTotalVentaPreparkCheque() {
		return totalVentaPreparkCheque;
	}

	public void setTotalVentaPreparkCheque(Integer totalVentaPreparkCheque) {
		this.totalVentaPreparkCheque = totalVentaPreparkCheque;
	}

	public Integer getTotalCambioPrepark() {
		return totalCambioPrepark;
	}

	public void setTotalCambioPrepark(Integer totalCambioPrepark) {
		this.totalCambioPrepark = totalCambioPrepark;
	}

	public Integer getTotalValoresBigpass() {
		return totalValoresBigpass;
	}

	public void setTotalValoresBigpass(Integer totalValoresBigpass) {
		this.totalValoresBigpass = totalValoresBigpass;
	}

	public Integer getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(Integer plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}

	public Integer getPlazasOcupadas() {
		return plazasOcupadas;
	}

	public void setPlazasOcupadas(Integer plazasOcupadas) {
		this.plazasOcupadas = plazasOcupadas;
	}

	public Integer getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(Integer transacciones) {
		this.transacciones = transacciones;
	}

	public Integer getCantidadEfectivo() {
		return cantidadEfectivo;
	}

	public void setCantidadEfectivo(Integer cantidadEfectivo) {
		this.cantidadEfectivo = cantidadEfectivo;
	}

	public Integer getCantidadPrepark() {
		return cantidadPrepark;
	}

	public void setCantidadPrepark(Integer cantidadPrepark) {
		this.cantidadPrepark = cantidadPrepark;
	}

	public Integer getCantidadDatafono() {
		return cantidadDatafono;
	}

	public void setCantidadDatafono(Integer cantidadDatafono) {
		this.cantidadDatafono = cantidadDatafono;
	}

	public Integer getCantidadMensuales() {
		return cantidadMensuales;
	}

	public void setCantidadMensuales(Integer cantidadMensuales) {
		this.cantidadMensuales = cantidadMensuales;
	}

	public Integer getCantidadVip() {
		return cantidadVip;
	}

	public void setCantidadVip(Integer cantidadVip) {
		this.cantidadVip = cantidadVip;
	}

	public Integer getCantidadConvenio() {
		return cantidadConvenio;
	}

	public void setCantidadConvenio(Integer cantidadConvenio) {
		this.cantidadConvenio = cantidadConvenio;
	}

	public Integer getCantidadStickers() {
		return cantidadStickers;
	}

	public void setCantidadStickers(Integer cantidadStickers) {
		this.cantidadStickers = cantidadStickers;
	}

	public Integer getCantidadVentaPrepark() {
		return cantidadVentaPrepark;
	}

	public void setCantidadVentaPrepark(Integer cantidadVentaPrepark) {
		this.cantidadVentaPrepark = cantidadVentaPrepark;
	}

	public Integer getCantidadRecargaPrepark() {
		return cantidadRecargaPrepark;
	}

	public void setCantidadRecargaPrepark(Integer cantidadRecargaPrepark) {
		this.cantidadRecargaPrepark = cantidadRecargaPrepark;
	}

	public Integer getCantidadCambioPrepark() {
		return cantidadCambioPrepark;
	}

	public void setCantidadCambioPrepark(Integer cantidadCambioPrepark) {
		this.cantidadCambioPrepark = cantidadCambioPrepark;
	}

	public Integer getCantidadVentaMensuales() {
		return cantidadVentaMensuales;
	}

	public void setCantidadVentaMensuales(Integer cantidadVentaMensuales) {
		this.cantidadVentaMensuales = cantidadVentaMensuales;
	}

	public Integer getCantidadSinCobro() {
		return cantidadSinCobro;
	}

	public void setCantidadSinCobro(Integer cantidadSinCobro) {
		this.cantidadSinCobro = cantidadSinCobro;
	}

	public Integer getCantidadCheque() {
		return cantidadCheque;
	}

	public void setCantidadCheque(Integer cantidadCheque) {
		this.cantidadCheque = cantidadCheque;
	}

	public Integer getCantidadBigpass() {
		return cantidadBigpass;
	}

	public void setCantidadBigpass(Integer cantidadBigpass) {
		this.cantidadBigpass = cantidadBigpass;
	}

	public Integer getAsticker() {
		return asticker;
	}

	public void setAsticker(Integer asticker) {
		this.asticker = asticker;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Integer subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getIvaEfectivo() {
		return ivaEfectivo;
	}

	public void setIvaEfectivo(Integer ivaEfectivo) {
		this.ivaEfectivo = ivaEfectivo;
	}

	public Integer getIvaPrepark() {
		return ivaPrepark;
	}

	public void setIvaPrepark(Integer ivaPrepark) {
		this.ivaPrepark = ivaPrepark;
	}

	public Integer getIvaDatafono() {
		return ivaDatafono;
	}

	public void setIvaDatafono(Integer ivaDatafono) {
		this.ivaDatafono = ivaDatafono;
	}

	public Integer getIvaCheque() {
		return ivaCheque;
	}

	public void setIvaCheque(Integer ivaCheque) {
		this.ivaCheque = ivaCheque;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getReportado() {
		return reportado;
	}

	public void setReportado(Integer reportado) {
		this.reportado = reportado;
	}

	public Integer getTransmitido() {
		return transmitido;
	}

	public void setTransmitido(Integer transmitido) {
		this.transmitido = transmitido;
	}

	public Integer getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(Integer acumulado) {
		this.acumulado = acumulado;
	}

	public Integer getCpropietario() {
		return cpropietario;
	}

	public void setCpropietario(Integer cpropietario) {
		this.cpropietario = cpropietario;
	}

	public Integer getCtaxicard() {
		return ctaxicard;
	}

	public void setCtaxicard(Integer ctaxicard) {
		this.ctaxicard = ctaxicard;
	}

	public Integer getCperiodoGracia() {
		return cperiodoGracia;
	}

	public void setCperiodoGracia(Integer cperiodoGracia) {
		this.cperiodoGracia = cperiodoGracia;
	}

	public Integer getTotal_recarga_pp_ef() {
		return total_recarga_pp_ef;
	}

	public void setTotal_recarga_pp_ef(Integer total_recarga_pp_ef) {
		this.total_recarga_pp_ef = total_recarga_pp_ef;
	}

	public Integer getTotal_recarga_pp_tc() {
		return total_recarga_pp_tc;
	}

	public void setTotal_recarga_pp_tc(Integer total_recarga_pp_tc) {
		this.total_recarga_pp_tc = total_recarga_pp_tc;
	}

	public Integer getTotal_recarga_pp_ch() {
		return total_recarga_pp_ch;
	}

	public void setTotal_recarga_pp_ch(Integer total_recarga_pp_ch) {
		this.total_recarga_pp_ch = total_recarga_pp_ch;
	}

	public Integer getNotas_credito() {
		return notas_credito;
	}

	public void setNotas_credito(Integer notas_credito) {
		this.notas_credito = notas_credito;
	}

	public Integer getId_inicio_turno() {
		return id_inicio_turno;
	}

	public void setId_inicio_turno(Integer id_inicio_turno) {
		this.id_inicio_turno = id_inicio_turno;
	}

	public Integer getCtarjeta_b() {
		return ctarjeta_b;
	}

	public void setCtarjeta_b(Integer ctarjeta_b) {
		this.ctarjeta_b = ctarjeta_b;
	}

	public Integer getId_inicio_dia() {
		return id_inicio_dia;
	}

	public void setId_inicio_dia(Integer id_inicio_dia) {
		this.id_inicio_dia = id_inicio_dia;
	}

	public Integer getCnum_comprobante() {
		return cnum_comprobante;
	}

	public void setCnum_comprobante(Integer cnum_comprobante) {
		this.cnum_comprobante = cnum_comprobante;
	}

	public Integer getTotal_venta_ts() {
		return total_venta_ts;
	}

	public void setTotal_venta_ts(Integer total_venta_ts) {
		this.total_venta_ts = total_venta_ts;
	}

	public Integer getTotal_transOff() {
		return total_transOff;
	}

	public void setTotal_transOff(Integer total_transOff) {
		this.total_transOff = total_transOff;
	}

	public Integer getTotal_reimpresion() {
		return total_reimpresion;
	}

	public void setTotal_reimpresion(Integer total_reimpresion) {
		this.total_reimpresion = total_reimpresion;
	}

	public Integer getTotal_efectivo_valet() {
		return total_efectivo_valet;
	}

	public void setTotal_efectivo_valet(Integer total_efectivo_valet) {
		this.total_efectivo_valet = total_efectivo_valet;
	}

	public Integer getTotal_tc_valet() {
		return total_tc_valet;
	}

	public void setTotal_tc_valet(Integer total_tc_valet) {
		this.total_tc_valet = total_tc_valet;
	}

	public Integer getTotal_donacion() {
		return total_donacion;
	}

	public void setTotal_donacion(Integer total_donacion) {
		this.total_donacion = total_donacion;
	}

	public Integer getTotal_ef_valet_park() {
		return total_ef_valet_park;
	}

	public void setTotal_ef_valet_park(Integer total_ef_valet_park) {
		this.total_ef_valet_park = total_ef_valet_park;
	}

	public String getJustificacion() {
		return justificacion;
	}

	public void setJustificacion(String justificacion) {
		this.justificacion = justificacion;
	}

	public Integer getCgroupon() {
		return cgroupon;
	}

	public void setCgroupon(Integer cgroupon) {
		this.cgroupon = cgroupon;
	}

	public Integer getIva_groupon() {
		return iva_groupon;
	}

	public void setIva_groupon(Integer iva_groupon) {
		this.iva_groupon = iva_groupon;
	}

	public Integer getTotal_gp() {
		return total_gp;
	}

	public void setTotal_gp(Integer total_gp) {
		this.total_gp = total_gp;
	}

	public Integer getClifemiles() {
		return clifemiles;
	}

	public void setClifemiles(Integer clifemiles) {
		this.clifemiles = clifemiles;
	}

	public Integer getIva_lifemiles() {
		return iva_lifemiles;
	}

	public void setIva_lifemiles(Integer iva_lifemiles) {
		this.iva_lifemiles = iva_lifemiles;
	}

	public Integer getTotal_lifemiles() {
		return total_lifemiles;
	}

	public void setTotal_lifemiles(Integer total_lifemiles) {
		this.total_lifemiles = total_lifemiles;
	}

	public Integer getTotal_cuponatic() {
		return total_cuponatic;
	}

	public void setTotal_cuponatic(Integer total_cuponatic) {
		this.total_cuponatic = total_cuponatic;
	}

	public Integer getCantBonosBancolombia() {
		return cantBonosBancolombia;
	}

	public void setCantBonosBancolombia(Integer cantBonosBancolombia) {
		this.cantBonosBancolombia = cantBonosBancolombia;
	}

	public long getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(long tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

}
