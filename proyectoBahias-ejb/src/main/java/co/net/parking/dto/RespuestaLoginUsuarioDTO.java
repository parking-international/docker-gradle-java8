package co.net.parking.dto;

public class RespuestaLoginUsuarioDTO {
	
	private String nombre;
	private String apellido;
	private String codEmpleado;
	private String idInicioTurno;
	public String getIdInicioTurno() {
		return idInicioTurno;
	}
	public void setIdInicioTurno(String idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	
}
