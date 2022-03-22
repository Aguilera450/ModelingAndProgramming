public class ModoSuspendido implements EstadoRobot{
    /** Robot asociado al estado actual */
    private Robot robot;

    /**
     * Constructor del modo suspendido.
     * Asocia el estado al robot recibido por parámetro.
     * @param robot Robot que será asociado al estado.
     */
    public ModoSuspendido(Robot robot){
        this.robot = robot;
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void suspenderse(){
        System.out.println("<**** MODO SUSPENDIDO ****>\nMcROBOT ya está suspendido.");
    }

    /**
     * Metodo que inicia el modo movimiento si es que se
     * cumplen con las condiciones.
     */
    public void caminar(){
        // Si al robot ya se le asigno una mesa a atender, puede proceder y cambiar a modo movimiento.
        if(robot.getAtencionMesaCliente()){
            System.out.println("<**** MODO SUSPENDIDO ****>\nMcROBOT pasará al MODO MOVIMIENTO.");
            robot.asignarNuevoEstado(robot.getEstadoMovimiento());
        } else {
            System.out.println("<**** MODO SUSPENDIDO ****>\nMcROBOT aún no ha sido asignado a ninguna mesa.");
        }
    }

    /**
     * Metodo que inicia el modo comanda si es que se
     * cumplen con las condiciones.
     */
    public void atender(){
        System.out.println("<**** MODO SUSPENDIDO ****>\nMcROBOT está suspendido, ninguna mesa ha solicitado la atención del robot.");
    }

    /**
     * Metodo que inicia el modo cocinero si es que se
     * cumplen con las condiciones.
     */
    public void cocinar(){
        System.out.println("<**** MODO SUSPENDIDO ****>\nMcROBOT está suspendido, no puede cocinar en este momento.");
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void entregar(){
        System.out.println("<**** MODO SUSPENDIDO ****>\nMcROBOT está suspendido, no tiene un platillo para entregar.");
    }
}