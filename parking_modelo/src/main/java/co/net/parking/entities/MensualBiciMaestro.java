package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="parking_mensual_bici_maestro")
@IdClass(DocumentoNumeroTipo.class)
public class MensualBiciMaestro {
	
	@Id
	@Column(name="documento_numero")
	private String documentoNumero;

	@Id
	@Column(name="documento_tipo")
	private Long documentoTipo;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="bicicleta_color")
	private String bicicletaColor;
	
	@Column(name="bicicleta_marca")
	private String bicicletaMarca;
	
	@Column(name="bicicleta_serial")
	private String bicicletaSerial;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bicicletaColor == null) ? 0 : bicicletaColor.hashCode());
		result = prime * result + ((bicicletaMarca == null) ? 0 : bicicletaMarca.hashCode());
		result = prime * result + ((bicicletaSerial == null) ? 0 : bicicletaSerial.hashCode());
		result = prime * result + ((documentoNumero == null) ? 0 : documentoNumero.hashCode());
		result = prime * result + ((documentoTipo == null) ? 0 : documentoTipo.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
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
		MensualBiciMaestro other = (MensualBiciMaestro) obj;
		if (bicicletaColor == null) {
			if (other.bicicletaColor != null)
				return false;
		} else if (!bicicletaColor.equals(other.bicicletaColor))
			return false;
		if (bicicletaMarca == null) {
			if (other.bicicletaMarca != null)
				return false;
		} else if (!bicicletaMarca.equals(other.bicicletaMarca))
			return false;
		if (bicicletaSerial == null) {
			if (other.bicicletaSerial != null)
				return false;
		} else if (!bicicletaSerial.equals(other.bicicletaSerial))
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
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MensualBiciMaestro [documentoNumero=" + documentoNumero + ", documentoTipo=" + documentoTipo
				+ ", nombres=" + nombres + ", bicicletaColor=" + bicicletaColor + ", bicicletaMarca=" + bicicletaMarca
				+ ", bicicletaSerial=" + bicicletaSerial + "]";
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

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getBicicletaColor() {
		return bicicletaColor;
	}

	public void setBicicletaColor(String bicicletaColor) {
		this.bicicletaColor = bicicletaColor;
	}

	public String getBicicletaMarca() {
		return bicicletaMarca;
	}

	public void setBicicletaMarca(String bicicletaMarca) {
		this.bicicletaMarca = bicicletaMarca;
	}

	public String getBicicletaSerial() {
		return bicicletaSerial;
	}

	public void setBicicletaSerial(String bicicletaSerial) {
		this.bicicletaSerial = bicicletaSerial;
	}
	
	

}
