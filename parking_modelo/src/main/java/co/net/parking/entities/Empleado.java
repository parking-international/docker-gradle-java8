/**
 *
 */
package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@Entity
@Table(name="empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name="Empleado.login", query="SELECT e FROM Empleado e WHERE e.login=:username AND e.password=:password AND estado=1 "),
    @NamedQuery(name="Empleado.findByCodEmpleado", query="SELECT e FROM Empleado e WHERE cod_empleado = :codEmpleado and estado = 1"),
    @NamedQuery(name="Empleado.codEmpleado", query="SELECT e FROM Empleado e WHERE e.codEmpelado=:codEmpleado"),
    @NamedQuery(name="UsuarioExistente",query="SELECT e FROM Empleado e WHERE login = :login and estado = 1"),
    @NamedQuery(name="Empleado.consulta.identificacion",query="SELECT e FROM Empleado e WHERE identificacion = :identificacion and estado = 1")
})
public class Empleado implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4701021491472360052L;

    @Id
    @Column(name="cod_empleado")
    private String codEmpelado;

    @Column(name="identificacion")
    private String identificacion;

    @Column(name="apellido")
    private String apellido;

    @Column(name="nombre")
    private String nombre;

    @Column(name="direccion")
    private String direcion;

    @Column(name="telefono")
    private String telefono;

    @Column(name="centro_costos")
    private String centroCosto;

    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_ingreso")
    private Date fechaIngreso;

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_retiro")
    private Date fechaRetiro;

    @Column(name="estado")
    private Integer estado;

    @Column(name="tipo")
    private Integer tipo;

    @Column(name="tipo_contrato")
    private Integer tipoContrato;

    @Column(name="cargo")
    private String cargo;

    @Column(name="cod_empresa")
    private String codEmpresa;

    @Column(name="cod_zona")
    private String codZona;

    @Column(name="temporal")
    private String temporal;

    @Column(name="horario")
    private Integer horario;

    @Column(name="sueldo")
    private Integer sueldo;
    
    @Transient
    private int idInicioTurno;

    /**
     * Devuelve el valor de codEmpelado
     * @return El valor de codEmpelado
     */
    public String getCodEmpelado() {
        return codEmpelado;
    }

    /**
     * Establece el valor de codEmpelado
     * @param codEmpelado El valor por establecer para codEmpelado
     */
    public void setCodEmpelado(String codEmpelado) {
        this.codEmpelado = codEmpelado;
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
     * Devuelve el valor de direcion
     * @return El valor de direcion
     */
    public String getDirecion() {
        return direcion;
    }

    /**
     * Establece el valor de direcion
     * @param direcion El valor por establecer para direcion
     */
    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    /**
     * Devuelve el valor de telefono
     * @return El valor de telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el valor de telefono
     * @param telefono El valor por establecer para telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el valor de centroCosto
     * @return El valor de centroCosto
     */
    public String getCentroCosto() {
        return centroCosto;
    }

    /**
     * Establece el valor de centroCosto
     * @param centroCosto El valor por establecer para centroCosto
     */
    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    /**
     * Devuelve el valor de login
     * @return El valor de login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Establece el valor de login
     * @param login El valor por establecer para login
     */
    public void setLogin(String login) {
        this.login = login;
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
     * Devuelve el valor de fechaIngreso
     * @return El valor de fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Establece el valor de fechaIngreso
     * @param fechaIngreso El valor por establecer para fechaIngreso
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Devuelve el valor de fechaRetiro
     * @return El valor de fechaRetiro
     */
    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    /**
     * Establece el valor de fechaRetiro
     * @param fechaRetiro El valor por establecer para fechaRetiro
     */
    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
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
     * Devuelve el valor de tipo
     * @return El valor de tipo
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * Establece el valor de tipo
     * @param tipo El valor por establecer para tipo
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve el valor de tipoContrato
     * @return El valor de tipoContrato
     */
    public Integer getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Establece el valor de tipoContrato
     * @param tipoContrato El valor por establecer para tipoContrato
     */
    public void setTipoContrato(Integer tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * Devuelve el valor de cargo
     * @return El valor de cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el valor de cargo
     * @param cargo El valor por establecer para cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
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
     * Devuelve el valor de codZona
     * @return El valor de codZona
     */
    public String getCodZona() {
        return codZona;
    }

    /**
     * Establece el valor de codZona
     * @param codZona El valor por establecer para codZona
     */
    public void setCodZona(String codZona) {
        this.codZona = codZona;
    }

    /**
     * Devuelve el valor de temporal
     * @return El valor de temporal
     */
    public String getTemporal() {
        return temporal;
    }

    /**
     * Establece el valor de temporal
     * @param temporal El valor por establecer para temporal
     */
    public void setTemporal(String temporal) {
        this.temporal = temporal;
    }

    /**
     * Devuelve el valor de horario
     * @return El valor de horario
     */
    public Integer getHorario() {
        return horario;
    }

    /**
     * Establece el valor de horario
     * @param horario El valor por establecer para horario
     */
    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    /**
     * Devuelve el valor de sueldo
     * @return El valor de sueldo
     */
    public Integer getSueldo() {
        return sueldo;
    }

    /**
     * Establece el valor de sueldo
     * @param sueldo El valor por establecer para sueldo
     */
    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Devuelve el valor de serialversionuid
     * @return El valor de serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

	public int getIdInicioTurno() {
		return idInicioTurno;
	}

	public void setIdInicioTurno(int idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}




}
