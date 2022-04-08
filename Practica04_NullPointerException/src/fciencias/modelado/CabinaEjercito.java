/**
 * Clase que simula una <code>Cabina Ejercito</code>
 * en la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Cabina</code>.
 */

public abstract class CabinaEjercito extends Cabina {
    
    /**
     * Constructor por omisión de una <code>Cabina</code>
     * de tipo <code>Cabina Ejercito</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de cabinas en específico, al constructor
     *  general hecho en la clase <code>Cabina</code>.</p>
     */
    public class CabinaEjercito() {
	    super();
        super.nombre += "Cabina para un ejercito.";
        super.descripcion += "La cabina ideal si se necesitas invadir una  "
            + "nación, planeta, galaxia, lo que quieras. Usada por los"
            + " genocidas más famosos de la galaxia.";
        super.precio += 912000.99f;
        super.peso += 100000.00f;
        super.defensa += 10;
    }
}
