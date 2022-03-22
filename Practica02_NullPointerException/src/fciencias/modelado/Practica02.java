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
