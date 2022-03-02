package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_pago_digital_log_recarga_automatica")
@NamedQueries({ 
	})  

public class ParkingPagoDigitalLogRecargaAutomatica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@Column(name = "id_pago_digital_usuario")
	private int idPagoDigitalUsuario;
	
	@Column(name = "fecha_modificacion")
	private String fechaModificacion;
	
	
	private int renovar;


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


	public String getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public int getRenovar() {
		return renovar;
	}


	public void setRenovar(int renovar) {
		this.renovar = renovar;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}