/**
 * Clase que simula el ingrediente catsup.
 * Esta clase forma parte del patrón Decorator.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 28/03/2022
 */
public class IngredienteCatsup extends Ingrediente {
    /** Precio del ingrediente */
    private float precio = 2.99f;
    
    /**
     * Constructor de un ingrediente catsup.
     * @param centro Platillo al cual se le agregará catsup.
     */
    IngredienteCatsup(Platillo centro){
        super(centro);
    }

    /**
     * Regresa el ticket del platillo.
     * El ticket muestra el nombre del platillo,
     * un listado de los ingredientes que lo componen 
     * junto a su precio de cada ingrediente.
     * 
     * @return Ticket del platillo.
     */
    @Override
    public String getTicket(){
        return platillo.getTicket() + "\n   Catsup - $" + precio;
    }

    /**
     * Regresa el precio del Platillo.
     * Este precio ya toma en cuenta los ingredientes
     * del platillo.
     * @return Precio del platillo.
     */
    @Override
    public float getPrecio(){
        return platillo.getPrecio() + precio;
    }
}
