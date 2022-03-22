/**
 * Clase que simula al objeto hamburgesa <code>McJumbo</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 * @see <code>Platillo</code>.
 */

public class McJumbo extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McJumbo con extra queso.
     */
    public McJumbo() {
	super.id = 4;
	super.nombre = "Hamburguesa McJumbo.";
	super.descripcion = "McJumbo hamburguesa es la de mayor tamaño "
	    + "y la promocionamos por su excelente sabor.";
	super.precio = 587.50f;
	super.llevaQueso = true;
	super.esVegetariano = false;
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
	return "\n *) Se coloca pan como base de la hamburguesa "
	    + "con ajonjolí de alta calidad.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "\n *) Se unta la mayonesa imporatada de los ranchos del "
	    + "norte de Cánada.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "\n *) Se coloca la mostaza por encima de la mayonesa.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "\n *) Se colocan 3 carnes en la hamburgesa y se colocan a "
	    + "la parrilla por 4 minutos.";
    }
    
    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String hook() {
	return "\n *) Se coloca el queso después de calentar las carnes, "
	    + "de esta manera se gratina en el momento.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa. 
     */
    @Override
    public String ponerVegetales() {
	return "\n *) A contiunuacion se colocan pepinillos, jitomates en "
	    + "rodajas, aros de cebolla envueltos en tocino, y un "
	    + "poco de hojas de espinacas.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "\n *) Se colocan 2 cucharadas de Catsup premium.";
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
	return "\n *) Finalmente se coloca pan como tapa a la hamburguesa "
	    + "con ajonjolí de alta calidad.";
    }
}
