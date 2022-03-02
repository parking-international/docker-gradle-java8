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

@Entity
@Table(name="mensualidades_terminos_condiciones")
@NamedQueries({
	@NamedQuery(name="acepto.terminos.usuario", query="SELECT m FROM Mensualidad_terminos_condiciones m WHERE m.identificacion_nit=:identificacion_nit")
})
public class Mensualidad_terminos_condiciones
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@Column(name = "identificacion_nit")
	private String identificacion_nit;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "ip")
	private String ip;
	
	@Column(name = "fecha_creacion")
	private String fecha_creacion;
	
	@Column(name = "correo")
	private String correo;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdentificacion_nit() {
		return identificacion_nit;
	}
	public void setIdentificacion_nit(String identificacion_nit) {
		this.identificacion_nit = identificacion_nit;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
