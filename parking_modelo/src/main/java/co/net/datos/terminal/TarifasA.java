package co.net.datos.terminal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 * The persistent class for the tarifas_a database table.
 * 
 */
@Entity
@Table(name="tarifas_a")
@NamedQueries({
    @NamedQuery(name="TarifasA.findTarifa",query="SELECT t FROM TarifasA t WHERE t.codPark=:codPark and t.tipo=:tipo AND tipoVehiculo=:tipoVehiculo AND estado = 1"),
    @NamedQuery(name="TarifasA.findTarifaEspecial",query="SELECT t FROM TarifasA t WHERE t.codPark=:codPark and t.tipo not in (3,8) AND estado = 1")
})


public class TarifasA implements Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = -1110613288129698496L;

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cod_park")
	private String codPark;

	@Column(name="cod_terminal")
	private String codTerminal;

	private String dia;

	private short estado;

	@Column(name="fecha_fin")
	private Date fechaFin;

	@Column(name="fecha_ini")
	private Date fechaIni;

	private int fraccion;

	@Column(name="hora_fin")
	private String horaFin;

	@Column(name="hora_ini")
	private String horaIni;

	@Column(name="q_final")
	@Basic(optional=false)
	private short qFinal;

	@Column(name="q_inicial")
	@Basic(optional=false)
	private short qInicial;

	private int tipo;

	@Column(name="tipo_tarifa_m")
	private short tipoTarifaM;

	@Column(name="tipo_vehiculo")
	private short tipoVehiculo;

	private int valor;

	public TarifasA() {
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

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public Object getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Object getFechaIni() {
		return this.fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public int getFraccion() {
		return this.fraccion;
	}

	public void setFraccion(int fraccion) {
		this.fraccion = fraccion;
	}

	public String getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getHoraIni() {
		return this.horaIni;
	}

	public void setHoraIni(String horaIni) {
		this.horaIni = horaIni;
	}

	public short getQFinal() {
		return this.qFinal;
	}

	public void setQFinal(short qFinal) {
		this.qFinal = qFinal;
	}

	public short getQInicial() {
		return this.qInicial;
	}

	public void setQInicial(short qInicial) {
		this.qInicial = qInicial;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public short getTipoTarifaM() {
		return this.tipoTarifaM;
	}

	public void setTipoTarifaM(short tipoTarifaM) {
		this.tipoTarifaM = tipoTarifaM;
	}

	public short getTipoVehiculo() {
		return this.tipoVehiculo;
	}

	public void setTipoVehiculo(short tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codPark == null) ? 0 : codPark.hashCode());
        result = prime * result + ((codTerminal == null) ? 0 : codTerminal.hashCode());
        result = prime * result + ((dia == null) ? 0 : dia.hashCode());
        result = prime * result + estado;
        result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
        result = prime * result + ((fechaIni == null) ? 0 : fechaIni.hashCode());
        result = prime * result + fraccion;
        result = prime * result + ((horaFin == null) ? 0 : horaFin.hashCode());
        result = prime * result + ((horaIni == null) ? 0 : horaIni.hashCode());
        result = prime * result + qFinal;
        result = prime * result + qInicial;
        result = prime * result + tipo;
        result = prime * result + tipoTarifaM;
        result = prime * result + tipoVehiculo;
        result = prime * result + valor;
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TarifasA other = (TarifasA) obj;
        if (codPark == null) {
            if (other.codPark != null)
                return false;
        } else if (!codPark.equals(other.codPark))
            return false;
        if (codTerminal == null) {
            if (other.codTerminal != null)
                return false;
        } else if (!codTerminal.equals(other.codTerminal))
            return false;
        if (dia == null) {
            if (other.dia != null)
                return false;
        } else if (!dia.equals(other.dia))
            return false;
        if (estado != other.estado)
            return false;
        if (fechaFin == null) {
            if (other.fechaFin != null)
                return false;
        } else if (!fechaFin.equals(other.fechaFin))
            return false;
        if (fechaIni == null) {
            if (other.fechaIni != null)
                return false;
        } else if (!fechaIni.equals(other.fechaIni))
            return false;
        if (fraccion != other.fraccion)
            return false;
        if (horaFin == null) {
            if (other.horaFin != null)
                return false;
        } else if (!horaFin.equals(other.horaFin))
            return false;
        if (horaIni == null) {
            if (other.horaIni != null)
                return false;
        } else if (!horaIni.equals(other.horaIni))
            return false;
        if (qFinal != other.qFinal)
            return false;
        if (qInicial != other.qInicial)
            return false;
        if (tipo != other.tipo)
            return false;
        if (tipoTarifaM != other.tipoTarifaM)
            return false;
        if (tipoVehiculo != other.tipoVehiculo)
            return false;
        if (valor != other.valor)
            return false;
        return true;
    }


	

}