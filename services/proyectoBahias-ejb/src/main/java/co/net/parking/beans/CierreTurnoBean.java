package co.net.parking.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.net.parking.dto.AcumuladoTransaccionesDTO;
import co.net.parking.dto.CierreTurnoDTO;
import co.net.parking.dto.RespuestaCierreTurnoDTO;
import co.net.parking.entities.CierreTurno;
import co.net.parking.entities.InicioTurno;
import co.net.parking.entities.TransV130;
import co.net.parking.util.Util;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Modulo:</b> Parking SIP- <br/>
 *
 * @author kayala <kayala@parking.net.co>
 */

@Stateless
public class CierreTurnoBean {
	@PersistenceContext(unitName = Util.UP_TRANSACCION_PARKING)
	private EntityManager em;

    public void addTransaccion(CierreTurno cierreTurno, InicioTurno inicioTurno){
    	Query q = em.createNamedQuery("consultaCierreTurno");
		q.setParameter("codTerminal", cierreTurno.getCodTerminal());
		q.setParameter("fechaIncial", cierreTurno.getFechaIncial());
		q.setParameter("fechaFinal", cierreTurno.getFechaFinal());
		List<CierreTurno> resultados = q.getResultList();
		if (resultados.isEmpty()) {
    	em.persist(cierreTurno);
    	actualizarInicioTurno(inicioTurno);
		}
    	
    }
    public AcumuladoTransaccionesDTO acumuladoTranscciones(int idInicioTurno,String codTerminal) {
    	AcumuladoTransaccionesDTO acumuladoTransacciones = new AcumuladoTransaccionesDTO();
    	int totalEfectivo=0;
    	int totalDatafono=0;
    	int numTransacciones=0;
    	int primeraFactura=0;
    	int ultimaFactura=0;
    	int perdido=0;
    	Query q = em.createNamedQuery("TotalEfectivoCierreTurno");
    	q.setParameter("codTerminal", codTerminal);
		q.setParameter("idInicioTurno", idInicioTurno);
		

		
		
		@SuppressWarnings("unchecked")
		List<TransV130> listaTransacciones = q.getResultList();
		if (!listaTransacciones.isEmpty()) {
			for (TransV130 transaccion : listaTransacciones)

			{
				totalEfectivo+=transaccion.getTotal();
				numTransacciones+=1;
				perdido+=transaccion.getPerdido();
			}
			try {
				TransV130 transPrimera=this.primeraFactura(codTerminal, idInicioTurno);
				TransV130 transUltima=this.ultimaFactura(codTerminal,idInicioTurno);
				primeraFactura=transPrimera.getNumFactura();
				ultimaFactura=transUltima.getNumFactura();
			}catch (Exception e) {
			}
			acumuladoTransacciones.setNumTransacciones(numTransacciones);
			acumuladoTransacciones.setTotalCalculadoSistema(totalEfectivo);
			acumuladoTransacciones.setFacturaInicial(primeraFactura);
			acumuladoTransacciones.setFacturaFinal(ultimaFactura);
			acumuladoTransacciones.setPerdidos(perdido);
		}
		Query q2 = em.createNamedQuery("TotalDatafonoCierreTurno");
    	q2.setParameter("codTerminal", codTerminal);
		q2.setParameter("idInicioTurno", idInicioTurno);
		
		List<TransV130> listaTransaccionesDat = q2.getResultList();
		if (!listaTransaccionesDat.isEmpty()) {
			for (TransV130 transaccion : listaTransaccionesDat)

			{
				totalDatafono+=transaccion.getTotal();
				numTransacciones+=1;
				perdido+=transaccion.getPerdido();
			}
			try {
				TransV130 transPrimera=this.primeraFactura(codTerminal, idInicioTurno);
				TransV130 transUltima=this.ultimaFactura(codTerminal,idInicioTurno);
				primeraFactura=transPrimera.getNumFactura();
				ultimaFactura=transUltima.getNumFactura();
			}catch (Exception e) {
			}
			acumuladoTransacciones.setNumTransacciones(numTransacciones);
			acumuladoTransacciones.setTotalCalculadoSistema(totalEfectivo);
			acumuladoTransacciones.setFacturaInicial(primeraFactura);
			acumuladoTransacciones.setFacturaFinal(ultimaFactura);
			acumuladoTransacciones.setPerdidos(perdido);
		}
		acumuladoTransacciones.setTotalCalculadoSistemaDatafono(totalDatafono);
		return acumuladoTransacciones;
	}
    	
    
    public RespuestaCierreTurnoDTO armarCiereTurno(CierreTurnoDTO cierreTurnoDTO) {
    	InicioTurno inicioTurno=this.consultarInicioTurno(cierreTurnoDTO.getIdInicioTurno(), cierreTurnoDTO.getCodTerminal());
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fechaString = format.format(new Date());
		inicioTurno.setFechaFinal(fechaString);
		int idInicioTurno=cierreTurnoDTO.getIdInicioTurno();
		 AcumuladoTransaccionesDTO acumuladoTransacciones = this.acumuladoTranscciones(cierreTurnoDTO.getIdInicioTurno(), cierreTurnoDTO.getCodTerminal());
    	CierreTurno cierreTurno=new CierreTurno();
    	cierreTurno.setAcumulado(0);
    	cierreTurno.setAsticker(0);
    	cierreTurno.setCantBonosBancolombia(0);
    	cierreTurno.setCantidadBigpass(0);
    	cierreTurno.setCantidadCambioPrepark(0);
    	cierreTurno.setCantidadCheque(0);
    	cierreTurno.setCantidadConvenio(0);
    	cierreTurno.setCantidadDatafono(0);
    	cierreTurno.setCantidadEfectivo(1);
    	cierreTurno.setCantidadMensuales(0);
    	cierreTurno.setCantidadPrepark(0);
    	cierreTurno.setCantidadRecargaPrepark(0);
    	cierreTurno.setCantidadSinCobro(0);
    	cierreTurno.setCantidadStickers(0);
    	cierreTurno.setCantidadVentaMensuales(0);
    	cierreTurno.setCantidadVentaPrepark(0);
    	cierreTurno.setCantidadVip(0);
    	cierreTurno.setCgroupon(0);
    	cierreTurno.setClifemiles(0);
    	cierreTurno.setCnum_comprobante(0);
    	cierreTurno.setCodEmpleado(cierreTurnoDTO.getCodEmpleado());
    	cierreTurno.setCodPark(cierreTurnoDTO.getCodPark());
    	cierreTurno.setCodTerminal(cierreTurnoDTO.getCodTerminal());
    	cierreTurno.setCperiodoGracia(0);
    	cierreTurno.setCpropietario(0);
    	cierreTurno.setCtarjeta_b(0);
    	cierreTurno.setPlazasOcupadas(0);
    	cierreTurno.setCtaxicard(0);
    	if(cierreTurnoDTO.getReportado()>=acumuladoTransacciones.getTotalCalculadoSistema()) {
    	cierreTurno.setEstado(1);
    	}else {
    		cierreTurno.setEstado(2);
    	}
    	cierreTurno.setFacturaFinal(acumuladoTransacciones.getFacturaFinal());
    	cierreTurno.setFacturaInicial(acumuladoTransacciones.getFacturaInicial());
		cierreTurno.setFechaFinal(inicioTurno.getFechaFinal());
		cierreTurno.setFechaIncial(inicioTurno.getFechaIncial());
		cierreTurno.setId_inicio_dia(inicioTurno.getId_inicio_dia());
		cierreTurno.setId_inicio_turno(idInicioTurno);
		cierreTurno.setIva_groupon(0);
		cierreTurno.setIva_lifemiles(0);
		cierreTurno.setIvaCheque(0);
		
		int subtotalEfect = (int) Math.round(((acumuladoTransacciones.getTotalCalculadoSistema()) / 1.19)); 
		int subtotalDatafono = (int) Math.round(((acumuladoTransacciones.getTotalCalculadoSistemaDatafono()) / 1.19)); 
		int ivaEfc=0;
		if(acumuladoTransacciones.getTotalCalculadoSistema()>0){
			ivaEfc=acumuladoTransacciones.getTotalCalculadoSistema()-subtotalEfect;
		}
				
		int ivaDat=0;
		if(acumuladoTransacciones.getTotalCalculadoSistemaDatafono()>0){
			ivaDat=acumuladoTransacciones.getTotalCalculadoSistemaDatafono()-subtotalDatafono;
		}
		cierreTurno.setIvaDatafono(ivaDat);
		cierreTurno.setIvaEfectivo(ivaEfc);
		cierreTurno.setIvaPrepark(0);
		cierreTurno.setJustificacion("BAHIAS");
		cierreTurno.setNotas_credito(0);
		cierreTurno.setPlazasDisponibles(0);
		cierreTurno.setReciboCajaFinal(0);
		cierreTurno.setReciboCajaInicial(0);
		cierreTurno.setReportado(cierreTurnoDTO.getReportado());
		cierreTurno.setSubtotal(subtotalEfect+subtotalDatafono);
		cierreTurno.setTiempoFinal(0);
		cierreTurno.setTiempoInicial(0);
		cierreTurno.setTiempoTotal(0);
		cierreTurno.setTipoEmpleado(1);
		cierreTurno.setTipoTurno(1);
		cierreTurno.setTotal(acumuladoTransacciones.getTotalCalculadoSistema());
		cierreTurno.setTotal_cuponatic(0);
		cierreTurno.setTotal_donacion(0);
		cierreTurno.setTotal_ef_valet_park(0);
		cierreTurno.setTotal_efectivo_valet(0);
		cierreTurno.setTotal_gp(0);
		cierreTurno.setTotal_lifemiles(0);
		cierreTurno.setTotal_recarga_pp_ch(0);
		cierreTurno.setTotal_recarga_pp_ef(0);
		cierreTurno.setTotal_recarga_pp_tc(0);
		cierreTurno.setTotal_reimpresion(0);
		cierreTurno.setTotal_tc_valet(0);
		cierreTurno.setTotal_transOff(0);
		cierreTurno.setTotal_venta_ts(0);
		cierreTurno.setTotalBonoRegalo(0);
		cierreTurno.setTotalCambioPrepark(acumuladoTransacciones.getPerdidos());
		cierreTurno.setTotalCheque(0);
		cierreTurno.setTotalDatafono(acumuladoTransacciones.getTotalCalculadoSistemaDatafono());
		cierreTurno.setTotalEfectivo(acumuladoTransacciones.getTotalCalculadoSistema());
		cierreTurno.setTotalMensualesCheque(0);
		cierreTurno.setTotalMensualesDatafono(0);
		cierreTurno.setTotalMensualesEfectivo(0);
		cierreTurno.setTotalPrepark(0);
		cierreTurno.setTotalValoresBigpass(0);
		cierreTurno.setTotalVentaPreparkCheque(0);
		cierreTurno.setTotalVentaPreparkDatafono(0);
		cierreTurno.setTotalVentaPreparkEfectivo(0);
		cierreTurno.setTransacciones(acumuladoTransacciones.getNumTransacciones());
		cierreTurno.setTransmitido(1);
		
		this.addTransaccion(cierreTurno, inicioTurno);
		
		RespuestaCierreTurnoDTO respuestaCierreTurno=new RespuestaCierreTurnoDTO();

		if(cierreTurno.getEstado()==2) {
		respuestaCierreTurno.setEfectivoAEntregar(String.valueOf(acumuladoTransacciones.getTotalCalculadoSistema()));
		}else {
		respuestaCierreTurno.setEfectivoAEntregar(String.valueOf(cierreTurno.getReportado()));
		}
		respuestaCierreTurno.setEfectivoReportado(String.valueOf(cierreTurno.getReportado()));
		respuestaCierreTurno.setEfectivoCalculadoSistema(String.valueOf(acumuladoTransacciones.getTotalCalculadoSistema()));
		respuestaCierreTurno.setFacturaFinal(String.valueOf(cierreTurno.getFacturaFinal()));
		respuestaCierreTurno.setFacturaInicial(String.valueOf(cierreTurno.getFacturaInicial()));
		respuestaCierreTurno.setFechaInicioTurno(inicioTurno.getFechaIncial());
		respuestaCierreTurno.setFechaFinTurno(inicioTurno.getFechaFinal());
		respuestaCierreTurno.setDatafonoCalculadoSistema(String.valueOf(acumuladoTransacciones.getTotalCalculadoSistemaDatafono()));

		
		
		return respuestaCierreTurno;
    	
    }
    
    
    public InicioTurno consultarInicioTurno(int idInicioTurno,String codTerminal) {
    	Query q = em.createNamedQuery("ConsultarInicioTurno");
		q.setParameter("idInicioTurno", idInicioTurno);
		q.setParameter("codTerminal", codTerminal);
		InicioTurno inicioTurno=null;

		@SuppressWarnings("unchecked")
		List<InicioTurno> listaInicioTurno = q.getResultList();
		if (!listaInicioTurno.isEmpty()) {
			for (InicioTurno turno : listaInicioTurno)

			{
				inicioTurno=turno;
			}
		}
		return inicioTurno;
	}
    
