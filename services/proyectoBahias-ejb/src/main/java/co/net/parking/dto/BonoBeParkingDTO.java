package co.net.parking.dto;

public class BonoBeParkingDTO {

	private String CodBono;
	private String DescripcionTipoBono;
	private int Duracion = 0;
	public String getCodBono() {
		return CodBono;
	}
	public void setCodBono(String codBono) {
		CodBono = codBono;
	}
	public int getDuracion() {
		return Duracion;
	}
	public void setDuracion(int duracion) {
		Duracion = duracion;
	}
	public String getDescripcionTipoBono() {
		return DescripcionTipoBono;
	}
	public void setDescripcionTipoBono(String descripcionTipoBono) {
		DescripcionTipoBono = descripcionTipoBono;
	}


}