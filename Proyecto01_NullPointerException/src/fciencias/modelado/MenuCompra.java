/**
 * Interfaz Menu compra con la cual usaremos el patrón strategy.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/06/2022
 */
public interface MenuCompra {
    /**
     * Devuelve el mensaje al completar una compra en el idioma correcto.
     * @return Mensaje de agradecimiento por su compra en tipo String.
     */
    public String completarCompra();

    /**
     * Devuelve el mensaje para saludar al usuario en el idioma correcto.
     * @return Saludo en tipo String.
     */
    public String saludar();

    /**
     * Devuelve el mensaje al despedirse del usuario en el idioma correcto.
     * @return Despedida en tipo String-
     */
    public String despedirse();
}
