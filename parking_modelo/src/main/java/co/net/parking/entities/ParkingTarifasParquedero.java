package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parking_tarifas_parqueadero")
public class ParkingTarifasParquedero {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "cod_park")
	private String codPark;
	
	@Column(name = "tipo_tarifa")
	private int tipoTarifa;
	
	@Column(name = "tipo_vehiculo")
	private int tipoVehiculo;
	
	@Column(name = "dia")
	private String dia;
	
	@Column(name = "hora_inicial")
	private String horaIncial;
	
	@Column(name = "hora_final")
	private String horaFinal;
	
	@Column(name ="horas_plena")
	private int horasPlena;
	
	
	private int valor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public int getTipoTarifa() {
		return tipoTarifa;
	}

	public void setTipoTarifa(int tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getHoraIncial() {
		return horaIncial;
	}

	public void setHoraIncial(String horaIncial) {
		this.horaIncial = horaIncial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public int getHorasPlena() {
		return horasPlena;
	}

	public void setHorasPlena(int horasPlena) {
		this.horasPlena = horasPlena;
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
