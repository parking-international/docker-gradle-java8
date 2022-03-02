package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mensuales database table.
 * 
 */
@Entity
@Table(name="mensuales")
@NamedQueries({
    @NamedQuery(name="VigenciaMensual",query="SELECT m FROM Mensuales m WHERE m.codPark=:codPark AND m.horario=:horario AND m.placa=:placa AND m.estado=:estado"),
    @NamedQuery(name="VigenciaMensualPlaca",query="SELECT m FROM Mensuales m WHERE m.codPark=:codPark AND m.placa=:placa AND m.estado=:estado"),
    @NamedQuery(name = "ConsultaMensual", query = "SELECT cm FROM Mensuales cm WHERE cm.codPark=:codPark and cm.codigoTarjeta=:codigoTarjeta and cm.estado=:estado"),
    @NamedQuery(name = "ConsultaMensualPlaca", query = "SELECT cm FROM Mensuales cm WHERE cm.codPark=:codPark and cm.placa=cm.placa and cm.estado=:estado"),
    @NamedQuery(name = "ConsultaMensualByContrato", query = "SELECT cm FROM Mensuales cm WHERE cm.contrato=:contrato AND cm.estado=:estado order by fechaFinal desc"),
    @NamedQuery(name = "ConsultaMensualByMensualesCodpark", query = "SELECT cm FROM Mensuales cm WHERE cm.placa=:placa AND cm.codPark=:codPark AND cm.estado=:estado"),
    @NamedQuery(name = "Mensuales.findByCodPark", query = "SELECT cm FROM Mensuales cm WHERE cm.codPark = :codPark AND cm.estado = 1"),
    @NamedQuery(name = "ConsultaMensualesCodPark", query = "SELECT cm FROM Mensuales cm WHERE cm.codPark=:codPark and cm.estado=1")
    })
 


public class Mensuales implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="codigo_tarjeta")
	private String codigoTarjeta;

	private Integer contrato;

	private Short estado;

	@Column(name="fecha_creacion")
	private String fechaCreacion;

	@Column(name="fecha_final")
	private String fechaFinal;

	@Column(name="fecha_inicial")
	private String fechaInicial;

	@Column(name="hora_final")
	private String horaFinal;

	@Column(name="hora_inicial")
	private String horaInicial;

	private Short horario;

	@Column(name="iden_asignado")
	private String idenAsignado;

	@Column(name="nombre_asignado")
	private String nombreAsignado;

	private String observacion;

	private String placa;

	private Short renovar;

	@Column(name="tipo_cliente")
	private Integer tipoCliente;

	public Mensuales() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodPark() {
		return codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public String getCodigoTarjeta() {
		return codigoTarjeta;
	}

	public void setCodigoTarjeta(String codigoTarjeta) {
		this.codigoTarjeta = codigoTarjeta;
	}

	public Integer getContrato() {
		return contrato;
	}

	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public Short getHorario() {
		return horario;
	}

	public void setHorario(Short horario) {
		this.horario = horario;
	}

	public String getIdenAsignado() {
		return idenAsignado;
	}

	public void setIdenAsignado(String idenAsignado) {
		this.idenAsignado = idenAsignado;
	}

	public String getNombreAsignado() {
		return nombreAsignado;
	}

	public void setNombreAsignado(String nombreAsignado) {
		this.nombreAsignado = nombreAsignado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Short getRenovar() {
		return renovar;
	}

	public void setRenovar(Short renovar) {
		this.renovar = renovar;
	}

	public Integer getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	}