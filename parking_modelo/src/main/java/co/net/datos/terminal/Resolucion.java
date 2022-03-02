package co.net.datos.terminal;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the resolucion database table.
 * 
 */
@Entity
@Table(name="resolucion")
@NamedQueries({
    @NamedQuery(name="Resolucion.findAll", query="SELECT r FROM Resolucion r"),
    @NamedQuery(name="Resolucion.findByAllField",query="SELECT r FROM Resolucion r WHERE r.codTerminal=:codTerminal AND r.codPark=:codPark AND"
            + " r.rangoInicial=:rangoInicial AND r.rangoFinal=:rangoFinal AND r.resolucion=:resolucion" )
})

public class Resolucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String codPark;

	private String codTerminal;

	private String nombrePark;

	private String rangoFinal;

	private String rangoInicial;

	private String resolucion;

	public Resolucion() {
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

	public String getNombrePark() {
		return this.nombrePark;
	}

	public void setNombrePark(String nombrePark) {
		this.nombrePark = nombrePark;
	}

	public String getRangoFinal() {
		return this.rangoFinal;
	}

	public void setRangoFinal(String rangoFinal) {
		this.rangoFinal = rangoFinal;
	}

	public String getRangoInicial() {
		return this.rangoInicial;
	}

	public void setRangoInicial(String rangoInicial) {
		this.rangoInicial = rangoInicial;
	}

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

}