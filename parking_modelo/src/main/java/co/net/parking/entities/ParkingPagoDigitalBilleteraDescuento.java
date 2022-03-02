package co.net.parking.entities;



import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="parking_pago_digital_billetera_descuento")
@NamedQueries({ 
	})  

public class ParkingPagoDigitalBilleteraDescuento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@Column(name = "id_pago_digital_usuario")
	private int idPagoDigitalUsuario;
	
	@Column(name = "valor_descontado")
	private int valorDescontado;
	

	private String fecha;
	
	private String detalle;
	
	@Column(name ="num_recibo_caja")
	private int numReciboCaja;
	
	@Column(name = "cod_terminal")
	private String codTerminal;
	
	private int aplicado;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPagoDigitalUsuario() {
		return idPagoDigitalUsuario;
	}

	public void setIdPagoDigitalUsuario(int idPagoDigitalUsuario) {
		this.idPagoDigitalUsuario = idPagoDigitalUsuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getValorDescontado() {
		return valorDescontado;
	}

	public void setValorDescontado(int valorDescontado) {
		this.valorDescontado = valorDescontado;
	}



	public int getNumReciboCaja() {
		return numReciboCaja;
	}

	public void setNumReciboCaja(int numReciboCaja) {
		this.numReciboCaja = numReciboCaja;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public int getAplicado() {
		return aplicado;
	}

	public void setAplicado(int aplicado) {
		this.aplicado = aplicado;
	}

	

}