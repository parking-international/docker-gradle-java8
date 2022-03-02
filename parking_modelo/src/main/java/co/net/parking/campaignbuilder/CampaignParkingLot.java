package co.net.parking.campaignbuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking_campaign_builder_p_lot")
public class CampaignParkingLot {
	
	@Id
	private long id;
	
	@Column(name = "campaign_id")
	private long campaignId;
	
	@Column(length=5, name = "cod_park")
	private String codPark;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (campaignId ^ (campaignId >>> 32));
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		CampaignParkingLot other = (CampaignParkingLot) obj;
		if (campaignId != other.campaignId)
			return false;
		if (codPark == null) {
			if (other.codPark != null)
				return false;
		} else if (!codPark.equals(other.codPark))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CampaignParkingLot [id=" + id + ", campaignId=" + campaignId + ", codPark=" + codPark + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long campaignId) {
		this.campaignId = campaignId;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}
	
	

}
