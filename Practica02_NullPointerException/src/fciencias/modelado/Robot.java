public class Robot{
    /** Menu que ofrece el robot de Tipo Menu. */
    private Menu menuOfrecido;

    /** Iterador que recorrera el menu. De tipo Iterator. */
    private Iterador iteradorMenu;

    /** Mesa atendida por el robot. De tipo MesaCliente. */
    private MesaCliente mesaAtendida;

    /** Platillo que se va a cocinar. Se tipo Platillo. */
    private Platillo platilloACocinar;

    /** Boolean que nos dice si se esta atendiendo una mesa. */
    private boolean atencionMesaCliente;

    /** Boolean que nos dice si el robot esta frente al cliente. */
    private boolean frenteAlCliente;

    /** Boolean que nos dice si ya se tomo la orden. */
    private boolean ordenTomada;

    /** Boolean que nos dice si el plato esta listo. */
    private boolean platoListo;

    /** Boolean que nos dice si el plato fue entregado. */
    private boolean platoEntregado;

    /** Estado Actual del robot. */
    private EstadoRobot estadoActual;

    /** Modo Suspendido del robot. */
    private EstadoRobot modoSuspendido;

    /** Modo Movimiento del robot. */
    private EstadoRobot modoMovimiento;

    /** Modo Comanda del robot. */
    private EstadoRobot modoComanda;

    /** Modo Cocinero del robot. */
    private EstadoRobot modoCocinero;

    /** Modo Entrega del robot. */
    private EstadoRobot modoEntrega;
    
    /**
     * Constructor del Robot.
     * Asigna el menu que se le paso como parametro.
     * @param menu Menu que va a mostrar al cliente.
     */
    public Robot(Menu menu){
        menuOfrecido = menu;
        iteradorMenu = menuOfrecido.crearIterador();
        asignarNuevoEstado(new ModoSuspendido(this));
    }

    /**
     * Metodo que cambia el Menu del Robot.
     * @param nuevoMenu nuevo Menu a mostrar.
     */
    public void cambiarMenu(Menu nuevoMenu){
        menuOfrecido = nuevoMenu;
    }

    /**
     * Metodo que devuelve el Menu en tipo String.
     * @return Menu en tipo String.
     */
    public String mostrarMenu(){
        String menuString = "";
        Platillo platilloActual;
        // Nos permitirá enumerar los platillos en el menú y así poder identificarlos acorde al iterador.
        int contadorPlatillos = 1;
        // Se usa el iterador actual para mostrar el menú.
        menuString += "********" + menuOfrecido.nombre().toUpperCase() + "********\n";
        while (iterador.hasNext()) {
            platilloActual = (Platillo) iterador.next();
            menuString +=   "\n\n----------- Platillo " + contadorPlatillos +" -----------\n"
                            + platilloActual.toString();
            contadorPlatillos++;
        }

        /* Una vez generado el menú en formato String,
        Se asigna nuevamente el iterador para volver a usarlo en el futuro*/
        iteradorMenu = menuOfrecido.crearIterador();

        return menuString;
    }

    /**
     * Metodo que asigna un nuevo estado actual al robot.
     * @param nuevoEstado Nuevo estado a asignar.
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado){
        estadoActual = nuevoEstado;
    }

    /**
     * Metodo que asigna una nueva mesa a atender.
     * @param mesa Nueva mesa a atender.
     */
    public void asignarMesaAAtender(MesaCliente mesa){
        mesaAtendida = mesa;
        atencionMesaCliente = true;
    }

    /**
     * Metodo que devuelve la mesa atendida.
     * @return Mesa atendia
     */
    public MesaCliente getMesaAtendida(){
        return mesaAtendida;
    }

    /**
     * Metodo que devuelve si se esta atendiendo una mesa.
     * @return True si es atendia, False en caso contrario.
     */
    public boolean getAtencionMesaCliente(){
        return atencionMesaCliente;
    }

    /**
     * Metodo que devuelve si el robot esta frente al cliente.
     * @return True si esta frente, False en caso contrario.
     */
    public boolean getFrenteACliente(){
        return frenteAlCliente;
    }

    /**
     * Metodo que devuelve si la orden fue tomada.
     * @return True si ya fue tomada, False en caso contrario.
     */
    public boolean getOrdenTomada(){
        return ordenTomada;
    }

    /**
     * Metodo que devuelve si el plato esta listo.
     * @return True si esta listo, False en caso contrario.
     */
    public boolean getPlatoListo(){
        return platoListo;
    }

    /**
     * Metodo que devuelve si el plato fue entregado.
     * @return True si fue entregado, False en caso contrario.
     */
    public boolean getPlatoEntregado(){
        return platoEntregado;
    }

    /** Metodo que suspende al robot. */
    public void suspenderse(){
        estadoActual.suspenderse();
    }

    /** Metodo que pone en modo movimiento al robot. */
    public void caminar(){
        estadoActual.caminar();
    }

    /** Metodo que pone en modo comanda al robot. */
    public void atender(){
        estadoActual.atender();
    }

    /** Metodo que pone en modo cocinero al robot. */
    public void cocinar(){
        estadoActual.cocinar();
    }

    /** Metodo que pone en modo Entrega al robot. */
    public void entregar(){
        estadoActual.entregar();
    }

    /**
     * Metodo que devuelve el estado Actual.
     * @return Devuelve el estado actual del Robot.
     */
    public EstadoRobot getEstadoActual(){
        return estadoActual;
    }

    /**
     * Metodo que devuelve el estado suspendido.
     * @return Devuelve el estado suspendido.
     */
    public EstadoRobot getEstadoSuspendido(){
        return modoSuspendido;
    }

    /**
     * Metodo que devuelve el estado movimiento.
     * @return Devuelve el estado movimiento.
     */
    public EstadoRobot getEstadoMovimiento(){
        return modoMovimiento;
    }

    /**
     * Metodo que devuelve el estado cocinero.
     * @return Devuelve el estado cocinero.
     */
    public EstadoRobot getEstadoCocinero(){
        return modoCocinero;
    }

    /**
     * Metodo que devuelve el estado entrega.
     * @return Devuelve el estado entrega.
     */
    public EstadoRobot getEstadoEntrega(){
        return modoEntrega;
    }

    /**
     * Metodo para hacer que el robot le pregunte
     * al cliente que platillo quiere.
     */
    public void preguntarPlatillo(){
        
    }

    /**
     * Metodo que hace que el robot cocine el platillo
     * que ordeno el cliente.
     */
    public void cocinarPlatillo(){
        System.out.println(platilloACocinar.cocinar());
    }
}