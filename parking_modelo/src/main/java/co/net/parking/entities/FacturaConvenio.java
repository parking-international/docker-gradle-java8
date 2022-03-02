package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the factura_convenio database table.
 * 
 */
@Entity
@Table(name = "factura_convenio")
@NamedQuery(name = "FacturaConvenio.findAll", query = "SELECT f FROM FacturaConvenio f")
public class FacturaConvenio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;

	@Column(name = "codigo_terminal") private String codigoTerminal;

	private String duracion;

	@Column(name = "factura_parking") private String facturaParking;

	@Column(name = "fecha_final") private String fechaFinal;

	@Column(name = "fecha_inicial") private String fechaInicial;

	@Column(name = "valor_factura") private String valorFactura;

	public FacturaConvenio() {}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getCodigoTerminal() {
		return codigoTerminal;
	}

	public void setCodigoTerminal(String codigoTerminal) {
		this.codigoTerminal = codigoTerminal;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getFacturaParking() {
		return facturaParking;
	}

	public void setFacturaParking(String facturaParking) {
		this.facturaParking = facturaParking;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(String valorFactura) {
		this.valorFactura = valorFactura;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
