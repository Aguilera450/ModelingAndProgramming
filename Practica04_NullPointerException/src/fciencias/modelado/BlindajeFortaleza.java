/**
 * Clase que simula un <code>Blindaje</code> de tipo <code>BlindajeFortaleza</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componente</code>.
 * @see <code>Blindaje</code>.
 */

public abstract class BlindajeFortaleza extends Blindaje {
    /**
     * Constructor de un <code>BlindajeFortaleza</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de blindaje.
     */
    public BlindajeFortaleza() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Fortaleza.";
        super.descripcion += "Este tipo de blindaje esta preparado "
            + "para soportar impactos con asteroides y cometas, pero "
            + "no soporta impactos con lunas, soles y otros planetas.";
        super.precio += 385000.50f;
        super.peso += 49750.80f;
        super.defensa += 50;
    }
}
