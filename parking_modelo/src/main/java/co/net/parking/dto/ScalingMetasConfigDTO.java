package co.net.parking.dto;

import co.net.parking.entities.ScalingMeta;

public class ScalingMetasConfigDTO {
	
	Integer base;
	Integer rojo;
	Integer amarillo;
	Integer verde;
	
	
	public static ScalingMetasConfigDTO createFrom(ScalingMeta scallingMeta) {


		ScalingMetasConfigDTO entity = new ScalingMetasConfigDTO();
		

		entity.setBase(scallingMeta.getMetaBase());
		entity.setRojo(scallingMeta.getRojo());
		entity.setAmarillo(scallingMeta.getAmarillo());
		entity.setVerde(scallingMeta.getVerde());
		
		
		return entity;
	}


	public Integer getBase() {
		return base;
	}


	public void setBase(Integer base) {
		this.base = base;
	}


	public Integer getRojo() {
		return rojo;
	}


	public void setRojo(Integer rojo) {
		this.rojo = rojo;
	}


	public Integer getAmarillo() {
		return amarillo;
	}


	public void setAmarillo(Integer amarillo) {
		this.amarillo = amarillo;
	}


	public Integer getVerde() {
		return verde;
	}


	public void setVerde(Integer verde) {
		this.verde = verde;
	}


	@Override
	public String toString() {
		return "ScallingMetasConfigDTO [base=" + base + ", rojo=" + rojo + ", amarillo=" + amarillo + ", verde=" + verde
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amarillo == null) ? 0 : amarillo.hashCode());
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result + ((rojo == null) ? 0 : rojo.hashCode());
		result = prime * result + ((verde == null) ? 0 : verde.hashCode());
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
		ScalingMetasConfigDTO other = (ScalingMetasConfigDTO) obj;
		if (amarillo == null) {
			if (other.amarillo != null)
				return false;
		} else if (!amarillo.equals(other.amarillo))
			return false;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		if (rojo == null) {
			if (other.rojo != null)
				return false;
		} else if (!rojo.equals(other.rojo))
			return false;
		if (verde == null) {
			if (other.verde != null)
				return false;
		} else if (!verde.equals(other.verde))
			return false;
		return true;
	}

	
	
	
	

}
