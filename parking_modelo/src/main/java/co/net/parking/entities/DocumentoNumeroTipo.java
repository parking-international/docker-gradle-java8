package co.net.parking.entities;

import java.io.Serializable;

public class DocumentoNumeroTipo implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String documentoNumero;
	private Long documentoTipo;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		DocumentoNumeroTipo other = (DocumentoNumeroTipo) obj;
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
		return "DocumentoNumeroTipo [documentoNumero=" + documentoNumero + ", documentoTipo=" + documentoTipo + "]";
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
