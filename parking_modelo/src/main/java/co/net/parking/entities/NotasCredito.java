package co.net.parking.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kayala <kayala@heinsohn.com.co>
 */
@Entity
@Table(name = "notas_credito")
@XmlRootElement
public class NotasCredito implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = -4785785852988008589L;

	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "tipo")
	private Integer tipo;
	
	@Column(name = "cod_terminal")
	private String codTerminal;


	@Column(name = "cod_empleado")
	private String codEmpleado;
	
	@Column(name = "factura")
	private Integer factura;

	@Column(name = "valor_ef_factura")
	private String valorEfFactura;
	
	@Column(name = "valor_nc")
	private String valorNc;
	
	@Column(name = "login_admin")
	private String loginAdmin;
	
	@Column(name = "estado")
	private Integer estado;
	
	@Column(name = "fecha_hora")
	private String fechaHora;	
	
	@Column(name = "concepto")
	private Integer concepto;

	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "act_trans")
	private Integer actTrans;
	
	@Column(name = "id_inicio_turno")
	private Integer idInicioTurno;
	
	@Column(name = "id_nc_local")
	private Integer idNcLocal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public Integer getFactura() {
		return factura;
	}

	public void setFactura(Integer factura) {
		this.factura = factura;
	}

	public String getValorEfFactura() {
		return valorEfFactura;
	}

	public void setValorEfFactura(String valorEfFactura) {
		this.valorEfFactura = valorEfFactura;
	}

	public String getValorNc() {
		return valorNc;
	}

	public void setValorNc(String valorNc) {
		this.valorNc = valorNc;
	}

	public String getLoginAdmin() {
		return loginAdmin;
	}

	public void setLoginAdmin(String loginAdmin) {
		this.loginAdmin = loginAdmin;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Integer getConcepto() {
		return concepto;
	}

	public void setConcepto(Integer concepto) {
		this.concepto = concepto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getActTrans() {
		return actTrans;
	}

	public void setActTrans(Integer actTrans) {
		this.actTrans = actTrans;
	}

	public Integer getIdInicioTurno() {
		return idInicioTurno;
	}

	public void setIdInicioTurno(Integer idInicioTurno) {
		this.idInicioTurno = idInicioTurno;
	}

	public Integer getIdNcLocal() {
		return idNcLocal;
	}

	public void setIdNcLocal(Integer idNcLocal) {
		this.idNcLocal = idNcLocal;
	}
	
	
	
	
	
	
	

	

}