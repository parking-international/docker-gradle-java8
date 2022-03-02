package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the codigos_emobi database table.
 * 
 */
@Entity
@Table(name="codigo_emobi")
@NamedQueries({
    @NamedQuery(name="ConsultaCodigosEmobi",query="SELECT c FROM CodigoEmobi c WHERE c.codigoAutorizado=:codigo"),
    })
public class CodigoEmobi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="codigo_autorizado")
	private String codigoAutorizado;

	public CodigoEmobi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoAutorizado() {
		return this.codigoAutorizado;
	}

	public void setCodigoAutorizado(String codigoAutorizado) {
		this.codigoAutorizado = codigoAutorizado;
	}

}