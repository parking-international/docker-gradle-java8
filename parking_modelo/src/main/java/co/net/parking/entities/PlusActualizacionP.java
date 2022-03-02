package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plus_actualizacion_ps database table.
 * 
 */
@Entity
@Table(name="plus_actualizacion_ps")
@NamedQueries({
@NamedQuery(name="placasPlusByTerminal", query="SELECT p FROM PlusActualizacionP p WHERE p.terminal=:terminal AND p.estado=0"),
@NamedQuery(name="PlusActualizacionP.findAll", query="SELECT p FROM PlusActualizacionP p")})
public class PlusActualizacionP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int estado;

	private String placa;

	private String terminal;
	
	private String QR;

	public PlusActualizacionP() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTerminal() {
		return this.terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getQR() {
		return QR;
	}

	public void setQR(String qR) {
		QR = qR;
	}

}