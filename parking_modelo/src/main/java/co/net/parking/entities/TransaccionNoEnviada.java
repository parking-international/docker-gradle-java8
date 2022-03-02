/**
 *
 */
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
 * The persistent class for the wb_app_reservas database table.
 * 
 */
@Entity
@Table(name = "transaccion_no_enviada")
@NamedQueries({@NamedQuery(name = "TransaccionNoEnviada.findAll", query = "SELECT t FROM TransaccionNoEnviada t")})

public class TransaccionNoEnviada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "num_factura") private String numFactura;

	@Column(name = "cod_terminal") private String codTerminal;

	@Column(name = "fecha_transmitido") private String fechaTransmitido;

	private String descripcion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getFechaTransmitido() {
		return fechaTransmitido;
	}

	public void setFechaTransmitido(String fechaTransmitido) {
		this.fechaTransmitido = fechaTransmitido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
