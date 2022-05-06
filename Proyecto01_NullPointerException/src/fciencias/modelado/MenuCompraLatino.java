/**
 * Clase que implementa la interfaz de MenuCompra.
 * Esta clase muestra el menu de compra en latino.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public class MenuCompraLatino extends MenuCompra {
    /** Variable que almacena el mensaje al comprar */
    private String completarCompra;

    /** Variable que almacena el mensaje al saludar */
    private String saludar;

    /** Variable que almacena el mensaje al despedirse */
    private String despedirse;

    /** 
     * Constructor sin parametros para definir los mensajes del idioma.
     */
    public MenuCompraLatino(){
        completarCompra = "Muchas gracias por su compra!, Vuelva pronto!";
        saludar = "Te damos la bienvenida a nuestra tienda!";
        despedirse = "Vuelva pronto!";
    }

    /**
     * Constructor de la clase con 3 parametros.
     * @param completarCompra Mensaje al comprar.
     * @param saludar Mensaje al saludar.
     * @param despedirse Mensaje al Despedirse.
     */
    public MenuCompraLatino(String completarCompra, String saludar, String despedirse){
        this.completarCompra = completarCompra;
        this.saludar = saludar;
        this.despedirse = despedirse;
    }

    /**
     * Devuelve el mensaje al completar una compra en el idioma latino.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public String completarCompra(){
        return completarCompra;
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma latino.
     * @return Saludo en tipo String.
     */
    public String saludar(){
        return saludar;
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma latino.
     * @return Despedida en tipo String-
     */
    public String despedirse(){
        return despedirse;
    }

}
