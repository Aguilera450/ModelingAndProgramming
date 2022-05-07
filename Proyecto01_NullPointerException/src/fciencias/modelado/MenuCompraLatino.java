/**
 * Clase que implementa la interfaz de MenuCompra.
 * Esta clase muestra el menu de compra en latino.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public class MenuCompraLatino extends MenuCompra {
    /**
     * Devuelve el mensaje al completar una compra en el idioma latino.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public String completarCompra(){
        return "¡Muchas gracias por su compra!, Vuelva pronto!";
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma latino.
     * @return Saludo en tipo String.
     */
    public String saludar(){
        return "¡Te damos la bienvenida a nuestra tienda!";
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma latino.
     * @return Despedida en tipo String.
     */
    public String despedirse(){
        return "¡Vuelva pronto!";
    }

    /**
     * Devuelve la opcióm 1 del menu en el idioma latino.
     * @return La opcion 1 en tipo String.
     */
    public String opcion1(){
        return "1) Quiero ver tus productos.";
    }

    /**
     * Devuelve la opción 2 del menu en el idioma latino.
     * @return La opcion 2 en tipo String.
     */
    public String opcion2(){
        return "2) Quiero comprar algo.";
    }

    /**
     * Devuelve la opción 3 del menu en el idioma latino.
     * @return La opcion 3 en tipo String.
     */
    public String opcion3(){
        return "3) ¡Me tengo que ir, nos vemos!.";
    }
}
