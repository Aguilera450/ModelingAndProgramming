import java.util.Scanner;

/**
 * Clase que simula un <code>Robot</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 */

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

    /** Boolean que nos dice si ya se tomo la orden. */
    private boolean ordenTomada;

    /** Boolean que nos dice si el plato esta listo. */
    private boolean platoListo;

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

        modoSuspendido = new ModoSuspendido(this);
        modoMovimiento = new ModoMovimiento(this);
        modoComanda = new ModoComanda(this);
        modoCocinero = new ModoCocinero(this);
        modoEntrega = new ModoEntrega(this);
        
        // El Robot inicia en modo suspendido
        asignarNuevoEstado(getEstadoSuspendido());
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
        while (iteradorMenu.hasNext()) {
            platilloActual = (Platillo) iteradorMenu.next();
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
     * Metodo que devuelve el estado comanda.
     * @return Devuelve el estado comanda.
     */
    public EstadoRobot getEstadoComanda() {
        return modoComanda;
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
     * Este método solo se podrá realizar cuando el robot este en modo comanda 
     * y no haya tomado la orden del cliente.
     */
    public void preguntarPlatillo(){
        // Si el robot esta en MODO COMANDA y no ha tomado la orden, solo en ese entonces podrá tomarla.
        if(getEstadoActual() == getEstadoComanda() && !getOrdenTomada()){
            System.out.println(mostrarMenu());
            
            Scanner input = new Scanner(System.in);
            boolean exit  = false;
            int userInput = 0;
            do{
                try{
                System.out.println("[*] "+ "Ingrese el número de platillo que desea ordenar: ");
                userInput = input.nextInt();
                if(userInput > 0 && userInput <= menuOfrecido.longitud())
                    exit = true;
                else 
                    throw new Exception("Rango inválido");
    
                }catch(Exception e){
                System.out.println("\n[!!] Ingrese una opción válida, por favor.");
                }finally{
                input.nextLine(); // Limpiamos el buffer.
                }
            }while(exit == false);

            // Guardamos el platillo que cocinaremos. Se resta uno porque la indexación comienza en 0.
            // y el Menú mostrado al usuario comenzaba en 1.
            platilloACocinar = menuOfrecido.obtenerPlatillo(userInput - 1);
            // E indicamos a ordenTomada que ya tenemos un platillo.
            ordenTomada = true;
            // Y le mostramos al usuario el platillo elejido.
            System.out.println("El platillo a cocinar será: " + platilloACocinar.getNombre());
        } else {
            System.out.println("McROBOT ya tomó su orden o aún no se encuentra en su mesa.");
        }
    }
    
    /**
     * Metodo que hace que el robot cocine el platillo
     * que ordeno el cliente.
     * Se cocinará el platillo solo si esta en MODO COCINERO,
     * si la orden ya ha sido tomada 
     * y si el platillo no ha sido preparado aún.
     */
    public void cocinarPlatillo(){
        if(getEstadoActual() == getEstadoCocinero() && ordenTomada && !platoListo){
            // Si se cumplen con las condiciones se procede a cocinar el platillo 
            // y mostrarle al usuario la preparación.
            System.out.println(platilloACocinar.cocinar());
            // Y también se le indica que el platillo ya esta listo
            platoListo = true;
        } else {
            if(!ordenTomada)
                System.out.println("McROBOT aún no ha tomado la orden del cliente.");
            else if(platoListo)
                System.out.println("McROBOT ya ha preparado el platillo.");
            else
                System.out.println("McROBOT no se encuentra en MODO COCINERO.");
        }
    }

    /**
     * Inicializa el estado del robot para poder atender a un cliente nuevamente.
     */
    public void inicializar(){
        mesaAtendida = null;
        platilloACocinar = null;
        atencionMesaCliente = false;
        ordenTomada = false;
        platoListo = false;
        estadoActual = getEstadoSuspendido();
    }
}
