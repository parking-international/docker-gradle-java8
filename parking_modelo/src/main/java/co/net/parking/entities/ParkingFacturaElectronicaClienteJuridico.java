package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="parking_factura_electronica_cliente_juridico")
@NamedQueries({ 
	@NamedQuery(name = "usuario.findJuridicoByIdentificacion", query = "SELECT t FROM ParkingFacturaElectronicaClienteJuridico t where t.numeroNit=:identificacion AND t.estado=1"),
//	@NamedQuery(name = "usuario.PaswordIdentificacion", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.identificacion=:identificacion AND t.password=:password AND  t.estado=1"),
//	@NamedQuery(name = "usuario.login", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.email=:email AND t.password=:password AND t.estado=1"),
//	@NamedQuery(name = "usuario.findByEmail", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.email=:email AND t.estado=1")
})  

public class ParkingFacturaElectronicaClienteJuridico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "tipo_identificacion")
	private int tipoIdentificacion;
	
	@Column(name = "numero_nit")
	private String numeroNit;
	
	@Column(name = "digito_verificacion")
	private String digitoVerificacion;
	
	@Column(name = "razon_social")
	private String razonSocial;

	private String  email;

	private String celular;
	

	private String direccion;
	
	private String ciudad;
	
	private int estado;
	
	private int creadoSAP;
	
	private int regimen;
	
		
@Column(name = "cod_municipio")
private String codMunicipio;

@Column(name = "acepta_terminos_condiciones")
private String aceptaTerminos;

@Column(name = "actividad_economica")
private String actividadEconomica;
	
	@Column(name = "fecha_creacion")
	private String fechaCreacion;
	
	@Column(name = "responsabilidad_fiscal")
	private int responsabilidadFiscal;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getCreadoSAP() {
		return creadoSAP;
	}

	public void setCreadoSAP(int creadoSAP) {
		this.creadoSAP = creadoSAP;
	}

	public int getRegimen() {
		return regimen;
	}

	public void setRegimen(int regimen) {
		this.regimen = regimen;
	}

	public String getNumeroNit() {
		return numeroNit;
	}

	public void setNumeroNit(String numeroNit) {
		this.numeroNit = numeroNit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getAceptaTerminos() {
		return aceptaTerminos;
	}

	public void setAceptaTerminos(String aceptaTerminos) {
		this.aceptaTerminos = aceptaTerminos;
	}

	public String getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	public String getDigitoVerificacion() {
		return digitoVerificacion;
	}

	public void setDigitoVerificacion(String digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}

	public int getResponsabilidadFiscal() {
		return responsabilidadFiscal;
	}

	public void setResponsabilidadFiscal(int responsabilidadFiscal) {
		this.responsabilidadFiscal = responsabilidadFiscal;
	}


}