/**
 * 
 */
package co.net.parking.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
@Table(name="usuario_autorizado_terminales")
@NamedQueries({
       @NamedQuery(name="UsuarioAutorizadoTerminal.finByTerminal",query="SELECT ut FROM UsuarioAutorizadoTerminal ut "
               + "INNER JOIN ut.usuarioAutorizado as u WHERE u.estado=1 AND ut.codTerminal=:codTerminal")
})
public class UsuarioAutorizadoTerminal  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 635352616950849005L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private int id;
    
    @Column(name="id_usuario_aut")
    private int idUsuarioAut;
   
    @Column(name="cod_terminal")
    private String codTerminal;
    
    @Column(name="fecha_actualizacion")
    private Date fechaActualizacion;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_usuario_aut",nullable=false,insertable=false, updatable=false)
    private UsuarioAutorizado usuarioAutorizado;

    /**
     * Devuelve el valor de id
     * @return El valor de id
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el valor de id
     * @param id El valor por establecer para id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el valor de idUsuarioAut
     * @return El valor de idUsuarioAut
     */
    public int getIdUsuarioAut() {
        return idUsuarioAut;
    }

    /**
     * Establece el valor de idUsuarioAut
     * @param idUsuarioAut El valor por establecer para idUsuarioAut
     */
    public void setIdUsuarioAut(int idUsuarioAut) {
        this.idUsuarioAut = idUsuarioAut;
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
     * Devuelve el valor de fechaActualizacion
     * @return El valor de fechaActualizacion
     */
    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Establece el valor de fechaActualizacion
     * @param fechaActualizacion El valor por establecer para fechaActualizacion
     */
    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    /**
     * Devuelve el valor de usuarioAutorizado
     * @return El valor de usuarioAutorizado
     */
    public UsuarioAutorizado getUsuarioAutorizado() {
        return usuarioAutorizado;
    }

    /**
     * Establece el valor de usuarioAutorizado
     * @param usuarioAutorizado El valor por establecer para usuarioAutorizado
     */
    public void setUsuarioAutorizado(UsuarioAutorizado usuarioAutorizado) {
        this.usuarioAutorizado = usuarioAutorizado;
    }
    
    
    
    
}
