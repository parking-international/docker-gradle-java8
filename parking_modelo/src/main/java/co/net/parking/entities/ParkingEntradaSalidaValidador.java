package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parking_entrada_salidas_validador")
public class ParkingEntradaSalidaValidador {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "cod_terminal")
	private String codTerminal;
	@Column(name = "cod_park")
	private String codPark;
	private String barcode;
	private String placa;
	@Column(name = "fecha_entrada")
	private String fechaEntrada;
	@Column(name = "fecha_salida")
	private String fechaSalida;
	
	public ParkingEntradaSalidaValidador() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
