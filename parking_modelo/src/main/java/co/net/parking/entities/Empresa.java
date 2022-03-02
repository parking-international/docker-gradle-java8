package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the empresa database table.
 * 
 */
@Entity
@Table(name="empresa")
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e Where codEmpresa = :codEmpresa and estado = 1")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_empresa")
	private String codEmpresa;

	@Column(name="actividad_economica")
	private int actividadEconomica;

	@Column(name="cod_empresa_sistemas_uno")
	private String codEmpresaSistemasUno;

	private String direccion;

	private String email;

	private short estado;

	private String fax;

	@Column(name="fecha_fin")
	private String fechaFin;

	@Column(name="fecha_ini")
	private String fechaIni;

	@Column(name="id_contribuyente")
	private int idContribuyente;

	@Column(name="id_tributaria")
	private int idTributaria;

	private String nit;

	private String nombre;

	private String telefono;

	public String getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public int getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(int actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	public String getCodEmpresaSistemasUno() {
		return codEmpresaSistemasUno;
	}

	public void setCodEmpresaSistemasUno(String codEmpresaSistemasUno) {
		this.codEmpresaSistemasUno = codEmpresaSistemasUno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}

	public int getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(int idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public int getIdTributaria() {
		return idTributaria;
	}

	public void setIdTributaria(int idTributaria) {
		this.idTributaria = idTributaria;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}