/**
 * Clase abstracta que modela las <code>Armas</code> 
 * de la nave espacial en cuestión.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 */

public class abstract Armas extends Componentes {
    
    /**
     * Constructor por omisión que crea e inicializa
     *  el <code>Armas</code> para una nave espacial.
     */
    public Armas() {
		super.nombre = "Armas de tipo: ";
		super.descripcion = "Armas: ";
		super.precio = 0.0f;
		super.velocidad = 0;
		super.defensa = 0;
		super.peso = 0.0f;
		super.ataque = 0;
    }
    
}
