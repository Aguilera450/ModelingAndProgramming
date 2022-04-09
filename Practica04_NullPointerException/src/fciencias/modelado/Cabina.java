/**
 * Clase abstracta que modela un <code>Componente</code> de tipo <code>Cabina</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 */

public abstract class Cabina extends Componente {
    
    /**
	 * Constructor que inicializa un <code>Componente</code> de tipo <code>Cabina</code>.
     */
    public Cabina() {
		super.nombre = "Cabina tipo ";
		super.descripcion = "Descripción de la cabina: ";
		super.precio = 0.0f;
		super.ataque = 0.0f;
		super.defensa = 0.0f;
		super.velocidad = 0.0f;
		super.peso = 0.0f;
    }
    
}
