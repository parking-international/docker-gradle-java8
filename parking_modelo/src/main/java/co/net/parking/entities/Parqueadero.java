/**
 *
 */
package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
@NamedQueries({ 
	@NamedQuery(name = "Parqueadero.findAll", query = "SELECT r FROM Parqueadero r WHERE r.estado=1"),
	@NamedQuery(name = "Parqueadero.findAllRuedaz", query = "SELECT r FROM Parqueadero r WHERE r.estado=1 and r.plus=1 and r.puntoValet<>1"),
	@NamedQuery(name = "Parqueadero.findCodPark", query = "SELECT r FROM Parqueadero r WHERE r.estado=1  and r.codPark=:codPark"),
    @NamedQuery(name = "Parqueadero.findNameByCodPark", query = "SELECT r.nombrePark FROM Parqueadero r WHERE r.codPark = :codPark"),
	@NamedQuery(name="CuposMensual",query="SELECT p FROM Parqueadero p WHERE p.codPark=:codPark"),
	@NamedQuery(name="Parqueadero.VehiculoElectrico",query="SELECT p FROM Parqueadero p WHERE p.vehiculoElectrico=1 AND p.estado=1"),
	@NamedQuery(name="ParqueaderoPlazas",query="SELECT p FROM Parqueadero p WHERE p.plazas>50 AND p.estado=1")
	})  
	

