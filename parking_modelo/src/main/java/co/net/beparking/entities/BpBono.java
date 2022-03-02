package co.net.beparking.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the BpBono database table.
 * 
 */
@Entity
@NamedQueries({ @NamedQuery(name = "BpBono.findAll", query = "SELECT b FROM BpBono b"),
		@NamedQuery(name = "BpBono.consultaPorCedula", query = "SELECT b FROM BpBono b WHERE cedula=:cedula AND estado=:estado"),
		@NamedQuery(name = "BpBono.consulta", query = "SELECT b FROM BpBono b WHERE cedula=:cedula"),
		@NamedQuery(name = "BpBono.findByCodBono", query = "SELECT b FROM BpBono b WHERE codBono=:codBono")

})
public class BpBono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "Cedula")
	private String cedula;

	@Column(name = "CodBono")
	private String codBono;

	@Column(name = "CodTipoBono")
	private int codTipoBono;

	@Column(name = "Descripcion")
	private String descripcion;

	@Column(name = "Estado")
	private String estado;

	@Column(name = "FechaActualizacion")
	private Date fechaActualizacion;

	@Column(name = "FechaCreacion")
	private Date fechaCreacion;

	@Column(name = "FechaFinalVigencia")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFinalVigencia;

	@Column(name = "FechaInicialVigencia")
	private Date fechaInicialVigencia;

	@Column(name = "IdTrans")
	private String idTrans;

	public BpBono() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodBono() {
		return this.codBono;
	}

	public void setCodBono(String codBono) {
		this.codBono = codBono;
	}

	public int getCodTipoBono() {
		return this.codTipoBono;
	}

	public void setCodTipoBono(int codTipoBono) {
		this.codTipoBono = codTipoBono;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaFinalVigencia() {
		return this.fechaFinalVigencia;
	}

	public void setFechaFinalVigencia(Date fechaFinalVigencia) {
		this.fechaFinalVigencia = fechaFinalVigencia;
	}

	public Date getFechaInicialVigencia() {
		return this.fechaInicialVigencia;
	}

	public void setFechaInicialVigencia(Date fechaInicialVigencia) {
		this.fechaInicialVigencia = fechaInicialVigencia;
	}

	public String getIdTrans() {
		return this.idTrans;
	}

	public void setIdTrans(String idTrans) {
		this.idTrans = idTrans;
	}

}