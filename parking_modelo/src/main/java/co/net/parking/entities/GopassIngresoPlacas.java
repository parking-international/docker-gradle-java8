package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jesus.gomez
 *
 */
@Entity
@Table(name="parking_gopass_ingreso_placas")
public class GopassIngresoPlacas implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="fecha_ingreso")
	private String fechaIngreso;
	
	private String placa;
	
	@Column(name="cod_park")
	private String codPark;
	
	@Column(name="cod_terminal")
	private String codTerminal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	}