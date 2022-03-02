/**
 * 
 */
package co.net.parking.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
public class MensualDetalleDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String contrato;
    private String codpark;
    private String placa;
    private Date fechaInicial;
    private Date fechaFinal;
    private String horaInicial;
    private String horaFinal;
    private int horario;
    private String diasAplica;
    private String codtarjeta;
    private int estado;
    private int cupos;
    private int ocupacion;
    private int tipoVehiculo;
    private int tipoCliente;
    /**
     * Devuelve el valor de contrato
     * @return El valor de contrato
     */
    public String getContrato() {
        return contrato;
    }
    /**
     * Establece el valor de contrato
     * @param contrato El valor por establecer para contrato
     */
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    /**
     * Devuelve el valor de codpark
     * @return El valor de codpark
     */
    public String getCodpark() {
        return codpark;
    }
    /**
     * Establece el valor de codpark
     * @param codpark El valor por establecer para codpark
     */
    public void setCodpark(String codpark) {
        this.codpark = codpark;
    }
    /**
     * Devuelve el valor de serial
     * @return El valor de serial
     */
    public String getPlaca() {
        return placa;
    }
    /**
     * Establece el valor de serial
     * @param serial El valor por establecer para serial
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Devuelve el valor de fechaInicial
     * @return El valor de fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }
    /**
     * Establece el valor de fechaInicial
     * @param fechaInicial El valor por establecer para fechaInicial
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }
    /**
     * Devuelve el valor de fechaFinal
     * @return El valor de fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }
    /**
     * Establece el valor de fechaFinal
     * @param fechaFinal El valor por establecer para fechaFinal
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    /**
     * Devuelve el valor de horaInicial
     * @return El valor de horaInicial
     */
    public String getHoraInicial() {
        return horaInicial;
    }
    /**
     * Establece el valor de horaInicial
     * @param horaInicial El valor por establecer para horaInicial
     */
    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }
    /**
     * Devuelve el valor de horaFinal
     * @return El valor de horaFinal
     */
    public String getHoraFinal() {
        return horaFinal;
    }
    /**
     * Establece el valor de horaFinal
     * @param horaFinal El valor por establecer para horaFinal
     */
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }
    /**
     * Devuelve el valor de horario
     * @return El valor de horario
     */
    public int getHorario() {
        return horario;
    }
    /**
     * Establece el valor de horario
     * @param horario El valor por establecer para horario
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }
    /**
     * Devuelve el valor de diasAplica
     * @return El valor de diasAplica
     */
    public String getDiasAplica() {
        return diasAplica;
    }
    /**
     * Establece el valor de diasAplica
     * @param diasAplica El valor por establecer para diasAplica
     */
    public void setDiasAplica(String diasAplica) {
        this.diasAplica = diasAplica;
    }
    /**
     * Devuelve el valor de codtarjeta
     * @return El valor de codtarjeta
     */
    public String getCodtarjeta() {
        return codtarjeta;
    }
    /**
     * Establece el valor de codtarjeta
     * @param codtarjeta El valor por establecer para codtarjeta
     */
    public void setCodtarjeta(String codtarjeta) {
        this.codtarjeta = codtarjeta;
    }
    /**
     * Devuelve el valor de estado
     * @return El valor de estado
     */
    public int getEstado() {
        return estado;
    }
    /**
     * Establece el valor de estado
     * @param estado El valor por establecer para estado
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
    /**
     * Devuelve el valor de cupos
     * @return El valor de cupos
     */
    public int getCupos() {
        return cupos;
    }
    /**
     * Establece el valor de cupos
     * @param cupos El valor por establecer para cupos
     */
    public void setCupos(int cupos) {
        this.cupos = cupos;
    }
    /**
     * Devuelve el valor de ocupacion
     * @return El valor de ocupacion
     */
    public int getOcupacion() {
        return ocupacion;
    }
    /**
     * Establece el valor de ocupacion
     * @param ocupacion El valor por establecer para ocupacion
     */
    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }
    /**
     * Devuelve el valor de tipoVehiculo
     * @return El valor de tipoVehiculo
     */
    public int getTipoVehiculo() {
        return tipoVehiculo;
    }
    /**
     * Establece el valor de tipoVehiculo
     * @param tipoVehiculo El valor por establecer para tipoVehiculo
     */
    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    /**
     * Devuelve el valor de tipoCliente
     * @return El valor de tipoCliente
     */
    public int getTipoCliente() {
        return tipoCliente;
    }
    /**
     * Establece el valor de tipoCliente
     * @param tipoCliente El valor por establecer para tipoCliente
     */
    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    
}
