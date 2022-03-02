package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

/**
 * The persistent class for the trans_auditoria database table.
 * 
 */
@Entity
@Table(name = "trans_auditoria")
@NamedQueries({@NamedQuery(name = "TransAuditoria.findAll", query = "SELECT t FROM TransAuditoria t"),
	@NamedQuery(name = "TransAuditoria.consultaPorTerminal", query = "SELECT t FROM TransAuditoria t where t.codTerminal=:codTerminal")})

public class TransAuditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") private int id;

	@Column(name = "cod_terminal") private String codTerminal;

	@Column(name = "fecha_final") private Date fechaFinal;

	@Transient @Column(name = "fecha_transmitido") private Date fechaTransmitido;

	@Column(name = "id_transaccion") @Type(type = "uuid-char") private UUID idTransaccion;

	@Column(name = "num_factura") private int numFactura;

	@Column(name = "total") private int total;

	private String categoria;

	public TransAuditoria() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public Date getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Date getFechaTransmitido() {
		return this.fechaTransmitido;
	}

	public void setFechaTransmitido(Date fechaTransmitido) {
		this.fechaTransmitido = fechaTransmitido;
	}

	public UUID getIdTransaccion() {
		return this.idTransaccion;
	}

	public void setIdTransaccion(UUID uuid) {
		this.idTransaccion = uuid;
	}

	public int getNumFactura() {
		return this.numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
