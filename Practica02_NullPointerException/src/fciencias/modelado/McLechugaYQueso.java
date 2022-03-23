/**
 * Clase que simula al objeto hamburgesa <code>McLechugaYQueso</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public class McLechugaYQueso extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McKongLechugaYQueso.
     */
    public McLechugaYQueso() {
	super.id = 6;
	super.nombre = "Hamburguesa McLechugaYQueso";
	super.descripcion = "McLechugaYQueso hamburguesa vegetariana.";
	super.precio = 89.50f;
	super.llevaQueso = true;
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
	return "\n *) Se coloca pan procesado con lechugas de alta calidad.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "\n *) Se unta mayonesa McMayonesa en el pan de lechuga base.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "\n *) Ahora, estamos untando mostaza junto a la mayonesa en la "
	    + "base de pan de lechuga.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "\n *) En este momento estamos dorando la carne de Soja y lechuga "
	    + "con un poco de aceite.";
    }
    
    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String hook() {
	return "\n *) Se coloca queso manchego y parmesano sobre la carne "
	    + "sintética.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa. 
     */
    @Override
    public String ponerVegetales() {
	return "\n *) Se le colocan rabanos, lechuga orejona, lechuga romana "
	    + "y aros de cebolla a la hamburguesa.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "\n *) Se coloca una cucharada de Catsup marca del gallo.";
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
	return "\n *) Finalmente, se coloca pan procesado con lechugas de alta calidad.";
    }    
}
