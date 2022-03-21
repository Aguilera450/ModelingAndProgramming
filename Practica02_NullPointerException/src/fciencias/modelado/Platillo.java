/**
 * Clase abstracta <code>Platillo</code> 
 * que implementa el patrón de diseño
 *  <code>Template</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 21/03/2022
 */

public abstract class Platillo {
    /* Atributos de clase.*/
    protected int id;
    protected String nombre;
    protected String descripcion;
    protected float precio;
    protected boolean llevaQueso;
    protected boolean esVegetariano;
    
    /** 
     * Método nos dice cual el Id de la hamburguesa.
     * @return <code>int</code> -- Id de la hamburguesa.
     */
    public Int getId() {
	return id;
    }
    
    /** 
     * Método nos dice cual es el nombre de la hamburguesa. 
     * @return <code>String</code> -- nombre de la hamburguesa.
     */
    public String getNombre() {
	return nombre;
    }
    
    /** 
     * Método que describe de la hamburguesa.
     * @return <code>String<code> -- descripción de la hamburguesa.
     */
    public String getDescripcion() {
	return descripcion;
    }
    
    /**
     * Método que nos regresa el precio de nuestra hamburguesa.
     * @return <code>float</code> -- precio de la hamburguesa.
     */
    public float getPrecio() {
	return precio;
    }
    
    /**
     * Método que nos regresa la información a cerca de algún
     * tipo de hamburguesa.
     * @return <code>String</code> -- información a cerca de
     *                                precios, nombres, ids,
     *                                y descipciones.
     */
    public String toString() {
	return "------------------------------------"
	    + "-------------------------------------"
	    + "\n Id: " + getId()
	    + "\n Nombre: " + getNombre()
	    + "\n Precio: " + getPrecio()
	    + "\n Descripcion:" + getDescripcion()
	    + "\n------------------------------------"
	    + "-------------------------------------";
    }
    
    /** Método que indica como se cocina una hamburguesa. */
    abstract String cocinar();
    
    /** Método que anuncia que se ha puesto la base de la hamburguesa. */
    abstract String ponerBasePan();
    
    /** Método que nos avisa que se le coloca la mayonesa a nuestra hamburguesa. */
    abstract String ponerMayonesa();
    
    /** Método que nos avisa que se le coloca la mostaza a nuestra hamburguesa. */
    abstract String ponerMostaza();
    
    /** Método que prepara la carne de nuestra hamburguesa. */
    abstract String prepararCarne();
    
    /**
     * Método que nos anuncia que se le ha colocado carne a nuestra hamburguesa.
     * @return <code>String</code> -- se le pone carne a nuestra hamburguesa y
     *                                dependiendo el gusto del cliente esta es
     *                                sintética o carne de verdad.
     */
    public String ponerCarne() {
	if(!esVegetariano)
	    return "Se coloca la carne.";
	else
	    return "Se coloca la carne de Soja.";
    }
    
    /** Método que nos dice que se le esta poniendo queso a nuestra hamburguesa. */
    abstract String ponerQueso();

    /** Método que nos dice que se le esta poniendo vegetales a nuestra hamburguesa. */
    abstract String ponerVegetales();
    
    /** Método que nos avisa que se le coloca la Catsup a la Hamburguesa. */
    abstract String ponerCatsup();
    
    /** Método que anuncia que se ha puesto la tapa de la hamburguesa. */
    abstract Strin ponerTapaPan();
}
