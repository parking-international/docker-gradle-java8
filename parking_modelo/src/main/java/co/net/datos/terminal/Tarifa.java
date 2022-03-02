package co.net.datos.terminal;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tarifas database table.
 * 
 */
@Entity
@Table(name="tarifas")
@NamedQueries({
    @NamedQuery(name="Tarifa.findTarifa",query="SELECT t FROM Tarifa t WHERE t.codTerminal=:codTerminal and t.tipo=:tipo AND t.duracionFrac=:duracionFrac AND t.valorOrdinario=:valorOrdinario")
})
public class Tarifa implements Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = -4814863970070920996L;

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="cod_terminal")
	private String codTerminal;

	@Column(name="control_plana")
	private short controlPlana;

	@Column(name="duracion_frac")
	private short duracionFrac;

	private short estado;

	@Column(name="hora_final_mensual")
	private String horaFinalMensual;

	@Column(name="hora_final_ord")
	private String horaFinalOrd;

	@Column(name="hora_inicial_mensual")
	private String horaInicialMensual;

	@Column(name="hora_inicial_ord")
	private String horaInicialOrd;

	private short tipo;

	@Column(name="valor_dia")
	private int valorDia;

	@Column(name="valor_domfest")
	private int valorDomfest;

	@Column(name="valor_mes_d")
	private int valorMesD;

	@Column(name="valor_mes_n")
	private int valorMesN;

	@Column(name="valor_mes_t")
	private int valorMesT;

	@Column(name="valor_nocturno")
	private int valorNocturno;

	@Column(name="valor_ordinario")
	private int valorOrdinario;

	@Column(name="valor_perdido")
	private int valorPerdido;

	@Column(name="valor_plana1")
	private int valorPlana1;

	@Column(name="valor_plana2")
	private int valorPlana2;

	@Column(name="valor_plana3")
	private int valorPlana3;

	@Column(name="valor_plana4")
	private int valorPlana4;

	@Column(name="valor_valet")
	private int valorValet;

	public Tarifa() {
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

	public short getControlPlana() {
		return this.controlPlana;
	}

	public void setControlPlana(short controlPlana) {
		this.controlPlana = controlPlana;
	}

	public short getDuracionFrac() {
		return this.duracionFrac;
	}

	public void setDuracionFrac(short duracionFrac) {
		this.duracionFrac = duracionFrac;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getHoraFinalMensual() {
		return this.horaFinalMensual;
	}

	public void setHoraFinalMensual(String horaFinalMensual) {
		this.horaFinalMensual = horaFinalMensual;
	}

	public String getHoraFinalOrd() {
		return this.horaFinalOrd;
	}

	public void setHoraFinalOrd(String horaFinalOrd) {
		this.horaFinalOrd = horaFinalOrd;
	}

	public String getHoraInicialMensual() {
		return this.horaInicialMensual;
	}

	public void setHoraInicialMensual(String horaInicialMensual) {
		this.horaInicialMensual = horaInicialMensual;
	}

	public String getHoraInicialOrd() {
		return this.horaInicialOrd;
	}

	public void setHoraInicialOrd(String horaInicialOrd) {
		this.horaInicialOrd = horaInicialOrd;
	}

	public short getTipo() {
		return this.tipo;
	}

	public void setTipo(short tipo) {
		this.tipo = tipo;
	}

	public int getValorDia() {
		return this.valorDia;
	}

	public void setValorDia(int valorDia) {
		this.valorDia = valorDia;
	}

	public int getValorDomfest() {
		return this.valorDomfest;
	}

	public void setValorDomfest(int valorDomfest) {
		this.valorDomfest = valorDomfest;
	}

	public int getValorMesD() {
		return this.valorMesD;
	}

	public void setValorMesD(int valorMesD) {
		this.valorMesD = valorMesD;
	}

	public int getValorMesN() {
		return this.valorMesN;
	}

	public void setValorMesN(int valorMesN) {
		this.valorMesN = valorMesN;
	}

	public int getValorMesT() {
		return this.valorMesT;
	}

	public void setValorMesT(int valorMesT) {
		this.valorMesT = valorMesT;
	}

	public int getValorNocturno() {
		return this.valorNocturno;
	}

	public void setValorNocturno(int valorNocturno) {
		this.valorNocturno = valorNocturno;
	}

	public int getValorOrdinario() {
		return this.valorOrdinario;
	}

	public void setValorOrdinario(int valorOrdinario) {
		this.valorOrdinario = valorOrdinario;
	}

	public int getValorPerdido() {
		return this.valorPerdido;
	}

	public void setValorPerdido(int valorPerdido) {
		this.valorPerdido = valorPerdido;
	}

	public int getValorPlana1() {
		return this.valorPlana1;
	}

	public void setValorPlana1(int valorPlana1) {
		this.valorPlana1 = valorPlana1;
	}

	public int getValorPlana2() {
		return this.valorPlana2;
	}

	public void setValorPlana2(int valorPlana2) {
		this.valorPlana2 = valorPlana2;
	}

	public int getValorPlana3() {
		return this.valorPlana3;
	}

	public void setValorPlana3(int valorPlana3) {
		this.valorPlana3 = valorPlana3;
	}

	public int getValorPlana4() {
		return this.valorPlana4;
	}

	public void setValorPlana4(int valorPlana4) {
		this.valorPlana4 = valorPlana4;
	}

	public int getValorValet() {
		return this.valorValet;
	}

	public void setValorValet(int valorValet) {
		this.valorValet = valorValet;
	}

}