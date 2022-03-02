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
@Table(name = "inicio_dia")
@NamedQueries({
	  @NamedQuery(name="idInicioDia",query="SELECT c FROM InicioDia c WHERE c.codTerminal=:codTerminal AND CONVERT (date, getdate())=CONVERT (date, fecha_hora) order by fechaHora desc"),
	  @NamedQuery(name="idInicioDiaUltimo",query="SELECT c FROM InicioDia c WHERE c.codTerminal=:codTerminal order by fechaHora desc")

})

@XmlRootElement

public class InicioDia implements Serializable {


	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "cod_terminal")
	private String codTerminal;
	
	@Column(name = "fecha_hora")
	private String fechaHora;

	@Column(name = "tiempo_inicial")
	private long tiempoInicial;

	private Integer turnos;
	
	private Integer estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public long getTiempoInicial() {
		return tiempoInicial;
	}

	public void setTiempoInicial(long tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public Integer getTurnos() {
		return turnos;
	}

	public void setTurnos(Integer turnos) {
		this.turnos = turnos;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}