/**
 *
 */
package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
@Table(name = "seguridad_contacto")
@NamedQueries({@NamedQuery(name = "SeguridadContacto.findByTipo", query = "SELECT s FROM SeguridadContacto s WHERE s.estado=1 AND s.tipo=:tipo")})
public class SeguridadContacto implements Serializable {

	/**
	 * Devuelve el valor de tercero
	 * 
	 * @return El valor de tercero
	 */
	public Tercero getTercero() {
		return tercero;
	}

	/**
	 * Establece el valor de tercero
	 * 
	 * @param tercero El valor por establecer para tercero
	 */
	public void setTercero(Tercero tercero) {
		this.tercero = tercero;
	}

	/**
	 *
	 */
	private static final long serialVersionUID = -6705227704769187434L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;

	@Basic(optional = false)
	private String tipo;

	@Basic(optional = false) @Column(name = "cod_park_emp") private String codParkEmp;

	@Basic(optional = false) @Column(name = "id_tercero") private String idTercero;

	@Basic(optional = false) private Boolean estado;

	@ManyToOne(fetch = FetchType.EAGER) @JoinColumn(name = "id_tercero", referencedColumnName = "identificacion", nullable = false,
		insertable = false, updatable = false) private Tercero tercero;

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
	 * @param id El valor por establecer para id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Devuelve el valor de tipo
	 * 
	 * @return El valor de tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Establece el valor de tipo
	 * 
	 * @param tipo El valor por establecer para tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Devuelve el valor de codParkEmp
	 * 
	 * @return El valor de codParkEmp
	 */
	public String getCodParkEmp() {
		return codParkEmp;
	}

	/**
	 * Establece el valor de codParkEmp
	 * 
	 * @param codParkEmp El valor por establecer para codParkEmp
	 */
	public void setCodParkEmp(String codParkEmp) {
		this.codParkEmp = codParkEmp;
	}

	/**
	 * Devuelve el valor de idTercero
	 * 
	 * @return El valor de idTercero
	 */
	public String getIdTercero() {
		return idTercero;
	}

	/**
	 * Establece el valor de idTercero
	 * 
	 * @param idTercero El valor por establecer para idTercero
	 */
	public void setIdTercero(String idTercero) {
		this.idTercero = idTercero;
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
	 * @param estado El valor por establecer para estado
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


}
