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
 * The persistent class for the new_parqueadero database table.
 * 
 */
@Entity
@Table(name = "MensualContrato")

@NamedQueries({ @NamedQuery(name = "MensualContrato.findAll", query = "SELECT e FROM MensualContrato e") })
public class MensualContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "contrato")
	private Long contrato;
	@Column(name = "nombreEmpresa")
	private String nombreEmpresa;
	@Column(name = "nitEmpresa")
	private String nitEmpresa;
	@Column(name = "cupos")
	private Long cupos;
	@Column(name = "fechaActivacion")
	private String fechaActivacion;
	@Column(name = "fechaVencimiento")
	private String fechaVencimiento;
	@Column(name = "tipo")
	private Long tipo;
	@Column(name = "codPark")
	private String codPark;
	@Column(name = "estado")
	private Long estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContrato() {
		return contrato;
	}

	public void setContrato(Long contrato) {
		this.contrato = contrato;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNitEmpresa() {
		return nitEmpresa;
	}

	public void setNitEmpresa(String nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}

	public Long getCupos() {
		return cupos;
	}

	public void setCupos(Long cupos) {
		this.cupos = cupos;
	}

	public String getFechaActivacion() {
		return fechaActivacion;
	}

	public void setFechaActivacion(String fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Long getTipo() {
		return tipo;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}
}
