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
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name="RUEDAZ_MEDIO_PAGO")
@NamedQueries({
	@NamedQuery(name = "RuedazMedioPagoId", query = "SELECT t FROM RuedazMedioPago t where t.idRuedazUsuario=:idRuedazUsuario AND t.estado=1")
// 	@NamedQuery(name="RuedazLoginCedulaPassword",   query="SELECT c FROM RuedazUsuario c WHERE c.identificacion=:identificacion AND c.contrasena=:contrasena AND c.estado=1 "),
//	@NamedQuery(name = "RuedazConsultaCelular", query = "SELECT t FROM RuedazUsuario t where t.celular=:celular AND t.estado=1"),
//	@NamedQuery(name = "RuedazConsultaEmail", query = "SELECT t FROM RuedazUsuario t where t.correoElectronico=:correoElectronico AND t.estado=1")
    })
public class RuedazMedioPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "ID_RUEDAZ_USUARIO")
	private int idRuedazUsuario;

	@Column(name = "TOKEN")
	private String token;
	
	@Column(name = "MARCA_TARJETA")
	private String marcaTarjeta;
	
	@Column(name = "NUM_TARJETA")
	private String numTarjeta;
	
	@Column(name = "ESTADO")
	private int estado;
	
	@Column(name = "NOMBRE_USUARIO_TARJETA")
	private String nombreUsuarioTarjeta;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdRuedazUsuario() {
		return idRuedazUsuario;
	}

	public void setIdRuedazUsuario(int idRuedazUsuario) {
		this.idRuedazUsuario = idRuedazUsuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMarcaTarjeta() {
		return marcaTarjeta;
	}

	public void setMarcaTarjeta(String marcaTarjeta) {
		this.marcaTarjeta = marcaTarjeta;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombreUsuarioTarjeta() {
		return nombreUsuarioTarjeta;
	}

	public void setNombreUsuarioTarjeta(String nombreUsuarioTarjeta) {
		this.nombreUsuarioTarjeta = nombreUsuarioTarjeta;
	}

	

	
	
	


	
}