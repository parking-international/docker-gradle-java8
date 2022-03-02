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

/**
 * The persistent class for the new_transaccion database table.
 * 
 */
@Entity
@Table(name = "new_transaccion")

@NamedQueries({@NamedQuery(name = "NewTransaccion.findAll", query = "SELECT e FROM NewTransaccion e"),})
public class NewTransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	@Column(name = "id_tipo_trans") private Long idTipoTrans;
	@Column(name = "placa_serial") private String placaSerial;
	@Column(name = "fecha_hora_entrada") private String fechaHoraEntrada;
	@Column(name = "fecha_hora_salida") private String fechaHoraSalida;
	@Column(name = "id_tipo_vehiculo") private Long idTipoVehiculo;
	@Column(name = "num_factura") private Long numFactura;
	@Column(name = "valor_factura") private Long valorFactura;
	@Column(name = "cod_terminal") private String codTerminal;
	@Column(name = "cod_empleado") private String codEmpleado;
	@Column(name = "id_turno") private Long idTurno;
	@Column(name = "resolucion") private String resolucion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTipoTrans() {
		return idTipoTrans;
	}

	public void setIdTipoTrans(Long idTipoTrans) {
		this.idTipoTrans = idTipoTrans;
	}

	public String getPlacaSerial() {
		return placaSerial;
	}

	public void setPlacaSerial(String placaSerial) {
		this.placaSerial = placaSerial;
	}

	public String getFechaHoraEntrada() {
		return fechaHoraEntrada;
	}

	public void setFechaHoraEntrada(String fechaHoraEntrada) {
		this.fechaHoraEntrada = fechaHoraEntrada;
	}

	public String getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	public void setFechaHoraSalida(String fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}

	public Long getIdTipoVehiculo() {
		return idTipoVehiculo;
	}

	public void setIdTipoVehiculo(Long idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}

	public Long getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(Long numFactura) {
		this.numFactura = numFactura;
	}

	public Long getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(Long valorFactura) {
		this.valorFactura = valorFactura;
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

	public Long getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Long idTurno) {
		this.idTurno = idTurno;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

}
