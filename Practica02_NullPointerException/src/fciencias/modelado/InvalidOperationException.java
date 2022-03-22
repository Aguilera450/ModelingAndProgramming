/**
 * Clase que manda una excepción de operación inválida.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 21/03/2022
 */

public class InvalidOperationException extends Exception {
    
    /** Lanza una excepción cuando no se admite alguna operación. */
    public InvalidOperationException() {}
    
    /** Lanza una excepción con mensaje cuando no se admite alguna operación. */
    public InvalidOperationException(String msj) {
	super(msj);
    }
}
