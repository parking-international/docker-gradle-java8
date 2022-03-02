package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jesus.gomez
 *
 */
@Entity
@Table(name="parking_gopass_usuario_juridico")
public class GopassUsuarioJuridico implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="numero_nit")
	private String numeroNit;
	
	@Column(name="digito_verificacion")
	private int digitoVerificacion;
	
	@Column(name="razon_social")
	private String razonSocial;
	
	private String email;
	
	private String telefono;
	
	private String ciudad;
	
	private String direccion;
	
	private int estado;
	
	@Column(name="creadoSAP")
	private int creadoSAP;
	
	@Column(name="fechaCreacion")
	private String fechaCreacion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNumeroNit() {
		return numeroNit;
	}

	public void setNumeroNit(String numeroNit) {
		this.numeroNit = numeroNit;
	}

	public int getDigitoVerificacion() {
		return digitoVerificacion;
	}

	public void setDigitoVerificacion(int digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getCreadoSAP() {
		return creadoSAP;
	}

	public void setCreadoSAP(int creadoSAP) {
		this.creadoSAP = creadoSAP;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


}