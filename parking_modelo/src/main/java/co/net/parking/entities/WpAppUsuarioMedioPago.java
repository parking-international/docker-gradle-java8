package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_app_usuario_medio_pago database table.
 * 
 */
@Entity
@Table(name="wp_app_usuario_medio_pago")
@NamedQueries({
@NamedQuery(name="WpAppUsuarioMedioPago.findAll", query="SELECT w FROM WpAppUsuarioMedioPago w"),
@NamedQuery(name="WpAppUsuarioMedioPago.findByCedula", query="SELECT w FROM WpAppUsuarioMedioPago w WHERE w.identificacion=:identificacion AND w.estado=1") })
public class WpAppUsuarioMedioPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="id_medio_pago")
	private String idMedioPago;

	private String identificacion;
	
	private int estado;

	public WpAppUsuarioMedioPago() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdMedioPago() {
		return this.idMedioPago;
	}

	public void setIdMedioPago(String idMedioPago) {
		this.idMedioPago = idMedioPago;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}