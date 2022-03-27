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
    // Atributos de clase. 
    /** Identificador del tipo de hamburguesa. */
    protected Integer id;
    /** Nombre de la hamburguesa. */
    protected String nombre;
    /** Breve descripción de la hamburguesa. */
    protected String descripcion;
    /** Precio de la hamburguesa. */
    protected float precio;
    /** Nos indica si la hamburgiesa lleva queso*/
    protected boolean llevaQueso;
    /** Nos indica si la hamburgesa lleva vegetales */
    protected boolean esVegetariano;
    
    /** 
     * Método nos dice cual el Id de la hamburguesa.
     * @return <code>int</code> -- Id de la hamburguesa.
     */
    public Integer getId() {
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
     * Método para indicar que la hamburguesa lleva queso.
     */
    public void siLlevaQueso(){
        llevaQueso = true;
    }

    /**
     * Método para indicar que la hamburguesa no lleva queso.
     */
    public void noLlevaQueso(){
        llevaQueso = false;
    }

    /**
     * Método para indicar que la hamburguesa lleva vegetales o es vegetariana.
     */
    public void siLlevaVegetales(){
        esVegetariano = true;
    }

    /**
     * Método para indicar que la hamburguesa no lleva vegetales o no es vegetariana.
     */
    public void noLlevaVegetales(){
        esVegetariano = false;
    }

    /**
     * Método que nos regresa la información a cerca de algún
     * tipo de hamburguesa.
     * @return <code>String</code> -- información a cerca de
     *                                precios, nombres,
     *                                y descipciones.
     */
    public String toString() {
        return "------------------------------------"
            + "\n-------------------------------------"
            + "\n Nombre: " + getNombre()
            + "\n Precio: " + getPrecio()
            + "\n Descripcion: " + getDescripcion()
            + "\n------------------------------------"
            + "\n-------------------------------------";
    }
    
    /**
     * Método que devuelve la preparación de la hamburguesa.
     * @return <code>String</code> -- los pasos de cocinar una 
     *                                hamburguesa. 
     */
    public String cocinar() {
        return "**** Preparación de " + getNombre() + " ****"
	    +  ponerBasePan()
	    +  ponerMayonesa()
	    +  ponerMostaza()
	    +  prepararCarne()
	    +  ponerCarne()
	    +  ponerQueso()
	    +  ponerVegetales()
	    +  ponerCatsup()
	    +  ponerTapaPan()
	    + "\n ¡Gracias por la espera!";
    }
    
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

    /**
     * Método que devuelve la aplicación del queso.
     * @return <code>String</code> -- descripción del queso y su
     *                                preparación en la hamburguesa.
     */
    public String ponerQueso() {
	    if(llevaQueso)
	        return "Se coloca una rebanada de queso de marca McQuesitosOriginales.";
	    else
	        return "";
    }
    
    /** Método que nos dice que se le esta poniendo vegetales a nuestra hamburguesa.
     * @return <code>String</code> -- descripción de los vegetales y su
     *                                proción en la hamburguesa.
     */
    public String ponerVegetales(){
        if(esVegetariano)
            return "Se colocan dos hojas de lechuga fresca, dos rebanadas de jitomate recién cortado, 10 gramos de cebolla y tres pepinillos.";
        else 
            return "";
    }
    
    /** Método que nos avisa que se le coloca la Catsup a la Hamburguesa. */
    abstract String ponerCatsup();
    
    /** Método que anuncia que se ha puesto la tapa de la hamburguesa. */
    abstract String ponerTapaPan();
}
