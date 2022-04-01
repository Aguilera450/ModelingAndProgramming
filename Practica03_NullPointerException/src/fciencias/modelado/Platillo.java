/**
 * Interfaz para definir las funciones principales de un Platillo en la Practica03.
 * Esta interfaz forma parte del patrón Decorator.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 28/03/2022
 */
public interface Platillo {
    /**
     * Regresa el ticket del platillo.
     * El ticket muestra el nombre del platillo,
     * un listado de los ingredientes que lo componen 
     * junto a su precio de cada ingrediente.
     * 
     * @return Ticket del platillo.
     */
    public String getTicket();

    /**
     * Regresa el precio del Platillo.
     * Este precio ya toma en cuenta los ingredientes
     * del platillo.
     * @return Precio del platillo.
     */
    public float getPrecio();
}
