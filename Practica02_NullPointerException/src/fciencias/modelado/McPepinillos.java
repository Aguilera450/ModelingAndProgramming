/**
 * Clase que simula al objeto hamburgesa <code>McPepinillos</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public class McPepinillos extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McPepinillos.
     */
    public McPepinillos() {
	super.id = 8;
	super.nombre = "Hamburguesa McPepinillos";
	super.descripcion = "McPepinillos hamburguesa vegetariana.";
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
	return "\n *) Iniciamos colocando una base de pan horneado "
	    + "de una gran marca mexicana.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "\n *) Ahora, se colca moyonesa McMayonesa sobre la base de pan.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "\n *) Luego, se unta un poco de mostaza McMostaza sobre la mayonesa. ";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "\n *) Preparamos la carne a base de Pepinillos y Soja "
	    + "con un toque de betabel para simular la sangre.";
    }
    
    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String hook() {
	return "\n *) Se aplica queso manchego y amarillo, ambos quesos van "
	    + "derretidos a la braza.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa. 
     */
    @Override
    public String ponerVegetales() {
	return "\n *) En este momento colocamos cebolla rallada, salsa de tomates, "
	    + "pepinillos y unas hojas de lechuga.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "\n *) Se coloca Catsup McCatsup sobre los vegetales. ";
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
	return "\n *) Terminamos colocando una tapa de pan horneado "
	    + "de una gran marca mexicana.";
    }
}
