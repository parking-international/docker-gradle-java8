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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kayala <kayala@heinsohn.com.co>
 */
@Entity
@Table(name = "inicio_turno")
@NamedQueries({
    @NamedQuery(name="InicioTurnoUpdate",query="SELECT c FROM InicioTurno c WHERE c.codTerminal=:cod_terminal AND c.codEmpleado=:cod_empleado AND c.idInicioTurno=:id_inicio_turno"),
    @NamedQuery(name="idInicioTurnoQuery",query="SELECT c FROM InicioTurno c WHERE c.codTerminal=:codTerminal order by fecha_inicial desc"),
    @NamedQuery(name="turnoAbierto",query="SELECT c FROM InicioTurno c WHERE c.codTerminal=:codTerminal AND estado=1 order by fecha_inicial desc"),
    @NamedQuery(name="ConsultarInicioTurno",query="SELECT c FROM InicioTurno c WHERE c.idInicioTurno=:idInicioTurno AND codTerminal=:codTerminal"),
    @NamedQuery(name="ConsultarInicioTurnoInicial",query="SELECT c FROM InicioTurno c WHERE c.id_inicio_dia=:idInicioDia AND codTerminal=:codTerminal order by fechaIncial asc"),
    @NamedQuery(name="ConsultarInicioTurnoFinal",query="SELECT c FROM InicioTurno c WHERE c.id_inicio_dia=:idInicioDia AND codTerminal=:codTerminal order by fechaIncial desc")
   
})

@XmlRootElement

public class InicioTurno implements Serializable {


	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
	
	@Column(name = "cod_empleado")
	private String codEmpleado;

	
	@Column(name = "fecha_inicial")
	private String fechaIncial;

	@Column(name = "tiempo_inicial")
	private long tiempoInicial;

	@Column(name = "cod_terminal")
	private String codTerminal;
	
	@Column(name = "id_inicio_turno")
	private Integer idInicioTurno;
	
	@Column(name = "estado")
	private Integer estado;
	
	@Column(name = "turno")
	private long turno;

	@Column(name = "id_inicio_dia")
	private Integer id_inicio_dia;


	@Column(name = "tipo_empleado")
	private Integer tipoEmpleado;

	@Column(name = "tipo_turno")
	private Integer tipoTurno;
	

	@Column(name = "fecha_final")
	private String fechaFinal;
	
	@Column(name = "tiempo_final")
	private long tiempoFinal;

	
	@Column(name = "afiliaciones")
	private Integer afiliaciones;

	@Column(name = "clientes_potenciales")
	private Integer clientesPotenciales;

	@Column(name = "meta_final")
	private Integer metaFinal;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getFechaIncial() {
		return fechaIncial;
	}

	public void setFechaIncial(String fechaIncial) {
		this.fechaIncial = fechaIncial;
	}

	public long getTiempoInicial() {
		return tiempoInicial;
	}

	public void setTiempoInicial(long tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}


	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public long getTurno() {
		return turno;
	}

	public void setTurno(long turno) {
		this.turno = turno;
	}

	public Integer getId_inicio_dia() {
		return id_inicio_dia;
	}

	public void setId_inicio_dia(Integer id_inicio_dia) {
		this.id_inicio_dia = id_inicio_dia;
	}

	public Integer getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(Integer tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public Integer getTipoTurno() {
		return tipoTurno;
	}

	public void setTipoTurno(Integer tipoTurno) {
		this.tipoTurno = tipoTurno;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public long getTiempoFinal() {
		return tiempoFinal;
	}

	public void setTiempoFinal(long tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}

	public Integer getAfiliaciones() {
		return afiliaciones;
	}

	public void setAfiliaciones(Integer afiliaciones) {
		this.afiliaciones = afiliaciones;
	}

	public Integer getClientesPotenciales() {
		return clientesPotenciales;
	}

	public void setClientesPotenciales(Integer clientesPotenciales) {
		this.clientesPotenciales = clientesPotenciales;
	}

	public Integer getMetaFinal() {
		return metaFinal;
	}

	public void setMetaFinal(Integer metaFinal) {
		this.metaFinal = metaFinal;
	}



	public Integer getIdInicioTurno() {
		return idInicioTurno;
	}



	public void setIdInicioTurno(Integer idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}
}
	