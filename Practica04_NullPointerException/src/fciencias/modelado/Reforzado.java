/**
 * Clase que simula el <code>Blindaje</code> 
 * <code>Reforzado</code> de la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Blindaje</code>.
 */

public class abstract Reforzado extends Blindaje {
    
    /**
     * Constructor por omisión de un <code>Blindaje</code>
     * de tipo <code>Reforzado</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de blindaje en específico, al constructor
     *  general hecho en la clase <code>Blindaje</code>.</p>
     */
    public class Reforzado() {
        super();
        super.nombre += "Reforzado.";
        super.descripcion += "Este tipo de blindaje esta preparado "
            + "para soportar impactos con cualquier cosa en el espacio "
            + "y la mayoría del arsenal balistico.";
        super.precio += 2900.00f;
        super.peso += 123430.87f;
        super.defensa += 9;
    }
}
