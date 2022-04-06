/**
 * Clase que simula un <code>ViajeInterplanetario</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>SistemaPropulsion</code>.
 * @see <code>Componentes</code>.
 */

public class abstract ViajeIntergalactico extends SistemaPropulsion {
    
    /**
     * Constructor por omisión de un <code>ViajeInterplanetario</code>.
     * <p> Se concatenan o autosuman los valores referentes a este tipo
     * de viaje en específico al constructor general hecho en la clase
     * <code>SistemaPropulsion</code>.</p>
     */
    public class ViajeIntercontinental() {
		super();
		super.nombre += "Viaje Interplanetario.";
		super.descripcion += "Este sistema es utilizado para viajar "
			+ "entre planetas y dentro de algún sistema solar (para "
			+ "algun sistema solar en el que se encuentre la nave "
			+ "espacial).";
		super.precio += 98000.75f;
		super.peso += 9400.90f;
		super.velocidad += 3;
		super.defensa += 2;
    }    
}
