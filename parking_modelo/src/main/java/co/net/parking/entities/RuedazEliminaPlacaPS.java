package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RUEDAZ_ELIMINA_PLACA_PS database table.
 * placasPlusByTerminal
 */
@Entity
@Table(name="RUEDAZ_ELIMINA_PLACA_PS")
@NamedQueries({
@NamedQuery(name="ruedazPlacasEliminar", query="SELECT p FROM RuedazEliminaPlacaPS p WHERE p.terminal=:terminal AND p.estado=0")})
@NamedStoredProcedureQuery(
		name = "RUEDAZ_ELIMINA_PLACA", 
		procedureName = "RUEDAZ_ELIMINA_PLACA",
		parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "placa")
				
		}
)
public class RuedazEliminaPlacaPS implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int estado;

	private String placa;

	private String terminal;
	

	public RuedazEliminaPlacaPS() {
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

}