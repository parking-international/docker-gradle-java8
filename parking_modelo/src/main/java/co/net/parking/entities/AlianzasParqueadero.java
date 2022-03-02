package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the alianzas_parqueaderos database table.
 * 
 */
@Entity
@Table(name = "alianzas_parqueaderos")
@NamedQuery(name = "AlianzasParqueadero.findAll", query = "SELECT a FROM AlianzasParqueadero a Where a.codPark=:codPark and a.estado = 1")
public class AlianzasParqueadero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "AlianzaParkId")
	private short alianzaParkId;

	@Column(name = "cod_park")
	private String codPark;

	private short alianzaId;

	private short estado;

	private String nombreAlianza;

	private String urlAlianza;

	public String getUrlAlianza() {
		return urlAlianza;
	}

	public void setUrlAlianza(String urlAlianza) {
		this.urlAlianza = urlAlianza;
	}

	public AlianzasParqueadero() {
	}

	public short getAlianzaId() {
		return this.alianzaId;
	}

	public void setAlianzaId(short alianzaId) {
		this.alianzaId = alianzaId;
	}

	public short getAlianzaParkId() {
		return this.alianzaParkId;
	}

	public void setAlianzaParkId(short alianzaParkId) {
		this.alianzaParkId = alianzaParkId;
	}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getNombreAlianza() {
		return this.nombreAlianza;
	}

	public void setNombreAlianza(String nombreAlianza) {
		this.nombreAlianza = nombreAlianza;
	}

}