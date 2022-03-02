package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the rango_facturas database table.
 * 
 */
@Entity
@Table(name = "rango_facturas")
@NamedQueries({ 
	@NamedQuery(name = "RangoFactura2.findAll", query = "SELECT r FROM RangoFactura2 r"),
	@NamedQuery(name = "RangoFactura2.byCodTerminal", query = "SELECT r FROM RangoFactura2 r WHERE r.codTerminal=:codTerminal AND r.estado=1"),
	@NamedQuery(name = "RangoFactura2.byCodTerminalByResolucion", query = "SELECT r FROM RangoFactura2 r WHERE r.codTerminal=:codTerminal AND r.estado=1 AND r.resolucion=:numResolucion") 
})

public class RangoFactura2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "cod_park")
	private String codPark;

	@Column(name = "cod_terminal")
	private String codTerminal;

	private short estado;

	@Column(name = "estado_actualizacion")
	private boolean estadoActualizacion;

	@Column(name = "fecha_modificacion")
	private String fechaModificacion;

	@Column(name = "frase_resolucion")
	private String fraseResolucion;

	@Column(name = "num_resolucion")
	private String resolucion;

	@Column(name = "rango_final")
	private int rangoFinal;

	@Column(name = "rango_inicial")
	private int rangoInicial;

	public RangoFactura2() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public boolean getEstadoActualizacion() {
		return this.estadoActualizacion;
	}

	public void setEstadoActualizacion(boolean estadoActualizacion) {
		this.estadoActualizacion = estadoActualizacion;
	}

	public String getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getFraseResolucion() {
		return this.fraseResolucion;
	}

	public void setFraseResolucion(String fraseResolucion) {
		this.fraseResolucion = fraseResolucion;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public int getRangoFinal() {
		return this.rangoFinal;
	}

	public void setRangoFinal(int rangoFinal) {
		this.rangoFinal = rangoFinal;
	}

	public int getRangoInicial() {
		return this.rangoInicial;
	}

	public void setRangoInicial(int rangoInicial) {
		this.rangoInicial = rangoInicial;
	}

}