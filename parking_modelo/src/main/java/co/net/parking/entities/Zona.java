package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the zonas database table.
 * 
 */
@Entity
@Table(name="zonas")
@NamedQuery(name="Zona.findAll", query="SELECT z FROM Zona z Where z.estado=1 order by nombreZona")
@XmlRootElement
public class Zona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="cod_admin")
	private String codAdmin;

	@Column(name="cod_zona")
	private String codZona;

	private short distrito;

	private short estado;

	@Column(name="nombre_zona")
	private String nombreZona;

	@Column(name="puerto_tcp")
	private int puertoTcp;

	public Zona() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodAdmin() {
		return this.codAdmin;
	}

	public void setCodAdmin(String codAdmin) {
		this.codAdmin = codAdmin;
	}

	public String getCodZona() {
		return this.codZona;
	}

	public void setCodZona(String codZona) {
		this.codZona = codZona;
	}

	public short getDistrito() {
		return this.distrito;
	}

	public void setDistrito(short distrito) {
		this.distrito = distrito;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getNombreZona() {
		return this.nombreZona;
	}

	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}

	public int getPuertoTcp() {
		return this.puertoTcp;
	}

	public void setPuertoTcp(int puertoTcp) {
		this.puertoTcp = puertoTcp;
	}

}