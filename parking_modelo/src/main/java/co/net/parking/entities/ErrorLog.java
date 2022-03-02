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
 * The persistent class for the error_log database table.
 * 
 */
@Entity
@Table(name = "error_log")

@NamedQueries({ @NamedQuery(name = "ErrorLog.findAll", query = "SELECT e FROM ErrorLog e"), })
public class ErrorLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "id_local")
	private int idLocal;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "cod_empleado")
	private String codEmpleado;

	@Column(name = "cod_terminal")
	private String codTerminal;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "estado")
	private int estado;	

	@Column(name = "fecha_auditoria")
	private String fechaAuditoria;

	@Transient
	private int transmitido;

	
	@Column(name="fecha_hora")
	private String fechaHora;
	
	@Column(name = "tipo")
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ErrorLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodEmpleado() {
		return this.codEmpleado;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
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
	@Transient
	public int getTransmitido() {
		return this.transmitido;
	}

	@Transient
	public void setTransmitido(int transmitido) {
		this.transmitido = transmitido;
	}

	public String getFechaAuditoria() {
		return fechaAuditoria;
	}

	public void setFechaAuditoria(String fechaAuditoria) {
		this.fechaAuditoria = fechaAuditoria;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ErrorLog [id=");
		builder.append(id);
		builder.append(", idLocal=");
		builder.append(idLocal);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", codEmpleado=");
		builder.append(codEmpleado);
		builder.append(", codTerminal=");
		builder.append(codTerminal);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", fechaAuditoria=");
		builder.append(fechaAuditoria);
		builder.append(", transmitido=");
		builder.append(transmitido);
		builder.append(", fechaHora=");
		builder.append(fechaHora);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

}