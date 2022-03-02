package co.net.parking.entities;

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
@Table(name="reg_comp_perdido", schema="dbo")
@NamedQueries({
	@NamedQuery(name="RegCompPerdido.findAll", query="SELECT n FROM RegCompPerdido n")
})
public class RegCompPerdido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonIgnore
	private Long id;
	
	@Column(name = "cod_terminal")
	private String codTerminal;
	
	@Column(name = "id_turno")
	private Long idTurno;
	
	@Column(name = "num_factura")
	private Long numFactura;
	
	@Column(name = "valor_ef")
	private Long valorEfectivo;
	
	@Column(name = "valor_pp")
	private Long valorPrepark;
	
	@Column(name = "valor_datafono")
	private Long valorDatafono;
	
	@Column(name = "estado")
	private Integer estado;
	
	@Column(name = "fecha")
	private String fecha;

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

	public Long getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(Long num_factura) {
		this.numFactura = num_factura;
	}

	public Long getValorEfectivo() {
		return valorEfectivo;
	}

	public void setValorEfectivo(Long valorEfectivo) {
		this.valorEfectivo = valorEfectivo;
	}

	public Long getValorPrepark() {
		return valorPrepark;
	}

	public void setValorPrepark(Long valorPrepark) {
		this.valorPrepark = valorPrepark;
	}

	public Long getValorDatafono() {
		return valorDatafono;
	}

	public void setValorDatafono(Long valorDatafono) {
		this.valorDatafono = valorDatafono;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
}
