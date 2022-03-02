package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_app_usuario_vehiculo database table.
 * 
 */
@Entity
@Table(name="wp_app_usuario_vehiculo")
@NamedQueries({
@NamedQuery(name="WpAppUsuarioVehiculo.findAll", query="SELECT w FROM WpAppUsuarioVehiculo w"),
@NamedQuery(name="WpAppUsuarioVehiculo.findCedulaPlaca", query="SELECT w FROM WpAppUsuarioVehiculo w WHERE cedula=:cedula AND placa=:placa ")
})
public class WpAppUsuarioVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String cedula;

	private String estado;

	@Column(name="fecha_actualizacion")
	private String fechaActualizacion;

	@Column(name="fecha_creacion")
	private String fechaCreacion;

	private String linea;

	private String marca;

	private String modelo;

	private String placa;

	@Column(name="tipo_vehiculo")
	private String tipoVehiculo;

	public WpAppUsuarioVehiculo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String string) {
		this.modelo = string;
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

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

}