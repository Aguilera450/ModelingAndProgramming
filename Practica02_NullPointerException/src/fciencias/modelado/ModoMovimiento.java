public class ModoMovimiento implements EstadoRobot{
    /** Robot asociado al estado actual */
    private Robot robot;

    /**
     * Constructor del modo Movimiento.
     * Asocia el estado al robot recibido por parámetro.
     * @param robot Robot que será asociado al estado.
     */
    public ModoMovimiento(Robot robot){
        this.robot = robot;
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void suspenderse(){
        System.out.println("<**** MODO MOVIMIENTO ****>\nMcROBOT pasará a MODO SUSPENDIDO.");
        robot.asignarNuevoEstado(robot.getEstadoSuspendido());
        // Como el robot se suspenderá deberá "reiniciarse" e inicializar todos sus
        // datos para una nueva ejecución.
        robot.inicializar();
    }

    /**
     * Metodo que inicia el modo movimiento si es que se
     * cumplen con las condiciones.
     */
    public void caminar(){
        System.out.println("<**** MODO MOVIMIENTO ****>\nMcROBOT ya está caminando hacia la mesa del cliente.");
    }

    /**
     * Metodo que inicia el modo comanda si es que se
     * cumplen con las condiciones.
     */
    public void atender(){
        System.out.println("<**** MODO MOVIMIENTO ****>\nMcROBOT ha llegado a la mesa del cliente y cambiara a MODO COMANDA.");
        robot.asignarNuevoEstado(robot.getEstadoComanda());
    }

    /**
     * Metodo que inicia el modo cocinero si es que se
     * cumplen con las condiciones.
     */
    public void cocinar(){
        System.out.println("<**** MODO MOVIMIENTO ****>\nMcROBOT aún no toma la orden del cliente.");
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void entregar(){
        System.out.println("<**** MODO MOVIMIENTO ****>\nMcROBOT aún no ha cocinado un platillo.");
    }
}