package co.net.datos.terminal;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the error_log database table.
 * 
 */
@Entity
@Table(name = "error_log")
@NamedQueries({ @NamedQuery(name = "ErrorLog.findAll", query = "SELECT e FROM ErrorLog e"),
		@NamedQuery(name = "ErrorLog.findByNotTransmited", query = "SELECT e FROM ErrorLog e where e.transmitido=null") })
public class LocalErrorLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "cod_empleado")
	private String codEmpleado;

	@Column(name = "cod_terminal")
	private String codTerminal;

	private String descripcion;

	private int estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_hora")
	private Date fechaHora;

	private String categoria;

	private int transmitido;

	public LocalErrorLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getTransmitido() {
		return this.transmitido;
	}

	public void setTransmitido(int transmitido) {
		this.transmitido = transmitido;
	}

}