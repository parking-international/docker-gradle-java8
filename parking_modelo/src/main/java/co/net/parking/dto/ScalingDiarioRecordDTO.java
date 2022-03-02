package co.net.parking.dto;

import co.net.parking.entities.ScalingDiario;

public class ScalingDiarioRecordDTO {
	
	
	private Integer recordMetaDia;
	private Integer codigoColor;
	

	public static ScalingDiarioRecordDTO createFrom(ScalingDiario scalingDiario) {

		ScalingDiarioRecordDTO entityBuilt = new ScalingDiarioRecordDTO();
		
		entityBuilt.setCodigoColor(scalingDiario.getCumplimiento());
		entityBuilt.setRecordMetaDia(scalingDiario.getCantidadCarros());
		
		return entityBuilt;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoColor == null) ? 0 : codigoColor.hashCode());
		result = prime * result + ((recordMetaDia == null) ? 0 : recordMetaDia.hashCode());
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
		ScalingDiarioRecordDTO other = (ScalingDiarioRecordDTO) obj;
		if (codigoColor == null) {
			if (other.codigoColor != null)
				return false;
		} else if (!codigoColor.equals(other.codigoColor))
			return false;
		if (recordMetaDia == null) {
			if (other.recordMetaDia != null)
				return false;
		} else if (!recordMetaDia.equals(other.recordMetaDia))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ScallingDiarioRecordDTO [recordMetaDia=" + recordMetaDia + ", codigoColor=" + codigoColor + "]";
	}


	public Integer getRecordMetaDia() {
		return recordMetaDia;
	}


	public void setRecordMetaDia(Integer recordMetaDia) {
		this.recordMetaDia = recordMetaDia;
	}


	public Integer getCodigoColor() {
		return codigoColor;
	}


	public void setCodigoColor(Integer codigoColor) {
		this.codigoColor = codigoColor;
	}

	
	
	
}
