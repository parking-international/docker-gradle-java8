package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the codigos_stickers database table.
 * 
 */
@Entity
@Table(name = "codigos_stickers")
@NamedQueries({ @NamedQuery(name = "CodigosSticker.findAll", query = "SELECT c FROM CodigosSticker c"),
		@NamedQuery(name = "CodigosSticker.buscarPorId", query = "SELECT c FROM CodigosSticker c where c.id=:id"),
		@NamedQuery(name = "CodigosSticker.buscarPorCodigo", query = "SELECT c FROM CodigosSticker c where c.codigo=:codigo and c.estado=0"),
		@NamedQuery(name = "CodigosSticker.buscarPorIdPorCodigo", query = "SELECT c FROM CodigosSticker c where c.id=:id or c.codigo=:codigo") })
@NamedStoredProcedureQuery(name = "sp_leer_csv_carga_sticker", procedureName = "sp_leer_csv_carga_sticker", parameters = {
		@StoredProcedureParameter(name = "csv", mode = ParameterMode.IN, type = String.class) })
public class CodigosSticker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private int id;
	@Column(unique = true)
	private String codigo;

	private short estado;

	private short tipo;

	public CodigosSticker() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public short getEstado() {
		return this.estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

	public short getTipo() {
		return this.tipo;
	}

	public void setTipo(short tipo) {
		this.tipo = tipo;
	}

}