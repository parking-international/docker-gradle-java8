package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_app_usuario_contrato database table.
 * 
 */
@Entity
@Table(name="wp_app_token_new")
@NamedQueries({
@NamedQuery(name="WpAppTokenNew.findByToken", query="SELECT w FROM WpAppTokenNew w WHERE w.token=:token"),
@NamedQuery(name="ConsultarTokenWP", query="SELECT w FROM WpAppTokenNew w WHERE w.identificacion=:identificacion"),
@NamedQuery(name="AllToken", query="SELECT w FROM WpAppTokenNew w ")
})
public class WpAppTokenNew implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String token;

	private String tipo;
	
	private String fecha;
	
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

	

}