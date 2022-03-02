package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_app_usuario_contrato database table.
 * 
 */
@Entity
@Table(name="wp_app_usuario_contrato")
@NamedQuery(name="WpAppUsuarioContrato.findByCedula", query="SELECT w FROM WpAppUsuarioContrato w WHERE w.identificacion=:identificacion")
public class WpAppUsuarioContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String identificacion;

	@Column(name="numero_contrato")
	private String numeroContrato;

	public WpAppUsuarioContrato() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNumeroContrato() {
		return this.numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

}