/**
 * Clase que simula el <code>Blindaje</code> 
 * <code>Fortaleza</code> de la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Blindaje</code>.
 */

public class abstract Fortaleza extends Blindaje {
    
    /**
     * Constructor por omisión de un <code>Blindaje</code>
     * de tipo <code>Fortaleza</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de blindaje en específico, al constructor
     *  general hecho en la clase <code>Blindaje</code>.</p>
     */
    public class Fortaleza() {
        super();
        super.nombre += "Fortaleza.";
        super.descripcion += "Este tipo de blindaje esta preparado "
            + "para soportar impactos con asteroides y cometas, pero "
            + "no soporta impactos con lunas, soles y otros planetas.";
        super.precio += 1200.50f;
        super.peso += 87430.80f;
        super.defensa += 3;
    }
}
