package co.net.parking.entities;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the new_tarifa database table.
 * 
 */
@Entity
@Table(name = "new_tarifa")

@NamedQueries({
	@NamedQuery(name = "NewTarifasActivas", query = "SELECT t FROM NewTarifa t WHERE t.codPark=:codPark AND t.estado = 1 AND idTipoVehiculo=:tipoVehiculo AND t.idTipoTarifa in (1,2,3)"),
	@NamedQuery(name = "NewTarifasAct", query = "SELECT t FROM NewTarifa t WHERE t.codPark=:codPark AND t.estado = 1 AND t.idTipoTarifa in (1,2)")

})
	public class NewTarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	@Column(name = "id_tipo_tarifa") private Long idTipoTarifa;
	@Column(name = "id_tipo_vehiculo") private Long idTipoVehiculo;
	@Column(name = "id_dia_inicio") private Long idDiaInicio;
	@Column(name = "id_dia_fin") private Long idDiaFin;
	@Column(name = "hora_inicio") private Time horaInicio;
	@Column(name = "hora_fin") private Time horaFin;
	@Column(name = "valor") private Long valor;
	@Column(name = "estado") private Long estado;
	@Column(name = "cod_park") private String codPark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTipoTarifa() {
		return idTipoTarifa;
	}

	public void setIdTipoTarifa(Long idTipoTarifa) {
		this.idTipoTarifa = idTipoTarifa;
	}

	public Long getIdTipoVehiculo() {
		return idTipoVehiculo;
	}

	public void setIdTipoVehiculo(Long idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}

	public Long getIdDiaInicio() {
		return idDiaInicio;
	}

	public void setIdDiaInicio(Long idDiaInicio) {
		this.idDiaInicio = idDiaInicio;
	}

	public Long getIdDiaFin() {
		return idDiaFin;
	}

	public void setIdDiaFin(Long idDiaFin) {
		this.idDiaFin = idDiaFin;
	}

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

}
