/**
 * Clase que simula el comportamiento de una <code>Pizza</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 30/03/2022
 */

public class Pizza {
    
    /* Atributos de clase. */
    public String nombre;
    public float precio;
    public Queso queso;
    public Carne carne;
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
    }
    
    /**
     * Método nos dice que tipo de queso tiene nuestra pizza.
     * @return <code>queso</code> -- tipo de queso que tiene la pizza.
     */
    public String tipoQueso() {
	return queso.nombre();
    }
    
    /**
     * Método nos dice que tipo de carne tiene nuestra pizza.
     * @return <code>carne</code> -- tipo de carne que tiene la pizza.
     */
    public String tipoCarne() {
	return carne.nombre();
    }
    
    /**
     * Método nos dice que tipo de masa tiene nuestra pizza.
     * @return <code>masa</code> -- tipo de masa que tiene la pizza.
     */
    public String tipoMasa() {
	return masa.nombre();
    }
    
    /**
     *
     */
    
}
