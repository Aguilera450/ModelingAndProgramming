/**
 * Clase que simula un <code>Blindaje</code> de tipo <code>BlindajeSimple</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componente</code>.
 * @see <code>Blindaje</code>.
 */

public abstract class BlindajeSimple extends Blindaje {
    
    /**
     * Constructor de un <code>BlindajeSimple</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de blindaje.
     */
    public BlindajeSimple() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Simple.";
        super.descripcion += "Este tipo de blindaje es sencillo "
            + "y solo repele balas de tipo A, puede llegar a ser "
            + "algo problemático si se necesita esquivar barreras.";
        super.precio += 50000.50f;
        super.peso += 4900.80f;
        super.defensa += 5;
    }
}
