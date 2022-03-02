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
 * The persistent class for the new_tarifa_parqueadero database table.
 * 
 */
@Entity
@Table(name = "new_tarifa_parqueadero")

@NamedQueries({@NamedQuery(name = "NewTarifaParqueadero.findAll", query = "SELECT e FROM NewTarifaParqueadero e"),})
public class NewTarifaParqueadero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Column(name = "id_park") private String idPark;

	@Column(name = "id_tarifa") private Long idTarifa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdPark() {
		return idPark;
	}

	public void setIdPark(String idPark) {
		this.idPark = idPark;
	}

	public Long getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(Long idTarifa) {
		this.idTarifa = idTarifa;
	}

}
