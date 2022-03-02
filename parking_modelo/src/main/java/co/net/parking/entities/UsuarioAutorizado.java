package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario_autorizado database table.
 * 
 */
@Entity
@Table(name="usuario_autorizado")
@NamedQueries({
    @NamedQuery(name="UsuarioAutorizado.findAll", query="SELECT u FROM UsuarioAutorizado u"),
    @NamedQuery(name="UsuarioAutorizado.finByEstado",query="SELECT u FROM UsuarioAutorizado u WHERE u.estado=:estado")
})

public class UsuarioAutorizado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario_aut")
	private int idUsuarioAut;

	private String apellido;

	private boolean estado;

	private String login;

	private String nombre;

	private String password;

	public UsuarioAutorizado() {
	}

	public int getIdUsuarioAut() {
		return this.idUsuarioAut;
	}

	public void setIdUsuarioAut(int idUsuarioAut) {
		this.idUsuarioAut = idUsuarioAut;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}