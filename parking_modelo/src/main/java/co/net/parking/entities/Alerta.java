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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <b>Descripcion:</b> Entidad de alerta<br/>
 * <b>M�dulo:</b> Parking SIP- <br/>
 *
 * @author parking
 */
@Entity
@Table(name = "alerta")
@XmlRootElement
public class Alerta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    @Basic(optional = false)
    @Column(name = "cod_alerta")
    private Integer codAlerta;
    
    @Basic(optional = false)
    @Column(name = "cod_park")
    private String codPark;
    
    @Basic(optional = false)
    @Column(name = "cod_terminal")
    private String codTerminal;
    
    @Basic(optional = false)
    @Column(name = "nombre")
    
    private String nombre;
    @Basic(optional = false)
    @Column(name = "mensaje")
    
    private String mensaje;
//    @NotNull(message = "el serial no puede ser null")
    @Column(name = "serial")    
    private String serial;
    
    @Basic(optional = false)
    @Column(name = "fecha_generacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGeneracion;
    
    @Basic(optional = false)
    @Column(name = "fecha_reguistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReguistro;
    
    @Basic(optional = false)
    @Column(name = "llave")
    private String llave;
    
    @Column(name = "estado_envio")
    private Boolean estadoEnvio;
    
    @Column(name = "prop_tarj")
    private String propietarioTarjeta;
    
    @Column(name = "fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;

    public Integer getCodAlerta() {
        return codAlerta;
    }
    public void setCodAlerta(Integer codAlerta) {
        this.codAlerta = codAlerta;
    }
    public String getCodPark() {
        return codPark;
    }
    public void setCodPark(String codPark) {
        this.codPark = codPark;
    }
    public String getCodTerminal() {
        return codTerminal;
    }
    public void setCodTerminal(String codTerminal) {
        this.codTerminal = codTerminal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }
    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Date getFechaReguistro() {
        return fechaReguistro;
    }

    public void setFechaReguistro(Date fechaReguistro) {
        this.fechaReguistro = fechaReguistro;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public Boolean getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(Boolean estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
    /**
     * Devuelve el valor de propietarioTarjeta
     * @return El valor de propietarioTarjeta
     */
    public String getPropietarioTarjeta() {
        return propietarioTarjeta;
    }
    /**
     * Establece el valor de propietarioTarjeta
     * @param propietarioTarjeta El valor por establecer para propietarioTarjeta
     */
    public void setPropietarioTarjeta(String propietarioTarjeta) {
        this.propietarioTarjeta = propietarioTarjeta;
    }
    /**
     * Devuelve el valor de fechaVencimiento
     * @return El valor de fechaVencimiento
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    /**
     * Establece el valor de fechaVencimiento
     * @param fechaVencimiento El valor por establecer para fechaVencimiento
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }



}
