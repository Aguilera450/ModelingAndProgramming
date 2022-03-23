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
     * Método que devuelve el estado del pan en la
     * base de la hamburguesa.
     * @return <code>String</code> -- mensaje que le
     * dice al usuario como va el avance del pan en
     * la base de la hamburguesa.
     */
    @Override
    public String ponerBasePan() {
	    return "\n *) Primero, se coloca la tapa del pan a sofreir con aceites vegetales.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	    return "\n *) Se coloca mayonesa con grasas vegetales.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	    return "\n *) Se coloca mostaza parmesana, una de las hechas con plantas "
	    + "y eco-friendly.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	    return "\n *) Se coloca a la freidora de aire una pieza de hambuerguesa "
	    + "de Soja marinada en Betabel.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa.
     */
    @Override
    public String ponerVegetales() {
        if(esVegetariano)
            return "\n *) Se colocan distintas variedades de especias mexicanas "
            + "en conjunto con rebanas de aguacate, lechuga, cebolla, "
            + "papas, pimientos y espinacas.";
        else
            return "";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	    return "\n *) Se colocan algunas cucharadas de Catsup del gallo.";
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
	    return "\n *) Por ultimo, se coloca la tapa del pan a sofreir con aceites vegetales.";
    }    
}
