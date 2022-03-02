package co.net.parking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="parking_mensual_bici_resumen")
@IdClass(DocumentoNumeroTipoCodPark.class)
public class MensualBiciResumen {
	
	@Id
	@Column(name="documento_numero")
	private String documentoNumero;
	
	@Id
	@Column(name="documento_tipo")
	private Long documentoTipo;
	
	@Id
	@Column(name="cod_park")
	private String codPark;
	
	@Column(name="fecha_ultima_compra")
	private Date fechaUltimaCompra;
	
	@Column(name="fecha_vigencia_inicio")
	private Date fechaVigenciaInicio;
	
	@Column(name="fecha_vigencia_fin")
	private Date fechaVigenciaFin;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + ((documentoNumero == null) ? 0 : documentoNumero.hashCode());
		result = prime * result + ((documentoTipo == null) ? 0 : documentoTipo.hashCode());
		result = prime * result + ((fechaUltimaCompra == null) ? 0 : fechaUltimaCompra.hashCode());
		result = prime * result + ((fechaVigenciaFin == null) ? 0 : fechaVigenciaFin.hashCode());
		result = prime * result + ((fechaVigenciaInicio == null) ? 0 : fechaVigenciaInicio.hashCode());
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
		MensualBiciResumen other = (MensualBiciResumen) obj;
		if (codPark == null) {
			if (other.codPark != null)
				return false;
		} else if (!codPark.equals(other.codPark))
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
		if (fechaUltimaCompra == null) {
			if (other.fechaUltimaCompra != null)
				return false;
		} else if (!fechaUltimaCompra.equals(other.fechaUltimaCompra))
			return false;
		if (fechaVigenciaFin == null) {
			if (other.fechaVigenciaFin != null)
				return false;
		} else if (!fechaVigenciaFin.equals(other.fechaVigenciaFin))
			return false;
		if (fechaVigenciaInicio == null) {
			if (other.fechaVigenciaInicio != null)
				return false;
		} else if (!fechaVigenciaInicio.equals(other.fechaVigenciaInicio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MensualBiciResumen [documentoNumero=" + documentoNumero + ", documentoTipo=" + documentoTipo
				+ ", codPark=" + codPark + ", fechaUltimaCompra=" + fechaUltimaCompra + ", fechaVigenciaInicio="
				+ fechaVigenciaInicio + ", fechaVigenciaFin=" + fechaVigenciaFin + "]";
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

	public Date getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}

	public void setFechaUltimaCompra(Date fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}

	public Date getFechaVigenciaInicio() {
		return fechaVigenciaInicio;
	}

	public void setFechaVigenciaInicio(Date fechaVigenciaInicio) {
		this.fechaVigenciaInicio = fechaVigenciaInicio;
	}

	public Date getFechaVigenciaFin() {
		return fechaVigenciaFin;
	}

	public void setFechaVigenciaFin(Date fechaVigenciaFin) {
		this.fechaVigenciaFin = fechaVigenciaFin;
	}
	
	
	
	

}
