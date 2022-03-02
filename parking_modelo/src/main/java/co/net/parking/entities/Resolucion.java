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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@Entity
@Table(name="resoluciones")
@NamedQueries({ 
	@NamedQuery(name = "Resolucion.findAll", query = "SELECT r FROM Resolucion r"),
	@NamedQuery(name = "Resolucion.findByResolucion", query = "SELECT r FROM Resolucion r WHERE r.numResolucion=:numResolucion")})
@XmlRootElement
public class Resolucion implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1608197582983248109L;

    @Id
    @Column(name="num_resolucion")
    @Basic(optional=false)
    private String numResolucion;

    @Column(name="cod_empresa")
    @Basic(optional=false)
    private String codEmpresa;

    @Column(name="fecha_inicial")
    @Basic(optional=true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;

    @Column(name="fecha_final")
    @Basic(optional=true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;

    @Basic(optional=false)
    private Boolean estado;


    /**
     * Devuelve el valor de numResolucion
     * @return El valor de numResolucion
     */
    public String getNumResolucion() {
        return numResolucion;
    }

    /**
     * Establece el valor de numResolucion
     * @param numResolucion El valor por establecer para numResolucion
     */
    public void setNumResolucion(String numResolucion) {
        this.numResolucion = numResolucion;
    }

    /**
     * Devuelve el valor de codEmpresa
     * @return El valor de codEmpresa
     */
    public String getCodEmpresa() {
        return codEmpresa;
    }

    /**
     * Establece el valor de codEmpresa
     * @param codEmpresa El valor por establecer para codEmpresa
     */
    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    /**
     * Devuelve el valor de fechaInicial
     * @return El valor de fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Establece el valor de fechaInicial
     * @param fechaInicial El valor por establecer para fechaInicial
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * Devuelve el valor de fechaFinal
     * @return El valor de fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Establece el valor de fechaFinal
     * @param fechaFinal El valor por establecer para fechaFinal
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * Devuelve el valor de estado
     * @return El valor de estado
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * Establece el valor de estado
     * @param estado El valor por establecer para estado
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


}
