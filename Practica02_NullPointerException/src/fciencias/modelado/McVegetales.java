/**
 * Clase que simula al objeto hamburgesa <code>McVegetales</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public class McVegetales extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McVegetales.
     */
    public McVegetales() {
        super.id = 11;
        super.nombre = "Hamburguesa McVegetales";
        super.descripcion = "McVegetales hamburguesa vegetariana.";
        super.precio = 39.50f;
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
	    return "\n *) Iniciamos colocando pan francés recién calentado a la plancha "
	    + "como base de nuestra hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	    return "\n *) Se unta un poco de mayonesa sobre el pan. ";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	    return "\n *) Se mezcla la mayonesa con la mostaza para generar un sabor unico. ";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	    if(esVegetariano){
            return "\n *) Se frien algunos Nopales con algo de Soja "
	    + "triturada, esto fungira de nuestra carne sintetica.";
        } else {
            return "\n *) Se frien algunos Nopales con algo carne";
        }
    }
    
    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String ponerQueso() {
	    if(llevaQueso){
            return "\n *) Se emplea queso oaxaca gratinado para aumentar la textura "
	        + "en su hamburguesa.";
        } else {
            return "";
        }
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa. 
     */
    @Override
    public String ponerVegetales() {
        if(esVegetariano)
	        return "\n *) Se colocan algunos pepinillos, rebanadas de jitomate "
	        + "y algunos aros de cebolla morada.";
        else 
            return "";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	    return "\n *) Se verte un poco de McCatsup sobre las verduras.";
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
	    return "\n *) Por último, colocamos pan francés recién calentado a la plancha "
	    + "como base de nuestra hamburguesa. ";
    }
}
