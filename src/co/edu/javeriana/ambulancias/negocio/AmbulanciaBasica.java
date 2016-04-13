/**
 * 
 */
package co.edu.javeriana.ambulancias.negocio;

/**
 * @author Pablo Ariza y Alejandro Castro
 *
 */
public class AmbulanciaBasica extends AmbulanciaMedicalizada {

	/**
	 * @param codigo
	 * @param placa
	 * @param medico
	 */
	public AmbulanciaBasica(int codigo, String placa, String medico) {
		super(codigo, placa, medico);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	public long calcularTarifa(){
		return (long)(TARIFA_BASE * 1.20);
	}
}
