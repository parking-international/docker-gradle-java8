package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the plus_cliente database table.
 * 
 */
@Entity
@Table(name="plus_transaccion")
@NamedQueries({
	@NamedQuery(name="PlusTransaccionEntrada", query="SELECT p FROM PlusTransaccion p WHERE p.placa=:placa AND p.codPark=:codPark AND fechaSalida IS NULL ORDER BY fechaEntrada DESC"),
	@NamedQuery(name="ConsultarPlusTransaccionEntrada", 
	query="SELECT p FROM PlusTransaccion p WHERE p.placa=:placa AND p.fechaEntrada=:fechaEntrada AND fechaSalida IS NULL ORDER BY fechaEntrada DESC"),
	@NamedQuery(name="PlusTransaccionSalida", query="SELECT p FROM PlusTransaccion p WHERE p.placa=:placa AND p.codPark=:codPark AND fechaEntrada IS NULL ORDER BY fechaSalida DESC"),
	@NamedQuery(name="ConsultarPlusTransaccionSalida",
	query="SELECT p FROM PlusTransaccion p WHERE p.placa=:placa AND p.codPark=:codPark AND p.codTerminal=:codTerminal AND p.fechaSalida=:fechaSalida AND fechaEntrada IS NULL ORDER BY fechaSalida DESC"),
	@NamedQuery(name="PlusBajarSalidas", query="SELECT p FROM PlusTransaccion p WHERE p.codPark=:codPark ORDER BY fechaSalida DESC")
	})
public class PlusTransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String placa;
	
	private String codEmpleado;

	private String codTerminal;
	
	private String codPark;
	
	private String fechaEntrada;

	private String fechaSalida;
	
	private int idPlusCliente;
	
	private int transmisionSalida;
	
	private int idTiempoExtra;
	
	private Integer localStorage;

	public String getCodPark() {
		return codPark;
	}


	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getCodTerminal() {
		return codTerminal;
	}


	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}


	public String getCodEmpleado() {
		return codEmpleado;
	}


	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}


	public PlusTransaccion() {
	}


	public int getIdPlusCliente() {
		return idPlusCliente;
	}


	public void setIdPlusCliente(int idPlusCliente) {
		this.idPlusCliente = idPlusCliente;
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


	public int getTransmisionSalida() {
		return transmisionSalida;
	}


	public void setTransmisionSalida(int transmisionSalida) {
		this.transmisionSalida = transmisionSalida;
	}


	public int getIdTiempoExtra() {
		return idTiempoExtra;
	}


	public void setIdTiempoExtra(int idTiempoExtra) {
		this.idTiempoExtra = idTiempoExtra;
	}


	public Integer getLocalStorage() {
		return localStorage;
	}


	public void setLocalStorage(Integer localStorage) {
		this.localStorage = localStorage;
	}

}