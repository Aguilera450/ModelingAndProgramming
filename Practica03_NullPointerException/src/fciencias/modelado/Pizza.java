/**
 * Clase que simula el comportamiento de una <code>Pizza</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 30/03/2022
 */

public class Pizza {
    
    /* Atributos de clase. */
    /** Nombre del tipo de <code>Pizza</code>. */
    public String nombre;
    /** Precio del tipo de <code>Pizza</code>. */
    public float precio;
    /** Queso del tipo de <code>Pizza</code>. */
    public Queso queso;
    /** Carne del tipo de <code>Pizza</code>. */
    public Carne carne;
    /** Masa del tipo de <code>Pizza</code>. */
    public Masa masa;
    
    /**
     * Método constructor por parámetros.
     * @param <code>queso</code> -- tipo de queso en la pizza.
     * @param <code>carne</code> -- tipo de carne en la pizza.
     * @param <code>masa</code> -- tipo de masa en la pizza.
     */
    public Pizza(Queso queso, Carne carne, Masa masa) {
	this.queso = queso;
	this.carne = carne;
	this.masa = masa;
	this.precio = queso.getPrecio() + carne.getPrecio() + masa.getPrecio();
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
}
