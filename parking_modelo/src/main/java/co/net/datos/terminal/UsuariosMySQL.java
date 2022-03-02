package co.net.datos.terminal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the usuariosMySQL database table.
 * 
 */
@Entity
@Table(name = "usuariosMySQL")
@NamedQueries({@NamedQuery(name = "UsuariosMySQL.findAll", query = "SELECT u FROM UsuariosMySQL u"), @NamedQuery(name = "UsuariosMySQL.findByUser",
	query = "SELECT u FROM UsuariosMySQL u WHERE u.codPark=:codPark AND u.codTerminal=:codTerminal AND u.nombreUsuario=:nombreUsuario")})

public class UsuariosMySQL implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;

	private String codPark;

	private String codTerminal;

	private String expiraClave;

	private Date fechaRegistro = new Date();

	private String host;

	private String nombrePark;

	private String nombreUsuario;

	private Date ultimoCambioClave;

	public UsuariosMySQL() {}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getExpiraClave() {
		return this.expiraClave;
	}

	public void setExpiraClave(String expiraClave) {
		this.expiraClave = expiraClave;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePark() {
		return this.nombrePark;
	}

	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Date getUltimoCambioClave() {
		return this.ultimoCambioClave;
	}

	public void setUltimoCambioClave(Date ultimoCambioClave) {
		this.ultimoCambioClave = ultimoCambioClave;
	}

}
