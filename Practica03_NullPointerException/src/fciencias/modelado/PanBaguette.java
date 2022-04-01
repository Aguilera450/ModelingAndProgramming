/**
 * Clase abastracta que simula un pan de baguette.
 * Esta clase forma parte del patrón Decorator.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 28/03/2022
 */
public abstract class PanBaguette implements Platillo{
    /** Precio del pan de baguette, o bien el precio inicial*/
    protected float precio;
    /** Tipo de pan usado */
    protected String tipoPan;

    /**
     * Método para mostrar el ticket de la baguette
     * armada con este tipo de pan.
     * @return Ticket de la baguette.
     */
    public String getTicket(){
        return  "\nBaguette de " + tipoPan + 
                "\n   Pan - $" + getPrecio();
    }

    /**
     * Método para obtener el precio total de la baguette
     * armada con este tipo de pan.
     * @return Precio de la baguette.
     */
    public float getPrecio(){
        return precio;
    }

    /**
     * Método para regresar el tipo de pan.
     * @return Tipo de pan.
     */
    public String tipoPan(){
        return tipoPan;
    }
}
