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
 * The persistent class for the cliente_emobi database table.
 * 
 */
@Entity
@Table(name="RUEDAZ_BENEFICIO_REFERIDO")
@NamedQueries({
	@NamedQuery(name="RuedazBeneficio",query="SELECT r FROM RuedazBeneficioReferido r WHERE r.estado=1")
    })
public class RuedazBeneficioReferido implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "VALOR")
	private String valor;
	
	@Column(name = "FECHA")
	private String fecha;

	@Column(name = "ESTADO")
	private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
	
	
	
	