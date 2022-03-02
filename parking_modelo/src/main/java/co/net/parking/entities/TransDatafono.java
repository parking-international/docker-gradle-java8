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
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@Entity
@Table(name = "trans_datafono")
@XmlRootElement
public class TransDatafono implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo_trans")
    private String tipoTrans;

    @Column(name = "cod_park")
    private String codPark;

    @Column(name = "cod_terminal")
    private String codTerminal;

    @Column(name = "id_turno")
    private Integer idTurno;

    @Column(name = "numero")
    private String numero;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "num_autorizacion")
    private String numAutorizacion;

    @Column(name = "num_recibo")
    private Integer numRecibo;

    @Column(name = "valor")
    private Integer valor;

    @Basic(optional = false)
    @Column(name = "iva")
    private Integer iva;
    
    @Column(name = "valor_descuento")
    private Integer valorDescuento;

    @Column(name = "cod_empleado")
    private String codEmpleado;

    @Column(name = "estado")
    private String estado;

    @Column(name = "tipo_tarjeta")
    private String tipoTarjeta;

    @Column(name = "id_cliente")
    private String idCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

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
     * Devuelve el valor de tipoTrans
     * @return El valor de tipoTrans
     */
    public String getTipoTrans() {
        return tipoTrans;
    }

    /**
     * Establece el valor de tipoTrans
     * @param tipoTrans El valor por establecer para tipoTrans
     */
    public void setTipoTrans(String tipoTrans) {
        this.tipoTrans = tipoTrans;
    }

    /**
     * Devuelve el valor de codPark
     * @return El valor de codPark
     */
    public String getCodPark() {
        return codPark;
    }

    /**
     * Establece el valor de codPark
     * @param codPark El valor por establecer para codPark
     */
    public void setCodPark(String codPark) {
        this.codPark = codPark;
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
     * Devuelve el valor de idTurno
     * @return El valor de idTurno
     */
    public Integer getIdTurno() {
        return idTurno;
    }

    /**
     * Establece el valor de idTurno
     * @param idTurno El valor por establecer para idTurno
     */
    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    /**
     * Devuelve el valor de numero
     * @return El valor de numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el valor de numero
     * @param numero El valor por establecer para numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Devuelve el valor de fecha
     * @return El valor de fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece el valor de fecha
     * @param fecha El valor por establecer para fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve el valor de numAutorizacion
     * @return El valor de numAutorizacion
     */
    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    /**
     * Establece el valor de numAutorizacion
     * @param numAutorizacion El valor por establecer para numAutorizacion
     */
    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    /**
     * Devuelve el valor de numRecibo
     * @return El valor de numRecibo
     */
    public Integer getNumRecibo() {
        return numRecibo;
    }

    /**
     * Establece el valor de numRecibo
     * @param numRecibo El valor por establecer para numRecibo
     */
    public void setNumRecibo(Integer numRecibo) {
        this.numRecibo = numRecibo;
    }

    /**
     * Devuelve el valor de valor
     * @return El valor de valor
     */
    public Integer getValor() {
        return valor;
    }

    /**
     * Establece el valor de valor
     * @param valor El valor por establecer para valor
     */
    public void setValor(Integer valor) {
        this.valor = valor;
    }

    /**
     * Devuelve el valor de iva
     * @return El valor de iva
     */
    public Integer getIva() {
        return iva;
    }

    /**
     * Establece el valor de iva
     * @param iva El valor por establecer para iva
     */
    public void setIva(Integer iva) {
        this.iva = iva;
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
     * Devuelve el valor de estado
     * @return El valor de estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el valor de estado
     * @param estado El valor por establecer para estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el valor de tipoTarjeta
     * @return El valor de tipoTarjeta
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Establece el valor de tipoTarjeta
     * @param tipoTarjeta El valor por establecer para tipoTarjeta
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * Devuelve el valor de idCliente
     * @return El valor de idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Establece el valor de idCliente
     * @param idCliente El valor por establecer para idCliente
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Devuelve el valor de nombreCliente
     * @return El valor de nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece el valor de nombreCliente
     * @param nombreCliente El valor por establecer para nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Devuelve el valor de valorDescuento
     * @return El valor de valorDescuento
     */
	public Integer getValorDescuento() {
		return valorDescuento;
	}

	/**
     * Establece el valor de valorDescuento
     * @param valorDescuento El valor por establecer para valorDescuento
     */
	public void setValorDescuento(Integer valorDescuento) {
		this.valorDescuento = valorDescuento;
	}


    


}
