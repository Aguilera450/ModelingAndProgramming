import javax.management.StringValueExp;
import javax.swing.plaf.synth.SynthStyle;

//package src.fciencias.modelado;

/**
 * Clase que simula a una cuenta bancaria y sus estados en saldo
 * para la realización de cobros.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 11/03/2022
 */
public class CuentaBancaria {
    /* Atributos de clase. */
    /** Usuario propietario de la cuenta bancaria */
    private Usuario propietario;
    /** Dinero que hay en la cuenta */
    private float dinero_disponible;

    /**
     * Constructor de la clase CuentaBancaria.
     * @param propietario Usuario propietario de la cuenta.
     * @param dinero Fondos de la cuenta.
     */
    public CuentaBancaria(Usuario propietario, float dinero){
        this.propietario = propietario;
        this.dinero_disponible = dinero;
    }
    
    /**
     * Método que indica el propietario de la Cuenta Bancaria.
     * @return el propietario de la cuenta.
     */
    public Usuario propietario() {
	    return propietario;
    }
    
    /**
     * Método que indica cuanto dinero tiene la cuenta bancaria.
     * @return dinero en la cuenta bancaria.
     */
    public float saldo_disponible() {
	    return dinero_disponible;
    }
    
    /**
     * Método que realiza los cobros que se le soliciten a la cuenta bancaria.
     * @param cobro dinero a cobrar, lo que se debe descontar del saldo disponible en la cuenta. 
     * @return el saldo que queda en la cuenta después de realizar el cobro.
     */
    public float cobrar(float cobro, String referencia)  {
        if(this.saldo_disponible() >= cobro){
            dinero_disponible -= cobro;
            System.out.println(propietario.nombre() + ", se realizó un cobro de $" + cobro +" por: " + referencia);
            return this.saldo_disponible();
        } else {
            return -1;
        }
            
    }
}
