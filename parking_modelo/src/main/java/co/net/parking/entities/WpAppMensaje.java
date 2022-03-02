package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_app_mensaje database table.
 * 
 */
@Entity
@Table(name="wp_app_mensaje")
@NamedQueries({
@NamedQuery(name="WpAppMensaje.ListaMensajesUsuario", query="SELECT w FROM WpAppMensaje w WHERE identificacion=:identificacion and estado<>:estado ORDER BY id desc"),
@NamedQuery(name="WpAppMensaje.ById", query="SELECT w FROM WpAppMensaje w WHERE id=:id")})
public class WpAppMensaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int estado;

	private String identificacion;

	@Lob
	private String mensaje;

	private String titulo;

	public WpAppMensaje() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}