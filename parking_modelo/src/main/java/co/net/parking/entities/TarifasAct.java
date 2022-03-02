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
		@NamedQuery(name = "TarifasActi", query = "SELECT t FROM TarifasAct t WHERE t.codPark=:codPark AND t.estado = 1 AND tipoVehiculo=:tipoVehiculo AND t.tipo in (20,21)"),
		@NamedQuery(name = "TarifasActivas", query = "SELECT t FROM TarifasAct t WHERE t.codPark=:codPark AND t.estado = 1 AND t.tipo in (20,21)")
		
})

public class TarifasAct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cod_park")
	private String codPark;
	
	private int tipo;
	
	private int fraccion;
	
	@Column(name = "fecha_fin")
	private String fechaFin;

	@Column(name = "fecha_ini")
	private String fechaIni;

	@Column(name = "hora_fin")
	private String horaFin;

	@Column(name = "hora_ini")
	private String horaIni;

	private String dia;

	private int valor;
	
	private short estado;

	@Column(name = "id_tarifa")
	private int idTarifa;
	
	@Column(name = "q_inicial")
	private int qInicial;


	@Column(name = "q_final")
	private int qFinal;

	
	@Column(name = "tipo_tarifa_m")
	private int tipoTarifaM;

	@Column(name = "tipo_vehiculo")
	private int tipoVehiculo;

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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getFraccion() {
		return fraccion;
	}

	public void setFraccion(int fraccion) {
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

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public int getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}

	public int getqInicial() {
		return qInicial;
	}

	public void setqInicial(int qInicial) {
		this.qInicial = qInicial;
	}

	public int getqFinal() {
		return qFinal;
	}

	public void setqFinal(int qFinal) {
		this.qFinal = qFinal;
	}

	public int getTipoTarifaM() {
		return tipoTarifaM;
	}

	public void setTipoTarifaM(int tipoTarifaM) {
		this.tipoTarifaM = tipoTarifaM;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}