
/**
 * Clase que implementa la interfaz de MenuCompra.
 * Esta clase muestra el menu de compra en ingles.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public class MenuCompraIngles extends MenuCompra{
    /**
     * Devuelve el mensaje al completar una compra en el idioma ingles.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public String completarCompra(){
        return "Thank you very much for you purchase!";
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma ingles.
     * @return Saludo en tipo String.
     */
    public String saludar(){
        return "Welcome to the best shop!, ChemsMart";
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma ingles.
     * @return Despedida en tipo String-
     */
    public String despedirse(){
        return "Thanks for visiting us!";
    }

    /**
     * Devuelve el mensaje al mostrar el menu del usuario en el idioma Ingles.
     * @return Despedida en tipo String.
     */
    public String opcionesMenu(){
        return "1) I wanna see your products." + "\n2) I wanna buy some things." + "\n3) I have to go home.";
    }
}
