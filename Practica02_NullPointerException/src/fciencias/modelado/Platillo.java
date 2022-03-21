/**
 * Clase abstracta <code>Platillo</code> 
 * que implementa el patrón de diseño
 *  <code>Template</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 */

public abstract class Platillo {
    /* Atributos de clase.*/
    protected int id;
    protected String nombre;
    protected String descripcion;
    protected float precio;
    protected boolean llevaQueso;
    protected boolean esVegetariano;
    
    /** */
    public Int getId() {
	return id;
    }
    
    /** */
    public String getNombre() {
	return nombre;
    }
    
    /** */
    public String getDescripcion() {
	return descripcion;
    }
    
    /** */
    public float getPrecio() {
	return precio;
    }
    
    /** */
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
    
    /** */
    abstract String cocinar();
    
    /** */
    abstract String ponerBasePan();
    
    /** */
    abstract String ponerMayonesa();
    
    /** */
    abstract String ponerMostaza();
    
    /**
     *
     */
    abstract String prepararCarne();
    
    /** */
    public String ponerCarne() {
	if(!esVegetariano)
	    return "Se coloca la carne.";
	else
	    return "Se coloca la carne de Soja.";
    }
    
    /** */
    abstract String ponerQueso();

    /** */
    abstract String ponerVegetales();
    
    /** */
    abstract String ponerCatsup();
    
    /** */
    abstract Strin ponerTapaPan();
}
