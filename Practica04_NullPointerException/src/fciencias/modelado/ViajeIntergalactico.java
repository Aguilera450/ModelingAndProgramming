/**
 * Clase que simula un <code>ViajeIntergalactico</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 05/04/2022
 * @see <code>SistemaPropulsion</code>.
 * @see <code>Componentes</code>.
 */

public abstract class ViajeIntergalactico extends SistemaPropulsion {
    
    /**
     * Constructor por omisión de un <code>ViajeIntergalactico</code>.
     * <p> Se concatenan o autosuman los valores referentes a este tipo
     * de viaje en específico al constructor general hecho en la clase
     * <code>SistemaPropulsion</code>.</p>
     */
    public ViajeIntercontinental() {
		super();
		super.nombre += "Viaje Intergalactico.";
		super.descripcion += "Este sistema es utilizado para viajar "
			+ "entre galaxias y dentro de algún k-universo (para alguna "
			+ "0 < k < ∞, y en el que se encuentre la nave espacial).";
		super.precio += 898000.50f;
		super.peso += 24000.49f;
		super.velocidad += 9;
		super.defensa += 3;
    }    
}
