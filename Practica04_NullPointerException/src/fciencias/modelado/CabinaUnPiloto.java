/**
 * Clase que simula una <code>Cabina</code> de tipo <code>CabinaUnPiloto</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 * @see <code>Cabina</code>.
 */

public abstract class CabinaUnPiloto extends Cabina {
    
    /**
     * Constructor de una <code>CabinaUnPiloto</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de cabina.
     */
    public CabinaUnPiloto() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Cabina de un piloto.";
        super.descripcion += "La cabina de nave más popular,  "
            + "barata y confiable, adecuada para cualquier tipo de nave "
            + "pero si necesitas más pasajeros hay mejores opciones.";
        super.precio += 1200.99f;
        super.peso += 8300.10f;
        super.defensa += 1;
    }
}
