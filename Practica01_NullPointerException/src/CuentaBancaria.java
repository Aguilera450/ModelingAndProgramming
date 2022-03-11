/**
 * Clase que simula a una cuenta bancaria y sus estados en saldo
 * para la realización del cobros a quienes implementen una instancia
 * de esta clase.
 * @author Adrian Aguilera, Marco Rivera, Diego Rosas.
 * @date 10/03/2021
 */

public class CuentaBancaria {
    /* Atributos de clase. */
    private Usuario propietario;
    private float dinero_disponible;
    
    /**
     * Método que indica el propiedario de la <code>CuentaBancaria</code>.
     * @return <code>Usuario</code> -- devuelve el propietario de la cuenta.
     */
    public Ususario propietario() {
	return propietario;
    }
    
    /**
     * Método que indica cuanto dinero tiene una cuenta asociada.
     * @return <code>float</code> -- devuelve el saldo disponible. 
     */
    public float saldo_disponible() {
	return dinero_disponible;
    }
    
    /**
     * Método que realiza los cobros que se le soliciten a la <code>CuentaBancaria</code>.
     * @param <code>cobro</code>  -- dinero a cobrar, lo que se debe descontar del saldo
     *                               disponible en la <code>CuentaBancaria</code>. 
     * @return <code>float</code> -- devuelve el saldo que queda en la <code>CuentaBancaria</code>
     *                               después de realizar el cobro.
     * @throws ExcepcionNoSePuedeCobrar.
     */
    public float cobrar(float cobro) throws ExcepcionNoSePuedeCobrar {
	if(this.dinero_disponible() < cobro)
	    throw new ExcepcionNoSePuedeCobrar("El saldo del usuario no es "
					       + "suficiente para realizar este cobro.");
	dinero_disponible -= cobro;
	return saldo_disponible();
    }
}
