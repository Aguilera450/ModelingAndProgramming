
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
    @Override
    public String completarCompra(){
        return "Thank you very much for you purchase!";
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma ingles.
     * @param nombre Nombre del usuario.
     * @return Saludo en tipo String.
     */
    @Override
    public String saludar(String nombre){
        return "Welcome "+ nombre +" to the best shop!, ChemsMart";
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma ingles.
     * @param nombre Nombre del usuario.
     * @return Despedida en tipo String.
     */
    @Override
    public String despedirse(String nombre){
        return "Thanks for visiting us " + nombre+"!";
    }

    /**
     * Devuelve el mensaje para decirle al usuario que seleccione una opcion en el idioma castellano.
     * @return Despedida en tipo String.
     */
    @Override
    public String seleccionaOpcion(){
        return "16) Exit \nPlease put the index product: " ;
    }

    /**
     * Devuelve el mensaje para informar el contenido del carrito.
     * @return Despedida en tipo String.
     */
    @Override
    public String contenidoCarrito(){
        return "This is the content of your shopping cart: " ;
    }

    /**
     * Devuelve la opcióm 1 del menu en el idioma ingles.
     * @return La opcion 1 en tipo String.
     */
    @Override
    public String opcion1(){
        return "1) I wanna see your products.";
    }

    /**
     * Devuelve la opción 2 del menu en el idioma ingles.
     * @return La opcion 2 en tipo String.
     */
    @Override
    public String opcion2(){
        return "2) I wanna buy some things." ;
    }

    /**
     * Devuelve la opción 3 del menu en el idioma ingles.
     * @return La opcion 3 en tipo String.
     */
    @Override
    public String opcion3(){
        return "3) I wanna pay my shopping cart.";
    }

    /**
     * Devuelve la opción 4 del menu en el idioma ingles.
     * @return La opcion 4 en tipo String.
     */
    @Override
    public String opcion4(){
        return "4) I have to go home!";
    }

    /**
     * Devuelve el mensaje para solicitar la cuenta bancaria.
     * @return Despedida en tipo String.
     */
    @Override
    public String ingresarCuenta(){
        return "Put your bank account: " ;
    }

    /**
     * Devuelve el mensaje de pago rechazado.
     * @return Despedida en tipo String.
     */
    @Override
    public String pagoRechazado(){
        return "Your pay was rejected. " ;
    }

    /**
     * Devuelve le titulo ticket
     * @return Despedida en tipo String.
     */
    @Override
    public String ticket(){
        return "Voucher" ;
    }

    /**
     * Devuelve el mensaje que avusa a donde se va a enviar:
     * @return Despedida en tipo String.
     */
    @Override
    public String direccion(){
        return "We will send you your products to the address: " ;
    }

    /**
     * Devuelve el mensaje apra avisar el dia.
     * @return Despedida en tipo String.
     */
    @Override
    public String dia(){
        return "In the day: " ;
    }
}
