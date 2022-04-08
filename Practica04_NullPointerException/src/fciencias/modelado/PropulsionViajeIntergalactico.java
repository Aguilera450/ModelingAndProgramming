/**
 * Clase que simula un <code>SistemaPropulsion</code> de tipo <code>PropulsionViajeIntergalactico</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>SistemaPropulsion</code>.
 * @see <code>Componente</code>.
 */

public abstract class PropulsionViajeIntergalactico extends SistemaPropulsion {

    /**
     * Constructor de un <code>PropulsionViajeIntergalactico</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de viaje.
     */
    public PropulsionViajeIntergalactico() {
		// Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
		super.nombre += "Viaje Intergalactico.";
		super.descripcion += "Este sistema es utilizado para viajar "
			+ "entre galaxias y dentro de algún k-universo (para alguna "
			+ "0 < k < ∞, y en el que se encuentre la nave espacial).";
		super.precio += 875000.50f;
		super.peso += 9950.49f;
		super.velocidad += 1000;
		super.defensa += 5;
    }    
}
