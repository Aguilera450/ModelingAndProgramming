/**
 * Clase que simula un <code>ViajeIntercontinental</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 05/04/2022
 * @see <code>SistemaPropulsion</code>.
 * @see <code>Componentes</code>.
 */

public class abstract ViajeIntercontinental extends SistemaPropulsion {
    
    /**
     * Constructor por omisión de un <code>ViajeIntercontinental</code>.
     * <p> Se concatenan o autosuman los valores referentes a este tipo
     * de viaje en específico al constructor general hecho en la clase
     * <code>SistemaPropulsion</code>.</p>
     */
    public class ViajeIntercontinental() {
		super();
		super.nombre += "Viaje Intercontinental.";
		super.descripcion += "Este sistema es utilizado para viajar "
			+ "entre continentes y dentro del planeta receptor (en "
			+ "el que se encuentre la nave espacial).";
		super.precio += 1980.50f;
		super.peso += 4000.00f;
		super.velocidad += 1;
		super.defensa += 1;
    }
}
