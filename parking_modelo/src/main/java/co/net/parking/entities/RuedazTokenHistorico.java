package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;


/**
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name="RUEDAZ_TOKEN_HISTORICO")
@NamedQueries({
	
    })
public class RuedazTokenHistorico implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "IDENTIFICACION")
	private String identificacion;

	@Column(name = "TOKEN")
	private String token;

	@Column(name = "FECHA_CAMBIO")
	private String fechaCambio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(String fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}