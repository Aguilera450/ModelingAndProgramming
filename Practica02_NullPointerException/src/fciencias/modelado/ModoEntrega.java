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
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void suspenderse(){
        if(robot.getPlatoEntregado()){
            System.out.println("<**** MODO ENTREGA ****>\nMcROBOT entregó el platillo y procede a cambiar a MODO SUSPENDIDO.");
            robot.asignarNuevoEstado(robot.getEstadoSuspendido());
            // Como el robot se suspenderá deberá "reiniciarse" e inicializar todos sus datos para una nueva ejecución.
            robot.inicializar();
        } else {
            System.out.println("<**** MODO COCINERO ****>\nMcROBOT aún no puede suspenderse porque no ha entregado el platillo.");
        }
    }

    /**
     * Metodo que inicia el modo movimiento si es que se
     * cumplen con las condiciones.
     */
    public void caminar(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT está entregando el platillo, no puede caminar ahora.");
    }

    /**
     * Metodo que inicia el modo comanda si es que se
     * cumplen con las condiciones.
     */
    public void atender(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT está entregando un platillo, no puede atender ahora.");
    }

    /**
     * Metodo que inicia el modo cocinero si es que se
     * cumplen con las condiciones.
     */
    public void cocinar(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT está entregando un platillo, no puede regresar a la cocina.");
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void entregar(){
        System.out.println("<**** MODO ENTREGA ****>\nMcROBOT ya está entregando el platillo.");
    }
}