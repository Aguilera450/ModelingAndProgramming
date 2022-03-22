/**
 * Clase que simula al objeto hamburgesa <code>McVegetales</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public class McVegetales {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McVegetales.
     */
    public McVegetales() {
	super.id = 11;
	super.nombre = "Hamburguesa McVegetales.";
	super.descripcion = "McVegetales hamburguesa vegetariana."
	super.precio = 39.50f;
	super.llevaQueso = true;
	super.esVegetariano = true;
    }
    
    /**
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una 
     *                                <code>McPepinillos</code>. 
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
	    + "\n 6. " + ponerQueso()
	    + "\n 7. " + ponerVegetales()
	    + "\n 8. " + ponerCatsup()
	    + "\n 9. " + ponerTapaPan()
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
	return " ";
    }
    
    /**
     *
     */
    @Override
    public String ponerMayonesa() {
	return " ";
    }
    
    /**
     *
     */
    @Override
    public String ponerMostaza() {
	return " ";
    }
    
    /**
     *
     */
    @Override
    public String prepararCarne() {
	return " ";
    }
    
    /**
     * 
     */
    @Override
    public String ponerQueso() {
	return " ";
    }
    
    /**
     *
     */
    @Override
    public String ponerVegetales() {
	return " ";
    }    
    
    /**
     *
     */
    @Override
    public String ponerCatsup() {
	return " ";
    }
    
    /**
     *
     */
    @Override
    public String ponerTapaPan() {
	return " ";
    }
}
