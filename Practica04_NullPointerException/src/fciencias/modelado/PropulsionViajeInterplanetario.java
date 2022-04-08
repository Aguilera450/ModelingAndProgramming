/**
 * Clase que simula un <code>SistemaPropulsion</code> de tipo <code>PropulsionViajeInterplanetario</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>SistemaPropulsion</code>.
 * @see <code>Componente</code>.
 */

public abstract class PropulsionViajeInterplanetario extends SistemaPropulsion{
    
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
		super.precio += 98000.75f;
		super.peso += 9400.90f;
		super.velocidad += 3;
		super.defensa += 2;
    }    
}
