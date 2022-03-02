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
import javax.persistence.Transient;

/**
 * The persistent class for the new_terminal database table.
 * 
 */
@Entity
@Table(name = "RUEDAZ_BONO")

@NamedQueries({ @NamedQuery(name = "RuedazBono.findAll", query = "SELECT e FROM RuedazBono e"),
		@NamedQuery(name = "RuedazBono.findByCodigo", query = "SELECT e FROM RuedazBono e WHERE e.codigo = :codigo"),
		@NamedQuery(name = "RuedazBono.getBonosActivosPlusCiente", query = "SELECT e FROM RuedazBono e WHERE e.estado = 1 AND e.idPlusCliente = :idPlusCliente") })
public class RuedazBono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "dias")
	private int dias;
	@Column(name = "tipo")
	private int tipo;
	@Column(name = "estado")
	private int estado;
	@Column(name = "fecha_inicial")
	private String fechaInicial;
	@Column(name = "fecha_final")
	private String fechaFinal;
	@Column(name = "id_plus_cliente")
	private Integer idPlusCliente;
	
	@Transient
	private String placa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Integer getIdPlusCliente() {
		return idPlusCliente;
	}

	public void setIdPlusCliente(Integer idPlusCliente) {
		this.idPlusCliente = idPlusCliente;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
