/**
 *
 */
package co.net.datos.terminal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
@Table(name="configuraciones")
@NamedQueries({
    @NamedQuery(name="Configuracion.findByCodTerminal",query="SELECT c FROM Configuracion c WHERE c.codTerminal=:codTerminal AND c.codPark=:codPark AND c.tipo=:tipo AND valor=:valor")
})
public class Configuracion implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -106031159910669191L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Integer id;
    @Column(name="cod_park")
    private String codPark;
    @Column(name="cod_terminal")
    private String codTerminal;
    private String tipo;
    private String valor;
    private int estado;
    private Date fecha = new Date();
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
     * Devuelve el valor de tipo
     * @return El valor de tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Establece el valor de tipo
     * @param tipo El valor por establecer para tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Devuelve el valor de valor
     * @return El valor de valor
     */
    public String getValor() {
        return valor;
    }
    /**
     * Establece el valor de valor
     * @param valor El valor por establecer para valor
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    /**
     * Devuelve el valor de estado
     * @return El valor de estado
     */
    public int getEstado() {
        return estado;
    }
    /**
     * Establece el valor de estado
     * @param estado El valor por establecer para estado
     */
    public void setEstado(int estado) {
        this.estado = estado;
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

    


}
