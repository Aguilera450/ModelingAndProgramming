/**
 * Clase que simula al objeto hamburgesa <code>McEspeciasMexicanas</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 * @see <code>Platillo</code>.
 */

public class McEspeciasMexicanas extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McEspeciasMexicanas.
     */
    public McEspeciasMexicanas() {
	super.id = 3;
	super.nombre = "Hamburguesa McEspeciasMexicanas";
	super.descripcion = "McEspeciasMexicanas hamburguesa "
	    + "es una hamburgesa vegetariana sin queso, con "
	    + "sabores irresistibles.";
	super.precio = 147.50f;
	super.llevaQueso = false;
	super.esVegetariano = true;
    }
    
    /**
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una 
     *                                <code>McEspeciasMexicanas</code>. 
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
	return "Primero, se coloca la tapa del pan a sofreir con aceites vegetales.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "Se coloca mayonesa con grasas vegetales.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "Se coloca mostaza parmesana, una de las hechas con plantas "
	    + "y eco-friendly.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "Se coloca a la freidora de aire una pieza de hambuerguesa "
	    + "de Soja marinada en Betabel.";
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
	return "Se colocan distintas variedades de especias mexicanas "
	    + "en conjunto con rebanas de aguacate, lechuga, cebolla, "
	    + "papas, pimientos y espinacas.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "Se colocan algunas cucharadas de Catsup del gallo.";
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
	return "Por ultimo, se coloca la tapa del pan a sofreir con aceites vegetales.";
    }    
}
