/**
 * Clase que implementa la interfaz de MenuCompra.
 * Esta clase muestra el menu de compra en castellano.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public class MenuCompraCastellano implements MenuCompra {
    /** Variable que almacena el mensaje al comprar */
    private String completarCompra;

    /** Variable que almacena el mensaje al saludar */
    private String saludar;

    /** Variable que almacena el mensaje al despedirse */
    private String despedirse;

    /** 
     * Constructor sin parametros para definir los mensajes del idioma.
     */
    public MenuCompraCastellano(){
        completarCompra = "Disfrutad de vuestra compra!";
        saludar = "Bienveniros a vuestra tienda favorita!";
        despedirse = "Gracias por vuestra preferencia! volved pronto.";
    }

    /**
     * Constructor de la clase con 3 parametros.
     * @param completarCompra Mensaje al comprar.
     * @param saludar Mensaje al saludar.
     * @param despedirse Mensaje al Despedirse.
     */
    public MenuCompraCastellano(String completarCompra, String saludar, String despedirse){
        this.completarCompra = completarCompra;
        this.saludar = saludar;
        this.despedirse = despedirse;
    }

    /**
     * Devuelve el mensaje al completar una compra en el idioma castellano.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public String completarCompra(){
        return completarCompra;
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma castellano.
     * @return Saludo en tipo String.
     */
    public String saludar(){
        return saludar;
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma castellano.
     * @return Despedida en tipo String-
     */
    public String despedirse(){
        return despedirse;
    }
}