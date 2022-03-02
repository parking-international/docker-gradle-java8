package co.net.parking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="parking_planilla_digital_log_modificacion_datafono")
@NamedQueries({ 
	@NamedQuery(name = "log.modificaciones.datafono", query = "SELECT ppdlmd FROM LogModificacionDatafono ppdlmd where (FORMAT(fecha,'yyyy-MM-dd') BETWEEN :fechaInicial and :fechaFinal) or (numAprobacionNuevo=:NumeroAprobacionNuevo) or (numFactura=:NumeroFactura)"),
//	@NamedQuery(name = "log.modificaciones.datafono", query = "SELECT ppdlmd FROM LogModificacionDatafono ppdlmd")
}) 
public class LogModificacionDatafono
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String numAprobacionAntiguo;
	
	private String numAprobacionNuevo;
	
	private String usuarioModifica;
	
	private String numFactura;
	
	private String nombrePark;
	
	private String fecha;
	
	
	public LogModificacionDatafono() {
	}
	

	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumAprobacionAntiguo() {
		return numAprobacionAntiguo;
	}
	public void setNumAprobacionAntiguo(String numAprobacionAntiguo) {
		this.numAprobacionAntiguo = numAprobacionAntiguo;
	}
	public String getNumAprobacionNuevo() {
		return numAprobacionNuevo;
	}
	public void setNumAprobacionNuevo(String numAprobacionNuevo) {
		this.numAprobacionNuevo = numAprobacionNuevo;
	}
	public String getUsuarioModifica() {
		return usuarioModifica;
	}
	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getNombrePark() {
		return nombrePark;
	}

	public void setNombrePark(String nombrePark) 
	{
		this.nombrePark = nombrePark;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
		
}