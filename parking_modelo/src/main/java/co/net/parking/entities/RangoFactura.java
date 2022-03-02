/**
 *
 */
package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que contiene el acceso a la tabla rango_facturas
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@Entity
@Table(name = "rango_facturas")
@NamedQueries({
		@NamedQuery(name = "RangoFactura.findByCodTerminal", query = "SELECT r FROM RangoFactura r WHERE r.codTerminal=:codTerminal AND r.estadoActualizacion=:estado AND r.estado=1"),
		@NamedQuery(name = "RangoFactura.findAll", query = "SELECT r FROM RangoFactura r "),
		@NamedQuery(name = "RangoFactura.byCodTerminalByResolucion", query = "SELECT r FROM RangoFactura r WHERE r.codTerminal=:codTerminal AND r.estado=1 AND r.resolucion.numResolucion=:numResolucion"),
		@NamedQuery(name = "RangoFactura.byCodTerminal", query = "SELECT r FROM RangoFactura r WHERE r.codTerminal=:codTerminal AND r.estado=1"),
		@NamedQuery(name = "RangoFactura.resolucionSinActualizar", query = "SELECT r FROM RangoFactura r WHERE r.estado=1 AND r.estadoActualizacion=:estado AND r.fechaModificacion<:fecha") })

@XmlRootElement
public class RangoFactura implements Serializable {

	private static final long serialVersionUID = -8291703284057484734L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cod_park")
	@Basic(optional = false)
	private String codPark;

	@Column(name = "rango_inicial")
	@Basic(optional = false)
	private Integer rangoInicial;

	@Column(name = "rango_final")
	@Basic(optional = false)
	private Integer rangoFinal;

	@Basic(optional = false)
	private Boolean estado;

	@Column(name = "cod_terminal")
	@Basic(optional = false)
	private String codTerminal;

	@Column(name = "estado_actualizacion")
	@Basic(optional = true)
	private Boolean estadoActualizacion;

	@Column(name = "fecha_modificacion")
	@Basic(optional = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "num_resolucion", nullable = false)
	private Resolucion resolucion;
	

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_park", nullable = false, insertable = false, updatable = false)
	private Parqueadero parqueadero;

	@Column(name = "frase_resolucion")
	private String fraseResolucion;

	/**
	 * Devuelve el valor de id
	 * 
	 * @return El valor de id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Establece el valor de id
	 * 
	 * @param id
	 *            El valor por establecer para id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Devuelve el valor de codPark
	 * 
	 * @return El valor de codPark
	 */
	public String getCodPark() {
		return codPark;
	}

	/**
	 * Establece el valor de codPark
	 * 
	 * @param codPark
	 *            El valor por establecer para codPark
	 */
	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	/**
	 * Devuelve el valor de rangoInicial
	 * 
	 * @return El valor de rangoInicial
	 */
	public Integer getRangoInicial() {
		return rangoInicial;
	}

	/**
	 * Establece el valor de rangoInicial
	 * 
	 * @param rangoInicial
	 *            El valor por establecer para rangoInicial
	 */
	public void setRangoInicial(Integer rangoInicial) {
		this.rangoInicial = rangoInicial;
	}

	/**
	 * Devuelve el valor de rangoFinal
	 * 
	 * @return El valor de rangoFinal
	 */
	public Integer getRangoFinal() {
		return rangoFinal;
	}

	/**
	 * Establece el valor de rangoFinal
	 * 
	 * @param rangoFinal
	 *            El valor por establecer para rangoFinal
	 */
	public void setRangoFinal(Integer rangoFinal) {
		this.rangoFinal = rangoFinal;
	}

	/**
	 * Devuelve el valor de estado
	 * 
	 * @return El valor de estado
	 */
	public Boolean getEstado() {
		return estado;
	}

	/**
	 * Establece el valor de estado
	 * 
	 * @param estado
	 *            El valor por establecer para estado
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve el valor de codTerminal
	 * 
	 * @return El valor de codTerminal
	 */
	public String getCodTerminal() {
		return codTerminal;
	}

	/**
	 * Establece el valor de codTerminal
	 * 
	 * @param codTerminal
	 *            El valor por establecer para codTerminal
	 */
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	/**
	 * Devuelve el valor de estadoActualizacion
	 * 
	 * @return El valor de estadoActualizacion
	 */
	public Boolean getEstadoActualizacion() {
		return estadoActualizacion;
	}

	/**
	 * Establece el valor de estadoActualizacion
	 * 
	 * @param estadoActualizacion
	 *            El valor por establecer para estadoActualizacion
	 */
	public void setEstadoActualizacion(Boolean estadoActualizacion) {
		this.estadoActualizacion = estadoActualizacion;
	}

	/**
	 * Devuelve el valor de fechaModificacion
	 * 
	 * @return El valor de fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * Establece el valor de fechaModificacion
	 * 
	 * @param fechaModificacion
	 *            El valor por establecer para fechaModificacion
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * Devuelve el valor de resolucion
	 * 
	 * @return El valor de resolucion
	 */
	public Resolucion getResolucion() {
		return resolucion;
	}

	/**
	 * Establece el valor de resolucion
	 * 
	 * @param resolucion
	 *            El valor por establecer para resolucion
	 */
	public void setResolucion(Resolucion resolucion) {
		this.resolucion = resolucion;
	}

	/**
	 * Devuelve el valor de parqueadero
	 * 
	 * @return El valor de parqueadero
	 */
	public Parqueadero getParqueadero() {
		return parqueadero;
	}

	/**
	 * Establece el valor de parqueadero
	 * 
	 * @param parqueadero
	 *            El valor por establecer para parqueadero
	 */
	public void setParqueadero(Parqueadero parqueadero) {
		this.parqueadero = parqueadero;
	}

	/**
	 * Devuelve el valor de frase resolucion
	 * 
	 * @return El valor de frase resolucion
	 */
	public String getFraseResolucion() {
		return fraseResolucion;
	}

	/**
	 * Establece el valor de fraseResolucion
	 * 
	 * @param fraseResolucion
	 *            El valor por establecer para fraseResolucion
	 */
	public void setFraseResolucion(String fraseResolucion) {
		this.fraseResolucion = fraseResolucion;
	}

}
