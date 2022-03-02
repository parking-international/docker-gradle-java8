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
@Table(name="RUEDAZ_BILLETERA")
@NamedQueries({
	@NamedQuery(name="RuedazBilleteraIdentificacion",query="SELECT r FROM RuedazBilletera r WHERE r.identificacion=:identificacion")
// 	@NamedQuery(name="RuedazLoginCedulaPassword",   query="SELECT c FROM RuedazUsuario c WHERE c.identificacion=:identificacion AND c.contrasena=:contrasena AND c.estado=1 "),
//	@NamedQuery(name = "RuedazConsultaCelular", query = "SELECT t FROM RuedazUsuario t where t.celular=:celular AND t.estado=1"),
//	@NamedQuery(name = "RuedazConsultaEmail", query = "SELECT t FROM RuedazUsuario t where t.correoElectronico=:correoElectronico AND t.estado=1")
    })
public class RuedazBilletera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "IDENTIFICACION")
	private String identificacion;

	@Column(name = "SALDO_ACTUAL")
	private int saldoActual;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}
	
}