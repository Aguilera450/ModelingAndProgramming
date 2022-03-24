/**
 * Clase que simula al objeto hamburgesa <code>McNopalitoToreado</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public class McNopalitoToreado extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McNopalitoToreado.
     */
    public McNopalitoToreado() {
        super.id = 7;
        super.nombre = "Hamburguesa McNopalitoToreado";
        super.descripcion = "McNopalitoToreado hamburguesa vegetariana.";
        super.precio = 59.50f;
        super.llevaQueso = false;
        super.esVegetariano = true;
    }
    
    /**
     * Método que devuelve el estado del pan en la
     * base de la hamburguesa.
     * @return <code>String</code> -- mensaje que le
     * dice al usuario como va el avance del pan en
     * la base de la hamburguesa.
     */
    @Override
    public String ponerBasePan() {
	    return "\n *) En este momento, se coloca pan marquez como base en esta hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	    return "\n *) Ahora, se unta mayonesa al pan de la base.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	    return "\n *) Colocamos mostaza moscada por encima de la mayonesa.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	    if(esVegetariano){
            return "\n *) Luego, se torean unos nopalitos con chiles abaneros "
	        + "para finalmente procesarse con Soja, y esto suple la "
	        + "a la carne en esta hamburguesa.";
        } else {
            return "\n *) Luego, se torean unos nopalitos con chiles abaneros "
	    + "para finalmente procesarse con la carne, y esto suple la "
	    + "a la carne en esta hamburguesa.";
        }
    }
        
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa.
     */
    @Override
    public String ponerVegetales() {
	    return "\n *) En este momento estamos colocando rodajas de cebolla  "
	    + "rebanadas de tomates, algunas hojas de lechuga y un "
	    + "nopalito toreado.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	    return "\n *) Se ponen algunas pizcas de Catsup por encima de los vegetales.";
    }
    
    /**
     * Método que devuelve el estado del pan en la
     * tapa de la hamburguesa.
     * @return <code>String</code> -- mensaje que le
     * dice al usuario como va el avance del pan en
     * la tapa de la hamburguesa.
     */
    @Override
    public String ponerTapaPan() {
	    return "\n *) Por ultimo, se coloca pan marquez como tapa en esta hamburguesa ";
    }
}
