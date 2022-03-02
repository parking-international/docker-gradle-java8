package co.net.parking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parking_mensual_bici_traza")
public class MensualBiciTraza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@Column(name="documento_numero")
	private String documentoNumero;

	@Column(name="documento_tipo")
	private Long documentoTipo;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="num_factura")
	private String numFactura;

	@Column(name="cod_terminal")
	private String codTerminal;

	@Column(name="fecha_compra")
	private Date fechaCompra;

	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Column(name="fecha_fin")
	private Date fechaFin;

	@Column(name="cod_emp")
	private Long codEmpleado;

	@Column(name="valor")
	private Long valor;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEmpleado == null) ? 0 : codEmpleado.hashCode());
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + ((codTerminal == null) ? 0 : codTerminal.hashCode());
		result = prime * result + ((documentoNumero == null) ? 0 : documentoNumero.hashCode());
		result = prime * result + ((documentoTipo == null) ? 0 : documentoTipo.hashCode());
		result = prime * result + ((fechaCompra == null) ? 0 : fechaCompra.hashCode());
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numFactura == null) ? 0 : numFactura.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MensualBiciTraza other = (MensualBiciTraza) obj;
		if (codEmpleado == null) {
			if (other.codEmpleado != null)
				return false;
		} else if (!codEmpleado.equals(other.codEmpleado))
			return false;
		if (codPark == null) {
			if (other.codPark != null)
				return false;
		} else if (!codPark.equals(other.codPark))
			return false;
		if (codTerminal == null) {
			if (other.codTerminal != null)
				return false;
		} else if (!codTerminal.equals(other.codTerminal))
			return false;
		if (documentoNumero == null) {
			if (other.documentoNumero != null)
				return false;
		} else if (!documentoNumero.equals(other.documentoNumero))
			return false;
		if (documentoTipo == null) {
			if (other.documentoTipo != null)
				return false;
		} else if (!documentoTipo.equals(other.documentoTipo))
			return false;
		if (fechaCompra == null) {
			if (other.fechaCompra != null)
				return false;
		} else if (!fechaCompra.equals(other.fechaCompra))
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numFactura == null) {
			if (other.numFactura != null)
				return false;
		} else if (!numFactura.equals(other.numFactura))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MensualBiciTraza [id=" + id + ", documentoNumero=" + documentoNumero + ", documentoTipo="
				+ documentoTipo + ", codPark=" + codPark + ", numFactura=" + numFactura + ", codTerminal=" + codTerminal
				+ ", fechaCompra=" + fechaCompra + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", codEmpleado=" + codEmpleado + ", valor=" + valor + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocumentoNumero() {
		return documentoNumero;
	}

	public void setDocumentoNumero(String documentoNumero) {
		this.documentoNumero = documentoNumero;
	}

	public Long getDocumentoTipo() {
		return documentoTipo;
	}

	public void setDocumentoTipo(Long documentoTipo) {
		this.documentoTipo = documentoTipo;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
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

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Long getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(Long codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	
	
	
	

}
