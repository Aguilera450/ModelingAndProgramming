package src.fciencias.modelado;

/**
 * Interfaz Sujeto para el patrón Observer.
 * Los Sujetos estarán enviando mensajes a todos sus Observadores por igual.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 11/03/2022
 */
public interface Sujeto{
	public void registrar(Suscripcion suscripcion);
	public void remover(Suscripcion suscripcion);
	public void notificar();
}