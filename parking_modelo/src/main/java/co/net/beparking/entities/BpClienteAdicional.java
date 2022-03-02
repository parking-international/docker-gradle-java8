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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@Entity
@Table(name = "BpClienteAdicional")
@NamedQueries({
    @NamedQuery(name="BpClienteAdicional.login",
                query="SELECT c FROM BpClienteAdicional c WHERE c.cedula=:cedula AND c.password=:password "),
    @NamedQuery(name="BpClienteAdicional.loginCedula",
    query="SELECT c FROM BpClienteAdicional c WHERE c.cedula=:cedula"),
    @NamedQuery(name="BpClienteAdicional.password",
    query="SELECT c FROM BpClienteAdicional c WHERE c.password=:password "),
    @NamedQuery(name="BpClienteAdicional.cedula", query="SELECT c FROM BpClienteAdicional c WHERE c.cedula=:cedula")
})
@XmlRootElement
public class BpClienteAdicional implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 9079567314544129618L;

    @Id
    @Column(name="Cedula")
    private String cedula;

    @Basic(optional=false)
    @Column(name="Passwd")
    private String password;

    @Column(name="Rol")
    private String rol;

    @Column(name="CodEmpleado")
    private String codEmpleado;

    @Column(name="IdInicioTurno")
    private Integer idInicioTurno;

    @Column(name="CodTerminal")
    private String codTerminal;

    @Column(name="BeneficioSamsung")
    private String beneficioSamsung;

    @Column(name="FechaBeneficio")
    private Date fechaBeneficio;

    @OneToOne
    @JoinColumn(name="cedula",nullable=false)
    @Transient
    private BpCliente bpCliente;

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
     * Devuelve el valor de password
     * @return El valor de password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece el valor de password
     * @param password El valor por establecer para password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devuelve el valor de rol
     * @return El valor de rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el valor de rol
     * @param rol El valor por establecer para rol
     */
    public void setRol(String rol) {
        this.rol = rol;
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
     * Devuelve el valor de idInicioTurno
     * @return El valor de idInicioTurno
     */
    public Integer getIdInicioTurno() {
        return idInicioTurno;
    }

    /**
     * Establece el valor de idInicioTurno
     * @param idInicioTurno El valor por establecer para idInicioTurno
     */
    public void setIdInicioTurno(Integer idInicioTurno) {
        this.idInicioTurno = idInicioTurno;
    }

    /**
     * Devuelve el valor de codTerminal
     * @return El valor de codTerminal
     */
    public String getCodTerminal() {
        return codTerminal;
    }

    /**
     * Establece el valor de codTerminal
     * @param codTerminal El valor por establecer para codTerminal
     */
    public void setCodTerminal(String codTerminal) {
        this.codTerminal = codTerminal;
    }

    /**
     * Devuelve el valor de beneficioSamsumg
     * @return El valor de beneficioSamsumg
     */
    public String getBeneficioSamsung() {
        return beneficioSamsung;
    }

    /**
     * Establece el valor de beneficioSamsumg
     * @param beneficioSamsumg El valor por establecer para beneficioSamsumg
     */
    public void setBeneficioSamsung(String beneficioSamsumg) {
        this.beneficioSamsung = beneficioSamsumg;
    }

    /**
     * Devuelve el valor de fechaBeneficio
     * @return El valor de fechaBeneficio
     */
    public Date getFechaBeneficio() {
        return fechaBeneficio;
    }

    /**
     * Establece el valor de fechaBeneficio
     * @param fechaBeneficio El valor por establecer para fechaBeneficio
     */
    public void setFechaBeneficio(Date fechaBeneficio) {
        this.fechaBeneficio = fechaBeneficio;
    }

    /**
     * Devuelve el valor de bpCliente
     * @return El valor de bpCliente
     */
    public BpCliente getBpCliente() {
        return bpCliente;
    }

    /**
     * Establece el valor de bpCliente
     * @param bpCliente El valor por establecer para bpCliente
     */
    public void setBpCliente(BpCliente bpCliente) {
        this.bpCliente = bpCliente;
    }




}
