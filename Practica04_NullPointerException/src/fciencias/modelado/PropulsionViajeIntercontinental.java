/**
 * Clase que simula un <code>SistemaPropulsion</code> de tipo <code>PropulsionViajeIntercontinental</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>SistemaPropulsion</code>.
 * @see <code>Componente</code>.
 */

public abstract class PropulsionViajeIntercontinental extends SistemaPropulsion {
    
    /**
     * Constructor de un <code>PropulsionViajeIntercontinental</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de viaje.
     */
    public PropulsionViajeIntercontinental() {
		// Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
		super.nombre += "Viaje Intercontinental.";
		super.descripcion += "Este sistema es utilizado para viajar "
			+ "entre continentes y dentro del planeta receptor (en "
			+ "el que se encuentre la nave espacial).";
		super.precio += 105000.99f;
		super.peso += 997.90f;
		super.velocidad += 100;
		super.defensa += 1;
    }
}
