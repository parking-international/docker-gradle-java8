package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tarifas_a database table.
 * 
 */
@Entity
@Table(name = "tarifas_a")
@NamedQueries({
		@NamedQuery(name = "TarifasA.findTarifa", query = "SELECT t FROM TarifasA t WHERE t.codPark=:codPark and t.tipo=:tipo AND tipoVehiculo=:tipoVehiculo AND estado = 1"),
		@NamedQuery(name = "TarifasA.findTarifaEspecial", query = "SELECT t FROM TarifasA t WHERE t.codPark=:codPark and t.tipo not in (3,8) AND estado = 1")
	
		
})

public class TarifasA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cod_park")
	private String codPark;
	
	private Integer tipo;
	
	private Integer fraccion;
	
	@Column(name = "fecha_fin")
	private String fechaFin;

	@Column(name = "fecha_ini")
	private String fechaIni;

	@Column(name = "hora_fin")
	private String horaFin;

	@Column(name = "hora_ini")
	private String horaIni;

	private String dia;

	private Integer valor;
	
	private short estado;

	@Column(name = "id_tarifa")
	private Integer idTarifa;
	
	@Column(name = "q_inicial")
	private Integer qInicial;


	@Column(name = "q_final")
	private Integer qFinal;

	
	@Column(name = "tipo_tarifa_m")
	private Integer tipoTarifaM;

	@Column(name = "tipo_vehiculo")
	private Integer tipoVehiculo;

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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getFraccion() {
		return fraccion;
	}

	public void setFraccion(Integer fraccion) {
		this.fraccion = fraccion;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getHoraIni() {
		return horaIni;
	}

	public void setHoraIni(String horaIni) {
		this.horaIni = horaIni;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public Integer getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(Integer idTarifa) {
		this.idTarifa = idTarifa;
	}

	public Integer getqInicial() {
		return qInicial;
	}

	public void setqInicial(Integer qInicial) {
		this.qInicial = qInicial;
	}

	public Integer getqFinal() {
		return qFinal;
	}

	public void setqFinal(Integer qFinal) {
		this.qFinal = qFinal;
	}

	public Integer getTipoTarifaM() {
		return tipoTarifaM;
	}

	public void setTipoTarifaM(Integer tipoTarifaM) {
		this.tipoTarifaM = tipoTarifaM;
	}

	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}