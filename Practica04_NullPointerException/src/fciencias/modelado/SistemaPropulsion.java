/**
 * Clase abstracta que modela un <code>Componente</code> de tipo <code>Sistema de Propulsión</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 */

public abstract class SistemaPropulsion extends Componente {
    
    /**
	 * Constructor que inicializa un <code>Componente</code> de tipo <code>Sistema de Propulsión</code>.
     */
    public SistemaPropulsion() {
		super.nombre = "Sistema de propulsion tipo: ";
		super.descripcion = "Descripcion del sistema de propulsion: ";
		super.precio = 0.0f;
		super.ataque = 0;
		super.defensa = 0;
		super.velocidad = 0;
		super.peso = 0.0f;
    }
    
}
