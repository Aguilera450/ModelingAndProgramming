/**
 * Clase para excepciones de cobro, cuando se intenta
 * cobrar una cnatidad mayor a la disponible se debe
 * invocar a esta excepción.
 * @author Adrian Aguilera, Marco Rivera, Diego Rosas.
 * @date 10/03/2021
 * @see Exception
 */

public class ExcepcionNoSePuedeCobrar extends Exception {
    
    /**
     * Constructor por omisión.
     */
    public ExcepcionNoSePuedeCobrar() {}
    
    /**
     * Constructor por parámetro.
     * @param <code>mensaje</code> -- recibe un mensaje a mostrar
     *                                cuando se lance la excepción.
     */
    public ExcepcionNoSePuedeCobrar(String mensaje) {
	super(mensaje);
    }
}
