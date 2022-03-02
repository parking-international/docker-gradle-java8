package co.net.parking.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="parking_scaling_metas_mes")
public class ScalingMeta {
	

	static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;


	private Integer proyecto;


	@Column(name = "cod_park")
	private String codPark;


	private Integer mes;


	@Column(name = "año")
	private Integer ano;


	@Column(name = "meta_base")
	private Integer metaBase;


	private Integer amarillo;


	private Integer rojo;


	private Integer verde;


	@Column(name = "fecha_creacion")
	private Date fechaCreacion;


	private Integer estado;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amarillo == null) ? 0 : amarillo.hashCode());
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		result = prime * result + ((metaBase == null) ? 0 : metaBase.hashCode());
		result = prime * result + ((proyecto == null) ? 0 : proyecto.hashCode());
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
		ScalingMeta other = (ScalingMeta) obj;
		if (amarillo == null) {
			if (other.amarillo != null)
				return false;
		} else if (!amarillo.equals(other.amarillo))
			return false;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (codPark == null) {
			if (other.codPark != null)
				return false;
		} else if (!codPark.equals(other.codPark))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
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
		if (metaBase == null) {
			if (other.metaBase != null)
				return false;
		} else if (!metaBase.equals(other.metaBase))
			return false;
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
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


	@Override
	public String toString() {
		return "ScallingMeta [id=" + id + ", proyecto=" + proyecto + ", codPark=" + codPark + ", mes=" + mes + ", ano="
				+ ano + ", metaBase=" + metaBase + ", amarillo=" + amarillo + ", rojo=" + rojo + ", verde=" + verde
				+ ", fechaCreacion=" + fechaCreacion + ", estado=" + estado + "]";
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


	public Integer getMetaBase() {
		return metaBase;
	}


	public void setMetaBase(Integer metaBase) {
		this.metaBase = metaBase;
	}


	public Integer getAmarillo() {
		return amarillo;
	}


	public void setAmarillo(Integer amarillo) {
		this.amarillo = amarillo;
	}


	public Integer getRojo() {
		return rojo;
	}


	public void setRojo(Integer rojo) {
		this.rojo = rojo;
	}


	public Integer getVerde() {
		return verde;
	}


	public void setVerde(Integer verde) {
		this.verde = verde;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Integer getEstado() {
		return estado;
	}


	public void setEstado(Integer estado) {
		this.estado = estado;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