    public TransV130 ultimaFactura(String codTerminal,int idInicioTurno) {
    	TransV130 trans=null;
    	Query q = em.createNamedQuery("PrimeraFacturaIdTurno");
		q.setParameter("codTerminal", codTerminal);
		q.setParameter("idInicioTurno", idInicioTurno);
		List<TransV130> resultados = q.getResultList();
		if (!resultados.isEmpty()) {
			for (TransV130 transaccion : resultados)
			{
				trans=transaccion;
			}
		}else {
			trans=null;
		}
		return trans;
		
    }
    public TransV130 primeraFactura(String codTerminal,int idInicioTurno) {
    	TransV130 trans=null;
    	Query q = em.createNamedQuery("UltimaFacturaIdTurno");
		q.setParameter("codTerminal", codTerminal);
		q.setParameter("idInicioTurno", idInicioTurno);
		List<TransV130> resultados = q.getResultList();
		if (!resultados.isEmpty()) {
			for (TransV130 transaccion : resultados)
			{
				trans=transaccion;
			}
		}else {
			trans=null;
		}
		return trans;
		
    }
    
	public void actualizarInicioTurno(InicioTurno inicioTurno) {
		Query q = em.createNamedQuery("InicioTurnoUpdate");
		q.setParameter("cod_terminal", inicioTurno.getCodTerminal());
		q.setParameter("cod_empleado", inicioTurno.getCodEmpleado());
		q.setParameter("id_inicio_turno", inicioTurno.getIdInicioTurno());

		@SuppressWarnings("unchecked")
		List<InicioTurno> resultados = q.getResultList();
		if (!resultados.isEmpty()) {
			for (InicioTurno turno : resultados)

			{
				turno.setCodEmpleado(inicioTurno.getCodEmpleado());
				turno.setCodTerminal(inicioTurno.getCodTerminal());
				turno.setEstado(0);
				turno.setFechaFinal(inicioTurno.getFechaFinal());
				turno.setTiempoFinal(inicioTurno.getTiempoFinal());
				turno.setIdInicioTurno(inicioTurno.getIdInicioTurno());
				turno.setAfiliaciones(inicioTurno.getAfiliaciones());
				turno.setClientesPotenciales(inicioTurno.getClientesPotenciales());
				turno.setMetaFinal(inicioTurno.getMetaFinal());
				turno.setTipoTurno(inicioTurno.getTipoTurno());
				turno.setTipoEmpleado(inicioTurno.getTipoEmpleado());
				
				em.merge(turno);

			}
		} else {
			em.persist(inicioTurno);
		}
	}

}
