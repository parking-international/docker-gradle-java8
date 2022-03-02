package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parking_parametros_campaña_descuento database table.
 * 
 */
@Entity
@Table(name="parking_historico_descuentos_campaña")
 

public class ParkingHistoricoDescuentoCampana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "valor_descontado")
	private int valorDescontado;
	
	@Column(name = "id_codigos_descuento")
	private int idCodigosDescuento;

	@Column(name = "cod_terminal")
	private String codTerminal;

	@Column(name = "cod_park")
	private String codPark;

	@Column(name = "num_celular")
	private String numCelular;

	@Column(name = "num_factura")
	private int numFactura;
	
	@Column(name = "fecha_consumo")
	private String fechaConsumo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValorDescontado() {
		return valorDescontado;
	}

	public void setValorDescontado(int valorDescontado) {
		this.valorDescontado = valorDescontado;
	}

	public int getIdCodigosDescuento() {
		return idCodigosDescuento;
	}

	public void setIdCodigosDescuento(int idCodigosDescuento) {
		this.idCodigosDescuento = idCodigosDescuento;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public String getFechaConsumo() {
		return fechaConsumo;
	}

	public void setFechaConsumo(String fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}