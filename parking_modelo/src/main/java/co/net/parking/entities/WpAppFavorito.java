package co.net.parking.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wp_app_favoritos database table.
 * 
 */
@Entity
@Table(name="wp_app_favoritos")
@NamedQueries({
@NamedQuery(name="WpAppFavorito.findAll", query="SELECT w FROM WpAppFavorito w"),
@NamedQuery(name="WpAppFavorito.findbyIdentificacionPark",query="SELECT w FROM WpAppFavorito w WHERE numIdentificacion=:numIdentificacion AND codPark=:codPark"), 
@NamedQuery(name="WpAppFavorito.ListaFavoritosUsuario",query="SELECT w FROM WpAppFavorito w WHERE numIdentificacion=:numIdentificacion AND estado=:estado")
})
public class WpAppFavorito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cod_park")
	private String codPark;

	private int estado;

	@Column(name="num_identificacion")
	private String numIdentificacion;

	public WpAppFavorito() {
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

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNumIdentificacion() {
		return this.numIdentificacion;
	}

	public void setNumIdentificacion(String numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}

}