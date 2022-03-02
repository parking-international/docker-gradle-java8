/**
 *
 */
package co.net.beparking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@Entity
@Table(name="BpCliente")
@NamedQueries({ @NamedQuery(name = "BpCliente.findAll", query = "SELECT t FROM BpCliente t"),
	@NamedQuery(name = "BpCliente.consultaPorCedula", query = "SELECT t FROM BpCliente t where t.cedula=:cedula"),
	@NamedQuery(name = "BpCliente.consultaPorCelular", query = "SELECT t FROM BpCliente t where t.celular=:celular"),
	@NamedQuery(name = "BpCliente.consultaPorCelularCedula", query = "SELECT t FROM BpCliente t where t.celular=:celular AND t.cedula!=:cedula"),
	@NamedQuery(name = "BpCliente.consultaPorEmailCedula", query = "SELECT t FROM BpCliente t where t.email=:email AND t.cedula!=:cedula"),
	@NamedQuery(name = "BpCliente.consultaPorEmail", query = "SELECT t FROM BpCliente t where t.email=:email"),
	@NamedQuery(name = "BpCliente.consultaPorCedulaActiva", query = "SELECT t FROM BpCliente t where t.cedula=:cedula and t.estadoAfiliado=:estadoAfiliado")
})
public class BpCliente implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 3705262335654913593L;


    @Id
    @Basic(optional=false)
    @Column(name="Cedula")
    private String cedula;

    @Basic(optional=false)
    @Column(name="Nombres")
    private String nombre;

    @Basic(optional=false)
    @Column(name="Apellidos")
    private String apellido;

    @Column(name="FechaNacimiento")
    private String fechaNacimiento;

    @Basic(optional=false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FechaIngresoPrograma")
    private Date fechaIngresoPrograma;

    @Column(name="Email")
    private String email;

    @Column(name="Celular")
    private String celular;

    @Column(name="Genero")
    private String genero;

    @Column(name="Direccion")
    private String direccion;

    @Column(name="CodCiudadresidencia")
    private String codCiudadresidencia;

    @Column(name="EstadoAfiliado")
    private String estadoAfiliado;

    @Column(name="AfiliadoPrepark")
    private String afiliadoPrepark;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FechaCreacion")
    private Date fechaCreacion;

    @Column(name="FechaActualizacion")
    private String fechaActualizacion;

    @Column(name="Observacion")
    private String observacion;

    @Column(name="CodigoAceptacion")
    private String codigoAceptacion;

    @Column(name="Nivel")
    private String nivel;

    @Column(name="Origen")
    private String origen;

    @Column(name="CodParqueadero")
    private String codParqueadero;

   
    /**
     * Devuelve el valor de cedula
     * @return El valor de cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece el valor de cedula
     * @param cedula El valor por establecer para cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Devuelve el valor de nombre
     * @return El valor de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor de nombre
     * @param nombre El valor por establecer para nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor de apellido
     * @return El valor de apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el valor de apellido
     * @param apellido El valor por establecer para apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Devuelve el valor de fechaIngresoPrograma
     * @return El valor de fechaIngresoPrograma
     */
    public Date getFechaIngresoPrograma() {
        return fechaIngresoPrograma;
    }

    /**
     * Establece el valor de fechaIngresoPrograma
     * @param fechaIngresoPrograma El valor por establecer para fechaIngresoPrograma
     */
    public void setFechaIngresoPrograma(Date fechaIngresoPrograma) {
        this.fechaIngresoPrograma = fechaIngresoPrograma;
    }

    /**
     * Devuelve el valor de email
     * @return El valor de email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el valor de email
     * @param email El valor por establecer para email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve el valor de celular
     * @return El valor de celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Establece el valor de celular
     * @param celular El valor por establecer para celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Devuelve el valor de genero
     * @return El valor de genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el valor de genero
     * @param genero El valor por establecer para genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Devuelve el valor de direccion
     * @return El valor de direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece el valor de direccion
     * @param direccion El valor por establecer para direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el valor de codCiudadresidencia
     * @return El valor de codCiudadresidencia
     */
    public String getCodCiudadresidencia() {
        return codCiudadresidencia;
    }

    /**
     * Establece el valor de codCiudadresidencia
     * @param codCiudadresidencia El valor por establecer para codCiudadresidencia
     */
    public void setCodCiudadresidencia(String codCiudadresidencia) {
        this.codCiudadresidencia = codCiudadresidencia;
    }

    /**
     * Devuelve el valor de estadoAfiliado
     * @return El valor de estadoAfiliado
     */
    public String getEstadoAfiliado() {
        return estadoAfiliado;
    }

    /**
     * Establece el valor de estadoAfiliado
     * @param estadoAfiliado El valor por establecer para estadoAfiliado
     */
    public void setEstadoAfiliado(String estadoAfiliado) {
        this.estadoAfiliado = estadoAfiliado;
    }

    /**
     * Devuelve el valor de afiliadoPrepark
     * @return El valor de afiliadoPrepark
     */
    public String getAfiliadoPrepark() {
        return afiliadoPrepark;
    }

    /**
     * Establece el valor de afiliadoPrepark
     * @param afiliadoPrepark El valor por establecer para afiliadoPrepark
     */
    public void setAfiliadoPrepark(String afiliadoPrepark) {
        this.afiliadoPrepark = afiliadoPrepark;
    }

    /**
     * Devuelve el valor de fechaCreacion
     * @return El valor de fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece el valor de fechaCreacion
     * @param fechaCreacion El valor por establecer para fechaCreacion
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    /**
     * Devuelve el valor de observacion
     * @return El valor de observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Establece el valor de observacion
     * @param observacion El valor por establecer para observacion
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * Devuelve el valor de codigoAceptacion
     * @return El valor de codigoAceptacion
     */
    public String getCodigoAceptacion() {
        return codigoAceptacion;
    }

    /**
     * Establece el valor de codigoAceptacion
     * @param codigoAceptacion El valor por establecer para codigoAceptacion
     */
    public void setCodigoAceptacion(String codigoAceptacion) {
        this.codigoAceptacion = codigoAceptacion;
    }

    /**
     * Devuelve el valor de nivel
     * @return El valor de nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Establece el valor de nivel
     * @param nivel El valor por establecer para nivel
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * Devuelve el valor de origen
     * @return El valor de origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el valor de origen
     * @param origen El valor por establecer para origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Devuelve el valor de codParqueadero
     * @return El valor de codParqueadero
     */
    public String getCodParqueadero() {
        return codParqueadero;
    }

    /**
     * Establece el valor de codParqueadero
     * @param codParqueadero El valor por establecer para codParqueadero
     */
    public void setCodParqueadero(String codParqueadero) {
        this.codParqueadero = codParqueadero;
    }

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

   



}
