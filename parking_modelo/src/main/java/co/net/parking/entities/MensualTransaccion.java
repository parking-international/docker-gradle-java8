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
 * The persistent class for the MensualTransaccion database table.
 * 
 */
@Entity
@Table(name = "MensualTransaccion")

@NamedQueries({ @NamedQuery(name = "MensualTransaccion.findAll", query = "SELECT e FROM MensualTransaccion e"),
		@NamedQuery(name = "MensualTransaccion.findEntradaByPlacaCodParkDesc", query = "SELECT p FROM MensualTransaccion p WHERE p.mensualPlaca = :placa AND p.codPark=:codPark AND p.fechaSalida IS NULL and p.fechaEntrada < :fecha ORDER BY p.fechaEntrada DESC"),
		@NamedQuery(name = "MensualTransaccion.findSalidaByPlacaCodParkAsc", query = "SELECT p FROM MensualTransaccion p WHERE p.mensualPlaca = :placa AND p.codPark = :codPark AND p.fechaEntrada IS NULL and p.fechaSalida > :fecha ORDER BY p.fechaSalida ASC")
})
public class MensualTransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "mensualPlaca")
	private String mensualPlaca;
	@Column(name = "fechaEntrada")
	private String fechaEntrada;
	@Column(name = "fechaSalida")
	private String fechaSalida;
	@Column(name = "codPark")
	private String codPark;
	@Column(name = "codTerminal")
	private String codTerminal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensualPlaca() {
		return mensualPlaca;
	}

	public void setMensualPlaca(String mensualPlaca) {
		this.mensualPlaca = mensualPlaca;
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
}
