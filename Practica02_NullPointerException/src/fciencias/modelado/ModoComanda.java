public class ModoComanda implements EstadoRobot{
    /** Robot del cual sera modificado el modo. */
    private Robot robot;

    /**
     * Constructor del modo Comanda.
     * Asigna el Robot pasado como parametro al atributo.
     * @param robot Recibe un robot de clase Robot.
     */
    public ModoComanda(Robot robot){
        this.robot = robot;
    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void suspenderse(){

    }

    /**
     * Metodo que inicia el modo movimiento si es que se
     * cumplen con las condiciones.
     */
    public void caminar(){

    }

    /**
     * Metodo que inicia el modo comanda si es que se
     * cumplen con las condiciones.
     */
    public void atender(){

    }

    /**
     * Metodo que inicia el modo cocinero si es que se
     * cumplen con las condiciones.
     */
    public void cocinar(){

    }

    /**
     * Metodo que inicia el modo suspendido si es que se
     * cumplen con las condiciones.
     */
    public void entregar(){

    }
}