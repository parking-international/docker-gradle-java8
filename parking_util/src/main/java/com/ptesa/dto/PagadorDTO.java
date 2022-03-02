package com.ptesa.dto;

/**
 * DTO que permite ARMAR EL OBJETO de datos que recibe PTESA para crear un pagador a PTESA
 * @author kayala
 *
 */
public class PagadorDTO {
	
	
	/**
	 * parametros base para todas las solicitudes
	 */
	private String origen;
	private String usuario;
	private String canal;
	private String codigoVerificacion;
	private String idOrganizacion;
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getCodigoVerificacion() {
		return codigoVerificacion;
	}

	public void setCodigoVerificacion(String codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}

	public String getIdOrganizacion() {
		return idOrganizacion;
	}

	public void setIdOrganizacion(String idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}

	/**
	 * datos del pagador
	 */
	
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private String telefonoCelula;
	private String telefonoFijo;
	private String tipoIdentificacion;
	private String numeroIdentificacion;
	private String fechaNacimiento;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTelefonoCelula() {
		return telefonoCelula;
	}

	public void setTelefonoCelula(String telefonoCelula) {
		this.telefonoCelula = telefonoCelula;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


}
