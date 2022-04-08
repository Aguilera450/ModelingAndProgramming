/**
 * Clase abstracta <code>Componentes</code> que define las
 * características de cada componente en la nave espacial
 * en cuestión.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 05/04/2022
 */

public abstract class Componente {
    
    /* Atributos. */
    protected String nombre;
    protected String descripcion;
    protected float precio;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected float peso;

    /**
     * Método que nos dice el nombre del componente anexado.
     * @return <code>nombre</code> -- nombre del componente.
     */
    public String nombre() {
	    return nombre;
    }
    
    /**
     * Método que nos dice como es el componente anexado.
     * @return <code>descripcion</code> -- descripción del componente.
     */
    public String descripcion() {
	    return descripcion;
    }
    
    /**
     * Método que nos dice cuanto cuesta cada componente en nuestra nave espacial.
     * @return <code>precio</code> -- devuelve un <code>float</code> que nos indica
     *                                el precio de nuestro componente anexado.
     */
    public float precio() {
	    return precio;
    }
    
    /**
     * Método que nos indica cuantitativamente el ataque de la nave espacial.
     * @return <code>ataque</code> -- devuelve un <code>int</code> equivalente
     *                                al poder de ataque.
     */
    public int ataque() {
	    return ataque;
    }
    
    /**
     * Método que nos indica cuantitativamente la defensa de la nave espacial.
     * @return <code>ataque</code> -- devuelve un <code>int</code> equivalente
     *                                al poder de defensa.
     */
    public int defensa() {
	    return defensa;
    }
    
    /**
     * Método que nos indica cuantitativamente la velocidad de la nave espacial.
     * @return <code>ataque</code> -- devuelve un <code>int</code> equivalente
     *                                a la velocidad.
     */
    public int velocidad() {
	    return velocidad;
    }
    
    /**
     * Método que genera el peso del componente anexado a la nave espacial.
     * @return <code>peso</code> -- devuelve un <code>float</code> que nos
     *                              indica el peso del nuevo componente.
     */
    public float peso() {
	    return peso;
    }
}
