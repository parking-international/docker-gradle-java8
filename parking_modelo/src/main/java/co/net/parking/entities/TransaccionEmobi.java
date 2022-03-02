package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the transaccion_emobi database table.
 * 
 */
@Entity
@Table(name = "transaccion_emobi")
@NamedQuery(name = "TransaccionEmobi.findAll", query = "SELECT t FROM TransaccionEmobi t")
public class TransaccionEmobi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;

	private String cliente;

	private String estado;

	private String fecha;

	private String ping;

	private String placa;

	private String terminal;

	public TransaccionEmobi() {}


	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPing() {
		return this.ping;
	}

	public void setPing(String ping) {
		this.ping = ping;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTerminal() {
		return this.terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

}
