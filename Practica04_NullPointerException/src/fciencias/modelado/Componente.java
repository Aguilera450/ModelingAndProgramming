/**
 * Clase abstracta <code>Componente</code> que define las
 * características de un componente de una nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 */

public abstract class Componente {
    
    /** Nombre del componente */
    protected String nombre;
    /** Descripción del componente */
    protected String descripcion;
    /** Precio del componente */
    protected float precio;

    /** Ataque extra que el componente proporciona a la nave */
    protected float ataque;
    /** Defensa extra que el componente proporciona a la nave */
    protected float defensa;
    /** Velocidad extra que el componente proporciona a la nave */
    protected float velocidad;
    /** Peso extra que el componente proporciona a la nave */
    protected float peso;

    /**
     * Método para saber el nombre del componente.
     * @return <code>String</code> -- nombre del componente.
     */
    public String nombre() {
	    return nombre;
    }
    
    /**
     * Método que nos dice como es el componente.
     * @return <code>String</code> -- descripción del componente.
     */
    public String descripcion() {
	    return descripcion;
    }
    
    /**
     * Método que nos indica el precio del componente.
     * @return <code>float</code> -- precio de nuestro componente.
     */
    public float precio() {
	    return precio;
    }
    
    /**
     * Método que nos indica cuantitativamente el ataque proporcionado por el componente.
     * @return <code>int</code> -- ataque proporcionado por el componente.
     */
    public float ataque() {
	    return ataque;
    }
    
    /**
     * Método que nos indica cuantitativamente la defensa proporcionada por el componente.
     * @return <code>int</code> -- defensa proporcionada por el componente.
     */
    public float defensa() {
	    return defensa;
    }
    
    /**
     * Método que nos indica cuantitativamente la velocidad proporcionada por el componente.
     * @return <code>int</code> -- velocidad proporcionada por el componente.
     */
    public float velocidad() {
	    return velocidad;
    }
    
    /**
     * Método que nos indica el peso proporcionado por el componente.
     * @return <code>float</code> -- peso del componente.
     */
    public float peso() {
	    return peso;
    }
}
