import java.util.HashMap;
import java.util.Scanner;

/**
 * Clase que simula la tienda CheemsMart.
 * Esta clase se encarga de fungir como menu principal, tiene un servidor propio y un menu de compra adaptado al idioma del usuario.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/05/2022
 */
public class CheemsMart {
    /** Menu de compra con el idioma correspondiente al usuario que ingresó al sistema */
    private static MenuCompra menuCompra;
    /** Servidor asociado a la tienda */
    private static ServidorProxy servidor;
    /** Lista de paises por idioma, donde el idioma es la clave */
    private static HashMap<String,String[]> idiomasPorPais;

    
    /**
     * Método que se encarga de autenticar a un usuario para acceder al sistema.
     * @return - El <code>Usuario</code> que accede al sitema.
     */
    public static Usuario ingresarAlSistema(){
        MenuTerminal menu = new MenuTerminal();
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario = "";
        Usuario usuario = null;
        String contrasena = "";
        boolean ingreso = false;
        while (!ingreso) {
            System.out.println("\n---- INGRESO A LA TIENDA CHEEMS MART ----");
            nombreUsuario = menu.dameUnaCadena("Ingrese su usuario:");
            contrasena = menu.dameUnaCadena("Ingrese su contrasena:");
            usuario = servidor.validarUsuario(nombreUsuario);
            if(usuario!= null){
                if(usuario.coincideContrasena(contrasena))
                    ingreso = true;
                else
                    System.out.println("[!] La contraseña no coincide.");
            }
        }
        return usuario;
    }

    /**
     * Método que cambia el idioma del menu de compra acorde al pais del usuario.
     * @param usuario - <code>Usuario</code> al que se adaptará el menu de compra.
     */
    public static void cambiarIdioma(Usuario usuario){
        if(idiomaPais(usuario.getPais()).equals("Castellano"))
            menuCompra = new MenuCompraCastellano();
        else if(idiomaPais(usuario.getPais()).equals("Ingles"))
            menuCompra = new MenuCompraIngles();
        else if(idiomaPais(usuario.getPais()).equals("Latino"))
            menuCompra = new MenuCompraLatino();
    }

    /**
     * Método auxiliar para llenar la lista de paises por idioma.
     */
    private static void inicializarIdiomasPais(){
        String[] castellano = {"Espana", "Andorra"};
        String[] ingles = {"Estados Unidos", "Reino Unido", "Australia","Canada","Irlanda", "Nueva Zelanda"};
        String[] latino = {"Mexico", "Argentina", "Bolivia", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador", "El Salvador", "Guatemala", "Guinea Ecuatorial", "Honduras", "Nicaragua", "Panama", "Uruguay", "Peru", "Puerto Rico", "Republica Dominicana", "Uruguay", "Venezuela"};

        idiomasPorPais.put("Castellano",castellano);
        idiomasPorPais.put("Ingles",ingles);
        idiomasPorPais.put("Latino",latino);
    }

    /**
     * Método para conocer el idioma del país.
     * @param pais - <codeString></code> con el pais a consultar su idioma.
     * @return - <code>String</code> con el idioma del pais, regresa una cadena vacia en caso de no encontrar algún idioma asociado al país.
     */
    public static String idiomaPais(String pais){
        String[] paises;
        for(String idioma: idiomasPorPais.keySet()){
            paises = idiomasPorPais.get(idioma);
            for (int i = 0; i < paises.length; i++) {
                if(paises[i].equals(pais))
                    return idioma;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        MenuTerminal menu = new MenuTerminal();
        // Se cargan los paises asociados a su idioma
        inicializarIdiomasPais();
        boolean ingreso = true;
        int opcion = 0;
        do{
            opcion = menu.opcionMenu(
                            "\nElija una opción:"+
                            "\n1) Ingresar al sistema"+
                            "\n2) Salir",1,2);
            if(opcion == 1){
                // Ingresa un usuario al sistema  y se cambia el idioma del siguiente menú para este usuario.
                Usuario usuario = ingresarAlSistema();
                cambiarIdioma(usuario);
                menuCompra.menuPrincipal(usuario, servidor);    
            } else {
                ingreso = false;
            }
        } while(ingreso);
    }
}
