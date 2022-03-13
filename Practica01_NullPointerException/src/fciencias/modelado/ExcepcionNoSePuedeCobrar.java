//package src.fciencias.modelado;

/**
 * Clase para excepciones de cobro, cuando se intenta
 * cobrar una cantidad mayor a la disponible se debe
 * invocar a esta excepción.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 10/03/2022
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
