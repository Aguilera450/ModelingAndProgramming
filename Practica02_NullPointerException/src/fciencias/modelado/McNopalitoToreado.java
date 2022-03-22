/**
 * Clase que simula al objeto hamburgesa <code>McNopalitoToreado</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public McNopalitoToreado extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McNopalitoToreado.
     */
    public McNopalitoToreado() {
	super.id = 7;
	super.nombre = "Hamburguesa McNopalitoToreado.";
	super.descripcion = "McNopalitoToreado hamburguesa vegetariana."
	super.precio = 59.50f;
	super.llevaQueso = false;
	super.esVegetariano = true;
    }
    
    /**
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una 
     *                                <code>McNopalitoToreado</code>.
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
	return "En este momento, se coloca pan marquez como base en esta hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "Ahora, se unta mayonesa al pan de la base.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "Colocamos mostaza moscada por encima de la mayonesa.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "Luego, se torean unos nopalitos con chiles abaneros "
	    + "para finalmente porcesarse con Soja, y esto suple la "
	    + "a la carne en esta hamburguesa.";
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
	return "En este momento estamos colocando rodajas de cebolla  "
	    + "rebanadas de tomates, algunas hojas de lechuga y un "
	    + "nopalito toreado.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "Se ponen algunas pizcas de Catsup por encima de los vegetales.";
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
	return "Por ultimo, se coloca pan marquez como tapa en esta hamburguesa ";
    }
}
