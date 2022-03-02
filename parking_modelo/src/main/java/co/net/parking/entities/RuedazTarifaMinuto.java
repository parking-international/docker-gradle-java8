package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the new_terminal database table.
 * 
 */
@Entity
@Table(name = "RUEDAZ_TARIFA_MINUTO")

@NamedQueries({ @NamedQuery(name = "RuedazTarifaMinuto.findAll", query = "SELECT e FROM RuedazTarifaMinuto e"),
		@NamedQuery(name = "RuedazTarifaMinuto.findActive", query = "SELECT e FROM RuedazTarifaMinuto e where e.estado = 1") })
public class RuedazTarifaMinuto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "valor")
	private int valor;
	@Column(name = "estado")
	private int estado;
	@Column(name = "fecha")
	private String fecha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
