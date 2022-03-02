package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the plus_tarifa database table.
 * 
 */
@Entity
@Table(name="plus_tarifa")
@NamedQueries({
@NamedQuery(name="PlusTarifaActiva", query="SELECT p FROM PlusTarifa p WHERE p.estado=1 AND p.tipoVehiculo=:tipoVehiculo"),
@NamedQuery(name="PlusTarifa.findAll", query="SELECT p FROM PlusTarifa p")})

public class PlusTarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int estado;

	private Timestamp fecha;

	private int valor;
	private int tipoVehiculo;

	public PlusTarifa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

}