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
 * The persistent class for the codigos_stickers_usuarios database table.
 * 
 */
@Entity
@Table(name = "codigos_stickers_usuarios")
@NamedQueries({@NamedQuery(name = "CodigosStickersUsuario.findAll", query = "SELECT c FROM CodigosStickersUsuario c"),
	@NamedQuery(name = "CodigosStickersUsuario.findById", query = "SELECT c FROM CodigosStickersUsuario c where c.csuId=:id"),
	@NamedQuery(name = "CodigosStickersUsuario.findByUserPassword",
		query = "SELECT c FROM CodigosStickersUsuario c where c.csuUsuario=:user and c.csuPassword=:password")})

public class CodigosStickersUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "csu_id") private long csuId;

	@Column(name = "csu_apellido") private String csuApellido;

	@Column(name = "csu_email") private String csuEmail;

	@Column(name = "csu_estado") private int csuEstado;

	@Column(name = "csu_fecha") private String csuFecha;

	@Column(name = "csu_nombre") private String csuNombre;

	@Column(name = "csu_password") private String csuPassword;

	@Column(name = "csu_usuario") private String csuUsuario;

	// bi-directional many-to-one association to CodigosStickersLog
	// @OneToMany(mappedBy = "codigosStickersUsuario")
	// private List<CodigosStickersLog> codigosStickersLogs;

	public CodigosStickersUsuario() {}

	public long getCsuId() {
		return this.csuId;
	}

	public void setCsuId(long csuId) {
		this.csuId = csuId;
	}

	public String getCsuApellido() {
		return this.csuApellido;
	}

	public void setCsuApellido(String csuApellido) {
		this.csuApellido = csuApellido;
	}

	public String getCsuEmail() {
		return this.csuEmail;
	}

	public void setCsuEmail(String csuEmail) {
		this.csuEmail = csuEmail;
	}

	public int getCsuEstado() {
		return this.csuEstado;
	}

	public void setCsuEstado(int csuEstado) {
		this.csuEstado = csuEstado;
	}

	public String getCsuFecha() {
		return this.csuFecha;
	}

	public void setCsuFecha(String csuFecha) {
		this.csuFecha = csuFecha;
	}

	public String getCsuNombre() {
		return this.csuNombre;
	}

	public void setCsuNombre(String csuNombre) {
		this.csuNombre = csuNombre;
	}

	public String getCsuPassword() {
		return this.csuPassword;
	}

	public void setCsuPassword(String csuPassword) {
		this.csuPassword = csuPassword;
	}

	public String getCsuUsuario() {
		return this.csuUsuario;
	}

	public void setCsuUsuario(String csuUsuario) {
		this.csuUsuario = csuUsuario;
	}

	// public List<CodigosStickersLog> getCodigosStickersLogs() {
	// return this.codigosStickersLogs;
	// }
	//
	// public void setCodigosStickersLogs(List<CodigosStickersLog>
	// codigosStickersLogs) {
	// this.codigosStickersLogs = codigosStickersLogs;
	// }
	//
	// public CodigosStickersLog addCodigosStickersLog(CodigosStickersLog
	// codigosStickersLog) {
	// getCodigosStickersLogs().add(codigosStickersLog);
	// codigosStickersLog.setCodigosStickersUsuario(this);
	//
	// return codigosStickersLog;
	// }
	//
	// public CodigosStickersLog removeCodigosStickersLog(CodigosStickersLog
	// codigosStickersLog) {
	// getCodigosStickersLogs().remove(codigosStickersLog);
	// codigosStickersLog.setCodigosStickersUsuario(null);
	//
	// return codigosStickersLog;
	// }

}
