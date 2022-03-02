package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name="cliente_emobi")
@NamedQueries({
    @NamedQuery(name="ConsultaClienteEmobi",query="SELECT c FROM ClienteEmobi c WHERE c.identificacion=:identificacion"),
    })
public class ClienteEmobi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String identificacion;

	private String nombre;


	public ClienteEmobi() {
	}

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}