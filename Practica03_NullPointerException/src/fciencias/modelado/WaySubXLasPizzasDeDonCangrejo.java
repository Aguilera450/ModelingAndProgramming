import java.util.Scanner;
/**
 * Clase que simula la fusión de las empresas de WaySub y Las Pizzas de Don Canrejo.
 * 
 * @author Adrian Aguilera Moreno - Aguiler450
 * @author Rosas Franco Diego Angel - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 31/03/2022
 */
public class WaySubXLasPizzasDeDonCangrejo {
    private static Platillo listaPizzas[] = {
            new AdapterPizza(new Pizza("Pizza Che'pollo ligera", new QuesoChedar(), new CarnePollo(), new MasaGruesa())),
            new AdapterPizza(new Pizza("Pizza Che'pollo densa", new QuesoManchego(), new CarnePollo(), new MasaDelgada())),
            new AdapterPizza(new Pizza("Pizza Jam'Chego", new QuesoManchego(), new CarneJamon(), new MasaGruesa())),
            new AdapterPizza(new Pizza("Pizza Dog", new QuesoChedar(), new CarneSalchicha(), new MasaDelgada())),
            new AdapterPizza(new Pizza("Pizza Mega Dog", new QuesoManchego(), new CarneSalchicha(), new MasaGruesa()))
        };

    /**
     * Método que le solicita un entero al usuario dentro de un rango acorde al menú proporcionado.
     * 
     * @param message Menu con opciones.
     * @param min     Minimo del rango
     * @param max     Máximo del rango
     * @return La opción ingresada por el usuario.
     */
    public static int opcionMenu(String message, int min, int max) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int userInput = 0;
        do {
            try {
                System.out.println("\n" + message);
                userInput = input.nextInt();
                if (userInput >= min && userInput <= max)
                    exit = true;
                else
                    throw new Exception("Rango inválido");

            } catch (Exception e) {
                System.out.println("\nSe ingresó una opción inválida, intentelo nuevamente.");
            } finally {
                input.nextLine(); // Limpiamos el buffer.
            }
        } while (exit == false);

