
/**
 * Clase que se encarga de crear Naves Espaciales.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 */
public class CrearNave {

    /**
     * Método que crea una nave individual de combate.
     * @return <code>NaveEspacial</code> -- Nave individual de combate.
     */
    public static NaveEspacial crearNaveIndividualCombate(){
        NaveEspacial naveModelo = new NaveEspacial();
        naveModelo.darSistemasPropulsion(new PropulsionViajeInterplanetario());
        naveModelo.darBlindaje(new BlindajeReforzado());
        naveModelo.darCabina(new CabinaUnPiloto());
        naveModelo.darArmas(new MisilesDePlasma());
        return naveModelo;
    }

    /**
     * Método que crea una nave militar de transporte
     * @return <code>NaveEspacial</code> -- Nave militar de transporte.
     */
    public static NaveEspacial crearNaveMilitarTransporte(){
        NaveEspacial naveModelo = new NaveEspacial();
        naveModelo.darSistemasPropulsion(new PropulsionViajeIntergalactico());
        naveModelo.darBlindaje(new BlindajeReforzado());
        naveModelo.darCabina(new CabinaTripulacionPequena());
        naveModelo.darArmas(new LaserSimple());
        return naveModelo;
    }

    /**
     * Método que crea una nave base espacial de guerra.
     * @return <code>NaveEspacial</code> -- Nave base espacial de guerra.
     */
    public static NaveEspacial crearNaveBaseEspacialDeGuerra(){
        NaveEspacial naveModelo = new NaveEspacial();
        naveModelo.darSistemasPropulsion(new PropulsionViajeIntergalactico());
        naveModelo.darBlindaje(new BlindajeFortaleza());
        naveModelo.darCabina(new CabinaEjercito());
        naveModelo.darArmas(new LaserDestructorDePlanetas());
        return naveModelo;
    }

    /**
     * Método que se encarga de una creación personalizada de una nave espacial
     * junto al usuario.
     * @return <code>NaveEspacial</code> -- Nave Espacial personalizada por el usuario.
     */
    public NaveEspacial crearNavePersonalizada(){
        MenuTerminal menu = new MenuTerminal();
        NaveEspacial naveArmada = new NaveEspacial();

        System.out.println("\n*Gracias por su preferencia, comencemos con la construccion de su nave."+
        "\nLos componentes se listaran de mas barato a mas caro*");

        // ------ SELECCIÓN DE SISTEMA DE PROPULSIÓN ------
        int opcion = menu.opcionMenu(
                    "--------------------------------------" +
                    "\nSistemas de Propulsion disponibles:" +
                    "\n1 - Viaje Intercontinental"+
                    "\n2 - Viaje Interplanetario"+
                    "\n3 - Viaje Intergalactico"+
                    "\nElije una opcion(1-3): ",1,3);

        switch (opcion) {
            case 1:
                naveArmada.darSistemasPropulsion(new PropulsionViajeIntercontinental());
                break;
            
            case 2:
                naveArmada.darSistemasPropulsion(new PropulsionViajeInterplanetario());
                break;

            case 3:
                naveArmada.darSistemasPropulsion(new PropulsionViajeIntergalactico());
                break;
            
            default:
                break;
        }


        // ------ SELECCIÓN DE BLINDAJE ------
        opcion = menu.opcionMenu(
                    "--------------------------------------" +
                    "\nBlindajes disponibles:" +
                    "\n1 - Simple"+
                    "\n2 - Reforzado"+
                    "\n3 - Fortaleza"+
                    "\nElije una opcion(1-3): ",1,3);

        switch (opcion) {
            case 1:
                naveArmada.darBlindaje(new BlindajeSimple());
                break;
            
            case 2:
                naveArmada.darBlindaje(new BlindajeReforzado());
                break;

            case 3:
                naveArmada.darBlindaje(new BlindajeFortaleza());
                break;
            
            default:
                break;
        }


        // ------ SELECCIÓN DE CABINA ------
        opcion = menu.opcionMenu(
                    "--------------------------------------" +
                    "\nCabinas disponibles:" +
                    "\n1 - Un Piloto"+
                    "\n2 - Tripulación pequeña"+
                    "\n3 - Ejercito"+
                    "\nElije una opcion(1-3): ",1,3);

        switch (opcion) {
            case 1:
                naveArmada.darCabina(new CabinaUnPiloto());
                break;
            
            case 2:
                naveArmada.darCabina(new CabinaTripulacionPequena());
                break;

            case 3:
                naveArmada.darCabina(new CabinaEjercito());
                break;
            
            default:
                break;
        }

        // ------ SELECCIÓN DE ARMAS ------
        opcion = menu.opcionMenu(
                    "--------------------------------------" +
                    "\nArmas disponibles:" +
                    "\n1 - Laser Simple"+
                    "\n2 - Misiles de Plasma"+
                    "\n3 - Laser Destructor de Planetas"+
                    "\nElije una opcion(1-3): ",1,3);

        switch (opcion) {
            case 1:
                naveArmada.darArmas(new LaserSimple());
                break;
            
            case 2:
                naveArmada.darArmas(new MisilesDePlasma());
                break;

            case 3:
                naveArmada.darArmas(new LaserDestructorDePlanetas());
                break;
            
            default:
                break;
        }
        System.out.println("\n*Construcción de nave personalizada completada*");
        
        return naveArmada;
    }
}
