package co.net.parking.entities;

import java.io.Serializable;

public class DocumentoNumeroTipoCodPark implements Serializable{

	private static final long serialVersionUID = 1L;
	private String documentoNumero;
	private Long documentoTipo;
	private String codPark;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + ((documentoNumero == null) ? 0 : documentoNumero.hashCode());
		result = prime * result + ((documentoTipo == null) ? 0 : documentoTipo.hashCode());
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
		DocumentoNumeroTipoCodPark other = (DocumentoNumeroTipoCodPark) obj;
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
		return true;
	}
	@Override
	public String toString() {
		return "DocumentoNumeroTipoCodPark [documentoNumero=" + documentoNumero + ", documentoTipo=" + documentoTipo
				+ ", codPark=" + codPark + "]";
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