        return userInput;
    }

    /**
     * Método que se encarga del proceso para ordenar una baguette.
     * 
     * @return La baguette armada por el usuario.
     */
    public static Platillo pedirBaguette(){
        Platillo baguette = null;
        // Se comienza el proceso  para elejir el tipo de pan

        // Opcion elejida por el usuario
        int opcion;
        opcion = opcionMenu(
        "\n------ ARMA TU BAGUETTE ------" + 
        "\nElije el tipo de pan:" +
        "\n1) Pan Integral" +
        "\n2) Pan Integral con Avena y Miel" +
        "\n3) Pan Blanco" +
        "\n4) Pan Italiano con Queso y Oregano" +
        "\n5) Pan Italiano Sesamo" + 
        "\nIngrese el número del pan que quiere: "
        , 1, 5);
        // Se inicializa la baguette con el tipo de pan seleccionado
        switch (opcion) {
            case 1:
                baguette = new PanIntegral();
                break;
            
            case 2:
                baguette = new PanIntegralConAvenaYMiel();
                break;
            
            case 3:
                baguette = new PanBlanco();
                break;
            
            case 4:
                baguette = new PanItalianoConQuesoYOregano();
                break;
            
            case 5:
                baguette = new PanItalianoSesamo();
                break;
        
            default:
                break;
        }

        // Se le pregunta al usuario todos los ingredientes extras que quiere:
        System.out.println("\n------ VAMOS A AGREGAR INGREDIENTES A TU BAGUETTE ------");

        do {
            // Se le solicita al usuario una opción asociada a un ingrediente
            opcion = opcionMenu(
            "\nINGREDIENTES DISPONIBLES:" +
            "\n1) Jamon" + 
            "\n2) Peperoni" + 
            "\n3) Pollo" + 
            "\n4) Lechuga" +
            "\n5) Jitomate" +  
            "\n6) Cebolla" + 
            "\n7) Mostaza" +
            "\n8) Catsup" +  
            "\n9) Mayonesa" +
            "\n0) Eso es todo:)" 
            , 0, 9);
            
            // Se agrega ese ingrediente elejido a la baguette.
            switch (opcion) {
                case 1:
                    baguette = new IngredienteJamon(baguette);
                    break;
                
                case 2:
                    baguette = new IngredientePeperoni(baguette);
                    break;

                case 3:
                    baguette = new IngredientePollo(baguette);
                    break;
                
                case 4:
                    baguette = new IngredienteLechuga(baguette);
                    break;

                case 5:
                    baguette = new IngredienteJitomate(baguette);
                    break;
                
                case 6:
                    baguette = new IngredienteCebolla(baguette);
                    break;
                
                case 7:
                    baguette = new IngredienteMostaza(baguette);
                    break;
                
                case 8:
                    baguette = new IngredienteCatsup(baguette);
                    break;
                
                case 9:
                    baguette = new IngredienteMayonesa(baguette);
                    break;

                default:
                    break;
            }
        } while (opcion != 0);
        System.out.println("BAGUETTE A REGRESAR: " +baguette.toString());
        return baguette;
    }


    /**
     * Método que se encarga del proceso para ordenar una pizza.
     * @return La pizza elejida por el usuario.
     */
    public static Platillo pedirPizza(){
        Platillo pizza = null;
        // Opcion elejida por el usuario
        int opcion;
        // Se le solicita al usuario elegir una opción
        opcion = opcionMenu(
        "\n------ PIZZAS DE DON CANGREJO -----" + 
        "\nPIZZA 1: "+
        listaPizzas[0].toString() + 
        "\n-----------------------------------" +
        "\nPIZZA 2: "+
        listaPizzas[1].toString() +
        "\n-----------------------------------" +
        "\nPIZZA 3: "+
        listaPizzas[2].toString() +
        "\n-----------------------------------" +
        "\nPIZZA 4: "+
        listaPizzas[3].toString() +
        "\n-----------------------------------" +
        "\nPIZZA 5: "+
        listaPizzas[4].toString() +
        "\n-----------------------------------" +
        "\nElije el número de pizza a ordenar: "
        , 1, 5);
        // Se guarda la pizza elejida por el usuario.
        switch (opcion) {
            case 1:
                pizza = listaPizzas[0];
                break;
            
            case 2:
                pizza = listaPizzas[1];
                break;

            case 3:
                pizza = listaPizzas[2];
                break;
            
            case 4:
                pizza = listaPizzas[3];
                break;
            
            case 5:
                pizza = listaPizzas[4];
                break;
            
            default:
                break;
        }
        return pizza;
    }

    /** Metodo que nos imprimer el Ticket del platillo.
     * @param platillo Platillo del cual se va a imprimir el ticket.
     */
    public static void mostrarTicketPlatillo(Platillo platillo){
	    System.out.println("\n---- TOME SU TICKET ----");
	    System.out.println(platillo.getTicket() + "\nTotal: $" + platillo.getPrecio());
    }
    
    /**
     * Método principal para elejir entre una baguette y una pizza.
     * Acorde a la anterior elección se realizará el proceso de orden.
     */
    public static void main(String[] args) {
        // Opcion elejida por el usuario
        int opcion;
        do {
            opcion = opcionMenu(
            "\n----- ¿QUE PLATILLO DESEA ORDENAR? -----" +
            "\n1) UNA BAGUETTE WAYSUB PERSONALIZADA" +
            "\n2) UNA PIZZA DE DON CANGREJO"+
            "\n3) ESO ES TODO:)" +
            "\nElije una opción: "
            ,1,3);
            switch (opcion) {
                case 1:
                    mostrarTicketPlatillo(pedirBaguette());
                    break;
                
                case 2:
                    mostrarTicketPlatillo(pedirPizza());
                    break;
            
                default:
                    break;
            }
        } while (opcion != 3);
        System.out.println("\n¡GRACIAS, VUELVA PRONTO!");
    }
}
