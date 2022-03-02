package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the error_log_autorizacion database table.
 * 
 */
@Entity
@Table(name="terminal_autorizacion")
@NamedQueries({
	@NamedQuery(name="TerminalAutorizacion.findAll", query="SELECT e FROM TerminalAutorizacion e"),
	@NamedQuery(name="TerminalAutorizacion.findByTerminal", query="SELECT e FROM TerminalAutorizacion e where e.numeroTerminal=:numeroTerminal")
})

public class TerminalAutorizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	private String estado;

	private Timestamp fecha;

	@Column(name="fecha_finalizacion")
	private Timestamp fechaFinalizacion;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
	private int id;

	@Column(name="numero_terminal")
	private String numeroTerminal;	
	
	private Integer inicio;
	

	public TerminalAutorizacion() {
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Timestamp getFechaFinalizacion() {
		return this.fechaFinalizacion;
	}

	public void setFechaFinalizacion(Timestamp fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroTerminal() {
		return this.numeroTerminal;
	}

	public void setNumeroTerminal(String numeroTerminal) {
		this.numeroTerminal = numeroTerminal;
	}

	public Integer getInicio() {
		return inicio;
	}

	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}
	
	

}