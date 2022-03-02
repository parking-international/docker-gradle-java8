/**
 *
 */
package co.net.datos.terminal;

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
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
@Entity
@Table(name="datos_terminal")
@NamedQueries({
    @NamedQuery(name="DatosTerminal.findByCodTerminal",query="SELECT d FROM DatosTerminal d WHERE d.codTerminal=:codTerminal")
})
public class DatosTerminal implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="cod_terminal")
    private String codTerminal;

    @Column(name="cod_cpu")
    private String codCpu;

    @Column(name="cod_monitor")
    private String codMonitor;

    @Column(name="cod_teclado")
    private String codTeclado;

    @Column(name="cod_mouse")
    private String codMouse;

    @Column(name="cod_lector")
    private String codLector;

    @Column(name="cod_impresora")
    private String codImpresora;

    @Column(name="cod_ups")
    private String codUps;

    @Column(name="cod_tecladonum")
    private String codTecladoNum;

    private Short estado;

    @Column(name="cod_park")
    private String codPark;

    private Short terminales ;

    @Column(name="cod_empresa")
    private String codEmpresa;

    @Column(name="nombre_park")
    private String nombrePark;

    private String direccion;

    @Column(name="centro_costos")
    private String centroCostos;

    private Short plazas;

    @Column(name="nombre_empresa")
    private String nombreEmpresa;

    @Column(name="nit_empresa")
    private String nitEmpresa;

    private String propietarios;

    private Short taxicard;

    @Column(name="punto_pago")
    private String puntoPago;

    @Column(name="base_caja")
    private Integer baseCaja;

    private String identificador;

    private Short red;

    @Column(name="cierre_ope1")
    private String cierreOpe1;

    @Column(name="ajuste_turno")
    private Short ajusteTurno;

    @Column(name="servidor_local")
    private Short servidorLocal;

    @Column(name="ms_sql")
    private Short msSql;

    @Column(name="version_scoip")
    private String versionScoip;

    @Column(name="control_barcode")
    private Short controlBarcode;

    @Column(name="trans_enlinea")
    private Short transEnLinea;

    @Column(name="pico_placa")
    private Short picoPlaca;

    @Column(name="actividad_economica")
    private Integer actividadEconomica;

    private Short donacion;

    /**
     * Devuelve el valor de id
     * @return El valor de id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el valor de id
     * @param id El valor por establecer para id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Devuelve el valor de codTerminal
     * @return El valor de codTerminal
     */
    public String getCodTerminal() {
        return codTerminal;
    }

    /**
     * Establece el valor de codTerminal
     * @param codTerminal El valor por establecer para codTerminal
     */
    public void setCodTerminal(String codTerminal) {
        this.codTerminal = codTerminal;
    }

    /**
     * Devuelve el valor de codCpu
     * @return El valor de codCpu
     */
    public String getCodCpu() {
        return codCpu;
    }

    /**
     * Establece el valor de codCpu
     * @param codCpu El valor por establecer para codCpu
     */
    public void setCodCpu(String codCpu) {
        this.codCpu = codCpu;
    }

    /**
     * Devuelve el valor de codMonitor
     * @return El valor de codMonitor
     */
    public String getCodMonitor() {
        return codMonitor;
    }

    /**
     * Establece el valor de codMonitor
     * @param codMonitor El valor por establecer para codMonitor
     */
    public void setCodMonitor(String codMonitor) {
        this.codMonitor = codMonitor;
    }

    /**
     * Devuelve el valor de codTeclado
     * @return El valor de codTeclado
     */
    public String getCodTeclado() {
        return codTeclado;
    }

    /**
     * Establece el valor de codTeclado
     * @param codTeclado El valor por establecer para codTeclado
     */
    public void setCodTeclado(String codTeclado) {
        this.codTeclado = codTeclado;
    }

    /**
     * Devuelve el valor de codMouse
     * @return El valor de codMouse
     */
    public String getCodMouse() {
        return codMouse;
    }

    /**
     * Establece el valor de codMouse
     * @param codMouse El valor por establecer para codMouse
     */
    public void setCodMouse(String codMouse) {
        this.codMouse = codMouse;
    }

    /**
     * Devuelve el valor de codLector
     * @return El valor de codLector
     */
    public String getCodLector() {
        return codLector;
    }

    /**
     * Establece el valor de codLector
     * @param codLector El valor por establecer para codLector
     */
    public void setCodLector(String codLector) {
        this.codLector = codLector;
    }

    /**
     * Devuelve el valor de codImpresora
     * @return El valor de codImpresora
     */
    public String getCodImpresora() {
        return codImpresora;
    }

    /**
     * Establece el valor de codImpresora
     * @param codImpresora El valor por establecer para codImpresora
     */
    public void setCodImpresora(String codImpresora) {
        this.codImpresora = codImpresora;
    }

    /**
     * Devuelve el valor de codUps
     * @return El valor de codUps
     */
    public String getCodUps() {
        return codUps;
    }

    /**
     * Establece el valor de codUps
     * @param codUps El valor por establecer para codUps
     */
    public void setCodUps(String codUps) {
        this.codUps = codUps;
    }

    /**
     * Devuelve el valor de codTecladoNun
     * @return El valor de codTecladoNun
     */
    public String getCodTecladoNum() {
        return codTecladoNum;
    }

    /**
     * Establece el valor de codTecladoNun
     * @param codTecladoNun El valor por establecer para codTecladoNun
     */
    public void setCodTecladoNum(String codTecladoNum) {
        this.codTecladoNum = codTecladoNum;
    }

    /**
     * Devuelve el valor de estado
     * @return El valor de estado
     */
    public Short getEstado() {
        return estado;
    }

    /**
     * Establece el valor de estado
     * @param estado El valor por establecer para estado
     */
    public void setEstado(Short estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el valor de codPark
     * @return El valor de codPark
     */
    public String getCodPark() {
        return codPark;
    }

    /**
     * Establece el valor de codPark
     * @param codPark El valor por establecer para codPark
     */
    public void setCodPark(String codPark) {
        this.codPark = codPark;
    }

    /**
     * Devuelve el valor de terminales
     * @return El valor de terminales
     */
    public Short getTerminales() {
        return terminales;
    }

    /**
     * Establece el valor de terminales
     * @param terminales El valor por establecer para terminales
     */
    public void setTerminales(Short terminales) {
        this.terminales = terminales;
    }

    /**
     * Devuelve el valor de codEmpresa
     * @return El valor de codEmpresa
     */
    public String getCodEmpresa() {
        return codEmpresa;
    }

    /**
     * Establece el valor de codEmpresa
     * @param codEmpresa El valor por establecer para codEmpresa
     */
    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    /**
     * Devuelve el valor de nombrePark
     * @return El valor de nombrePark
     */
    public String getNombrePark() {
        return nombrePark;
    }

    /**
     * Establece el valor de nombrePark
     * @param nombrePark El valor por establecer para nombrePark
     */
    public void setNombrePark(String nombrePark) {
        this.nombrePark = nombrePark;
    }

    /**
     * Devuelve el valor de direccion
     * @return El valor de direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece el valor de direccion
     * @param direccion El valor por establecer para direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el valor de centroCostos
     * @return El valor de centroCostos
     */
    public String getCentroCostos() {
        return centroCostos;
    }

    /**
     * Establece el valor de centroCostos
     * @param centroCostos El valor por establecer para centroCostos
     */
    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
    }

    /**
     * Devuelve el valor de plazas
     * @return El valor de plazas
     */
    public Short getPlazas() {
        return plazas;
    }

    /**
     * Establece el valor de plazas
     * @param plazas El valor por establecer para plazas
     */
    public void setPlazas(Short plazas) {
        this.plazas = plazas;
    }

    /**
     * Devuelve el valor de nombreEmpresa
     * @return El valor de nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Establece el valor de nombreEmpresa
     * @param nombreEmpresa El valor por establecer para nombreEmpresa
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * Devuelve el valor de nitEmpresa
     * @return El valor de nitEmpresa
     */
    public String getNitEmpresa() {
        return nitEmpresa;
    }

    /**
     * Establece el valor de nitEmpresa
     * @param nitEmpresa El valor por establecer para nitEmpresa
     */
    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    /**
     * Devuelve el valor de propietarios
     * @return El valor de propietarios
     */
    public String getPropietarios() {
        return propietarios;
    }

    /**
     * Establece el valor de propietarios
     * @param propietarios El valor por establecer para propietarios
     */
    public void setPropietarios(String propietarios) {
        this.propietarios = propietarios;
    }

    /**
     * Devuelve el valor de taxicad
     * @return El valor de taxicad
     */
    public Short getTaxicard() {
        return taxicard;
    }

    /**
     * Establece el valor de taxicad
     * @param taxicad El valor por establecer para taxicad
     */
    public void setTaxicard(Short taxicard) {
        this.taxicard = taxicard;
    }

    /**
     * Devuelve el valor de puntoPago
     * @return El valor de puntoPago
     */
    public String getPuntoPago() {
        return puntoPago;
    }

    /**
     * Establece el valor de puntoPago
     * @param puntoPago El valor por establecer para puntoPago
     */
    public void setPuntoPago(String puntoPago) {
        this.puntoPago = puntoPago;
    }

    /**
     * Devuelve el valor de baseCaja
     * @return El valor de baseCaja
     */
    public Integer getBaseCaja() {
        return baseCaja;
    }

    /**
     * Establece el valor de baseCaja
     * @param baseCaja El valor por establecer para baseCaja
     */
    public void setBaseCaja(Integer baseCaja) {
        this.baseCaja = baseCaja;
    }

    /**
     * Devuelve el valor de identificador
     * @return El valor de identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Establece el valor de identificador
     * @param identificador El valor por establecer para identificador
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Devuelve el valor de red
     * @return El valor de red
     */
    public Short getRed() {
        return red;
    }

    /**
     * Establece el valor de red
     * @param red El valor por establecer para red
     */
    public void setRed(Short red) {
        this.red = red;
    }

    /**
     * Devuelve el valor de cierreOpe1
     * @return El valor de cierreOpe1
     */
    public String getCierreOpe1() {
        return cierreOpe1;
    }

    /**
     * Establece el valor de cierreOpe1
     * @param cierreOpe1 El valor por establecer para cierreOpe1
     */
    public void setCierreOpe1(String cierreOpe1) {
        this.cierreOpe1 = cierreOpe1;
    }

    /**
     * Devuelve el valor de ajusteTurno
     * @return El valor de ajusteTurno
     */
    public Short getAjusteTurno() {
        return ajusteTurno;
    }

    /**
     * Establece el valor de ajusteTurno
     * @param ajusteTurno El valor por establecer para ajusteTurno
     */
    public void setAjusteTurno(Short ajusteTurno) {
        this.ajusteTurno = ajusteTurno;
    }

    /**
     * Devuelve el valor de servidorLocal
     * @return El valor de servidorLocal
     */
    public Short getServidorLocal() {
        return servidorLocal;
    }

    /**
     * Establece el valor de servidorLocal
     * @param servidorLocal El valor por establecer para servidorLocal
     */
    public void setServidorLocal(Short servidorLocal) {
        this.servidorLocal = servidorLocal;
    }

    /**
     * Devuelve el valor de msSql
     * @return El valor de msSql
     */
    public Short getMsSql() {
        return msSql;
    }

    /**
     * Establece el valor de msSql
     * @param msSql El valor por establecer para msSql
     */
    public void setMsSql(Short msSql) {
        this.msSql = msSql;
    }

    /**
     * Devuelve el valor de versionScoip
     * @return El valor de versionScoip
     */
    public String getVersionScoip() {
        return versionScoip;
    }

    /**
     * Establece el valor de versionScoip
     * @param versionScoip El valor por establecer para versionScoip
     */
    public void setVersionScoip(String versionScoip) {
        this.versionScoip = versionScoip;
    }

    /**
     * Devuelve el valor de controlBarcode
     * @return El valor de controlBarcode
     */
    public Short getControlBarcode() {
        return controlBarcode;
    }

    /**
     * Establece el valor de controlBarcode
     * @param controlBarcode El valor por establecer para controlBarcode
     */
    public void setControlBarcode(Short controlBarcode) {
        this.controlBarcode = controlBarcode;
    }

    /**
     * Devuelve el valor de transEnLinea
     * @return El valor de transEnLinea
     */
    public Short getTransEnLinea() {
        return transEnLinea;
    }

    /**
     * Establece el valor de transEnLinea
     * @param transEnLinea El valor por establecer para transEnLinea
     */
    public void setTransEnLinea(Short transEnLinea) {
        this.transEnLinea = transEnLinea;
    }

    /**
     * Devuelve el valor de pipoPlaca
     * @return El valor de pipoPlaca
     */
    public Short getPicoPlaca() {
        return picoPlaca;
    }

    /**
     * Establece el valor de pipoPlaca
     * @param pipoPlaca El valor por establecer para pipoPlaca
     */
    public void setPicoPlaca(Short picoPlaca) {
        this.picoPlaca = picoPlaca;
    }

    /**
     * Devuelve el valor de actividadEconomica
     * @return El valor de actividadEconomica
     */
    public Integer getActividadEconomica() {
        return actividadEconomica;
    }

    /**
     * Establece el valor de actividadEconomica
     * @param actividadEconomica El valor por establecer para actividadEconomica
     */
    public void setActividadEconomica(Integer actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    /**
     * Devuelve el valor de donacion
     * @return El valor de donacion
     */
    public Short getDonacion() {
        return donacion;
    }

    /**
     * Establece el valor de donacion
     * @param donacion El valor por establecer para donacion
     */
    public void setDonacion(Short donacion) {
        this.donacion = donacion;
    }

}
