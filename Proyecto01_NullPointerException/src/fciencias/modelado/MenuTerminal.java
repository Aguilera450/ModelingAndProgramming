import java.util.Scanner;

/**
 * Clase auxiliar para usar de manera declarativa los menús y sus validaciones.
 * 
 * @author Adrian Aguilera Moreno - Aguiler450
 * @author Rosas Franco Diego Angel - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 */
public class MenuTerminal {

    /**
     * Método que le solicita un entero al usuario acorde al menú proporcionado.
     * 
     * @param mensaje Menu con opciones.
     * @return <code>int</code> -- La opción ingresada por el usuario.
     */
    public int opcionMenu(String mensaje) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int userInput = 0;
        do {
            try {
                System.out.println("\n" + mensaje);
                userInput = input.nextInt();
            } catch (Exception e) {
                System.out.println("\nSe ingresó una opción inválida, intentelo nuevamente.");
            } finally {
                input.nextLine(); // Limpiamos el buffer.
            }
        } while (exit == false);

        return userInput;
    }

    /**
     * Método que le solicita un entero al usuario dentro de un rango acorde al menú proporcionado.
     * 
     * @param mensaje Menu con opciones.
     * @param min     Minimo del rango
     * @param max     Máximo del rango
     * @return <code>int</code> -- La opción ingresada por el usuario.
     */
    public int opcionMenu(String mensaje, int min, int max) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int userInput = 0;
        do {
            try {
                System.out.println("\n" + mensaje);
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
    * Método que le solicita un número float al usuario.
    * @param mensaje mensaje de solicitud del float.
    * @return <code>float</code> -- El número ingresado por el usuario.
    */
    public float dameUnFloat(String mensaje){
        Scanner input = new Scanner(System.in);
        boolean exit  = false;
        float userInput = 0;
        do{
            try{
                System.out.println("\n[*] "+ mensaje);
                userInput = input.nextFloat();
                exit = true;
            }catch(Exception e){
                System.out.println("\nSe ingreso un valor inválido, intentelo nuevamente.");
            }finally{
                input.nextLine(); // Limpiamos el buffer.
            }
        }while(exit == false);

        return userInput;
    }
    
    /**
    * Método que le solicita un número float al usuario.
    * @param mensaje mensaje de solicitud del float.
    * @return <code>float</code> -- El número ingresado por el usuario.
    */
    public String dameUnaCadena(String mensaje){
        Scanner input = new Scanner(System.in);
        boolean exit  = false;
        String userInput = "";
        do{
            try{
                System.out.println("\n[*] "+ mensaje);
                userInput = input.nextLine();
                if(!userInput.equals(""))
                    exit = true;
            }catch(Exception e){
                System.out.println("\nSe ingreso un valor inválido, intentelo nuevamente.");
            }finally{
                input.nextLine(); // Limpiamos el buffer.
            }
        }while(exit == false);

        return userInput;
    }

    /**
     * Método que limpia la terminal.
     */
    public static void limpiaTerminal(){
        System.out.println("\033[H\033[2J");
    }

    /**
     * Método que genera una pausa dentro del programa y solicita presionar Enter
     * para continuar
     */
    public static void dameEnter() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nPulse Enter para continuar...");
        input.nextLine();
        limpiaTerminal();
    }
}
