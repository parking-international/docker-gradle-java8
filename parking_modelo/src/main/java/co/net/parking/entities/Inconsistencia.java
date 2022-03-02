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

/**
 * The persistent class for the new_rol database table.
 * 
 */
@Entity
@Table(name = "INCONSISTENCIAS")

@NamedQueries({@NamedQuery(name = "Inconsistencia.findAll", query = "SELECT e FROM Inconsistencia e"),})
public class Inconsistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_inconsistencia") private Long id;

	@Column(name = "fecha") private String fecha;

	@Column(name = "serial") private String serial;

	@Column(name = "tipo_tarjeta") private String tipoTarjeta;

	@Column(name = "observacion") private String observacion;

	@Column(name = "cod_park") private String codPark;

	@Column(name = "cod_terminal") private String codTerminal;

	@Transient private int idSalida;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getIdSalida() {
		return idSalida;
	}

	public void setIdSalida(int idSalida) {
		this.idSalida = idSalida;
	}

}
