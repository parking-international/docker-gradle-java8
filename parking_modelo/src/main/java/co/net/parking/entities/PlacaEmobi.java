package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the placas_emobi database table.
 * 
 */
@Entity
@Table(name="placa_emobi")
@NamedQueries({
    @NamedQuery(name="ConsultaPlacasEmobi",query="SELECT p FROM PlacaEmobi p WHERE p.placaAutorizada=:placa"),
    })
public class PlacaEmobi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="placa_autorizada")
	private String placaAutorizada;

	public PlacaEmobi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlacaAutorizada() {
		return this.placaAutorizada;
	}

	public void setPlacaAutorizada(String placaAutorizada) {
		this.placaAutorizada = placaAutorizada;
	}

}