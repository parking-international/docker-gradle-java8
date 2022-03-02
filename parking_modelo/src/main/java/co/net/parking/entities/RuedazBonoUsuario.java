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
@Table(name = "RUEDAZ_BONO_USUARIO")

@NamedQueries({ @NamedQuery(name = "RuedazBonoUsuario.findAll", query = "SELECT e FROM RuedazBonoUsuario e"),
		@NamedQuery(name = "RuedazBonoUsuario.findByIdBonoIdUsuario", query = "SELECT e from RuedazBonoUsuario e WHERE e.idUsuario = :idUsuario and e.idBono = :idBono"),
		@NamedQuery(name = "RuedazBonoUsuario.findByIdBono", query = "SELECT e FROM RuedazBonoUsuario e where e.idBono = :idBono") })
public class RuedazBonoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "id_bono")
	private int idBono;
	@Column(name = "id_usuario")
	private int idUsuario;
	@Column(name = "id_movimiento_venta")
	private int idMovimientoVenta;
	@Column(name = "fecha")
	private String fecha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdBono() {
		return idBono;
	}

	public void setIdBono(int idBono) {
		this.idBono = idBono;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdMovimientoVenta() {
		return idMovimientoVenta;
	}

	public void setIdMovimientoVenta(int idMovimientoVenta) {
		this.idMovimientoVenta = idMovimientoVenta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
