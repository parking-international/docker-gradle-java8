package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parking_pago_digital_minimo_valor_ingreso")

public class ParkingPagoDigitalMinimoValorIngreso {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="minimo_valor_ingreso")
	private int minimoValorIngreso;
	@Column(name ="minimo_valor_recarga")
	private int minimoValorRecarga;
	@Column(name="estado")
	private int estado;
	
	public ParkingPagoDigitalMinimoValorIngreso() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMinimoValorIngreso() {
		return minimoValorIngreso;
	}

	public void setMinimoValorIngreso(int minimoValorIngreso) {
		this.minimoValorIngreso = minimoValorIngreso;
	}

	public int getMinimoValorRecarga() {
		return minimoValorRecarga;
	}

	public void setMinimoValorRecarga(int minimoValorRecarga) {
		this.minimoValorRecarga = minimoValorRecarga;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
