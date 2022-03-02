package co.net.parking.entities;

/**
*
*/

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the wb_app_reservas database table.
 * 
 */
@Entity
@Table(name = "impresion")
@NamedQueries({@NamedQuery(name = "Impresion.findAll", query = "SELECT i FROM Impresion i"),
	@NamedQuery(name = "Impresion.consultaPorCodTerminalNumFactura",
		query = " SELECT i FROM Impresion i WHERE i.codTerminal = :codTerminal AND i.numFactura = :numFactura ORDER BY i.fecha DESC "),
	@NamedQuery(name = "Impresion.consultaPorFechaPlacaTipo",
	query = " SELECT i FROM Impresion i WHERE i.fecha >= :fecha AND i.fecha < DATEADD(day,1,:fecha) AND i.placa = :placa AND i.tipo = :tipo ORDER BY i.fecha DESC ")})

public class Impresion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "Id") private int id;

	@Column(name = "Fecha") private Date fecha;

	@Column(name = "Cod_Terminal") private String codTerminal;

	@Column(name = "Num_Factura") private int numFactura;
	
	@Column(name = "Placa") private String placa;

	@Column(name = "Tipo") private int tipo;

	@Column(name = "Data") private byte[] data;

	public Impresion() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
