/**
 * Clase que simula el comportamiento de una Pizza.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 30/03/2022
 */

public class Pizza {
    
    /* Atributos de clase. */
    /** Nombre de la Pizza. */
    private String nombre;
    /** Precio de la Pizza. */
    private float precio;
    /** Queso del tipo de la Pizza. */
    private Queso queso;
    /** Carne del tipo de la Pizza. */
    private Carne carne;
    /** Masa del tipo de la Pizza. */
    private Masa masa;
    
    /**
     * Método constructor por parámetros.
     * @param queso -- tipo de queso en la pizza.
     * @param carne -- tipo de carne en la pizza.
     * @param masa -- tipo de masa en la pizza.
     */
    public Pizza(String nombre, Queso queso, Carne carne, Masa masa) {
        this.nombre = nombre;
        this.queso = queso;
        this.carne = carne;
        this.masa = masa;
        this.precio = queso.precio() + carne.precio() + masa.precio();
    }
    
    /** @return String -- nombre de la Pizza. */
    public String getNombre(){
        return nombre;
    }

    /** @return float -- precio de la Pizza. */
    public float getPrecio() {
        return precio;
    }

    /** @return queso -- tipo de queso que tiene la pizza. */
    public String tipoQueso() {
	    return queso.nombre();
    }
    
    /** @return carne -- tipo de carne que tiene la pizza. */
    public String tipoCarne() {
	    return carne.nombre();
    }
    
    /** @return masa -- tipo de masa que tiene la pizza. */
    public String tipoMasa() {
	    return masa.nombre();
    }
    
    /** @return Queso -- queso en la Pizza. */
    public Queso getQueso() {
	    return queso;
    }

    /** @return Carne -- carne en la Pizza. */
    public Carne getCarne() {
	    return carne;
    }
    
    /** @return Masa -- masa de la que esta hecha la Pizza. */
    public Masa getMasa() {
	    return masa;
    }

    
    /**
     * Método que regresa la representación en cadena de una Pizza.
     * @return String -- descripción de una Pizza.
     */
    public String toString() {
	    return "\n"+ nombre +"   - $"+ precio +"\n" +
	    "Ingredientes: "+ tipoQueso() +", "+ tipoCarne() +", "+ tipoMasa() +".";
    }
}
