/**
 *
 */
package co.net.datos.terminal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
public class Log {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;

	@Column(name = "cod_park")
	private String codPark;

	@Column(name = "cod_terminal")
	private String codTerminal;

	private String detalleLog;

	private String logErrores;

	private Date fecha = new Date();

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
	 * @param codPark El valor por establecer para codPark
	 */
	public void setCodPark(String codPark) {
		this.codPark = codPark;
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
	 * @param codTerminal El valor por establecer para codTerminal
	 */
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	/**
	 * Devuelve el valor de detalleLog
	 * 
	 * @return El valor de detalleLog
	 */
	public String getDetalleLog() {
		return detalleLog;
	}

	/**
	 * Establece el valor de detalleLog
	 * 
	 * @param detalleLog El valor por establecer para detalleLog
	 */
	public void setDetalleLog(String detalleLog) {
		this.detalleLog = detalleLog;
	}

	/**
	 * Devuelve el valor de logErrores
	 * 
	 * @return El valor de logErrores
	 */
	public String getLogErrores() {
		return logErrores;
	}

	/**
	 * Establece el valor de logErrores
	 * 
	 * @param logErrores El valor por establecer para logErrores
	 */
	public void setLogErrores(String logErrores) {
		this.logErrores = logErrores;
	}

	/**
	 * Devuelve el valor de fecha
	 * 
	 * @return El valor de fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Establece el valor de fecha
	 * 
	 * @param fecha El valor por establecer para fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



}
