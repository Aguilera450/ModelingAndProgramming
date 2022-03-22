/**
 * Clase que simula al objeto hamburgesa <code>Mc3Queso</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 20/03/2022
 * @see <code>Platillo</code>.
 */

public class Mc3Queso extends Platillo  {
    
    /**
     * Constructor por omisión de una hamburguesa de
     * 3 quesos con carne.
     */
    public Mc3Queso() {
	super.id = 1;
	super.nombre = "Hamburguesa Mc3Queso";
	super.descripcion = "Esta hamburguesa es de la linea de hamburguesas de lujo, "
	    + "pues contiene quesos gurmet traidos desde Suiza y hechos con leche de "
	    + "las mejores cabras del mundo. Esta es una de las hamburguesas más "
	    + "costosas que ofrecemos.";
	super.precio = 876.50f;
	super.llevaQueso = true;
	super.esVegetariano = false;
    }
    
    /**
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una <code>Mc3Queso</code>.
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
	return "Se corta un pan artesanal de Oaxaca "
	    + "se coloca como base para la hamburguesa"
	    + ", y se calienta en la plancha de marmol.";
    }
    
    /**
     * Método que devuelve la aplicación de la mayonesa.
     * @return <code>String</code> -- descripción de la mayonesa.
     */
    @Override
    public String ponerMayonesa() {
	return "Se aplica mayonesa Maiye, una mayonesa "
	    + "oriental con estilo esloveno a la base "
	    + "de la hamburguesa.";
    }
    
    /**
     * Método que devuelve la aplicación de la mostaza.
     * @return <code>String</code> -- descripcion de la mostaza.
     */
    @Override
    public String ponerMostaza() {
	return "Sobre la mayonesa se unta la mostaza que es "
	    + "importada desde Italia.";
    }
    
    /**
     * Método que prepara la carne.
     * @return <code>String</code> -- descripción de la 
     *                                preparación de la carne.
     */
    @Override
    public String prepararCarne() {
	return "Se rostiza la carne marinada en adobo "
	    + "ranchero con carbon egipcio.";
    }
    
    /**
     * Método que devuelve la aplicación de los quesos.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    @Override
    public String ponerQueso() {
	return "Se gratinan los quesos a la parrilla "
	    + "con un poco de aceite de nuez.";
    }
    
    /**
     * Método que devuelve la aplicación de los vegetales.
     * @return <code>String</code> -- descripción de los vegetales
     *                                en la hamburguesa.
     */
    @Override
    public String ponerVegetales() {
	return "Se coloca lechuga romana, "
	    + "aros de cebolla empanizados, "
	    + "rodajas de jitomate y espinacas "
	    + "para ponerse como popeye.";
    }    
    
    /**
     * Método que devuelve la aplicación de la Castsup.
     * @return <code>String</code> -- breve descripción de la Catsup
     *                                y de su origen.
     */
    @Override
    public String ponerCatsup() {
	return "Se colaca salsa Catsup canadiense, "
	    + "por su dulcura.";
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
	return "Finalmente se coloca la tapa de "
	    + "pan de la hamburguesa.";
    }
}
