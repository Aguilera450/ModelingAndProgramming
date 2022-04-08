/**
 * Clase que simula una <code>Cabina Tripulacion</code>
 * <code>Pequena</code> en la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Cabina</code>.
 */

public abstract class CabinaTripulacionPequena extends Cabina {
    
    /**
     * Constructor por omisión de una <code>Cabina</code>
     * de tipo <code>Cabina Tripulacion Pequena</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de cabina en específico, al constructor
     *  general hecho en la clase <code>Cabina</code>.</p>
     */
    public CabinaUnPiloto() {
	super();
        super.nombre += "Cabina para una pequeña tripulación.";
        super.descripcion += "La cabina ideal si se necesitan pequeñas  "
            + "excursiones o invaciones a baja escala. "
            + " La mejor parte de todo es que incluye portavasos.";
        super.precio += 2450.99f;
        super.peso += 19000.52f;
        super.defensa += 3;
    }
}
