/**
 *
 */
package co.net.parking.util;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>MÃ³dulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
public class FechaUtil {

	private static Logger logger = Logger.getLogger(FechaUtil.class.getName());
	private static Calendar calendar = null;
	private static String[] meses =
		{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	// private String[] dias = { "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
	// "Sábado" };
	int mes;
	static int dia;
	int hora;
	int minuto;
	int segundo;

	/**
	 * mÃ©todo para convertir una fecha en texto
	 * 
	 * @return retorna un string con la fecha en formato yyyy-mm-ddd
	 */
	public static String toFechaShort(Date fecha) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.format(fecha);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error convirtiendo la fecha a texto", e);
		}
		return null;
	}

	/**
	 * método que retorna la fecha en formato yyyy-MM-dd HH:mm:ss.SS
	 * 
	 * @param fecha :Date
	 * @return String yyyy-MM-dd HH:mm:ss.SS
	 */
	public static String toFechaLong(Date fecha) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
		try {
			return format.format(fecha);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error convirtiendo la fecha a texto", e);
		}
		return null;
	}

	public static Date agregarDias(Date fecha, int dias) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.add(Calendar.DATE, dias);
		return cal.getTime();
	}

	/**
	 * Mï¿½todo que recibe un string en formato yyyy-mm-dd HH:mm:ss y devuelve un objeto de tipo
	 * date
	 * 
	 * @return
	 */
	public static Date stringToDate(String datestr) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateInString = datestr;
		Date date = new Date();

		try {
			date = formatter.parse(dateInString);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return date;

	}

	public String sumarRestarDiasFecha(Date fecha, int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha); // Configuramos la fecha que se recibe
		calendar.add(Calendar.DAY_OF_YEAR, dias); // numero de dï¿½as a aï¿½adir, o restar en caso
													// de dï¿½as<0
		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fechaString = formatter.format(calendar.getTime());
		return fechaString; // Devuelve el objeto Date con los nuevos dï¿½as aï¿½adidos
	}

	/**
	 * Mï¿½todo que recibe un string en formato yyyy-mm-dd devuelve un objeto de tipo date
	 * 
	 * @return
	 */
	public Date stringToDateShort(String datestr) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateInString = datestr;
		Date date = new Date();

		try {
			date = formatter.parse(dateInString);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return date;

	}

	/**
	 * Sumar meses a una fecha
	 * 
	 * @param fecha
	 * @param dias
	 * @return
	 */
	public String sumarRestarMesFecha(Date fecha, int meses) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha); // Configuramos la fecha que se recibe
		calendar.add(Calendar.MONTH, meses); // numero de meses a aï¿½adir, o restar en caso de
												// meses<0
		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fechaString = formatter.format(calendar.getTime());
		return fechaString; // Devuelve el objeto Date con los nuevos dï¿½as aï¿½adidos
	}

	/**
	 * método que suma o resta horas
	 * 
	 * @param fecha Date
	 * @param horas (-24 hasta 24)
	 * @return String en formato yyyy-MM-dd HH:mm:ss
	 */
	public String sumarRestarHoraFecha(Date fecha, int horas) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha); // Configuramos la fecha que se recibe
		calendar.add(Calendar.HOUR, horas); // numero de horas a añadir, o restar en caso de meses<0
		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fechaString = formatter.format(calendar.getTime());
		return fechaString; // Devuelve el objeto Date con los nuevos días añadidos
	}

	public String reiniciarDia(Date fecha) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha); // Configuramos la fecha que se recibe
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fechaString = formatter.format(calendar.getTime());
		return fechaString; // Devuelve el objeto Date con los nuevos días añadidos
	}

	/**
	 * Obtiene long con el tiempo en segundos transcurridos desde 19800101 00:00:00
	 * 
	 * @return long tiempo en segundos
	 */
	public static long getLongTiempo() {
		calendar = new GregorianCalendar();
		return calendar.getTimeInMillis() / 1000;
	}

	public static boolean compararFechasConDate(String fechaPark, String fechaReserva) {
		String fechaRese = fechaReserva + ":00";
		boolean resultado = true;
		try {
			/** Obtenemos las fechas enviadas en el formato a comparar */
			SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date fechaDate1 = formateador.parse(fechaPark);
			Date fechaDate2 = formateador.parse(fechaRese);

			if (fechaDate1.before(fechaDate2)) {
				resultado = false;
			} else {
				if (fechaDate2.before(fechaDate1)) {
					resultado = true;
				} else {
					resultado = false;
				}
			}
		} catch (ParseException e) {
			System.out.println("Se Produjo un Error!!!  " + e.getMessage());
		}
		return resultado;
	}

	public static boolean compararFechaConFechaActual(String fechaReser) {
		boolean resultado = true;
		try {
			/** Obtenemos las fechas enviadas en el formato a comparar */
			SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
			String fechaDate = formateador.format(new Date());
			Date fechaActual = formateador.parse(fechaDate);
			Date fechaReserva = formateador.parse(fechaReser);

			if (fechaActual.before(fechaReserva)) {
				resultado = false;
			} else {
				resultado = true;
			}
		} catch (ParseException e) {
			System.out.println("Se Produjo un Error!!!  " + e.getMessage());
		}
		return resultado;
	}

	/**
	 * fechacorta
	 * 
	 * @return
	 */
	public static Date stringToFechaCorta(String datestr) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateInString = datestr;
		Date date = new Date();

		try {
			date = formatter.parse(dateInString);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return date;

	}

	/**
	 * Obtiene string con la fecha detallada
	 * 
	 * @return fecha en formato NOMBRE_MES DD,AAAA, Diciembre 14, 1981
	 */
	public static String getStringFecha() {
		String ret = null;
		calendar = new GregorianCalendar();
		ret = meses[calendar.get(Calendar.MONTH)] + " ";
		dia = calendar.get(Calendar.DAY_OF_MONTH);
		if (dia < 10)
			ret = ret.concat("0");
		ret = ret.concat(String.valueOf(dia) + ", ");
		ret = ret.concat(String.valueOf(calendar.get(Calendar.YEAR)));
		return ret;
	}


	public static String datetoString(Date fecha) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.format(fecha);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error convirtiendo la fecha a texto", e);
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public static boolean validaFechasEntradaSalida(String fechaEntrada, String fechaSalida) {
		boolean resultado = true;
		try {
			/** Obtenemos las fechas enviadas en el formato a comparar */
			SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date fechaDate1 = formateador.parse(fechaEntrada);
			Date fechaDate2 = formateador.parse(fechaSalida);

			if (fechaDate1.after(fechaDate2)) {
				resultado = false;
			} else {
				if (fechaDate2.after(fechaDate1)) {
					if(fechaDate2.getDate()==fechaDate1.getDate()) {
					resultado = true;
					}
					else{
						resultado=false;
					}
				} else {
					resultado = false;
				}
			}
		} catch (ParseException e) {
			System.out.println("Se Produjo un Error!!!  " + e.getMessage());
		}
		return resultado;
	}

	public long getLongTiempo(String strDateTime) {
		int amdhms[] = new int[6];
		amdhms[0] = Integer.parseInt(strDateTime.substring(0, 4));
		amdhms[1] = Integer.parseInt(strDateTime.substring(5, 7));
		amdhms[2] = Integer.parseInt(strDateTime.substring(8, 10));
		amdhms[3] = Integer.parseInt(strDateTime.substring(11, 13));
		amdhms[4] = Integer.parseInt(strDateTime.substring(14, 16));
		amdhms[5] = Integer.parseInt(strDateTime.substring(17, 19));
		Calendar c = new GregorianCalendar(amdhms[0], amdhms[1] - 1, amdhms[2], amdhms[3], amdhms[4], amdhms[5]);
		return c.getTimeInMillis() / 1000;
	}

	public int getDuracion(String fechaIncial, String fechaFinal) {
		int duracion = 0;
		long fechaIni = this.getLongTiempo(fechaIncial);
		long fechaFin = this.getLongTiempo(fechaFinal);
		duracion = (int) (fechaFin - fechaIni);

		return duracion;

	}

	public static String getTiempohms(long segundos) {
		String ret = null;
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		String h, m, s;

		minuto = (int) segundos / 60;
		segundo = (int) segundos % 60;

		if (minuto > 59) {
			hora = minuto / 60;
			minuto = minuto % 60;
		}

		h = String.valueOf(hora);
		if (minuto < 10)
			m = "0" + String.valueOf(minuto);
		else
			m = String.valueOf(minuto);


		if (segundo < 10)
			s = "0" + String.valueOf(segundo);
		else
			s = String.valueOf(segundo);

		ret = h + ":" + m + ":" + s;
		return ret;
	}

	public int obtenerDiferenciaMinutos(String fechaFinal, String fechaInicial, int tiempoBase) {
		try {

			SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date fechaDate1 = formateador.parse(fechaInicial);
			Date fechaDate2 = formateador.parse(fechaFinal);

			int totalMinutos = (int) Math.ceil((fechaDate2.getTime() - fechaDate1.getTime()) / 1000 / 60);

			if (totalMinutos > tiempoBase)
				return totalMinutos - tiempoBase;
			else
				return 0;

		} catch (Exception e) {
			return 0;
		}
	}
}
