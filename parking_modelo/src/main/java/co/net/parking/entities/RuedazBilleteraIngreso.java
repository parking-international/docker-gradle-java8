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
@Table(name = "RUEDAZ_BILLETERA_INGRESO")
@NamedQueries({
		@NamedQuery(name = "RuedazBilleteraIngreso.findByDocumento", query = "SELECT r FROM RuedazBilleteraIngreso r WHERE r.idReferido = :identificacion")
//    @NamedQuery(name="RuedazLoginCedulaPassword",   query="SELECT c FROM RuedazUsuario c WHERE c.identificacion=:identificacion AND c.contrasena=:contrasena AND c.estado=1 "),
//	@NamedQuery(name = "RuedazConsultaCelular", query = "SELECT t FROM RuedazUsuario t where t.celular=:celular AND t.estado=1"),
//	@NamedQuery(name = "RuedazConsultaEmail", query = "SELECT t FROM RuedazUsuario t where t.correoElectronico=:correoElectronico AND t.estado=1")
})
public class RuedazBilleteraIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "IDENTIFICACION")
	private String identificacion;

	@Column(name = "ID_REFERIDO")
	private String idReferido;

	@Column(name = "VALOR_CARGADO")
	private int valorCargado;

	@Column(name = "FECHA")
	private String fecha;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getValorCargado() {
		return valorCargado;
	}

	public void setValorCargado(int valorCargado) {
		this.valorCargado = valorCargado;
	}

	public String getIdReferido() {
		return idReferido;
	}

	public void setIdReferido(String idReferido) {
		this.idReferido = idReferido;
	}

}