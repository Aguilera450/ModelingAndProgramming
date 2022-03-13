//package src.fciencias.modelado;

/**
 * Interfaz Sujeto para el patrón Observer.
 * Los Sujetos estarán enviando mensajes a todos sus Observadores por igual.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 12/03/2022
 */
public interface Sujeto{
    /**
     * Metodo para registrar una suscripción.
     * @param suscripcion suscripción a registrar.
     */
	public void registrar(Suscripcion suscripcion);

	/**
	 * Método para eliminar una suscripción.
	 * Ninguna suscripción se eliminará si no coincide con la recibida.
	 * @param suscripción suscripción a eliminar.
	 */
	public void remover(Suscripcion suscripcion);

	/**
	 * Método para notificar a los Observadores.
	 */
	public void notificar();
}