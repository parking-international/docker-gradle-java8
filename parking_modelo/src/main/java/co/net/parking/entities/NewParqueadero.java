package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the new_parqueadero database table.
 * 
 */
@Entity
@Table(name = "new_parqueadero")

@NamedQueries
({@NamedQuery(name = "NewParqueadero.findAll", query = "SELECT e FROM NewParqueadero e"),
	@NamedQuery(name = "NewParqueadero.findCodEmpresaById", query = "SELECT e.codEmpresa FROM NewParqueadero e where e.id = :id and estado = 1"),
	@NamedQuery(name = "NewParqueadero.findCodParkById", query = "SELECT e.codPark FROM NewParqueadero e where e.id = :id and estado = 1")
})
public class NewParqueadero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	@Column(name = "proyecto") private Long proyecto;
	@Column(name = "cod_park") private String codPark;
	@Column(name = "nombre") private String nombre;
	@Column(name = "direccion") private String direccion;
	@Column(name = "latitud") private String latitud;
	@Column(name = "longitud") private String longitud;
	@Column(name = "cupos_carro") private Long cuposCarro;
	@Column(name = "cupos_moto") private Long cuposMoto;
	@Column(name = "cupos_bici") private Long cuposBici;
	@Column(name = "id_zona") private Long idZona;
	@Column(name = "cod_empresa") private String codEmpresa;
	@Column(name = "estado") private Long estado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProyecto() {
		return proyecto;
	}
	public void setProyecto(Long proyecto) {
		this.proyecto = proyecto;
	}
	public String getCodPark() {
		return codPark;
	}
	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public Long getCuposCarro() {
		return cuposCarro;
	}
	public void setCuposCarro(Long cuposCarro) {
		this.cuposCarro = cuposCarro;
	}
	public Long getCuposMoto() {
		return cuposMoto;
	}
	public void setCuposMoto(Long cuposMoto) {
		this.cuposMoto = cuposMoto;
	}
	public Long getCuposBici() {
		return cuposBici;
	}
	public void setCuposBici(Long cuposBici) {
		this.cuposBici = cuposBici;
	}
	public Long getIdZona() {
		return idZona;
	}
	public void setIdZona(Long idZona) {
		this.idZona = idZona;
	}
	public String getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public Long getEstado() {
		return estado;
	}
	public void setEstado(Long estado) {
		this.estado = estado;
	}
	
}
