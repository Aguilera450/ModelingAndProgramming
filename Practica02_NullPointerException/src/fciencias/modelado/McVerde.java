/**
 * Clase que simula al objeto hamburgesa <code>McVerde</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 * @see <code>Platillo</code>.
 */

public class McVerde extends Platillo {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * McVerde.
     */
    public McVerde() {
	super.id = 12;
	super.nombre = "Hamburguesa McPolloQueso.";
	super.descripcion = "McVerde hamburguesa es una hamburguesa "
	    + "de carne marinada en jugos verdes.";
	super.precio = 74.50f;
	super.llevaQueso = false;
	super.esVegetariano = false;
	
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
	return "\n *) Empezamos colocando la base de su hamburguesa, "
	    + "no sin antes haberla calentado con leños de caoba.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "\n *) Se coloca la mayonesa sobre el pan. ";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "\n *) Se emplea mostaza con colorante verde para simular "
	    + "una tonalidad a pasto.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "\n *) Se coloca al asador una porción de carne de "
	    + "cerdo marinada en algas verdes.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa.
     */
    @Override
    public String ponerVegetales() {
	return "\n *) Se colocan rodajas de papa con algunos pepinillos, "
	    + "aguacate, y algunas hojas de espinaca.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup.
     */
    @Override
    public String ponerCatsup() {
	return "\n *) Se verten algunas pizcas de McCatsup.";
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
	return "\n *) Finalmente colocamos la tapa de su hamburguesa, "
	    + "no sin antes haberla calentado con leños de caoba.";
    }    
}
