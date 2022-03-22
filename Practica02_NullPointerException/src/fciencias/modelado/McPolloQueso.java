/**
 * Clase que simula al objeto hamburgesa <code>McJumbo</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 * @see <code>Platillo</code>.
 */

public class McPolloQueso extends Platillo {
        
    /**
     * Constructor por omisión de una hamburguesa de
     * McPolloQueso.
     */
    public McPolloQueso() {
	super.id = 9;
	super.nombre = "Hamburguesa McPolloQueso.";
	super.descripcion = "McPolloQueso hamburguesa es la de mayor tamaño "
	    + "y la promocionamos por su excelente sabor.";
	super.precio = 64.50f;
	super.llevaQueso = true;
	super.esVegetariano = false;
    }
    
    /**
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una 
     *                                <code>McPolloQueso</code>. 
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
	return "Empezamos colocando una media pieza de pan "
	    + "crujiente y caliente como base de su hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "Untamos un poco de mayonesa McMayonesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "Se coloca un cucharada pequeña de mostaza "
	    + "sobre la mayonesa.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "En este momento calentamos con aceite la carne "
	    + "de pollo que funge como hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String hook() {
	return "Se aplican 4 laminas de queso americano sobre la carne "
	    + "recien calentada.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa. 
     */
    @Override
    public String ponerVegetales() {
	return "Se coloca tomate, cebolla y cilantro en una "
	    + "salsa mexicana [pico de gallo].";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "Se verte un chorro de Catsup sobre los vegetales.";
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
	return "Finalizamos colocando una media pieza de pan "
	    + "crujiente y caliente como tapa de su hamburguesa.";
    }
}
