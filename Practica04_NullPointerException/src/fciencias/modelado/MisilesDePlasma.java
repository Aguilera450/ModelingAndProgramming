/**
 * Clase que simula un <code>Arma</code> de tipo <code>MisilesDePlasma</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 * @see <code>Arma</code>.
 */

public abstract class MisilesDePlasma extends Arma {
    
    /**
     * Constructor de un <code>MisilesDePlasma</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de arma.
     */
    public MisilesDePlasma() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Misiles de Plasma.";
        super.descripcion += "Unos poderosos Misiles de Plasma, mortales y rápidos "
            + " contra seres vivos y construcciones avanzadas."
            + " Aprovecha que la munición de plasma viene incluida.";
        super.precio += 298777.99f;
        super.peso += 1987.52f;
        super.ataque += 23;
        super.defensa = 2;
    }
