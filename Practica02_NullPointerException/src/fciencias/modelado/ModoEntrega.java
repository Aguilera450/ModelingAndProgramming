/**
 * Clase que simula el estado <code>ModoEntrega</code> del Robot.
 * @author Adrian Aguilera Moreno - Aguiler450
 * @author Rosas Franco Diego Angel - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>EstadoRobot</code>.
 */

public class ModoEntrega implements EstadoRobot{
    /** Robot asociado al estado actual */
    private Robot robot;

    /**
     * Constructor del modo Entrega.
     * Asocia el estado al robot recibido por parámetro.
     * @param robot Robot que será asociado al estado.
     */
    public ModoEntrega(Robot robot){
        this.robot = robot;
    }

    /**
     * Método que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void suspenderse(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT entregó el platillo y procede a cambiar a MODO SUSPENDIDO.");
        robot.asignarNuevoEstado(robot.getEstadoSuspendido());
        // Como el robot se suspenderá deberá "reiniciarse" e inicializar todos sus datos para una nueva ejecución.
        robot.inicializar();
    }

    /**
     * Método que inicia el modo movimiento si es que se
     * cumplen con las condiciones.
     */
    public void caminar(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT está entregando el platillo, no puede caminar ahora.");
    }

    /**
     * Método que inicia el modo comanda si es que se
     * cumplen con las condiciones.
     */
    public void atender(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT está entregando un platillo, no puede atender ahora.");
    }

    /**
     * Método que inicia el modo cocinero si es que se
     * cumplen con las condiciones.
     */
    public void cocinar(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT está entregando un platillo, no puede regresar a la cocina.");
    }

    /**
     * Método que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void entregar(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT ya está entregando el platillo.");
    }
}
