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
 * The persistent class for the new_empresa_logo database table.
 * 
 */
@Entity
@Table(name = "new_empresa_logo")

@NamedQueries({@NamedQuery(name = "NewEmpresalogo.findAll", query = "SELECT e FROM NewEmpresaLogo e WHERE codEmpresa=:codEmpresa AND estado=1")})
public class NewEmpresaLogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

	@Column(name = "cod_empresa") private String codEmpresa;

	@Column(name = "logo") private byte[] logo;
	
	@Column(name="documento_resolucion") private String documentoResolucion;

	@Column(name="estado") private int estado;
			
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getDocumentoResolucion() {
		return documentoResolucion;
	}

	public void setDocumentoResolucion(String documentoResolucion) {
		this.documentoResolucion = documentoResolucion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}	
}
