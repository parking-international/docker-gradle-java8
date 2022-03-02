package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_pago_digital_recibo_caja")
@NamedQueries({ 
		@NamedQuery(name = "reciboCaja", query = "SELECT t FROM ParkingPagoDigitalReciboCaja t ")
})  

public class ParkingPagoDigitalReciboCaja implements Serializable {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReciboCaja() {
		return reciboCaja;
	}

	public void setReciboCaja(int reciboCaja) {
		this.reciboCaja = reciboCaja;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "ultimo_recibo_caja")
	private int reciboCaja;
}