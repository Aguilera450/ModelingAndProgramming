/**
 * Clase que simula un <code>Arma</code> de tipo <code>LaserSimple</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 * @see <code>Arma</code>.
 */

public class LaserSimple extends Arma {

    /**
     * Constructor de un <code>LaserSimple</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de arma.
     */
    public LaserSimple() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Laser Simple.";
        super.descripcion += "Un laser simple, eficaz y barato, nunca  "
            + " hay que salir sin uno de estos a la galaxia fría y cruel."
            + " Todos nuestros clientes lo recomiendan.";
        super.precio += 79834.99f;
        super.peso += 999.52f;
        super.ataque += 7;
        super.defensa = 2;
    }
}
