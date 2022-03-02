package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_app_reservas_configuracion database table.
 * 
 */
@Entity
@Table(name="wp_app_reservas_configuracion")
@NamedQueries({
	@NamedQuery(name="ReservasConfiguracion.findAll", query="SELECT w FROM ReservasConfiguracion w"),
	@NamedQuery(name="ReservasConfiguracion.findByItem", query="SELECT r FROM ReservasConfiguracion r where r.rcItem=:item"),
	@NamedQuery(name="ReservasConfiguracion.findByCodPark", query="SELECT r FROM ReservasConfiguracion r where r.rcCodPark=:codPark"),
	@NamedQuery(name="ReservasConfiguracion.findByItemCodPark", query="SELECT r FROM ReservasConfiguracion r where r.rcCodPark=:codPark and r.rcItem=:item"),
})
public class ReservasConfiguracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rc_id")
	private int rcId;

	@Column(name="rc_cod_park")
	private String rcCodPark;

	@Column(name="rc_estado")
	private int rcEstado;

	@Column(name="rc_fecha")
	private String rcFecha;

	@Column(name="rc_item")
	private String rcItem;

	@Column(name="rc_valor")
	private String rcValor;

	public ReservasConfiguracion() {
	}

	public int getRcId() {
		return this.rcId;
	}

	public void setRcId(int rcId) {
		this.rcId = rcId;
	}

	public String getRcCodPark() {
		return this.rcCodPark;
	}

	public void setRcCodPark(String rcCodPark) {
		this.rcCodPark = rcCodPark;
	}

	public int getRcEstado() {
		return this.rcEstado;
	}

	public void setRcEstado(int rcEstado) {
		this.rcEstado = rcEstado;
	}

	public String getRcFecha() {
		return this.rcFecha;
	}

	public void setRcFecha(String rcFecha) {
		this.rcFecha = rcFecha;
	}

	public String getRcItem() {
		return this.rcItem;
	}

	public void setRcItem(String rcItem) {
		this.rcItem = rcItem;
	}

	public String getRcValor() {
		return this.rcValor;
	}

	public void setRcValor(String rcValor) {
		this.rcValor = rcValor;
	}

}