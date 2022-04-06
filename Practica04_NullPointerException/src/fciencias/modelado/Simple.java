/**
 * Clase que simula el <code>Blindaje</code> de la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Blindaje</code>.
 */

public class abstract Simple extends Blindaje {
    
    /**
     * Constructor por omisión de un <code>Blindaje</code>
     * de tipo <code>Simple</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de blindaje en específico, al constructor
     *  general hecho en la clase <code>Blindaje</code>.</p>
     */
    public class Simple() {
	super();
	super.nombre += "Simple.";
	super.descripcion += "Este tipo de blindaje es sencillo "
	    + "y solo repele balas de tipo A, puede llegar a ser "
	    + "algo problemático si se necesita esquivar barreras.";
	super.precio += 800.50f;
	super.peso += 5600.80f;
	super.velocidad += 0;
	super.defensa += 1;
	super.ataque += 0;
    }
}
