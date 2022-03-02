package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_pago_digital_billetera_ingreso")
@NamedQueries({ 
	})  

public class ParkingPagoDigitalBilleteraIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@Column(name = "id_pago_digital_usuario")
	private int idPagoDigitalUsuario;
	
	@Column(name = "valor_recargado")
	private int valorRecargado;
	
	private String fecha;
	
	private String detalle;
	
	private int id_pago_digital_pasarela;

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

	public int getValorRecargado() {
		return valorRecargado;
	}

	public void setValorRecargado(int valorRecargado) {
		this.valorRecargado = valorRecargado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId_pago_digital_pasarela() {
		return id_pago_digital_pasarela;
	}

	public void setId_pago_digital_pasarela(int id_pago_digital_pasarela) {
		this.id_pago_digital_pasarela = id_pago_digital_pasarela;
	}

}