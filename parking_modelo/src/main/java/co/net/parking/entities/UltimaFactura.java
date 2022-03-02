package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the ultima_factura database table.
 * 
 */
@Entity
@Table(name="ultima_factura")
@NamedQuery(name="UltimaFactura.findByCodPark", query="SELECT u FROM UltimaFactura u WHERE codTerminal=:codTerminal")
public class UltimaFactura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="cod_terminal")
	private String codTerminal;

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	@Column(name="ultima_factura")
	private int ultimaFactura;
	
	private int contrato;

	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public UltimaFactura() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getUltimaFactura() {
		return this.ultimaFactura;
	}

	public void setUltimaFactura(int ultimaFactura) {
		this.ultimaFactura = ultimaFactura;
	}


}