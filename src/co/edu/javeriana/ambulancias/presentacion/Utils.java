/**
 *
 */
package co.edu.javeriana.ambulancias.presentacion;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/**
 * @author Pablo Ariza y Alejandro Castro
 *
 */
public class Utils {
	/**
	 * Convierte una fecha String en una instancia de la clase GregorianCalendar
	 *
	 * @param fecha
	 *            Estilo YYYY-MM-DD
	 * @return fecha Instancia de GregorianCalendar
	 * @see GregorianCalendar
	 */
	public static GregorianCalendar convertirStringFecha(String fecha) {
		StringTokenizer tokens = new StringTokenizer(fecha, "-");
		String aux = tokens.nextToken();
		int anio, mes, dia;
		anio = Integer.parseInt(aux);
		aux = tokens.nextToken();
		mes = Integer.parseInt(aux) - 1;
		aux = tokens.nextToken();
		dia = Integer.parseInt(aux);
		GregorianCalendar fechaG = new GregorianCalendar(anio, mes, dia);
		return fechaG;
	}

	/**
	 * Convierte una fecha GregorianCalendar en un String
	 *
	 * @param fecha
	 *            de tipo GregorianCalendar
	 * @return String "MMM DD"
	 * @see GregorianCalendar
	 */
	public static String convertirFechaString(GregorianCalendar fecha) {
		int dia = fecha.get(Calendar.DATE);
		int mes = fecha.get(Calendar.MONTH) + 1;
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int min = fecha.get(Calendar.MINUTE);
		String mesString = new String();
		switch (mes) {
		case 1:
			mesString = "Ene";
			break;
		case 2:
			mesString = "Feb";
			break;
		case 3:
			mesString = "Mar";
			break;
		case 4:
			mesString = "Abr";
			break;
		case 5:
			mesString = "May";
			break;
		case 6:
			mesString = "Jun";
			break;
		case 7:
			mesString = "Jul";
			break;
		case 8:
			mesString = "Ago";
			break;
		case 9:
			mesString = "Sep";
			break;
		case 10:
			mesString = "Oct";
			break;
		case 11:
			mesString = "Nov";
			break;
		case 12:
			mesString = "Dic";
			break;
		default:
			break;
		}
		if (min < 10)
			return mesString + " " + dia + " " + hora + ":0" + min;
		else
			return mesString + " " + dia + " " + hora + ":" + min;
	}

	/**
	 * Dada un afecha en GregoriaCalendar, retorna la hora de esta en formato
	 * HH:MM
	 * 
	 * @param fecha:
	 *            fecha a convertir la hora y minutos a String
	 * @return String "HH:MM"
	 */
	public static String convertirFechaHoraString(GregorianCalendar fecha) {
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int min = fecha.get(Calendar.MINUTE);
		if (min < 10)
			return hora + ":0" + min;
		else
			return hora + ":" + min;
	}
}
