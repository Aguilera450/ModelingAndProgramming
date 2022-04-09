/**
 * Clase que simula un <code>SistemaPropulsion</code> de tipo <code>PropulsionViajeInterplanetario</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>SistemaPropulsion</code>.
 * @see <code>Componente</code>.
 */

public class PropulsionViajeInterplanetario extends SistemaPropulsion{
    
    /**
     * Constructor de un <code>PropulsionViajeInterplanetario</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de viaje.
     */
    public PropulsionViajeInterplanetario() {
		// Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
		super.nombre += "Viaje Interplanetario.";
		super.descripcion += "Este sistema es utilizado para viajar "
			+ "entre planetas y dentro de algún sistema solar (para "
			+ "algun sistema solar en el que se encuentre la nave "
			+ "espacial).";
		super.precio += 294000.99f;
		super.peso += 2985.90f;
		super.velocidad += 500.00f;
		super.defensa += 3.00f;
    }    
}
