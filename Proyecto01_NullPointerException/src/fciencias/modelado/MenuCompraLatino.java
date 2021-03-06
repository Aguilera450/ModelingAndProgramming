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
    @Override
    public String completarCompra(){
        return "¡Muchas gracias por su compra!, Vuelva pronto!";
    }

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma latino.
     * @param nombre Nombre del usuario.
     * @return Saludo en tipo String.
     */
    @Override
    public String saludar(String nombre){
        return "Hola "+ nombre +",¡Te damos la bienvenida a nuestra tienda!";
    }

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma latino.
     * @param nombre Nombre del usuario.
     * @return Despedida en tipo String.
     */
    @Override
    public String despedirse(String nombre){
        return "¡Vuelve pronto" + nombre + "!";
    }

    /**
     * Devuelve el mensaje para decirle al usuario que seleccione una opcion en el idioma latino.
     * @return Despedida en tipo String.
     */
    @Override
    public String seleccionaOpcion(){
        return "16) Salir \nIngresa el número asociado al producto que quieres: " ;
    }

    /**
     * Devuelve el mensaje para informar el contenido del carrito.
     * @return Despedida en tipo String.
     */
    @Override
    public String contenidoCarrito(){
        return "Esto es lo que llevas en tu carrito: " ;
    }

    /**
     * Devuelve la opcióm 1 del menu en el idioma latino.
     * @return La opcion 1 en tipo String.
     */
    @Override
    public String opcion1(){
        return "1) Quiero ver tus productos.";
    }

    /**
     * Devuelve la opción 2 del menu en el idioma latino.
     * @return La opcion 2 en tipo String.
     */
    @Override
    public String opcion2(){
        return "2) Quiero comprar algo.";
    }

    /**
     * Devuelve la opción 3 del menu en el idioma latino.
     * @return La opcion 3 en tipo String.
     */
    @Override
    public String opcion3(){
        return "3) Quiero pagar mi carrito.";
    }

    /**
     * Devuelve la opción 4 del menu en el idioma latino.
     * @return La opcion 4 en tipo String.
     */
    @Override
    public String opcion4(){
        return "4) ¡Me tengo que ir, nos vemos!.";
    }

    /**
     * Devuelve el mensaje para solicitar la cuenta bancaria.
     * @return Despedida en tipo String.
     */
    @Override
    public String ingresarCuenta(){
        return "Ingresa tu cuenta bancaria: " ;
    }

    /**
     * Devuelve el mensaje de pago rechazado.
     * @return Despedida en tipo String.
     */
    @Override
    public String pagoRechazado(){
        return "Tu pago fue rechazado. " ;
    }

    /**
     * Devuelve le titulo ticket
     * @return Despedida en tipo String.
     */
    @Override
    public String ticket(){
        return "TICKET " ;
    }

    /**
     * Devuelve el mensaje que avusa a donde se va a enviar:
     * @return Despedida en tipo String.
     */
    @Override
    public String direccion(){
        return "Te mandaremos sus productos a: " ;
    }

    /**
     * Devuelve el mensaje apra avisar el dia.
     * @return Despedida en tipo String.
     */
    @Override
    public String dia(){
        return "en la fecha: " ;
    }
}
