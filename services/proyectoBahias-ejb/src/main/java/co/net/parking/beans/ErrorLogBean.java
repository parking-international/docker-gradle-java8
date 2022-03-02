package co.net.parking.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.net.parking.dto.RespuestaGeneralDTO;
import co.net.parking.entities.ErrorLog;
import co.net.parking.util.Util;

@Stateless
public class ErrorLogBean {

	@PersistenceContext(unitName = Util.UP_TRANSACCION_PARKING)
	private EntityManager em;
	Date now = new Date();
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String fechaP = format1.format(now);

	public RespuestaGeneralDTO addErrorLog(String descripcion, String categoria,String cod_terminal) {
		RespuestaGeneralDTO respuestaGeneralDTO = new RespuestaGeneralDTO();
		

		try {
			Integer size = (descripcion.length() > 3000) ? 3000 : descripcion.length();

			ErrorLog errorLog = new ErrorLog();
			errorLog.setCategoria(categoria);
			errorLog.setCodTerminal(cod_terminal);
			errorLog.setCodEmpleado("0");
			errorLog.setDescripcion(descripcion.substring(0, size));
			errorLog.setEstado(1);
			errorLog.setFechaHora(fechaP);
			errorLog.setFechaAuditoria(fechaP);
			errorLog.setIdLocal(1);
			em.persist(errorLog);
			respuestaGeneralDTO.setEstado(true);
		} catch (Exception e) {
			e.printStackTrace();
			respuestaGeneralDTO.setEstado(false);
			respuestaGeneralDTO.setDetalle(e.getMessage());
		}
		return respuestaGeneralDTO;

	}

	public RespuestaGeneralDTO addException(Exception exception, String origen) {
		RespuestaGeneralDTO respuestaGeneralDTO = new RespuestaGeneralDTO();
		exception.printStackTrace();
		String descripcion = exception.getMessage();
		String categoria = "Res";
		Date now = new Date();
		
		try {			
			Integer size = (descripcion.length() > 3000) ? 3000 : descripcion.length();
			ErrorLog errorLog = new ErrorLog();
			errorLog.setCategoria(categoria);
			errorLog.setCodTerminal("Res");
			errorLog.setCodEmpleado("Res");
			errorLog.setDescripcion(origen + " - " + descripcion.substring(0, size));
			errorLog.setEstado(1);
			errorLog.setFechaAuditoria(fechaP);
			errorLog.setFechaHora(fechaP);
			errorLog.setIdLocal(1);
			em.persist(errorLog);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			respuestaGeneralDTO.setEstado(false);
			respuestaGeneralDTO.setDetalle(exception.getMessage());
		}
		return respuestaGeneralDTO;

	}

	
	
	/**
	 * metodo que retorna el nombre del metodo 
	 * @return
	 */
	public static String getNombreMetodo(){
	      //Retorna el nombre del metodo desde el cual se hace el llamado
	      return new Exception().getStackTrace()[1].getMethodName();
	   }

}