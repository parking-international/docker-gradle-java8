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
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name="RUEDAZ_TOKEN")
@NamedQueries({
	@NamedQuery(name="ConsultarToken", query="SELECT w FROM RuedazToken w WHERE w.identificacion=:identificacion"),
    })
public class RuedazToken implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "TOKEN")
	private String token;

	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "FECHA")
	private String fecha;
	
	@Column(name = "IDENTIFICACION")
	private String identificacion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
