/**
 *
 */
package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
@Table(name="terceros")
@NamedQueries({
    @NamedQuery(name="ConsultaTercero",query="SELECT c FROM Tercero c WHERE  c.identificacion=:identificacion")
})


public class Tercero implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 5978066945539000019L;

    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Basic(optional=false)
    @Column(name="tipo_documento")
    private String tipoDocumento;

    @Basic(optional=false)
    private String identificacion;

    private Integer clase;

    @Column(name="nombre_rs")
    private String nombreRs;

    @Column(name="apellido_nc")
    private String apellidoNc;

    private String direccion1;

    private String direccion2;

    private String direccion3;

    private String telefono1;

    private String telefono2;

    private String email;

    @Column(name="tipo_tercero")
    private Integer tipoTercero;

    @Column(name="fecha_ini")
    private String fechaIni;

    @Column(name="fecha_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMod;

    private Integer estado;

    @Column(name="tel_movil_fax")
    private String telMovilFax;

    @Column(name="cod_empleado")
    private String codEmpleado;

    @Column(name="fecha_ini_suspension")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIniSuspension;

    @Column(name="fecha_fin_suspension")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinSuspension;

    /**
     * Devuelve el valor de id
     * @return El valor de id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el valor de id
     * @param id El valor por establecer para id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Devuelve el valor de tipoDocumento
     * @return El valor de tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Establece el valor de tipoDocumento
     * @param tipoDocumento El valor por establecer para tipoDocumento
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * Devuelve el valor de identificacion
     * @return El valor de identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece el valor de identificacion
     * @param identificacion El valor por establecer para identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Devuelve el valor de clase
     * @return El valor de clase
     */
    public Integer getClase() {
        return clase;
    }

    /**
     * Establece el valor de clase
     * @param clase El valor por establecer para clase
     */
    public void setClase(Integer clase) {
        this.clase = clase;
    }

    /**
     * Devuelve el valor de nombreRs
     * @return El valor de nombreRs
     */
    public String getNombreRs() {
        return nombreRs;
    }

    /**
     * Establece el valor de nombreRs
     * @param nombreRs El valor por establecer para nombreRs
     */
    public void setNombreRs(String nombreRs) {
        this.nombreRs = nombreRs;
    }

    /**
     * Devuelve el valor de apellidoNc
     * @return El valor de apellidoNc
     */
    public String getApellidoNc() {
        return apellidoNc;
    }

    /**
     * Establece el valor de apellidoNc
     * @param apellidoNc El valor por establecer para apellidoNc
     */
    public void setApellidoNc(String apellidoNc) {
        this.apellidoNc = apellidoNc;
    }

    /**
     * Devuelve el valor de direccion1
     * @return El valor de direccion1
     */
    public String getDireccion1() {
        return direccion1;
    }

    /**
     * Establece el valor de direccion1
     * @param direccion1 El valor por establecer para direccion1
     */
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    /**
     * Devuelve el valor de direccion2
     * @return El valor de direccion2
     */
    public String getDireccion2() {
        return direccion2;
    }

    /**
     * Establece el valor de direccion2
     * @param direccion2 El valor por establecer para direccion2
     */
    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    /**
     * Devuelve el valor de direccion3
     * @return El valor de direccion3
     */
    public String getDireccion3() {
        return direccion3;
    }

    /**
     * Establece el valor de direccion3
     * @param direccion3 El valor por establecer para direccion3
     */
    public void setDireccion3(String direccion3) {
        this.direccion3 = direccion3;
    }

    /**
     * Devuelve el valor de telefono1
     * @return El valor de telefono1
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * Establece el valor de telefono1
     * @param telefono1 El valor por establecer para telefono1
     */
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    /**
     * Devuelve el valor de telefono2
     * @return El valor de telefono2
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * Establece el valor de telefono2
     * @param telefono2 El valor por establecer para telefono2
     */
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
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
     * Devuelve el valor de tipoTercero
     * @return El valor de tipoTercero
     */
    public Integer getTipoTercero() {
        return tipoTercero;
    }

    /**
     * Establece el valor de tipoTercero
     * @param tipoTercero El valor por establecer para tipoTercero
     */
    public void setTipoTercero(Integer tipoTercero) {
        this.tipoTercero = tipoTercero;
    }

    /**
     * Devuelve el valor de fechaIni
     * @return El valor de fechaIni
     */
    public String getFechaIni() {
        return fechaIni;
    }

    /**
     * Establece el valor de fechaIni
     * @param fechaIni El valor por establecer para fechaIni
     */
    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    /**
     * Devuelve el valor de fechaMod
     * @return El valor de fechaMod
     */
    public Date getFechaMod() {
        return fechaMod;
    }

    /**
     * Establece el valor de fechaMod
     * @param fechaMod El valor por establecer para fechaMod
     */
    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    /**
     * Devuelve el valor de estado
     * @return El valor de estado
     */
    public Integer getEstado() {
        return estado;
    }

    /**
     * Establece el valor de estado
     * @param estado El valor por establecer para estado
     */
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el valor de telMovilFax
     * @return El valor de telMovilFax
     */
    public String getTelMovilFax() {
        return telMovilFax;
    }

    /**
     * Establece el valor de telMovilFax
     * @param telMovilFax El valor por establecer para telMovilFax
     */
    public void setTelMovilFax(String telMovilFax) {
        this.telMovilFax = telMovilFax;
    }

    /**
     * Devuelve el valor de codEmpleado
     * @return El valor de codEmpleado
     */
    public String getCodEmpleado() {
        return codEmpleado;
    }

    /**
     * Establece el valor de codEmpleado
     * @param codEmpleado El valor por establecer para codEmpleado
     */
    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    /**
     * Devuelve el valor de fechaIniSuspension
     * @return El valor de fechaIniSuspension
     */
    public Date getFechaIniSuspension() {
        return fechaIniSuspension;
    }

    /**
     * Establece el valor de fechaIniSuspension
     * @param fechaIniSuspension El valor por establecer para fechaIniSuspension
     */
    public void setFechaIniSuspension(Date fechaIniSuspension) {
        this.fechaIniSuspension = fechaIniSuspension;
    }

    /**
     * Devuelve el valor de fechaFinSuspension
     * @return El valor de fechaFinSuspension
     */
    public Date getFechaFinSuspension() {
        return fechaFinSuspension;
    }

    /**
     * Establece el valor de fechaFinSuspension
     * @param fechaFinSuspension El valor por establecer para fechaFinSuspension
     */
    public void setFechaFinSuspension(Date fechaFinSuspension) {
        this.fechaFinSuspension = fechaFinSuspension;
    }


}
