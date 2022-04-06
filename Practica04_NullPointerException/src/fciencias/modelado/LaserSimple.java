/**
 * Clase que simula un <code>Laser Simple</code>
 * en la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Armas</code>.
 */

public class abstract LaserSimple extends Armas {
    
    /**
     * Constructor por omisión de una <code>Armas</code>
     * de tipo <code>Laser Simple</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de armas en específico, al constructor
     *  general hecho en la clase <code>Armas</code>.</p>
     */
    public class LaserSimple() {
	    super();
        super.nombre += "Laser Simple.";
        super.descripcion += "Un laser simple, eficaz y barato, nunca  "
            + " hay que salir sin uno de estos a la galaxia fría y cruel."
            + " Todos nuestros clientes lo recomiendan.";
        super.precio += 32000.99f;
        super.peso += 40000.52f;
        super.ataque += 3;
    }
}
