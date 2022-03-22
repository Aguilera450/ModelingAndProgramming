/**
 * Clase que simula al objeto hamburgesa <code>McKongFrijoles</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 * @see <code>Platillo</code>.
 */

public McKongFrijoles extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McKongFrijoles.
     */
    public McKongFrijoles() {
	super.id = 5;
	super.nombre = "Hamburguesa McKongFrijoles.";
	super.descripcion = "McKongFrijoles hamburguesa es vegetariana."
	super.precio = 47.50f;
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
	return "\n *) Se calienta en la plancha la base de la hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "\n *) Se coloca mayonesa de limón y sin grasas animales.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza. 
     */
    @Override
    public String ponerMostaza() {
	return "\n *) Luego, se unta la mostaza sobre la mayoneza, hasta que se mezcla.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "\n *) Ahora estamos preparando la carne, de Soja con frijoles, "
	    + "a la plancha con aceites vegetales.";
    }
        
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa.
     */
    @Override
    public String ponerVegetales() {
	return "\n *) Estamos colocando los vegetales a su hamburguesa, algunos de "
	    + "estos son; epazote, chipilin, albahaca, cilantro, jitomates, "
	    + "cebollas, entre otras especias y verduras.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "\n *) En este momento estamos poniendo unas pizcas de Catsup "
	    + "a su hamburguesa.";
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
	return "\n *) Se calienta en la plancha la tapa de la hamburguesa.";
    }
}
