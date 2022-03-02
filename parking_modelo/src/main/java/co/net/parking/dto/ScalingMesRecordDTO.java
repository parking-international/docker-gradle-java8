package co.net.parking.dto;

import java.util.List;

import co.net.parking.entities.ScalingMensual;

public class ScalingMesRecordDTO {
	
	
	private Integer recordMetaMes;
	private Integer codigoColor;
	

	public static ScalingMesRecordDTO createFrom(ScalingMensual scalingMensual) {

		ScalingMesRecordDTO entityBuilt = new ScalingMesRecordDTO();
		

		entityBuilt.setCodigoColor(scalingMensual.getCumplimiento());
		
		entityBuilt.setRecordMetaMes(scalingMensual.getCantidadCarros());
		
		
		return entityBuilt;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoColor == null) ? 0 : codigoColor.hashCode());
		result = prime * result + ((recordMetaMes == null) ? 0 : recordMetaMes.hashCode());
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
		ScalingMesRecordDTO other = (ScalingMesRecordDTO) obj;
		if (codigoColor == null) {
			if (other.codigoColor != null)
				return false;
		} else if (!codigoColor.equals(other.codigoColor))
			return false;
		if (recordMetaMes == null) {
			if (other.recordMetaMes != null)
				return false;
		} else if (!recordMetaMes.equals(other.recordMetaMes))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ScallingMesRecordDTO [recordMetaMes=" + recordMetaMes + ", codigoColor=" + codigoColor + "]";
	}


	public Integer getRecordMetaMes() {
		return recordMetaMes;
	}


	public void setRecordMetaMes(Integer recordMetaMes) {
		this.recordMetaMes = recordMetaMes;
	}


	public Integer getCodigoColor() {
		return codigoColor;
	}


	public void setCodigoColor(Integer codigoColor) {
		this.codigoColor = codigoColor;
	}
	
	
	
	

}
