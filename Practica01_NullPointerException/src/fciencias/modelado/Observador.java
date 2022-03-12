package src.fciencias.modelado;

/**
 * Interfaz Observador para el patrón Observer.
 * Los Observadores estarán recibiendo mensajes por parte de un Sujeto en común.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 11/03/2022
 */
public interface Observador{
	/**
	 * Método que se encarga de actualizar al objeto Observador acorde al mensaje del Sujeto.
	 */
	public void actualizar();
}
