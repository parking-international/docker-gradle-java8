package co.net.beparking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BpLlavePassword database table.
 * 
 */
@Entity
@NamedQuery(name="BpLlavePassword.findAll", query="SELECT b FROM BpLlavePassword b")
public class BpLlavePassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Cedula")
	private String cedula;

	@Column(name="Estado")
	private short estado;

	@Column(name="Llave")
	private String llave;

	public BpLlavePassword() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public String getLlave() {
		return this.llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}

}