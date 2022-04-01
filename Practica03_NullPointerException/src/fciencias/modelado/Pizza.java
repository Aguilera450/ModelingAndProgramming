/**
 * Clase que simula el comportamiento de una <code>Pizza</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 30/03/2022
 */

public class Pizza {
    
    /* Atributos de clase. */
    /** Nombre de la <code>Pizza</code>. */
    private String nombre;
    /** Precio de la <code>Pizza</code>. */
    private float precio;
    /** Queso del tipo de la <code>Pizza</code>. */
    private Queso queso;
    /** Carne del tipo de la <code>Pizza</code>. */
    private Carne carne;
    /** Masa del tipo de la <code>Pizza</code>. */
    private Masa masa;
    
    /**
     * Método constructor por parámetros.
     * @param <code>queso</code> -- tipo de queso en la pizza.
     * @param <code>carne</code> -- tipo de carne en la pizza.
     * @param <code>masa</code> -- tipo de masa en la pizza.
     */
    public Pizza(String nombre, Queso queso, Carne carne, Masa masa) {
        this.nombre = nombre;
        this.queso = queso;
        this.carne = carne;
        this.masa = masa;
        this.precio = queso.precio() + carne.precio() + masa.precio();
    }
    
    /** @return <code>String</code> -- nombre de la Pizza. */
    public String getNombre(){
        return nombre;
    }

    /** @return <code>float</code> -- precio de la Pizza. */
    public float getPrecio() {
        return precio;
    }

    /** @return <code>queso</code> -- tipo de queso que tiene la pizza. */
    public String tipoQueso() {
	    return queso.nombre();
    }
    
    /** @return <code>carne</code> -- tipo de carne que tiene la pizza. */
    public String tipoCarne() {
	    return carne.nombre();
    }
    
    /** @return <code>masa</code> -- tipo de masa que tiene la pizza. */
    public String tipoMasa() {
	    return masa.nombre();
    }
    
    /** @return <code>Queso</code> -- queso en la <code>Pizza</code>. */
    public Queso getQueso() {
	    return queso;
    }

    /** @return <code>Carne</code> -- carne en la <code>Pizza</code>. */
    public Carne getCarne() {
	    return carne;
    }
    
    /** @return <code>Masa</code> -- masa de la que esta hecha la <code>Pizza</code>. */
    public Masa getMasa() {
	    return masa;
    }

    
    /**
     * Método que regresa la representación en cadena de una <code>Pizza</code>.
     * @return <code>String</code> -- descripción de una <code>Pizza</code>.
     */
    public String toString() {
	    return "\n Pizza "+ nombre +"   - $"+ precio +"\n" +
	    "Ingredientes: "+ tipoQueso() +", "+ tipoCarne() +", "+ tipoMasa() +".";
    }
}
