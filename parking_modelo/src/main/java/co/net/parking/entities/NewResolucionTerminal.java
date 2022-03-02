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
 * The persistent class for the new_resolucion_terminal database table.
 * 
 */
@Entity
@Table(name = "new_resolucion_terminal")

@NamedQueries({@NamedQuery(name = "NewResolucionTerminal.findAll", query = "SELECT i FROM NewResolucionTerminal i"),
	@NamedQuery(name = "NewResolucionTerminal.findByIdTerminal", query = " SELECT i FROM NewResolucionTerminal i WHERE i.idTerminal = :idTerminal AND i.estado = 1 "),
	@NamedQuery(name = "NewResolucionTerminal.findByCodTerminal", query = " SELECT i FROM NewResolucionTerminal i WHERE i.codTerminal = :codTerminal AND i.estado = 1 ")
})

public class NewResolucionTerminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Id") private Long id;

	@Column(name = "id_terminal") private Long idTerminal;

	@Column(name = "numero_resolucion") private Long numeroResolucion;

	@Column(name = "fecha_inicial") private String fechaInicial;

	@Column(name = "fecha_final") private String fechaFinal;

	@Column(name = "rango_inicial") private Long rangoInicial;

	@Column(name = "rango_final") private Long rangoFinal;

	@Column(name = "id_tipo_solicitud") private Long idTipoSolicitud;

	@Column(name = "ultima_factura") private Long ultimaFactura;

	@Column(name = "estado") private Long estado;
	
	@Column(name = "cod_terminal") private String codTerminal;

	public NewResolucionTerminal() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(Long idTerminal) {
		this.idTerminal = idTerminal;
	}

	public Long getNumeroResolucion() {
		return numeroResolucion;
	}

	public void setNumeroResolucion(Long numeroResolucion) {
		this.numeroResolucion = numeroResolucion;
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

	public Long getRangoInicial() {
		return rangoInicial;
	}

	public void setRangoInicial(Long rangoInicial) {
		this.rangoInicial = rangoInicial;
	}

	public Long getRangoFinal() {
		return rangoFinal;
	}

	public void setRangoFinal(Long rangoFinal) {
		this.rangoFinal = rangoFinal;
	}

	public Long getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public void setIdTipoSolicitud(Long idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}

	public Long getUltimaFactura() {
		return ultimaFactura;
	}

	public void setUltimaFactura(Long ultimaFactura) {
		this.ultimaFactura = ultimaFactura;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

}
