/**
 * Clase que funge de Adapter a la clase
 * Pizza y a la clase Platillo
 * junto a sus dependencias.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 30/03/2022
 */

public class AdapterPizza implements Platillo {
    
    /* Atributos de clase. */
    private Pizza pizza;

    /**
     * Constructor del adaptador.
     * @param pizza Pizza que será adaptada.
     */
    AdapterPizza(Pizza pizza){
        this.pizza = pizza;
    }

    /**
     * Método que adapta el ticket de una Pizza al del restaurant
     * WaySubLasPizzasDeDonCangrejo, junto al de las baggets.
     * @return String -- Ticket de la Pizza.
     */
    public String getTicket() {
	return "\n" + pizza.getNombre() +"\n"
	    + "   Queso: " + pizza.tipoQueso() + " - $" + pizza.getQueso().precio() + "\n"
	    + "   Carne: " + pizza.tipoCarne() + " - $ " + pizza.getCarne().precio() + "\n"
	    + "   Masa:  " + pizza.tipoMasa()  + " - $" + pizza.getMasa().precio();
    }
    
    /** @return float -- precio de la Pizza.  */
    public float getPrecio() {
	    return pizza.getPrecio();
    }
    
    /** @return String -- genera una pizza en forma de una cadena. */
    public String toString() {
	    return pizza.toString();
    }
}
