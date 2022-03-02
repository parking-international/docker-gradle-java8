package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

/**
 * The persistent class for the plus_adicional_transaccion database table.
 * 
 */
@Entity
@Table(name = "plus_adicional_transaccion")
@NamedQueries({
		@NamedQuery(name = "plusAdicionalTransaccion.findAll", query = "SELECT p FROM PlusAdicionalTransaccion p") })
@NamedStoredProcedureQuery(
		name = "ruedaz_pagar_tiempo_extra", 
		procedureName = "ruedaz_pagar_tiempo_extra",
		parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "cedula"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "token_tarjeta"),
				@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "TEXTO_SALIDA")
		}
)
public class PlusAdicionalTransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "id_plus_transaccion")
	private int idPlusTransaccion;

	@Column(name = "fechaCreacion")
	private String fechaCreacion;

	@Column(name = "estadoTransaccion")
	private int estadoTransaccion;

	@Column(name = "detalleTransaccion")
	private String detalleTransaccion;

	@Column(name = "placa")
	private String placa;

	@Column(name = "codTerminal")
	private String codTerminal;

	@Column(name = "fechaEntrada")
	private String fechaEntrada;

	@Column(name = "fechaSalida")
	private String fechaSalida;

	@Column(name = "totalMinutos")
	private int totalMinutos;

	@Column(name = "adicionalMinutos")
	private int adicionalMinutos;

	@Column(name = "tarifaMinuto")
	private int tarifaMinuto;

	@Column(name = "totalAdicional")
	private int totalAdicional;

	@Column(name = "id_wapp_transaccion")
	private int idWappTransaccion;

	private int idEstadoSms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPlusTransaccion() {
		return idPlusTransaccion;
	}

	public void setIdPlusTransaccion(int idPlusTransaccion) {
		this.idPlusTransaccion = idPlusTransaccion;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getEstadoTransaccion() {
		return estadoTransaccion;
	}

	public void setEstadoTransaccion(int estadoTransaccion) {
		this.estadoTransaccion = estadoTransaccion;
	}

	public String getDetalleTransaccion() {
		return detalleTransaccion;
	}

	public void setDetalleTransaccion(String detalleTransaccion) {
		this.detalleTransaccion = detalleTransaccion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getTotalMinutos() {
		return totalMinutos;
	}

	public void setTotalMinutos(int totalMinutos) {
		this.totalMinutos = totalMinutos;
	}

	public int getAdicionalMinutos() {
		return adicionalMinutos;
	}

	public void setAdicionalMinutos(int adicionalMinutos) {
		this.adicionalMinutos = adicionalMinutos;
	}

	public int getTarifaMinuto() {
		return tarifaMinuto;
	}

	public void setTarifaMinuto(int tarifaMinuto) {
		this.tarifaMinuto = tarifaMinuto;
	}

	public int getTotalAdicional() {
		return totalAdicional;
	}

	public void setTotalAdicional(int totalAdicional) {
		this.totalAdicional = totalAdicional;
	}

	public int getIdWappTransaccion() {
		return idWappTransaccion;
	}

	public void setIdWappTransaccion(int idWappTransaccion) {
		this.idWappTransaccion = idWappTransaccion;
	}

	public int getIdEstadoSms() {
		return idEstadoSms;
	}

	public void setIdEstadoSms(int idEstadoSms) {
		this.idEstadoSms = idEstadoSms;
	}

}