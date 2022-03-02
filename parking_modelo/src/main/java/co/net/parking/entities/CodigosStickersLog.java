package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the codigos_stickers_log database table.
 * 
 */
@Entity
@Table(name = "codigos_stickers_log")
@NamedQuery(name = "CodigosStickersLog.findAll", query = "SELECT c FROM CodigosStickersLog c")
public class CodigosStickersLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "csl_id")
	private long cslId;

	@Column(name = "csl_detalle")
	private String cslDetalle;

	@Column(name = "csl_evento")
	private String cslEvento;

	@Column(name = "csl_fecha")
	@Transient
	private String cslFecha;

	@ManyToOne
	@JoinColumn(name = "csl_usuario")
	private CodigosStickersUsuario codigosStickersUsuario;

	public CodigosStickersLog() {
	}

	public long getCslId() {
		return this.cslId;
	}

	public void setCslId(long cslId) {
		this.cslId = cslId;
	}

	public String getCslDetalle() {
		return this.cslDetalle;
	}

	public void setCslDetalle(String cslDetalle) {
		this.cslDetalle = cslDetalle;
	}

	public String getCslEvento() {
		return this.cslEvento;
	}

	public void setCslEvento(String cslEvento) {
		this.cslEvento = cslEvento;
	}

	public String getCslFecha() {
		return cslFecha;
	}

	public void setCslFecha(String cslFecha) {
		this.cslFecha = cslFecha;
	}

	public CodigosStickersUsuario getCodigosStickersUsuario() {
		return this.codigosStickersUsuario;
	}

	public void setCodigosStickersUsuario(CodigosStickersUsuario codigosStickersUsuario) {
		this.codigosStickersUsuario = codigosStickersUsuario;
	}

}