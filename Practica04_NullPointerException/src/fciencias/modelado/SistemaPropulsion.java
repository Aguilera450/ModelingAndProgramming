/**
 * Clase abstracta que modela un <code>Sistema de Propulsión</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 05/04/2022
 * @see <code>Componentes</code>.
 */

public abstract class SistemaPropulsion extends Componente {
    
    /**
     * Constructor por omisión que crea e inicializa un Sistema 
     * de Propulsión para una nave espacial.
     */
    public SistemaPropulsion() {
		super.nombre = "Sistema de propulsion tipo: ";
		super.descripcion = "Sistema de propulsion: ";
		super.precio = 0.0f;
		super.velocidad = 0;
		super.defensa = 0;
		super.peso = 0.0f;
		super.ataque = 0;
    }
    
}
