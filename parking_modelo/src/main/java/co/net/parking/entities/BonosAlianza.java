package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bonos_alianza database table.
 * 
 */
@Entity
@Table(name="bonos_alianza")
@NamedQueries({
    @NamedQuery(name="BonosAlianza.findAll", query="SELECT b FROM BonosAlianza b"),
    @NamedQuery(name="BonosAlianza.finByAlianza",query="SELECT b FROM BonosAlianza b WHERE b.codBono=:codBono AND b.nombreAlianza=:nombreAlianza"),
    @NamedQuery(name="BonosAlianza.finById",query="SELECT b FROM BonosAlianza b WHERE b.id=:id")
})
public class BonosAlianza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cod_bono")
	private String codBono;

	@Column(name="cod_empleado")
	private String codEmpleado;

	@Column(name="cod_terminal")
	private String codTerminal;

	private int estado;

	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

	@Column(name="fecha_uso")
	private String fechaUso;

	private String identificacion;

	@Column(name="nombre_alianza")
	private String nombreAlianza;

	@Column(name="num_factura")
	private String numFactura;

	@Column(name="tipo_bono")
	private String tipoBono;

	@Column(name="valor_bono")
	private int valorBono;

	public BonosAlianza() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodBono() {
		return this.codBono;
	}

	public void setCodBono(String codBono) {
		this.codBono = codBono;
	}

	public String getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getCodTerminal() {
		return this.codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicial() {
		return this.fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaUso() {
		return this.fechaUso;
	}

	public void setFechaUso(String fechaUso) {
		this.fechaUso = fechaUso;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombreAlianza() {
		return this.nombreAlianza;
	}

	public void setNombreAlianza(String nombreAlianza) {
		this.nombreAlianza = nombreAlianza;
	}

	public String getNumFactura() {
		return this.numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getTipoBono() {
		return this.tipoBono;
	}

	public void setTipoBono(String tipoBono) {
		this.tipoBono = tipoBono;
	}

	public int getValorBono() {
		return this.valorBono;
	}

	public void setValorBono(int valorBono) {
		this.valorBono = valorBono;
	}

}