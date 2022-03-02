package co.net.parking.entities;



import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_respuestas_encuesta")
@NamedQueries({ 
	})  

public class ParkingRespuestaEncuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "id_pregunta")
	private int idPregunta;
	
	@Column(name = "nombre_empleado")
	private String nombreEmpleado;
	
	@Column(name = "cod_empleado")
	private String codEmpleado;

	@Column(name = "cod_park")
	private String codPark;

	@Column(name = "fecha_respuesta")
	private String fechaRespuesta;

	private String afirmativa;

	private String negativa;
	
	private String opcion1;
	private String opcion2;
	private String opcion3;
	private String opcion4;
	private String opcion5;
	private String opcion6;
	private String opcion7;
	private String opcion8;
	private String opcion9;
	private String opcion10;
	private String respuesta;
	private String recomendacion;

	public String getAfirmativa() {
		return afirmativa;
	}
	public void setAfirmativa(String afirmativa) {
		this.afirmativa = afirmativa;
	}
	public String getNegativa() {
		return negativa;
	}
	public void setNegativa(String negativa) {
		this.negativa = negativa;
	}

	public String getRecomendacion() {
		return recomendacion;
	}
	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPregunta() {
		return idPregunta;
	}
	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getCodPark() {
		return codPark;
	}
	public void setCodPark(String codPark) {
		this.codPark = codPark;
	}
	public String getFechaRespuesta() {
		return fechaRespuesta;
	}
	public void setFechaRespuesta(String fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getOpcion1() {
		return opcion1;
	}
	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}
	public String getOpcion2() {
		return opcion2;
	}
	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}
	public String getOpcion3() {
		return opcion3;
	}
	public void setOpcion3(String opcion3) {
		this.opcion3 = opcion3;
	}
	public String getOpcion4() {
		return opcion4;
	}
	public void setOpcion4(String opcion4) {
		this.opcion4 = opcion4;
	}
	public String getOpcion5() {
		return opcion5;
	}
	public void setOpcion5(String opcion5) {
		this.opcion5 = opcion5;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOpcion7() {
		return opcion7;
	}
	public void setOpcion7(String opcion7) {
		this.opcion7 = opcion7;
	}

	public String getOpcion6() {
		return opcion6;
	}
	public void setOpcion6(String opcion6) {
		this.opcion6 = opcion6;
	}
	public String getOpcion8() {
		return opcion8;
	}
	public void setOpcion8(String opcion8) {
		this.opcion8 = opcion8;
	}
	public String getOpcion9() {
		return opcion9;
	}
	public void setOpcion9(String opcion9) {
		this.opcion9 = opcion9;
	}
	public String getOpcion10() {
		return opcion10;
	}
	public void setOpcion10(String opcion10) {
		this.opcion10 = opcion10;
	}
}