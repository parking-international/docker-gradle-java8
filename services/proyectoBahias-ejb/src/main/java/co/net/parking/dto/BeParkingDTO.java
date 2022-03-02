package co.net.parking.dto;

import java.util.List;

public class BeParkingDTO {
	
	public String  nombreCliente;
	public List<BonoBeParkingDTO> Bonos;
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public List<BonoBeParkingDTO> getBonos() {
		return Bonos;
	}
	public void setBonos(List<BonoBeParkingDTO> bonos) {
		Bonos = bonos;
	}
	
}
