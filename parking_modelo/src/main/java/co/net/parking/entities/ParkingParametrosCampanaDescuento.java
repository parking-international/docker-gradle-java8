package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parking_parametros_campaña_descuento database table.
 * 
 */
@Entity
@Table(name="parking_parametros_campaña_descuento")
@NamedQueries({ 
	@NamedQuery(name = "parametrosCampanaParqueadero", query = "SELECT r FROM ParkingParametrosCampanaDescuento r WHERE r.estado=1"),
	})  

public class ParkingParametrosCampanaDescuento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "fecha_inicio")
	private String fechaInicio;
	
	@Column(name = "fecha_fin")
	private String fechaFin;

	@Column(name = "porcentaje_descuento")
	private int porcentajeDescuento;

	@Column(name = "dias_consumo")
	private int diasConsumo;

	@Column(name = "valor_generacion_descuento")
	private int  valorGeneracionDescuento;

	@Column(name = "valor_consumo_descuento")
	private int valorConsumoDescuento;
	
	private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(int porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public int getDiasConsumo() {
		return diasConsumo;
	}

	public void setDiasConsumo(int diasConsumo) {
		this.diasConsumo = diasConsumo;
	}

	public int getValorGeneracionDescuento() {
		return valorGeneracionDescuento;
	}

	public void setValorGeneracionDescuento(int valorGeneracionDescuento) {
		this.valorGeneracionDescuento = valorGeneracionDescuento;
	}

	public int getValorConsumoDescuento() {
		return valorConsumoDescuento;
	}

	public void setValorConsumoDescuento(int valorConsumoDescuento) {
		this.valorConsumoDescuento = valorConsumoDescuento;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}