public class Practica02{
    /** Menu usado para la prueba */
    static Menu menuPrueba = new MenuDiario("Menu Diario");
    /** Robot usado para la prueba */
    static Robot mcrobot = new Robot(menuPrueba);
    /** Mesa del cliente para la prueba */
    static MesaCliente mesa = new MesaCliente("Arturo");

    public static void main(String[] args) {
        System.out.println("Bienvenido a McHamburguesas, " + mesa.nombreCliente());
        MenuDiario menu = new MenuDiario("Menu 1");
    }
}