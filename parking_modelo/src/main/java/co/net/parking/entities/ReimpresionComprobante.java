package co.net.parking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "reimpresion_comprobante_entrada", schema = "dbo")
@NamedQueries({@NamedQuery(name = "ReimpresionComprobante.findAll", query = "SELECT n FROM ReimpresionComprobante n")})
public class ReimpresionComprobante {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") @JsonIgnore private Long id;
	@Column(name = "cod_terminal") private String codTerminal;
	@Column(name = "id_turno") private Long idTurno;
	@Column(name = "placa") private String placa;
	@Column(name = "fecha_hora", columnDefinition = "datetime") private String fechaHora;
	@Column(name = "fecha_reimpresion", columnDefinition = "datetime") private String fechaReimpresion;
	@Column(name = "tipo_reimpresion") private Integer tipoReimpresion;
	@Column(name = "llave_motivo") private String llaveMotivo;
	@Column(name = "nombre_cliente") private String nombreCliente;
	@Column(name = "identificacion") private String identificacion;
	@Column(name = "direccion") private String direccion;
	@Column(name = "telefono") private String telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public Long getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Long idTurno) {
		this.idTurno = idTurno;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Integer getTipoReimpresion() {
		return tipoReimpresion;
	}

	public void setTipoReimpresion(Integer tipoReimpresion) {
		this.tipoReimpresion = tipoReimpresion;
	}

	public String getLlaveMotivo() {
		return llaveMotivo;
	}

	public void setLlaveMotivo(String llaveMotivo) {
		this.llaveMotivo = llaveMotivo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getFechaReimpresion() {
		return fechaReimpresion;
	}

	public void setFechaReimpresion(String fechaReimpresion) {
		this.fechaReimpresion = fechaReimpresion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
