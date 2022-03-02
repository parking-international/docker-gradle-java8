package co.net.parking.entities;



import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_pago_digital_billetera")
@NamedQueries({ 

	@NamedQuery(name = "consultaBilletera", query = "SELECT t FROM ParkingPagoDigitalBilletera t where t.idPagoDigitalUsuario=:idPagoDigitalUsuario"),

	@NamedQuery(name = "getUsuariosBilletera", query = "SELECT t FROM ParkingPagoDigitalBilletera t  ")

	})  

public class ParkingPagoDigitalBilletera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@Column(name = "id_pago_digital_usuario")
	private int idPagoDigitalUsuario;
	
	private int valor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPagoDigitalUsuario() {
		return idPagoDigitalUsuario;
	}

	public void setIdPagoDigitalUsuario(int idPagoDigitalUsuario) {
		this.idPagoDigitalUsuario = idPagoDigitalUsuario;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}