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
 * The persistent class for the new_turno database table.
 * 
 */
@Entity
@Table(name = "new_turno")

@NamedQueries({@NamedQuery(name = "NewTurno.findAll", query = "SELECT e FROM NewTurno e"),
	@NamedQuery(name = "NewTurno.findById", query = "SELECT e FROM NewTurno e where id = :id"), @NamedQuery(name = "NewTurno.findOpenByCodEmpleado",
		query = "SELECT e FROM NewTurno e where cod_empleado = :codEmpleado and fecha_hora_cierre is null")})
public class NewTurno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	@Column(name = "id_terminal") private Long idTerminal;
	@Column(name = "cod_empleado") private String codEmpleado;
	@Column(name = "fecha_hora_apertura") private String fechaHoraApertura;
	@Column(name = "fecha_hora_cierre") private String fechaHoraCierre;
	@Column(name = "valor_reportado") private Long valorReportado;
	@Column(name = "valor_calculado") private Long valorCalculado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(Long idTerminal) {
		this.idTerminal = idTerminal;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getFechaHoraApertura() {
		return fechaHoraApertura;
	}

	public void setFechaHoraApertura(String fechaHoraApertura) {
		this.fechaHoraApertura = fechaHoraApertura;
	}

	public String getFechaHoraCierre() {
		return fechaHoraCierre;
	}

	public void setFechaHoraCierre(String fechaHoraCierre) {
		this.fechaHoraCierre = fechaHoraCierre;
	}

	public Long getValorReportado() {
		return valorReportado;
	}

	public void setValorReportado(Long valorReportado) {
		this.valorReportado = valorReportado;
	}

	public Long getValorCalculado() {
		return valorCalculado;
	}

	public void setValorCalculado(Long valorCalculado) {
		this.valorCalculado = valorCalculado;
	}
}
