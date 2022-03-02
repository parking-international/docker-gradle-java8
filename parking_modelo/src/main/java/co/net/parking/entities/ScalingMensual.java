package co.net.parking.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "parking_scaling_mes")
public class ScalingMensual {

	static final long serialVersionUID = 1L;


	@Id
	private Integer id;

	private Integer proyecto;

	@Column(name = "cod_park")
	private String codPark;

	private Integer mes;

	@Column(name = "año")
	private Integer ano;

	@Column(name = "cantidad_carros")
	private Integer cantidadCarros;

	private Integer cumplimiento;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((cantidadCarros == null) ? 0 : cantidadCarros.hashCode());
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + ((cumplimiento == null) ? 0 : cumplimiento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		result = prime * result + ((proyecto == null) ? 0 : proyecto.hashCode());
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
		ScalingMensual other = (ScalingMensual) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (cantidadCarros == null) {
			if (other.cantidadCarros != null)
				return false;
		} else if (!cantidadCarros.equals(other.cantidadCarros))
			return false;
		if (codPark == null) {
			if (other.codPark != null)
				return false;
		} else if (!codPark.equals(other.codPark))
			return false;
		if (cumplimiento == null) {
			if (other.cumplimiento != null)
				return false;
		} else if (!cumplimiento.equals(other.cumplimiento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ScallingMensual [id=" + id + ", proyecto=" + proyecto + ", codPark=" + codPark + ", mes=" + mes
				+ ", ano=" + ano + ", cantidadCarros=" + cantidadCarros + ", cumplimiento=" + cumplimiento + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProyecto() {
		return proyecto;
	}

	public void setProyecto(Integer proyecto) {
		this.proyecto = proyecto;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getCantidadCarros() {
		return cantidadCarros;
	}

	public void setCantidadCarros(Integer cantidadCarros) {
		this.cantidadCarros = cantidadCarros;
	}

	public Integer getCumplimiento() {
		return cumplimiento;
	}

	public void setCumplimiento(Integer cumplimiento) {
		this.cumplimiento = cumplimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
}
