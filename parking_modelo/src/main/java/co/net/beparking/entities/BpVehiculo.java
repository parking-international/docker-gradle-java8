package co.net.beparking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the BpVehiculo database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="BpVehiculo.findAll", query="SELECT b FROM BpVehiculo b"),
	@NamedQuery(name="BpVehiculo.findById", query="SELECT b FROM BpVehiculo b where b.vehiculoId=:id"),
	@NamedQuery(name="BpVehiculo.findByCedula", query="SELECT b FROM BpVehiculo b where b.cedula=:cedula and estado=:estado order by fechaCreacion desc"),
	@NamedQuery(name="BpVehiculo.findByPlaca", query="SELECT b FROM BpVehiculo b where b.placa=:placa"),
	@NamedQuery(name="BpVehiculo.findByMarca", query="SELECT b FROM BpVehiculo b where b.marca=:marca"),
	@NamedQuery(name="BpVehiculo.findByTipo", query="SELECT b FROM BpVehiculo b where b.tipoVehiculo=:tipo"),
	@NamedQuery(name="BpVehiculo.findByModelo", query="SELECT b FROM BpVehiculo b where b.modelo=:modelo"),
	@NamedQuery(name="BpVehiculo.findByCedulaByPlaca", query="SELECT b FROM BpVehiculo b where b.placa=:placa and b.cedula=:cedula and b.estado=:estado"),
})

public class BpVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VehiculoId")
	private Integer vehiculoId;

	@Column(name="Cedula")
	private String cedula;

	@Column(name="Estado")
	private String estado;

	@Column(name="FechaActualizacion")
	private String fechaActualizacion;

	@Column(name="FechaCreacion")
	private String fechaCreacion;

	@Column(name="Linea")
	private String linea;

	@Column(name="Marca")
	private String marca;

	private String modelo;

	@Column(name="Placa")
	private String placa;

	@Column(name="TipoVehiculo")
	private String tipoVehiculo;

	public BpVehiculo() {
	}

	public Integer getVehiculoId() {
		return this.vehiculoId;
	}

	public void setVehiculoId(Integer vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	

	public String getLinea() {
		return this.linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipoVehiculo() {
		return this.tipoVehiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


}