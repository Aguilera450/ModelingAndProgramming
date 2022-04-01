/**
 * Clase que funge de <code>Adapter</code> a la clase
 * <code>Pizza</code> y a la clase <code>Platillo</code>
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
     * Método que adapta el ticket de una <code>Pizza</code> al del restaurant
     * <code>WaySubLasPizzasDeDonCangrejo</code>, junto al de las baggets.
     * @return <code>String</code> -- Ticket de la <code>Pizza</code>.
     */
    public String getTicket() {
	return "\nTipo de Pizza: " + pizza.getNombre()
	    + "Queso: " + pizza.tipoQueso() + ",      Precio: " + pizza.getQueso().precio() + "\n"
	    + "Carne: " + pizza.tipoCarne() + ",      Precio: " + pizza.getCarne().precio() + "\n"
	    + "Masa:  " + pizza.tipoMasa()  + ",      Precio: " + pizza.getMasa().precio() + "\n";
    }
    
    /** @return <code>float</code> -- <code>precio</code> de la <code>Pizza</code>.  */
    public float getPrecio() {
	return pizza.getPrecio();
    }
}
