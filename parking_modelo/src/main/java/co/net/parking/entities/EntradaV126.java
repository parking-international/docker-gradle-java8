package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entrada_v126 database table.
 * 
 */
@Entity
@Table(name="entrada_v126")
@NamedQueries({
@NamedQuery(name = "EntradaV126.findCodPark", query = "SELECT e FROM EntradaV126 e WHERE e.codPark=:codPark AND e.estado=:estado order by fechaHora desc "),
@NamedQuery(name = "EntradaV126.findPlaca", query = "SELECT e FROM EntradaV126 e WHERE placa=:placa AND codPark=:codPark AND e.estado=1"),
@NamedQuery(name = "EntradaV126.findBarcode", query = "SELECT e FROM EntradaV126 e WHERE barcode=:barcode AND codPark=:codPark AND e.estado=1"),
@NamedQuery(name = "EntradaV126.findBarcode2", query = "SELECT e FROM EntradaV126 e WHERE barcode=:barcode AND codPark=:codPark AND e.estado in(1,0) order by fechaHora DESC"),
@NamedQuery(name = "EntradaV126.findCodParkCarro", query = "SELECT e FROM EntradaV126 e WHERE e.codPark=:codPark AND e.estado=:estado AND tipoVehiculo=1 "),
@NamedQuery(name = "EntradaV126.findCodParkMoto", query = "SELECT e FROM EntradaV126 e WHERE e.codPark=:codPark AND e.estado=:estado AND tipoVehiculo=2 "),
@NamedQuery(name = "EntradaV126.findPlaca2", query = "SELECT e FROM EntradaV126 e WHERE placa=:placa AND codTerminal=:codTerminal AND e.estado in(1,0) order by fechaHora desc "),
})
public class EntradaV126 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String barcode;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="cod_terminal")
	private String codTerminal;

	private int contrato;

	private short estado;

	@Column(name="fecha_hora")
	private String fechaHora;

	@Column(name="hora_final")
	private String horaFinal;

	@Column(name="hora_inicial")
	private String horaInicial;

	@Column(name="id_entrada")
	private String idEntrada;

	private String mensual;

	private short perdido;

	private String placa;

	@Column(name="tiempo_inicial")
	private long tiempoInicial;

	@Column(name="tipo_vehiculo")
	private short tipoVehiculo;

	private short transmitido;

	private short valet;

	public EntradaV126() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
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

	public int getContrato() {
		return this.contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getHoraFinal() {
		return this.horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String getHoraInicial() {
		return this.horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getIdEntrada() {
		return this.idEntrada;
	}

	public void setIdEntrada(String idEntrada) {
		this.idEntrada = idEntrada;
	}

	public String getMensual() {
		return this.mensual;
	}

	public void setMensual(String mensual) {
		this.mensual = mensual;
	}

	public short getPerdido() {
		return this.perdido;
	}

	public void setPerdido(short perdido) {
		this.perdido = perdido;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public long getTiempoInicial() {
		return this.tiempoInicial;
	}

	public void setTiempoInicial(long tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public short getTipoVehiculo() {
		return this.tipoVehiculo;
	}

	public void setTipoVehiculo(short tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public short getTransmitido() {
		return this.transmitido;
	}

	public void setTransmitido(short transmitido) {
		this.transmitido = transmitido;
	}

	public short getValet() {
		return this.valet;
	}

	public void setValet(short valet) {
		this.valet = valet;
	}

}