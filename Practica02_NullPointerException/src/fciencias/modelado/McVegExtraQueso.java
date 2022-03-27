/**
 * Clase que simula al objeto hamburgesa <code>McVegExtraQueso</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public class McVegExtraQueso extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McPepinillos.
     */
    public McVegExtraQueso() {
        super.id = 10;
        super.nombre = "Hamburguesa McVegExtraQueso";
        super.descripcion = "McVegExtraQueso hamburguesa vegetariana.";
        super.precio = 109.50f;
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
	    return "\n *) Se coloca pan espolvoreado de arina y recién "
        + "horneado como base de su hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	    return "\n *) Se unta mayonesa en el pan base de su hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	    return "\n *) Se coloca mostaza sobre la mayonesa y el pan para "
	    + "formar un tipo de adereso.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	    return "\n *) Ahora, calentamos y colocamos sobre su pan y adereso "
	    + "una carne de Soja y mezcla de vegetales.";
    }
    
    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String ponerQueso() {
        if(llevaQueso)
	        return "\n *) Se colocan 2 tipos de quesos, uno de cabra y 3 laminas "
	        + "de queso manchego.";
        else
            return "";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa. 
     */
    @Override
    public String ponerVegetales() {
        if(esVegetariano)
	        return "\n *) Estamos colocando aros de cebolla fritos, rodajas "
	        + "de jitomates, algunas hojas de espinaca.";
        else
            return "";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	    return "\n *) Se anexa un poco de Catsup a la mezcla que llevamos. ";
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
	    return "\n *) Se coloca pan espolvoreado de arina y recién "
	    + "horneado como tapa de su hamburguesa.";
    }
}
