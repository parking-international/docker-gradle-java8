package co.net.parking.dto;

import java.util.List;

public class InformacionTerminalBahiasDTO {
	
	private String nombreEmpresa;
	private String nitEmpresa;
	private String codTerminal;
	private String codPark;
	private String nombrePark;
	private String direccion;
	private String horario;
	private int baseCaja;
	private String resolucion;
	private String poliza;
	private int tarifaCarro;
	private int tarifaMoto;
	private int tarifaBici;
	private int tipoTarifa;
	private int tiempoGracia;
	private List<ConveniosBahiasDTO> listaConvenios;
	
	
	
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getNitEmpresa() {
		return nitEmpresa;
	}
	public void setNitEmpresa(String nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	
	
	
	public int getTipoTarifa() {
		return tipoTarifa;
	}
	public void setTipoTarifa(int tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	public String getNombrePark() {
		return nombrePark;
	}
	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getBaseCaja() {
		return baseCaja;
	}
	public void setBaseCaja(int baseCaja) {
		this.baseCaja = baseCaja;
	}
	public String getCodPark() {
		return codPark;
	}
	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getPoliza() {
		return poliza;
	}
	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}

	public int getTarifaCarro() {
		return tarifaCarro;
	}
	public void setTarifaCarro(int tarifaCarro) {
		this.tarifaCarro = tarifaCarro;
	}
	public int getTarifaMoto() {
		return tarifaMoto;
	}
	public void setTarifaMoto(int tarifaMoto) {
		this.tarifaMoto = tarifaMoto;
	}
	public int getTarifaBici() {
		return tarifaBici;
	}
	public void setTarifaBici(int tarifaBici) {
		this.tarifaBici = tarifaBici;
	}
	public int getTiempoGracia() {
		return tiempoGracia;
	}
	public void setTiempoGracia(int tiempoGracia) {
		this.tiempoGracia = tiempoGracia;
	}
	public List<ConveniosBahiasDTO> getListaConvenios() {
		return listaConvenios;
	}
	public void setListaConvenios(List<ConveniosBahiasDTO> listaConvenios) {
		this.listaConvenios = listaConvenios;
	}

	

}
