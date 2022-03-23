import java.util.Scanner;
/**
 * Ejecución de los algoritmos implementados para la simulación
 * del Robot y todas las cosas que puede realizar.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 */

public class Practica02{
    /** Menu usado para la prueba */
     static Menu menuPrueba = new MenuGeneral("Menu general");
    // static Menu menuPrueba = new MenuDeLujo("Menu de Lujo");
    // static Menu menuPrueba = new MenuGeneral("Menu General");
    
    /** Robot usado para la prueba */
    static Robot mcrobot = new Robot(menuPrueba);

    /** Mesa del cliente para la prueba */
    static MesaCliente mesa = new MesaCliente("Arturo");
    

    // Métodos de apoyo para el menú

    /**
     * Método que genera una pausa dentro del programa y solicita presionar Enter
     * para continuar
     */
    public static void requestEnter() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n[*] Pulse Enter para continuar.");
        input.nextLine();
        System.out.println("\033[H\033[2J");
    }

    public static String mostrarMenu(EstadoRobot estadoRobot){
        String cadenaEstado = "";
        if(estadoRobot instanceof ModoSuspendido)
            cadenaEstado = " <**** MODO SUSPENDIDO ****>\n";
        if(estadoRobot instanceof ModoMovimiento)
            cadenaEstado = " <**** MODO MOVIMIENTO ****>\n";
        if(estadoRobot instanceof ModoComanda)
            cadenaEstado = " <**** MODO COMANDA ****>\n";
        if(estadoRobot instanceof ModoCocinero)
            cadenaEstado = " <**** MODO COCINERO ****>\n";
        if(estadoRobot instanceof ModoEntrega)
            cadenaEstado = " <**** MODO ENTREGA ****>\n";

        return "\n\n---- MENU DE OPCIONES DE MC\'BURGUESAS -----\n" +
                    "1.- Solicitar un McROBOT.\n" + 
                    "2.- Indicarle un platillo a McROBOT.\n" +
                    "3.- Ver preparacion de platillo.\n" +
                    "-- OPCIONES DIRECTAS DE McROBOT --\n" +
                    " McROBOT se encuentra en el estado de:\n" +
                    cadenaEstado + 
                    "4.- Suspenderse.\n" +
                    "5.- Caminar.\n" +
                    "6.- Atender.\n" +
                    "7.- Cocinar.\n" +
                    "8.- Entregar.\n" +
                    "9.- Terminar simulacion.\n";
    }
    
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a McHamburguesas, " + mesa.nombreCliente() +"!");
        System.out.println("En la prueba piloto de hoy, el robot que te atenderá será McROBOT.");
        requestEnter();

        //  ------ MENU DEL PROGRAMA ------
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(mostrarMenu(mcrobot.getEstadoActual()));
            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Por favor elige una opcion válida \n"+ mostrarMenu(mcrobot.getEstadoActual()));
                }
            }

            switch (opcion) {
                case 1:
                    mesa.pedirPlatillo(mcrobot);
                    break;

                case 2:
                    mcrobot.preguntarPlatillo();    
                    break;

                case 3:
                    mcrobot.cocinarPlatillo();
                    break;

                case 4:
                    mcrobot.suspenderse();
                    break;

                case 5:
                    mcrobot.caminar();
                    break;
                
                case 6:
                    mcrobot.atender();
                    break;
                
                case 7:
                    mcrobot.cocinar();
                    break;

                case 8:
                    mcrobot.entregar();
                    break;

                case 9:
                    System.out.println("\n¡Gracias por ser parte de este piloto, " + mesa.nombreCliente() + "!");
                    break;

                default:
                    System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
                    break;

            }

        } while (opcion != 9);

        
    }
}
