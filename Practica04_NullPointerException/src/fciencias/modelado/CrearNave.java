
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
        NaveEspacial naveEscogida = null;
        int opcion = menu.opcionMenu("\nNuestro catálogo de naves es el siguiente:" +
                    "\n1 - Nave Individual de Combate"+
                    "\n2 - Nave Militar de Transporte"+
                    "\n3 - Nave Base Espacial de Guerra"+
                    "\n4 - Salir"+
                    "\nElije una opcion(1-4): ",1,4);

        switch (opcion) {
            case 1:
                naveEscogida = crearNaveIndividualCombate();
                break;
            
            case 2:
                naveEscogida = crearNaveMilitarTransporte();
                break;

            case 3:
                naveEscogida = crearNaveBaseEspacialDeGuerra();
                break;
            
            case 4:
                break;

            default:
                break;
        }
        return naveEscogida;
    }
}
