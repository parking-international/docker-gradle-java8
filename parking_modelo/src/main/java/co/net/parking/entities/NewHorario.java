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
 * The persistent class for the new_horario database table.
 * 
 */
@Entity
@Table(name = "new_horario")

@NamedQueries({@NamedQuery(name = "NewHorario.findAll", query = "SELECT i FROM NewHorario i"),
	@NamedQuery(name = "NewHorario.findByIdPark",
		query = " SELECT i FROM NewHorario i WHERE i.idPark = :idPark AND i.estado = 1 ORDER BY i.idDiaInicio ")})

public class NewHorario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Id") private Long id;

	@Column(name = "id_park") private Long idPark;

	@Column(name = "id_dia_inicio") private Long idDiaInicio;

	@Column(name = "id_dia_fin") private Long idDiaFin;

	@Column(name = "hora_inicio") private String horaInicio;

	@Column(name = "hora_fin") private String horaFin;

	@Column(name = "estado") private String estado;

	public NewHorario() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPark() {
		return idPark;
	}

	public void setIdPark(Long idPark) {
		this.idPark = idPark;
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

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
