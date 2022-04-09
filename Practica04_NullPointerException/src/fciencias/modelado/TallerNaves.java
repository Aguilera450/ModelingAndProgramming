import java.util.Scanner;
/**
 * Clase que simula el Taller de Naves Espaciales.
 * Aqui se pueden armar las naves del catálogo o si el usuario
 * quiere se puede hacer una nueva nave personalizada, siempre y cuando
 * el cliuente tenga dinero suficiente para pagarla.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 */
public class TallerNaves {

    /**
     * Método para validar si alcanza para comprar una nave con determinado presupuesto.
     * @param nave -- Nave Espacial que queremos comprar.
     * @param presupuesto -- Presupuesto con el que cuento para comprar la nave.
     * @return <code>boolean</code> -- True si puedo comprarla.
     */
    public static boolean meAlcanza(NaveEspacial nave, float presupuesto){
        return nave.precio() <= presupuesto;
    }
    /**
     * Método main que se encarga de la atención al cliente del Taller.
     * Le permite al usuario personalizar su nave o mostrarle el catálogo.
     * Además de validar si su presupuesto es suficiente.
     */
    public static void main(String[] args){
        // Instancia de MenuTerminal para manejar de forma delcarativa los menús.
        MenuTerminal menu = new MenuTerminal();
        // Clase que nos permite crear naves personalizadas o en su defecto elejir una nave ya creada.
        CrearNave creadorNaves = new CrearNave();
        // Nave del usuario, ya sea la que armó o la que eligió del catálogo
        NaveEspacial naveUsuario = null;
        // Variable que contendrá el presupuesto del cliente.
        float presupuestoCliente;

        // Opcion de menú elejida por el usuario.
        int opcion;
        // Variable para controlar el ciclo del menú principal
        boolean seguir = false;

        // Primero se le pregunta al usuario su presupuesto
        presupuestoCliente = menu.dameUnFloat("Ingrese su presupuesto: ");
        
        do{
            // El usuario construye su nave personalizada
            naveUsuario = creadorNaves.crearNavePersonalizada();
            // Se valida si tiene presupuesto suficiente para llevarsela
            if(meAlcanza(naveUsuario, presupuestoCliente))
                System.out.println("\nTu nave está lista para recoger, estas son sus características:\n" +
                    naveUsuario.toString() + 
                    "\nPaga en la caja la cantidad de $" + naveUsuario.precio());
            else {
                // Si no tiene dinero suficiente se le pregunta si quiere ver el catálogo o volver a crear una nave personalizada.
                opcion = menu.opcionMenu("El costo de tu nave sobrepasa tu presupuesto. ¿Deseas..."+
                                        "\n1 - Diseñar otra nave?" +
                                        "\n2 - Ver nuestro catálogo?"+
                                        "\n3 - Salir de la tienda de naves pobremente:("+
                                        "\nElije una opcion(1-3)",1,3);
                if(opcion == 1)
                    seguir = true;
                else if(opcion == 2){
                    opcion = menu.opcionMenu("\nNuestro catálogo de naves es el siguiente:" +
                        "\n1 - Nave Individual de Combate"+
                        "\n2 - Nave Militar de Transporte"+
                        "\n3 - Nave Base Espacial de Guerra"+
                        "\n4 - Salir de la tienda de naves pobremente:("+
                        "\nElije una opcion(1-4): ",1,4);

                    switch (opcion) {
                        case 1:
                            naveUsuario = CrearNave.crearNaveIndividualCombate();
                            break;
                        
                        case 2:
                            naveUsuario = CrearNave.crearNaveMilitarTransporte();
                            break;

                        case 3:
                            naveUsuario = CrearNave.crearNaveBaseEspacialDeGuerra();
                            break;
                        
                        case 4:
                            seguir = false;
                            break;

                        default:
                            break;
                    }
                    // Si ya se le mostró al usuario el catálogo y aún así no le alcanza, se le saca de la tienda (se termina la ejecución)
                    if(!meAlcanza(naveUsuario, presupuestoCliente))
                        break;
                } else if(opcion == 3)
                    seguir = false;
            }

        }while(seguir);
    }
}
