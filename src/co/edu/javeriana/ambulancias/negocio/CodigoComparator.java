/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

import java.util.Comparator;

/**
 * @author Pablo Ariza y Alejandro Castro
 *
 */
public class CodigoComparator implements Comparator<Integer> {
	/**
	 * Metodo compare implementado para INTEGER
	 */
	public int compare(Integer ambulancia1, Integer ambulancia2) {
		return ambulancia1 - ambulancia2;
	}
}
