/**
 * Clase que simula una <code>Cabina</code> de tipo <code>CabinaTripulacionPequena</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 * @see <code>Cabina</code>.
 */

public abstract class CabinaTripulacionPequena extends Cabina {
    
    /**
     * Constructor de una <code>CabinaTripulacionPequena</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de cabina.
     */
    public CabinaTripulacionPequena() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Cabina para una pequeña tripulación.";
        super.descripcion += "La cabina ideal si se necesitan pequeñas  "
            + "excursiones o invaciones a baja escala. "
            + " La mejor parte de todo es que incluye portavasos.";
        super.precio += 2450.99f;
        super.peso += 19000.52f;
        super.defensa += 3;
    }
}
