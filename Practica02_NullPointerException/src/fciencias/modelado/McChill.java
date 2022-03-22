/**
 * Clase que simula al objeto hamburgesa <code>McChill</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 * @see <code>Platillo</code>.
 */

public class McChill extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McChill con carne picante.
     */
    public McChill() {
	super.id = 2;
	super.nombre = "Hamburguesa McChill";
	super.descripcion = "McChill hamburguesa es la sensacion en "
	    + "algun pais, con un sabor casero y picante.";
	super.precio = 87.50f;
	super.llevaQueso = true;
	super.esVegetariano = false;
    }
    
    /**
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una <code>McChill</code>.
     */
    @Override
    public String cocinar() {
	return return "********** "
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
	    + "\n ¡Gracias por la espera!";;
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
	return "Se ahuma a la leña el pan para la base de "
	    + "la hamburguesa, esto con un poco de mantequilla "
	    + "untada.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "En este momento se esta aplicando la mayonesa a la base de "
	    + "la hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "A continuacion se unta una mostaza estilo mexicana "
	    + "con sabores unicos.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "Luego, se asa la carne a la parrilla y ahuma con un poco "
	    + "de leño de Hickory y se enchila con salsa chili.";
    }
    
    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String ponerQueso() {
	return "Se aplica queso manchego y amarillo, ambos quesos van "
	    + "derretidos a la braza.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa.
     */
    @Override
    public String ponerVegetales() {
	return "Se coloca lechuga, rodajas de cebolla y unas rebanadas "
	    + "de jitomates.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "Se coloca Catsup del gallo.";
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
	return "Por ultimo, se ahuma a la leña el pan para la "
	    + "tapa de la hamburguesa, esto con un poco de mantequilla "
	    + "untada.";
    }
}
