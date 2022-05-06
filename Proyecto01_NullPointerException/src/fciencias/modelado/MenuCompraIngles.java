
/**
 * Clase que implementa la interfaz de MenuCompra.
 * Esta clase muestra el menu de compra en ingles.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public class MenuCompraIngles extends MenuCompra{
    /** Variable que almacena el mensaje al comprar */
    private String completarCompra;

    /** Variable que almacena el mensaje al saludar */
    private String saludar;

    /** Variable que almacena el mensaje al despedirse */
    private String despedirse;

    /** Variable que guarda el menu */
    private String menu;

    /** 
     * Constructor sin parametros para definir los mensajes del idioma.
     */
    public MenuCompraIngles(){
        completarCompra = "Thanyou for you purchase!";
        saludar = "Welcome to the best shop!, ChemsMart";
        despedirse = "Thanks for visiting us!";
        menu = "1) I wanna see your products." + "\n2) I wanna buy some things." + "\n3) I have to go home.";
    }

    /**
     * Constructor de la clase con 3 parametros.
     * @param completarCompra Mensaje al comprar.
     * @param saludar Mensaje al saludar.
     * @param despedirse Mensaje al Despedirse.
     */
    public MenuCompraIngles(String completarCompra, String saludar, String despedirse, String menu){
        this.completarCompra = completarCompra;
        this.saludar = saludar;
        this.despedirse = despedirse;
        this.menu = menu;
    }

    /**
     * Devuelve el mensaje al completar una compra en el idioma ingles.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public String completarCompra(){
        return completarCompra;
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma ingles.
     * @return Saludo en tipo String.
     */
    public String saludar(){
        return saludar;
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma ingles.
     * @return Despedida en tipo String-
     */
    public String despedirse(){
        return despedirse;
    }

    /**
     * Devuelve el mensaje al mostrar el menu del usuario en el idioma Ingles.
     * @return Despedida en tipo String-
     */
    public String menu(){
        return menu;
    }
}
