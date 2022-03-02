package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the fp_park database table.
 * 
 */
@Entity
@Table(name = "fp_park")
@NamedQuery(name = "FpPark.findAll", query = "SELECT f FROM FpPark f WHERE estado = 1 and codFp in ('EF', 'DT') and codPark=:codPark ")
public class FpPark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "cod_fp")
	private String codFp;

	@Column(name = "cod_park")
	private String codPark;

	private short estado;

	@Column(name = "fecha_fin")
	private String fechaFin;

	@Column(name = "fecha_ini")
	private String fechaIni;

	public FpPark() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodFp() {
		return this.codFp;
	}

	public void setCodFp(String codFp) {
		this.codFp = codFp;
	}

	public String getCodPark() {
		return this.codPark;
	}

	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaIni() {
		return this.fechaIni;
	}

	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}

}