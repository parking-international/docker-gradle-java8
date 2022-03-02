package co.net.parking.campaignbuilder;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "parking_campaign_builder_tracing")
public class CampaignTracingData {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column( name = "cod_campaign" )
	private Long campaignId;
	
	@Column( name = "num_factura" )
	private String numFactura;
	
	@Column( name = "valor_dcto" )
	private Long totalDiscount;
	
	@Column( name = "cod_park" )
	private String codPark;
	
	@Column( name = "cod_terminal" )
	private String codTerminal;
	
	@Column( name = "codigo_usado")
	private String usedCode;
	
	private Date fecha;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campaignId == null) ? 0 : campaignId.hashCode());
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + ((codTerminal == null) ? 0 : codTerminal.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numFactura == null) ? 0 : numFactura.hashCode());
		result = prime * result + ((totalDiscount == null) ? 0 : totalDiscount.hashCode());
		result = prime * result + ((usedCode == null) ? 0 : usedCode.hashCode());
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
		CampaignTracingData other = (CampaignTracingData) obj;
		if (campaignId == null) {
			if (other.campaignId != null)
				return false;
		} else if (!campaignId.equals(other.campaignId))
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
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
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
		if (totalDiscount == null) {
			if (other.totalDiscount != null)
				return false;
		} else if (!totalDiscount.equals(other.totalDiscount))
			return false;
		if (usedCode == null) {
			if (other.usedCode != null)
				return false;
		} else if (!usedCode.equals(other.usedCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CampaignTracingData [id=" + id + ", campaignId=" + campaignId + ", numFactura=" + numFactura
				+ ", totalDiscount=" + totalDiscount + ", codPark=" + codPark + ", codTerminal=" + codTerminal
				+ ", usedCode=" + usedCode + ", fecha=" + fecha + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Long getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(Long totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getUsedCode() {
		return usedCode;
	}

	public void setUsedCode(String usedCode) {
		this.usedCode = usedCode;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	
	

}
