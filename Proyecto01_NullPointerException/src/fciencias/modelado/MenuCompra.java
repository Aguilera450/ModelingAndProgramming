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
     * @return Saludo en tipo String.
     */
    public abstract String saludar();

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma correcto.
     * @return Despedida en tipo String-
     */
    public abstract String despedirse();

    /**
     * Devuelve el mensaje al mostrar el menu del usuario en el idioma castellano.
     * @return Despedida en tipo String-
     */
    public abstract String menu();

    /**
     * Menu Principal
     */
    public void menuPrincipal(Usuario usuario, ServidorProxy servidor){
        MenuTerminal menu = new MenuTerminal();
        boolean seguir = true;
        int opcion = menu.opcionMenu(saludar() + "\n"+ menu(), 1, 3);
        do {
            switch(opcion){
                case 1:
                    System.out.println(servidor.solicitarCatalogo(usuario));
                    break;
                case 2:
                    System.out.println(servidor.solicitarCatalogo(usuario));
                    break;
                case 3:
                    seguir = false;
                    break;
            }
        } while (seguir);
    }
}
