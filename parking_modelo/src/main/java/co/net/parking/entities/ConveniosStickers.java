package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the codigos_stickers database table.
 * 
 */
@Entity
@Table(name = "convenios_stickers")
@NamedQueries({ @NamedQuery(name = "ConveniosStickersCodigo", query = "SELECT c FROM ConveniosStickers c where c.codigo1=:codigo1")
		})
   
public class ConveniosStickers implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="id_convenios")
	private int idConvenios;
	
	@Column(name="cod_park")
	private String codPark;
	
	private String codigo1;
	
	private String codigo2;
	
	private short cantidad;
	
	private short cuartos;
	
	private String rastreo;
	
	private short estado;
	
	private short transmitido;
	
	@Column(name="fecha_inicial")
	private String fechaInicial;
	
	@Column(name="fecha_final")
	private String fechaFinal;
	
	@Column(name="id_transaccion")
	private String idTransaccion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdConvenios() {
		return idConvenios;
	}

	public void setIdConvenios(int idConvenios) {
		this.idConvenios = idConvenios;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodigo1() {
		return codigo1;
	}

	public void setCodigo1(String codigo1) {
		this.codigo1 = codigo1;
	}

	public String getCodigo2() {
		return codigo2;
	}

	public void setCodigo2(String codigo2) {
		this.codigo2 = codigo2;
	}

	public short getCantidad() {
		return cantidad;
	}

	public void setCantidad(short cantidad) {
		this.cantidad = cantidad;
	}

	public short getCuartos() {
		return cuartos;
	}

	public void setCuartos(short cuartos) {
		this.cuartos = cuartos;
	}

	public String getRastreo() {
		return rastreo;
	}

	public void setRastreo(String rastreo) {
		this.rastreo = rastreo;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public short getTransmitido() {
		return transmitido;
	}

	public void setTransmitido(short transmitido) {
		this.transmitido = transmitido;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}