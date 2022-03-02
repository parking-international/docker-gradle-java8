package co.net.parking.dto;

public class InformacionTerminalDTO {
	
	private String codTerminal;
	private String ipDireccion;
	private String puertoTcp;
	private String versionMysql;
	private String versionJava;
	private int integraDatafono;
	private String configTerminal;
	private String datosFacturacion;
	
	public String getPoliza() {
		return poliza;
	}
	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}
	private String poliza;
	
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public String getIpDireccion() {
		return ipDireccion;
	}
	public void setIpDireccion(String ipDireccion) {
		this.ipDireccion = ipDireccion;
	}
	public String getPuertoTcp() {
		return puertoTcp;
	}
	public void setPuertoTcp(String puertoTcp) {
		this.puertoTcp = puertoTcp;
	}
	public String getVersionMysql() {
		return versionMysql;
	}
	public void setVersionMysql(String versionMysql) {
		this.versionMysql = versionMysql;
	}
	public String getVersionJava() {
		return versionJava;
	}
	public void setVersionJava(String versionJava) {
		this.versionJava = versionJava;
	}
	public int getIntegraDatafono() {
		return integraDatafono;
	}
	public void setIntegraDatafono(int integraDatafono) {
		this.integraDatafono = integraDatafono;
	}
	public String getConfigTerminal() {
		return configTerminal;
	}
	public void setConfigTerminal(String configTerminal) {
		this.configTerminal = configTerminal;
	}
	public String getDatosFacturacion() {
		return datosFacturacion;
	}
	public void setDatosFacturacion(String datosFacturacion) {
		this.datosFacturacion = datosFacturacion;
	}
	
}
