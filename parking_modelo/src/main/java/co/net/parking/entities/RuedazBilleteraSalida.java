package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;


/**
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name="RUEDAZ_BILLETERA_SALIDA")
@NamedQueries({
//	@NamedQuery(name="RuedazLoginCedula",query="SELECT r FROM RuedazUsuario r WHERE r.identificacion=:identificacion AND r.estado=1"),
//    @NamedQuery(name="RuedazLoginCedulaPassword",   query="SELECT c FROM RuedazUsuario c WHERE c.identificacion=:identificacion AND c.contrasena=:contrasena AND c.estado=1 "),
//	@NamedQuery(name = "RuedazConsultaCelular", query = "SELECT t FROM RuedazUsuario t where t.celular=:celular AND t.estado=1"),
//	@NamedQuery(name = "RuedazConsultaEmail", query = "SELECT t FROM RuedazUsuario t where t.correoElectronico=:correoElectronico AND t.estado=1")
    })
public class RuedazBilleteraSalida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "IDENTIFICACION")
	private String identificacion;

	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "VALOR")
	private int valor;
	
	@Column(name = "FECHA")
	private String fecha;
	
	@Column(name="ID_TRANSACCION")
	private String idTransaccion;
	

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	
}