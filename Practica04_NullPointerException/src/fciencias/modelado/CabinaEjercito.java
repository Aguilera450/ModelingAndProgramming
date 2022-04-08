/**
 * Clase que simula una <code>Cabina</code> de tipo <code>CabinaEjercito</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 * @see <code>Cabina</code>.
 */

public abstract class CabinaEjercito extends Cabina {
    
    /**
     * Constructor de una <code>CabinaEjercito</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de cabina.
     */
    public CabinaEjercito() {
	    // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Cabina para un ejercito.";
        super.descripcion += "La cabina ideal si se necesitas invadir una  "
            + "nación, planeta, galaxia, lo que quieras. Usada por los"
            + " genocidas más famosos de la galaxia.";
        super.precio += 199789.99f;
        super.peso += 34567.00f;
        super.defensa += 10;
    }
}
