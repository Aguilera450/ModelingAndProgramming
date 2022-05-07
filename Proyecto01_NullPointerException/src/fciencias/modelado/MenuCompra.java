/**
 * Calse abstracta Menu compra con la cual usaremos el patrón strategy.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public abstract class MenuCompra {
    /**
     * Devuelve el mensaje al completar una compra en el idioma correcto.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public abstract String completarCompra();

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma correcto.
     * @param nombre Nombre del usuario.
     * @return Saludo en tipo String.
     */
    public abstract String saludar(String nombre);

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma correcto.
     * @param nombre Nombre del usuario.
     * @return Despedida en tipo String-
     */
    public abstract String despedirse(String nombre);

    /**
     * Devuelve la opcion 1 del menu del usuario.
     * @return La opcion 1 en tipo String.
     */
    public abstract String opcion1();

    /**
     * Devuelve la opcion 2 del menu del usuario.
     * @return La opcion 2 en tipo String.
     */
    public abstract String opcion2();

    /**
     * Devuelve la opcion 3 del menu del usuario.
     * @return La opcion 3 en tipo String.
     */
    public abstract String opcion3();

    /**
     * Devuelve el menu completo de opciones en el idioma correcto.
     * @param nombre Nombre del usuario.
     * @return Devuelve las opciones del menu en una sola cadena.
     */
    public String opcionesMenu(String nombre){
        return saludar(nombre) + "\n" + opcion1() +"\n" + opcion2() + "\n" + opcion3();
    }

    /**
     * Menu Principal
     * @param usuario Usuario.
     * @param servidor Servidor Proxy.
     */
    public void menuPrincipal(Usuario usuario, ServidorProxy servidor){
        MenuTerminal menu = new MenuTerminal();
        boolean seguir = true;
        int opcion = 0;
        do {
            opcion = menu.opcionMenu(opcionesMenu(usuario.getNombreCompleto()), 1, 3);
            switch(opcion){
                case 1:
                    System.out.println(servidor.solicitarCatalogo(usuario));
                    break;
                case 2:
                    System.out.println(servidor.solicitarCatalogo(usuario));
                    break;
                case 3:
                    System.out.println(despedirse(usuario.getNombreCompleto()));
                    seguir = false;
                    break;
            }
        } while (seguir);
    }
}
