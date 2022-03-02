package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parking_mensual_bici_config")
public class MensualBiciConfig {
	
	

	
	@Id
	@Column(name="cod_park")
	private String codPark;

	@Column(name="valor_mensualidad")
	private Long valorMensualidad;
	
	@Column(name="cupos_mensualidad")
	private Long cuposMensualidad;
	
	private int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + ((cuposMensualidad == null) ? 0 : cuposMensualidad.hashCode());
		result = prime * result + ((valorMensualidad == null) ? 0 : valorMensualidad.hashCode());
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
		MensualBiciConfig other = (MensualBiciConfig) obj;
		if (codPark == null) {
			if (other.codPark != null)
				return false;
		} else if (!codPark.equals(other.codPark))
			return false;
		if (cuposMensualidad == null) {
			if (other.cuposMensualidad != null)
				return false;
		} else if (!cuposMensualidad.equals(other.cuposMensualidad))
			return false;
		if (valorMensualidad == null) {
			if (other.valorMensualidad != null)
				return false;
		} else if (!valorMensualidad.equals(other.valorMensualidad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MensualBiciConfig [codPark=" + codPark + ", valorMensualidad=" + valorMensualidad
				+ ", cuposMensualidad=" + cuposMensualidad + "]";
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public Long getValorMensualidad() {
		return valorMensualidad;
	}

	public void setValorMensualidad(Long valorMensualidad) {
		this.valorMensualidad = valorMensualidad;
	}

	public Long getCuposMensualidad() {
		return cuposMensualidad;
	}

	public void setCuposMensualidad(Long cuposMensualidad) {
		this.cuposMensualidad = cuposMensualidad;
	}

	
	


}
