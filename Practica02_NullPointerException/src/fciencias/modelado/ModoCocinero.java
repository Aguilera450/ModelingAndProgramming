/**
 * Clase que simula el estado <code>ModoCocinero</code>
 * del Robot.
 * @author Adrian Aguilera Moreno - Aguiler450
 * @author Rosas Franco Diego Angel - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>EstadoRobot</code>.
 */

public class ModoCocinero implements EstadoRobot{
    /** Robot asociado al estado actual */
    private Robot robot;

    /**
     * Constructor del modo Cocinero.
     * Asocia el estado al robot recibido por parámetro.
     * @param robot Robot que será asociado al estado.
     */
    public ModoCocinero(Robot robot){
        this.robot = robot;
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void suspenderse(){
        System.out.println("<**** MODO COCINERO ****>\nMcROBOT está cocinando, no puede suspenderse ahora.");
    }

    /**
     * Metodo que inicia el modo movimiento si es que se
     * cumplen con las condiciones.
     */
    public void caminar(){
        System.out.println("<**** MODO COCINERO ****>\nMcROBOT está cocinando, no puede caminar ahora.");
    }

    /**
     * Metodo que inicia el modo comanda si es que se
     * cumplen con las condiciones.
     */
    public void atender(){
        System.out.println("<**** MODO COCINERO ****>\nMcROBOT está cocinando, no puede atender ahora.");
    }

    /**
     * Metodo que inicia el modo cocinero si es que se
     * cumplen con las condiciones.
     */
    public void cocinar(){
        System.out.println("<**** MODO COCINERO ****>\nMcROBOT ya está cocinando.");
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void entregar(){
        if(robot.getPlatoListo()){
            System.out.println("<**** MODO COCINERO ****>\nMcROBOT ha terminado de preparar el platillo, cambiando a MODO ENTREGA.");
            robot.asignarNuevoEstado(robot.getEstadoEntrega());
        } else {
            System.out.println("<**** MODO COMANDA ****>\nMcROBOT aún no termina de preparar el platillo del cliente.");
        }
    }
}
