package co.net.parking.dto;

public class OcupacionParqueaderoDTO {
	
	private int plazasCarro;
	private int plazasMoto;
	private int plazasBici;
	private int ocupacionCarro;
	private int ocupacionMoto;	
	private int ocupacionBicicleta;
	private int totalCupos;
	private int ocupados;
	private int disponibles;
	
	
	public int getTotalCupos() {
		return totalCupos;
	}
	public void setTotalCupos(int totalCupos) {
		this.totalCupos = totalCupos;
	}
	public int getOcupados() {
		return ocupados;
	}
	public void setOcupados(int ocupados) {
		this.ocupados = ocupados;
	}
	public int getDisponibles() {
		return disponibles;
	}
	public void setDisponibles(int disponibles) {
		this.disponibles = disponibles;
	}
	public int getPlazasCarro() {
		return plazasCarro;
	}
	public void setPlazasCarro(int plazasCarro) {
		this.plazasCarro = plazasCarro;
	}
	public int getPlazasMoto() {
		return plazasMoto;
	}
	public void setPlazasMoto(int plazasMoto) {
		this.plazasMoto = plazasMoto;
	}
	public int getPlazasBici() {
		return plazasBici;
	}
	public void setPlazasBici(int plazasBici) {
		this.plazasBici = plazasBici;
	}
	public int getOcupacionCarro() {
		return ocupacionCarro;
	}
	public void setOcupacionCarro(int ocupacionCarro) {
		this.ocupacionCarro = ocupacionCarro;
	}
	public int getOcupacionMoto() {
		return ocupacionMoto;
	}
	public void setOcupacionMoto(int ocupacionMoto) {
		this.ocupacionMoto = ocupacionMoto;
	}
	public int getOcupacionBicicleta() {
		return ocupacionBicicleta;
	}
	public void setOcupacionBicicleta(int ocupacionBicicleta) {
		this.ocupacionBicicleta = ocupacionBicicleta;
	}
	
}