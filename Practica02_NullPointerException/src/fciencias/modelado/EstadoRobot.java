/**
 * Interfaz que se usara para crear los Estados del Robot.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 */
public interface EstadoRobot{
    /** Método que inicia el Modo Suspendido. */
    public void suspenderse();

    /** Método que inicia el Modo Movimiento. */
    public void caminar();

    /** Método que inicia el Modo Comanda. */
    public void atender();

    /** Método que inicia el Modo Cocinero. */
    public void cocinar();

    /** Método que inicia el Modo Entrega. */
    public void entregar();
}