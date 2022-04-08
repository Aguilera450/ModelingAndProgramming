/**
 * Clase que simula un <code>Blindaje</code> de tipo <code>BlindajeReforzado</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componente</code>.
 * @see <code>Blindaje</code>.
 */

public abstract class BlindajeReforzado extends Blindaje {
    
    /**
     * Constructor de un <code>BlindajeReforzado</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de blindaje.
     */
    public BlindajeReforzado() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Reforzado.";
        super.descripcion += "Este tipo de blindaje esta preparado "
            + "para soportar impactos con cualquier cosa en el espacio "
            + "y la mayoría del arsenal balistico.";
        super.precio += 1200.00f;
        super.peso += 87430.87f;
        super.defensa += 7;
    }
}
