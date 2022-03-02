package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the wp_app_transacciones database table.
 * 
 */
@Entity
@Table(name = "wp_app_transacciones")
@NamedQueries({
		@NamedQuery(name = "WpAppTransacciones.findAll", query = "SELECT w FROM WpAppTransacciones w"),
		@NamedQuery(name="WpAppTransacciones.ListaTransacciones",query="SELECT w FROM WpAppTransacciones w WHERE identificacion=:identificacion order by fecha desc")		
})

public class WpAppTransacciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String identificacion;
	private String idMedioPago;
	private String concepto;
	private String valor;
	private String numeroAprobacion;
	private String estado;
	private String descripcion;
	private String fecha;
	private int reciboCaja;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getIdMedioPago() {
		return idMedioPago;
	}
	public void setIdMedioPago(String idMedioPago) {
		this.idMedioPago = idMedioPago;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getNumeroAprobacion() {
		return numeroAprobacion;
	}
	public void setNumeroAprobacion(String numeroAprobacion) {
		this.numeroAprobacion = numeroAprobacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getReciboCaja() {
		return reciboCaja;
	}
	public void setReciboCaja(int reciboCaja) {
		this.reciboCaja = reciboCaja;
	}

	}