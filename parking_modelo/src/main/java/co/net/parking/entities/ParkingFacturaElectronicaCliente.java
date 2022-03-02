package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="parking_factura_electronica_cliente_natural")
@NamedQueries({ 
	@NamedQuery(name = "usuario.findNaturalByIdentificacion", query = "SELECT t FROM ParkingFacturaElectronicaCliente t where t.identificacion=:identificacion AND t.estado=1"),
//	@NamedQuery(name = "usuario.PaswordIdentificacion", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.identificacion=:identificacion AND t.password=:password AND  t.estado=1"),
//	@NamedQuery(name = "usuario.login", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.email=:email AND t.password=:password AND t.estado=1"),
//	@NamedQuery(name = "usuario.findByEmail", query = "SELECT t FROM ParkingPagoDigitalUsuario t where t.email=:email AND t.estado=1")
})  

public class ParkingFacturaElectronicaCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "tipo_identificacion")
	private int tipoIdentificacion;
	
	private String identificacion;
	
	private String nombre;

	private String apellido;

	private String  email;

	private String celular;
	

	private String direccion;
	
	private String ciudad;
	
	private int estado;
	
	private int creadoSAP;
	
	private int regimen;
	
	private String fuente;
	
	@Column(name = "responsabilidad_fiscal")
	private int responsabilidadFiscal;
	
	@Column(name = "fecha_creacion")
	private String fechaCreacion;
		
	@Column(name = "cod_municipio")
	private String codMunicipio;
	
	@Column(name = "acepta_terminos_condiciones")
	private String aceptaTerminos;
	
	@Column(name = "actividad_economica")
	private String actividadEconomica;
	
	
	
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

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public int getResponsabilidadFiscal() {
		return responsabilidadFiscal;
	}

	public void setResponsabilidadFiscal(int responsabilidadFiscal) {
		this.responsabilidadFiscal = responsabilidadFiscal;
	}

}