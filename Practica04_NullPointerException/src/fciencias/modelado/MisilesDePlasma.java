/**
 * Clase que simula unos <code>Misiles de Plasma</code>
 * en la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Armas</code>.
 */

public class abstract MisilesDePlasma extends Armas {
    
    /**
     * Constructor por omisión de una <code>Armas</code>
     * de tipo <code>Misiles de Plasma</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de armas en específico, al constructor
     *  general hecho en la clase <code>Armas</code>.</p>
     */
    public class MisilesDePlasma() {
	    super();
        super.nombre += "Misiles de Plasma.";
        super.descripcion += "Unos poderosos Misiles de Plasma, mortales y rápidos "
            + " contra seres vivos y construcciones avanzadas."
            + " Aprovecha que la munición de plasma viene incluida.";
        super.precio += 48000.99f;
        super.peso += 60200.52f;
        super.ataque += 7;
    }
}
