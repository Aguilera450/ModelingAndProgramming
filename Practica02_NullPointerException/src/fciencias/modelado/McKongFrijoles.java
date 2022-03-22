/**
 * Clase que simula al objeto hamburgesa <code>McKongFrijoles</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 * @see <code>Platillo</code>.
 */

public McKongFrijoles {
    
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
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una 
     *                                <code>McKongFrijoles</code>.
     */
    @Override
    public String cocinar() {
	return "********** "
	    + "La preparacion de su hamburguesa esta hecha en los siguientes pasos:"
	    + "\n 1. " + ponerBasePan()
	    + "\n 2. " + ponerMayonesa()
	    + "\n 3. " + ponerMostaza()
	    + "\n 4. " + prepararCarne()
	    + "\n 5. " + ponerCarne()
	    + "\n 6. " + ponerVegetales()
	    + "\n 7. " + ponerCatsup()
	    + "\n 8. " + ponerTapaPan()
	    + "\n ¡Gracias por la espera!";
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
	return "Se calienta en la plancha la base de la hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "Se coloca mayonesa de limón y sin grasas animales.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza. 
     */
    @Override
    public String ponerMostaza() {
	return "Luego, se unta la mostaza sobre la mayoneza, hasta que se mezcla.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "Ahora estamos preparando la carne, de Soja con frijoles, "
	    + "a la plancha con aceites vegetales.";
    }
    
    /**
     * Este método no debe ser implementado en esta clase por la
     * definición de la hamburguesa.
     * @throws InvalidOperationException.
     */
    @Override
	public String ponerQueso() throws InvalidOperationException {
	throw new InvalidOperationException("Lo siento, "
					    + "aquí no hacemos eso hermano.");
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa.
     */
    @Override
    public String ponerVegetales() {
	return "Estamos colocando los vegetales a su hamburguesa, algunos de "
	    + "estos son; epazote, chipilin, albahaca, cilantro, jitomates, "
	    + "cebollas, entre otras especias y verduras.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "En este momento estamos poniendo unas pizcas de Catsup "
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
    public String tapaPan() {
	return "Se calienta en la plancha la tapa de la hamburguesa.";
    }
}
