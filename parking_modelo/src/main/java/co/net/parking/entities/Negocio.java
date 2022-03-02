package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the negocios database table.
 * 
 */
@Entity
@Table(name="negocios")
@NamedQueries({
@NamedQuery(name="Negocio.findAll", query="SELECT n FROM Negocio n"),
@NamedQuery(name="Negocio.findByContrato", query="SELECT n FROM Negocio n WHERE idCliente=:idCliente AND estado=:estado order by fechaCreacion desc")})
public class Negocio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Short auto;

	private Integer cantidad;

	@Column(name="cod_empleado")
	private String codEmpleado;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="cod_vendedor")
	private String codVendedor;

	private Integer consecutivo;

	private String contrato;

	private String descripcion;

	@Column(name="dias_plazo_credito")
	private Integer diasPlazoCredito;

	private Integer estado;

	private Date facturacion;

	@Column(name="fecha_creacion")
	private String fechaCreacion;

	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

	@Column(name="fecha_mod")
	private String fechaMod;

	@Column(name="final_suspension")
	private Date finalSuspension;

	@Column(name="id_cliente")
	private String idCliente;

	@Column(name="id_modo_pago")
	private Integer idModoPago;

	@Column(name="inicial_suspension")
	private Date inicialSuspension;

	@Column(name="num_factura")
	private String numFactura;

	@Column(name="precio_total")
	private Integer precioTotal;

	@Column(name="precio_unit")
	private Integer precioUnit;

	@Column(name="tipo_mensualidad")
	private String tipoMensualidad;

	@Column(name="tipo_negocio")
	private Integer tipoNegocio;

	@Column(name="vigencia_precio")
	private Date vigenciaPrecio;

	public Negocio() {
	}
	public Short getAuto() {
		return this.auto;
	}

	public void setAuto(Short auto) {
		this.auto = auto;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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

	public String getCodVendedor() {
		return this.codVendedor;
	}

	public void setCodVendedor(String codVendedor) {
		this.codVendedor = codVendedor;
	}

	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getContrato() {
		return this.contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDiasPlazoCredito() {
		return this.diasPlazoCredito;
	}

	public void setDiasPlazoCredito(int diasPlazoCredito) {
		this.diasPlazoCredito = diasPlazoCredito;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(Integer integer) {
		this.estado = integer;
	}

	public Date getFacturacion() {
		return this.facturacion;
	}

	public void setFacturacion(Date facturacion) {
		this.facturacion = facturacion;
	}

	public String getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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

	public String getFechaMod() {
		return this.fechaMod;
	}

	public void setFechaMod(String fechaMod) {
		this.fechaMod = fechaMod;
	}

	public Date getFinalSuspension() {
		return this.finalSuspension;
	}

	public void setFinalSuspension(Date finalSuspension) {
		this.finalSuspension = finalSuspension;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdModoPago() {
		return this.idModoPago;
	}

	public void setIdModoPago(int idModoPago) {
		this.idModoPago = idModoPago;
	}

	public Date getInicialSuspension() {
		return this.inicialSuspension;
	}

	public void setInicialSuspension(Date inicialSuspension) {
		this.inicialSuspension = inicialSuspension;
	}

	public String getNumFactura() {
		return this.numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public int getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(Integer precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Integer getPrecioUnit() {
		return this.precioUnit;
	}

	public void setPrecioUnit(int precioUnit) {
		this.precioUnit = precioUnit;
	}

	public String getTipoMensualidad() {
		return this.tipoMensualidad;
	}

	public void setTipoMensualidad(String tipoMensualidad) {
		this.tipoMensualidad = tipoMensualidad;
	}

	public Integer getTipoNegocio() {
		return this.tipoNegocio;
	}

	public void setTipoNegocio(Integer tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public Date getVigenciaPrecio() {
		return this.vigenciaPrecio;
	}

	public void setVigenciaPrecio(Date vigenciaPrecio) {
		this.vigenciaPrecio = vigenciaPrecio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}