public class Parqueadero implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 7412384990446951117L;

	@Id
	@Column(name = "cod_park")
	@Basic(optional = false)
	private String codPark;

	@Column(name = "cod_empresa")
	@Basic(optional = false)
	private String codEmpresa;

	@Column(name = "nombre_park")
	@Basic(optional = false)
	private String nombrePark;

	private String direccion;

	private String telefono;

	@Column(name = "centro_costos")
	private String centroCosto;

	private Integer plazas;

	@Column(name = "plazas_ocupadas")
	private Integer plazasOcupadas;

	@Column(name = "fecha_apertura")
	@Temporal(TemporalType.DATE)
	private Date fechaApertura;

	@Column(name = "fecha_cierre")
	@Temporal(TemporalType.DATE)
	private Date fechaCierre;

	@Basic(optional = false)
	private Integer terminales;

	@Column(name = "cod_zona")
	private String codZona;

	private Integer estado;

	private Integer propietarios;

	private Integer taxicard;

	@Column(name = "cierre_ope1")
	private String cierreOpe;

	private Integer seguridad;

	private String latitud;

	private String longitud;

	private String scripts;

	@Column(name = "id_actividad")
	private Integer idActividad;

	@Column(name = "id_ciudad")
	private String idCiudad;

	@Column(name = "id_zona_park")
	private Integer idZonaPark;

	@Column(name = "cc_sistemas_uno")
	private String ccSistemasUno;

	@Column(name = "check_proceso")
	private Integer checkProceso;

	private Integer bicicletas;

	private Integer motos;

	@Column(name = "nombre_comercial")
	private String nombreComercial;

	@Column(name = "zona_clientes")
	private String zonaClientes;

	private Boolean sistema;

	@Column(name = "punto_valet")
	private Boolean puntoValet;

	@Column(name = "cupos_mensual_carro")
	private Integer cuposMensualCarro;

	@Column(name = "cupos_mensual_moto")
	private Integer cuposMensualMoto;

	private Integer nivel;

	@Column(name = "veinticuatro_HH")
	private Integer veinticuatroHH;

	private Integer reservas;
	
	private Integer automatizado;
	
	private Integer alianza;

	
	@Column(name = "plazas_carro")
	private Integer plazasCarro;
	
	@Column(name = "plazas_moto")
	private Integer plazasMoto;
	
	@Column(name = "plazas_bicicleta")
	private Integer plazasBicicleta;
	
	private Integer proyecto;
	
	private Integer cuposReservas;
	
	private Integer vehiculoElectrico;
	
	private Integer plus;
	
	public Integer getAlianza() {
		return alianza;
	}

	public void setAlianza(Integer alianza) {
		this.alianza = alianza;
	}

	private Integer mensuales;

	/**
	 * Devuelve el valor de codPark
	 * 
	 * @return El valor de codPark
	 */
	public String getCodPark() {
		return codPark;
	}

	/**
	 * Establece el valor de codPark
	 * 
	 * @param codPark
	 *            El valor por establecer para codPark
	 */
	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	/**
	 * Devuelve el valor de codEmpresa
	 * 
	 * @return El valor de codEmpresa
	 */
	public String getCodEmpresa() {
		return codEmpresa;
	}

	/**
	 * Establece el valor de codEmpresa
	 * 
	 * @param codEmpresa
	 *            El valor por establecer para codEmpresa
	 */
	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	/**
	 * Devuelve el valor de nombrePark
	 * 
	 * @return El valor de nombrePark
	 */
	public String getNombrePark() {
		return nombrePark;
	}

	/**
	 * Establece el valor de nombrePark
	 * 
	 * @param nombrePark
	 *            El valor por establecer para nombrePark
	 */
	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}

	/**
	 * Devuelve el valor de direccion
	 * 
	 * @return El valor de direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece el valor de direccion
	 * 
	 * @param direccion
	 *            El valor por establecer para direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devuelve el valor de telefono
	 * 
	 * @return El valor de telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece el valor de telefono
	 * 
	 * @param telefono
	 *            El valor por establecer para telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Devuelve el valor de centroCosto
	 * 
	 * @return El valor de centroCosto
	 */
	public String getCentroCosto() {
		return centroCosto;
	}

	/**
	 * Establece el valor de centroCosto
	 * 
	 * @param centroCosto
	 *            El valor por establecer para centroCosto
	 */
	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	/**
	 * Devuelve el valor de plazas
	 * 
	 * @return El valor de plazas
	 */
	public Integer getPlazas() {
		return plazas;
	}

	/**
	 * Establece el valor de plazas
	 * 
	 * @param plazas
	 *            El valor por establecer para plazas
	 */
	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}

	/**
	 * Devuelve el valor de plazasOcupadas
	 * 
	 * @return El valor de plazasOcupadas
	 */
	public Integer getPlazasOcupadas() {
		return plazasOcupadas;
	}

	/**
	 * Establece el valor de plazasOcupadas
	 * 
	 * @param plazasOcupadas
	 *            El valor por establecer para plazasOcupadas
	 */
	public void setPlazasOcupadas(Integer plazasOcupadas) {
		this.plazasOcupadas = plazasOcupadas;
	}

	/**
	 * Devuelve el valor de fechaApertura
	 * 
	 * @return El valor de fechaApertura
	 */
	public Date getFechaApertura() {
		return fechaApertura;
	}

	/**
	 * Establece el valor de fechaApertura
	 * 
	 * @param fechaApertura
	 *            El valor por establecer para fechaApertura
	 */
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	/**
	 * Devuelve el valor de fechaCierre
	 * 
	 * @return El valor de fechaCierre
	 */
	public Date getFechaCierre() {
		return fechaCierre;
	}

	/**
	 * Establece el valor de fechaCierre
	 * 
	 * @param fechaCierre
	 *            El valor por establecer para fechaCierre
	 */
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	/**
	 * Devuelve el valor de terminales
	 * 
	 * @return El valor de terminales
	 */
	public Integer getTerminales() {
		return terminales;
	}

	/**
	 * Establece el valor de terminales
	 * 
	 * @param terminales
	 *            El valor por establecer para terminales
	 */
	public void setTerminales(Integer terminales) {
		this.terminales = terminales;
	}

	/**
	 * Devuelve el valor de codZona
	 * 
	 * @return El valor de codZona
	 */
	public String getCodZona() {
		return codZona;
	}

	/**
	 * Establece el valor de codZona
	 * 
	 * @param codZona
	 *            El valor por establecer para codZona
	 */
	public void setCodZona(String codZona) {
		this.codZona = codZona;
	}

	/**
	 * Devuelve el valor de estado
	 * 
	 * @return El valor de estado
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * Establece el valor de estado
	 * 
	 * @param estado
	 *            El valor por establecer para estado
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve el valor de propietarios
	 * 
	 * @return El valor de propietarios
	 */
	public Integer getPropietarios() {
		return propietarios;
	}

	/**
	 * Establece el valor de propietarios
	 * 
	 * @param propietarios
	 *            El valor por establecer para propietarios
	 */
	public void setPropietarios(Integer propietarios) {
		this.propietarios = propietarios;
	}

	/**
	 * Devuelve el valor de taxicard
	 * 
	 * @return El valor de taxicard
	 */
	public Integer getTaxicard() {
		return taxicard;
	}

	/**
	 * Establece el valor de taxicard
	 * 
	 * @param taxicard
	 *            El valor por establecer para taxicard
	 */
	public void setTaxicard(Integer taxicard) {
		this.taxicard = taxicard;
	}

	/**
	 * Devuelve el valor de cierreOpe
	 * 
	 * @return El valor de cierreOpe
	 */
	public String getCierreOpe() {
		return cierreOpe;
	}

	/**
	 * Establece el valor de cierreOpe
	 * 
	 * @param cierreOpe
	 *            El valor por establecer para cierreOpe
	 */
	public void setCierreOpe(String cierreOpe) {
		this.cierreOpe = cierreOpe;
	}

	/**
	 * Devuelve el valor de seguridad
	 * 
	 * @return El valor de seguridad
	 */
	public Integer getSeguridad() {
		return seguridad;
	}

	/**
	 * Establece el valor de seguridad
	 * 
	 * @param seguridad
	 *            El valor por establecer para seguridad
	 */
	public void setSeguridad(Integer seguridad) {
		this.seguridad = seguridad;
	}

	/**
	 * Devuelve el valor de latitud
	 * 
	 * @return El valor de latitud
	 */
	public String getLatitud() {
		return latitud;
	}

	/**
	 * Establece el valor de latitud
	 * 
	 * @param latitud
	 *            El valor por establecer para latitud
	 */
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	/**
	 * Devuelve el valor de longitud
	 * 
	 * @return El valor de longitud
	 */
	public String getLongitud() {
		return longitud;
	}

	/**
	 * Establece el valor de longitud
	 * 
	 * @param longitud
	 *            El valor por establecer para longitud
	 */
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	/**
	 * Devuelve el valor de scripts
	 * 
	 * @return El valor de scripts
	 */
	public String getScripts() {
		return scripts;
	}

	/**
	 * Establece el valor de scripts
	 * 
	 * @param scripts
	 *            El valor por establecer para scripts
	 */
	public void setScripts(String scripts) {
		this.scripts = scripts;
	}

	/**
	 * Devuelve el valor de idActividad
	 * 
	 * @return El valor de idActividad
	 */
	public Integer getIdActividad() {
		return idActividad;
	}

	/**
	 * Establece el valor de idActividad
	 * 
	 * @param idActividad
	 *            El valor por establecer para idActividad
	 */
	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	/**
	 * Devuelve el valor de idCiudad
	 * 
	 * @return El valor de idCiudad
	 */
	public String getIdCiudad() {
		return idCiudad;
	}

	/**
	 * Establece el valor de idCiudad
	 * 
	 * @param idCiudad
	 *            El valor por establecer para idCiudad
	 */
	public void setIdCiudad(String idCiudad) {
		this.idCiudad = idCiudad;
	}

	/**
	 * Devuelve el valor de idZonaPark
	 * 
	 * @return El valor de idZonaPark
	 */
	public Integer getIdZonaPark() {
		return idZonaPark;
	}

	/**
	 * Establece el valor de idZonaPark
	 * 
	 * @param idZonaPark
	 *            El valor por establecer para idZonaPark
	 */
	public void setIdZonaPark(Integer idZonaPark) {
		this.idZonaPark = idZonaPark;
	}

	/**
	 * Devuelve el valor de ccSistemasUno
	 * 
	 * @return El valor de ccSistemasUno
	 */
	public String getCcSistemasUno() {
		return ccSistemasUno;
	}

	/**
	 * Establece el valor de ccSistemasUno
	 * 
	 * @param ccSistemasUno
	 *            El valor por establecer para ccSistemasUno
	 */
	public void setCcSistemasUno(String ccSistemasUno) {
		this.ccSistemasUno = ccSistemasUno;
	}

	/**
	 * Devuelve el valor de checkProceso
	 * 
	 * @return El valor de checkProceso
	 */
	public Integer getCheckProceso() {
		return checkProceso;
	}

	/**
	 * Establece el valor de checkProceso
	 * 
	 * @param checkProceso
	 *            El valor por establecer para checkProceso
	 */
	public void setCheckProceso(Integer checkProceso) {
		this.checkProceso = checkProceso;
	}

	/**
	 * Devuelve el valor de bicicletas
	 * 
	 * @return El valor de bicicletas
	 */
	public Integer getBicicletas() {
		return bicicletas;
	}

	/**
	 * Establece el valor de bicicletas
	 * 
	 * @param bicicletas
	 *            El valor por establecer para bicicletas
	 */
	public void setBicicletas(Integer bicicletas) {
		this.bicicletas = bicicletas;
	}

	/**
	 * Devuelve el valor de motos
	 * 
	 * @return El valor de motos
	 */
	public Integer getMotos() {
		return motos;
	}

	/**
	 * Establece el valor de motos
	 * 
	 * @param motos
	 *            El valor por establecer para motos
	 */
	public void setMotos(Integer motos) {
		this.motos = motos;
	}

	/**
	 * Devuelve el valor de nombreComercial
	 * 
	 * @return El valor de nombreComercial
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}

	/**
	 * Establece el valor de nombreComercial
	 * 
	 * @param nombreComercial
	 *            El valor por establecer para nombreComercial
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	/**
	 * Devuelve el valor de zonaClientes
	 * 
	 * @return El valor de zonaClientes
	 */
	public String getZonaClientes() {
		return zonaClientes;
	}

	/**
	 * Establece el valor de zonaClientes
	 * 
	 * @param zonaClientes
	 *            El valor por establecer para zonaClientes
	 */
	public void setZonaClientes(String zonaClientes) {
		this.zonaClientes = zonaClientes;
	}

	/**
	 * Devuelve el valor de sistema
	 * 
	 * @return El valor de sistema
	 */
	public Boolean getSistema() {
		return sistema;
	}

	/**
	 * Establece el valor de sistema
	 * 
	 * @param sistema
	 *            El valor por establecer para sistema
	 */
	public void setSistema(Boolean sistema) {
		this.sistema = sistema;
	}

	/**
	 * Devuelve el valor de puntoValet
	 * 
	 * @return El valor de puntoValet
	 */
	public Boolean getPuntoValet() {
		return puntoValet;
	}

	/**
	 * Establece el valor de puntoValet
	 * 
	 * @param puntoValet
	 *            El valor por establecer para puntoValet
	 */
	public void setPuntoValet(Boolean puntoValet) {
		this.puntoValet = puntoValet;
	}

	/**
	 * Devuelve el valor de cuposMensualCarro
	 * 
	 * @return El valor de cuposMensualCarro
	 */
	public Integer getCuposMensualCarro() {
		return cuposMensualCarro;
	}

	/**
	 * Establece el valor de cuposMensualCarro
	 * 
	 * @param cuposMensualCarro
	 *            El valor por establecer para cuposMensualCarro
	 */
	public void setCuposMensualCarro(Integer cuposMensualCarro) {
		this.cuposMensualCarro = cuposMensualCarro;
	}

	/**
	 * Devuelve el valor de cuposMensualMoto
	 * 
	 * @return El valor de cuposMensualMoto
	 */
	public Integer getCuposMensualMoto() {
		return cuposMensualMoto;
	}

	/**
	 * Establece el valor de cuposMensualMoto
	 * 
	 * @param cuposMensualMoto
	 *            El valor por establecer para cuposMensualMoto
	 */
	public void setCuposMensualMoto(Integer cuposMensualMoto) {
		this.cuposMensualMoto = cuposMensualMoto;
	}

	/**
	 * Devuelve el valor de nivel
	 * 
	 * @return El valor de nivel
	 */
	public Integer getNivel() {
		return nivel;
	}

	/**
	 * Establece el valor de nivel
	 * 
	 * @param nivel
	 *            El valor por establecer para nivel
	 */
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getVeinticuatroHH() {
		return veinticuatroHH;
	}

	public void setVeinticuatroHH(Integer veinticuatroHH) {
		this.veinticuatroHH = veinticuatroHH;
	}

	/**
	 * Devuelve el valor de reservas
	 * 
	 * @return El valor de reservas
	 */
	public Integer getReservas() {
		return reservas;
	}

	/**
	 * Establece el valor de reservas
	 * 
	 * @param reserva
	 *            El valor por establecer para reservas
	 */
	public void setReservas(Integer reservas) {
		this.reservas = reservas;
	}

	/**
	 * Devuelve el valor de automatizado
	 * 
	 * @return El valor de automatizado
	 */
	public Integer getAutomatizado() {
		return automatizado;
	}

	/**
	 * Establece el valor de automatizado
	 * 
	 * @param reserva
	 *            El valor por establecer para automatizado
	 */
	public void setAutomatizado(Integer automatizado) {
		this.automatizado = automatizado;
	}

	public Integer getMensuales() {
		
		return mensuales;
	}

	public void setMensuales(Integer mensuales) {
		this.mensuales = mensuales;
	}

	public Integer getPlazasCarro() {
		return plazasCarro;
	}

	public void setPlazasCarro(Integer plazasCarro) {
		this.plazasCarro = plazasCarro;
	}

	public Integer getPlazasMoto() {
		return plazasMoto;
	}

	public void setPlazasMoto(Integer plazasMoto) {
		this.plazasMoto = plazasMoto;
	}

	public Integer getPlazasBicicleta() {
		return plazasBicicleta;
	}

	public void setPlazasBicicleta(Integer plazasBicicleta) {
		this.plazasBicicleta = plazasBicicleta;
	}

	public Integer getProyecto() {
		return proyecto;
	}

	public void setProyecto(Integer proyecto) {
		this.proyecto = proyecto;
	}

	public Integer getCuposReservas() {
		return cuposReservas;
	}

	public void setCuposReservas(Integer cuposReservas) {
		this.cuposReservas = cuposReservas;
	}

	public Integer getVehiculoElectrico() {
		return vehiculoElectrico;
	}

	public void setVehiculoElectrico(Integer vehiculoElectrico) {
		this.vehiculoElectrico = vehiculoElectrico;
	}
	
	

	public Integer getPlus() {
		return plus;
	}

	public void setPlus(Integer plus) {
		this.plus = plus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parqueadero [codPark=");
		builder.append(codPark);
		builder.append(", codEmpresa=");
		builder.append(codEmpresa);
		builder.append(", nombrePark=");
		builder.append(nombrePark);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", centroCosto=");
		builder.append(centroCosto);
		builder.append(", idActividad=");
		builder.append(idActividad);
		builder.append(", idCiudad=");
		builder.append(idCiudad);
		builder.append(", idZonaPark=");
		builder.append(idZonaPark);
		builder.append(", nombreComercial=");
		builder.append(nombreComercial);
		builder.append("]");
		return builder.toString();
	}


}
