/**
 * Clase que implementa la interfaz de MenuCompra.
 * Esta clase muestra el menu de compra en castellano.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public class MenuCompraCastellano extends MenuCompra {

    /**
     * Devuelve el mensaje al completar una compra en el idioma castellano.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public String completarCompra(){
        return "Disfrutad de vuestra compra!";
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma castellano.
     * @return Saludo en tipo String.
     */
    public String saludar(){
        return "Bienveniros a vuestra tienda favorita!";
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma castellano.
     * @return Despedida en tipo String-
     */
    public String despedirse(){
        return "Gracias por vuestra preferencia! volved pronto.";
    }

    /**
     * Devuelve el mensaje al mostrar el menu del usuario en el idioma castellano.
     * @return Despedida en tipo String.
     */
    public String opcionesMenu(){
        return "1) Quiero ver vuestro catalogo." + "\n Quiero comprar uno de vuestros productos." + "\n 3) Me piro vampiro.";
    }
}
