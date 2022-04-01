/**
 * Clase abastracta que simula un ingrediente.
 * Esta clase forma parte del patrón Decorator.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 28/03/2022
 */
public abstract class Ingrediente implements Platillo{
    /** Referencia al platillo contenido */
    protected Platillo platillo;

    /**
     * Constructor de un ingrediente.
     * @param centro Platillo al cual se le agregará el ingrediente.
     */
    public Ingrediente(Platillo centro){
        this.platillo = centro;
    }

    /**
     * Regresa el ticket del platillo.
     * El ticket muestra el nombre del platillo,
     * un listado de los ingredientes que lo componen 
     * junto a su precio de cada ingrediente.
     * Y el precio total del platillo.
     * 
     * @return Ticket del platillo.
     */
    public String getTicket(){
        return platillo.getTicket();
    }

    
    /**
     * Regresa el precio del Platillo.
     * Este precio ya toma en cuenta los ingredientes
     * del platillo.
     * @return Precio del platillo.
     */
    @Override
    public float getPrecio(){
        return platillo.getPrecio();
    }
}
