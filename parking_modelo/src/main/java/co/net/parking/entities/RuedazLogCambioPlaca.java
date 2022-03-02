package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the RUEDAZ_LOG_CAMBIO_PLACA database table.
 * 
 */
@Entity
@Table(name="RUEDAZ_LOG_CAMBIO_PLACA")
@NamedQueries({
	@NamedQuery(name = "RuedazLogCambioPlaca.consultaCambiosUltimoMes", query = "SELECT r FROM RuedazLogCambioPlaca r WHERE r.idPlusCliente=:idPlusCliente AND fecha >= :fechaRenovacion AND fecha <= :fechaActual"),
	})
public class RuedazLogCambioPlaca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer idPlusCliente;

	private String placaAntigua;

	private String placaNueva;

	private String aplicativo;

	private String usuarioModifica;

	private String fecha;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdPlusCliente() {
		return idPlusCliente;
	}

	public void setIdPlusCliente(Integer idPlusCliente) {
		this.idPlusCliente = idPlusCliente;
	}

	public String getPlacaAntigua() {
		return placaAntigua;
	}

	public void setPlacaAntigua(String placaAntigua) {
		this.placaAntigua = placaAntigua;
	}

	public String getPlacaNueva() {
		return placaNueva;
	}

	public void setPlacaNueva(String placaNueva) {
		this.placaNueva = placaNueva;
	}

	public String getAplicativo() {
		return aplicativo;
	}

	public void setAplicativo(String aplicativo) {
		this.aplicativo = aplicativo;
	}

	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
