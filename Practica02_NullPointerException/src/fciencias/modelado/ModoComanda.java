public class ModoComanda implements EstadoRobot{
    /** Robot asociado al estado actual */
    private Robot robot;

    /**
     * Constructor del modo Comanda.
     * Asocia el estado al robot recibido por parámetro.
     * @param robot Robot que será asociado al estado.
     */
    public ModoComanda(Robot robot){
        this.robot = robot;
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void suspenderse(){
        System.out.println("<**** MODO COMANDA ****>\nMcROBOT no puede suspenderse ahora, está atendiendo a un cliente.");
    }

    /**
     * Metodo que inicia el modo movimiento si es que se
     * cumplen con las condiciones.
     */
    public void caminar(){
        System.out.println("<**** MODO COMANDA ****>\nMcROBOT no puede caminar ahora, está atendiendo a un cliente.");
    }

    /**
     * Metodo que inicia el modo comanda si es que se
     * cumplen con las condiciones.
     */
    public void atender(){
        System.out.println("<**** MODO COMANDA ****>\nMcROBOT ya está atendiendo al cliente.");
    }

    /**
     * Metodo que inicia el modo cocinero si es que se
     * cumplen con las condiciones.
     */
    public void cocinar(){
        if(robot.getOrdenTomada()){
            System.out.println("<**** MODO COMANDA ****>\nMcROBOT ha recibido el platillo y procede a concinarlo, cambiando a MODO COCINERO");
            robot.asignarNuevoEstado(robot.getEstadoCocinero());
        } else {
            System.out.println("<**** MODO COMANDA ****>\nMcROBOT aún no recibe el platillo que comerá el cliente.");
        }
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void entregar(){
        System.out.println("<**** MODO COMANDA ****>\nMcROBOT aún no recibe el platillo que comerá el cliente.");
    }
}