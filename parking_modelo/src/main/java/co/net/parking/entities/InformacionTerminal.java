package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the informacion_terminal database table.
 * 
 */
@Entity
@Table(name="informacion_terminal")
@NamedQuery(name="InformacionTerminal.findAll", query="SELECT i FROM InformacionTerminal i")
public class InformacionTerminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="cod_terminal")
	private String codTerminal;

	@Column(name="direccion_ip")
	private String direccionIp;

	@Column(name="fecha_actualizacion")
	private String fechaActualizacion;

	@Column(name="puerto_tcp")
	private String puertoTcp;

	@Column(name="version_mysql")
	private String versionMysql;
	
	@Column(name="version_java")
	private String versionJava;
	
	@Column(name="integra_datafono")
	private int integraDatafono;
	
	@Column(name="conf_terminal_local")
	private String configTerminal;
	
	@Column(name="datos_facturacion")
	private String datosFacturacion;
	
	public String getDatosFacturacion() {
		return datosFacturacion;
	}

	public void setDatosFacturacion(String datosFacturacion) {
		this.datosFacturacion = datosFacturacion;
	}

	public String getPoliza() {
		return poliza;
	}

	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}

	@Column(name="poliza")
	private String poliza;

	public InformacionTerminal() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getDireccionIp() {
		return this.direccionIp;
	}

	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}

	public String getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getPuertoTcp() {
		return this.puertoTcp;
	}

	public void setPuertoTcp(String puertoTcp) {
		this.puertoTcp = puertoTcp;
	}

	public String getVersionMysql() {
		return this.versionMysql;
	}

	public void setVersionMysql(String versionMysql) {
		this.versionMysql = versionMysql;
	}

	public String getVersionJava() {
		return versionJava;
	}

	public void setVersionJava(String versionJava) {
		this.versionJava = versionJava;
	}

	public int getIntegraDatafono() {
		return integraDatafono;
	}

	public void setIntegraDatafono(int integraDatafono) {
		this.integraDatafono = integraDatafono;
	}

	public String getConfigTerminal() {
		return configTerminal;
	}

	public void setConfigTerminal(String configTerminal) {
		this.configTerminal = configTerminal;
	}

}