/**
 *
 */
package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the wb_app_reservas database table.
 * 
 */
@Entity
@Table(name="wp_app_reservas")
@NamedQueries({ @NamedQuery(name = "Reserva.findAll", query = "SELECT t FROM Reserva t"),
	@NamedQuery(name = "Reserva.consultaPorCedula", query = "SELECT t FROM Reserva t where t.cedula=:cedula AND t.estado=1 order by horaIngreso desc"),
	@NamedQuery(name = "Reserva.consultaPorPark", query = "SELECT t FROM Reserva t where t.codTerminal=:codTerminal AND t.estado=1"),
	@NamedQuery(name = "Reserva.consultaPorPlaca", query = "SELECT t FROM Reserva t where t.placa=:placa"),
	@NamedQuery(name = "Reserva.consultaPorFecha", query = "SELECT t FROM Reserva t where t.fechaReserva between :fecha and :fecha"),
	@NamedQuery(name = "Reserva.consultaPorEstado", query = "SELECT t FROM Reserva t where t.estado=:estado"),
	@NamedQuery(name = "Reserva.consultaPorCedulaParkFechaHora", query = "SELECT t FROM Reserva t WHERE t.codPark=:codPark AND t.placa=:placa AND t.estado=:estado order by horaIngreso desc"),
    @NamedQuery(name = "Reserva.consultaPorParkProcesado", query = "SELECT t FROM Reserva t where t.codTerminal=:codTerminal AND t.procesado=0")
})

public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long cedula;

	private String codPark;
	private String codTerminal;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoReserva;

	private int estado;

	private String fechaReserva;

	private String horaIngreso;

	private String horaSalida;

	private String placa;

	private int valorReserva;

	private int valorReservaCalculado;
	
	private String fechaProcesado;
	
	@Column(name="procesado")
	private int procesado;
	

	public String getFechaProcesado() {
		return fechaProcesado;
	}

	public void setFechaProcesado(String fechaProcesado) {
		this.fechaProcesado = fechaProcesado;
	}

	
	public int getProcesado() {
		return procesado;
	}
	
	

	public void setProcesado(int procesado) {
		this.procesado = procesado;
	}

	public Reserva() {
	}

	public Long getCedula() {
		return this.cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public Integer getCodigoReserva() {
		return this.codigoReserva;
	}

	public void setCodigoReserva(Integer codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public int getEstado() {
		return this.estado;
	}
	
	

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFechaReserva() {
		return this.fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getHoraIngreso() {
		return this.horaIngreso;
	}

	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public String getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getValorReserva() {
		return this.valorReserva;
	}

	public void setValorReserva(int valorReserva) {
		this.valorReserva = valorReserva;
	}

	public int getValorReservaCalculado() {
		return this.valorReservaCalculado;
	}

	public void setValorReservaCalculado(int valorReservaCalculado) {
		this.valorReservaCalculado = valorReservaCalculado;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	
	

}