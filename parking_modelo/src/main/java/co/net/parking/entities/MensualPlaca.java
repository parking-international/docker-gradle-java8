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
@Table(name = "MensualPlaca")

@NamedQueries({ @NamedQuery(name = "MensualPlaca.findAll", query = "SELECT e FROM MensualPlaca e") })
public class MensualPlaca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "documento")
	private String documento;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "placa")
	private String placa;

	@Column(name = "fechaActivacion")
	private String fechaActivacion;

	@Column(name = "fechaVencimiento")
	private String fechaVencimiento;

	@Column(name = "idMensualContrato")
	private Long idMensualContrato;

	@Column(name = "qr")
	private String qr;

	@Column(name = "barcode")
	private String barcode;
	
	@Column(name = "estado")
	private Long estado;

	@Column(name = "trasmitido")
	private Long trasmitido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public Long getIdMensualContrato() {
		return idMensualContrato;
	}

	public void setIdMensualContrato(Long idMensualContrato) {
		this.idMensualContrato = idMensualContrato;
	}

	public String getQr() {
		return qr;
	}

	public void setQr(String qr) {
		this.qr = qr;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	public Long getTrasmitido() {
		return trasmitido;
	}

	public void setTrasmitido(Long trasmitido) {
		this.trasmitido = trasmitido;
	}

}
