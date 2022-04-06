/**
 * Clase abstracta que modela el <code>Blindje</code> 
 * de la nave espacial en cuestión.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 */

public class abstract Blindaje extends Componentes {
    
    /**
     * Constructor por omisión que crea e inicializa
     *  el <code>Blindaje</code> para una nave espacial.
     */
    public SistemaPropulsion() {
	super.nombre = "Blindaje de tipo: ";
	super.descripcion = "Blindaje: ";
	super.precio = 0.0f;
	super.velocidad = 0;
	super.defensa = 0;
	super.peso = 0.0f;
	super.ataque = 0;
    }
    
}
