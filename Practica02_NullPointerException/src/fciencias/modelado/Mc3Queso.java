/**
 * Clase que simula al objeto hamburgesa <code>Mc3Queso<code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 */

public class Mc3Queso {
    
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
     * 
     */
    @Override
    public String cocinar() {
	return "No implementado.";
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
     *
     */
    @Override
    public String ponerMayonesa() {
	return "Se aplica mayonesa Maiye, una mayonesa "
	    + "oriental con estilo esloveno a la base "
	    + "de la hamburguesa.";
    }
    
    /**
     *
     */
    @Override
    public String ponerMostaza() {
	return "Sobre la mayonesa se unta la mostaza que es "
	    + "importada desde Italia.";
    }
    
    /**
     *
     */
    @Override
    public String prepararCarne() {
	return "Se rostiza la carne marinada en adobo "
	    + "ranchero con carbón egipcio.";
    }
    
    /**
     * 
     */
    @Override
    public String ponerQueso() {
	return "Se gratinan los quesos a la parrilla "
	    + "con un poco de aceite de nuez.";
    }
    
    /**
     *
     */
    @Override
    public String ponerVegetales() {
	return "";
    }
    
    /**
     *
     */
    @Override
    public String ponerCatsup() {
	return "";
    }
    
    /**
     *
     */
    @Override
    public String tapaPan() {
	return "";
    }
}
