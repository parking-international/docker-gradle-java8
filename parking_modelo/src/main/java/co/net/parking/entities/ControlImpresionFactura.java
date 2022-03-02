package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the control_impresion_facturas database table.
 * 
 */
@Entity
@Table(name = "control_impresion_facturas")
@NamedQuery(name = "ControlImpresionFactura.findAll", query = "SELECT c FROM ControlImpresionFactura c")
public class ControlImpresionFactura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;

	@Column(name = "id_local") private int idLocal;

	@Column(name = "cod_empleado") private String codEmpleado;

	@Column(name = "cod_park") private String codPark;

	@Column(name = "cod_terminal") private String codTerminal;

	@Column(name = "fecha_impresion") private String fechaImpresion;

	@Column(name = "num_factura") private int numFactura;

	private String motivo;

	private String placa;

	public ControlImpresionFactura() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

	public String getCodEmpleado() {
		return this.codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
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

	public String getFechaImpresion() {
		return this.fechaImpresion;
	}

	public void setFechaImpresion(String fechaImpresion) {
		this.fechaImpresion = fechaImpresion;
	}

	public int getNumFactura() {
		return this.numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


}
