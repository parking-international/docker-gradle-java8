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
 * The persistent class for the new_terminal database table.
 * 
 */
@Entity
@Table(name = "new_terminal")

@NamedQueries({@NamedQuery(name = "NewTerminal.findAll", query = "SELECT e FROM NewTerminal e"),
	@NamedQuery(name = "NewTerminal.findByCodTerminal", query = "SELECT e FROM NewTerminal e where cod_terminal = :codTerminal and estado = 1"),
	@NamedQuery(name = "NewTerminal.findIdParkByCodTerminal", query = "SELECT e.idPark FROM NewTerminal e where e.codTerminal =:codTerminal and e.estado = 1"),
	@NamedQuery(name = "NewTerminal.findById", query = "SELECT e FROM NewTerminal e where id = :id and estado = 1")})
public class NewTerminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	@Column(name = "cod_terminal") private String codTerminal;
	@Column(name = "id_park") private Long idPark;
	@Column(name = "base_caja") private Long baseCaja;
	@Column(name = "id_tipo_terminal") private Long idTipoTerminal;
	@Column(name = "version") private String version;
	@Column(name = "ip_privada") private String ipPrivada;
	@Column(name = "estado") private Long estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public Long getIdPark() {
		return idPark;
	}

	public void setIdPark(Long idPark) {
		this.idPark = idPark;
	}

	public Long getBaseCaja() {
		return baseCaja;
	}

	public void setBaseCaja(Long baseCaja) {
		this.baseCaja = baseCaja;
	}

	public Long getIdTipoTerminal() {
		return idTipoTerminal;
	}

	public void setIdTipoTerminal(Long idTipoTerminal) {
		this.idTipoTerminal = idTipoTerminal;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIpPrivada() {
		return ipPrivada;
	}

	public void setIpPrivada(String ipPrivada) {
		this.ipPrivada = ipPrivada;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}
}
