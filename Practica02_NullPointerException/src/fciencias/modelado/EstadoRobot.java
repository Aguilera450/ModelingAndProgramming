/**
 * Interfaz que se usara para crear los Modos del Robot.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 */
public interface EstadoRobot{
    /** Metodo que inicia el Modo Suspendido. */
    public void suspenderse();

    /** Metodo que inicia el Modo Movimiento. */
    public void caminar();

    /** Metodo que inicia el Modo Comanda. */
    public void atender();

    /** Metodo que inicia el Modo Cocinero. */
    public void cocinar();

    /** Metodo que inicia el Modo Entrega. */
    public void entregar();
}