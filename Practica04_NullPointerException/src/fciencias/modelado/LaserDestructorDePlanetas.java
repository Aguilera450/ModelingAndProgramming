/**
 * Clase que simula un <code>Arma</code> de tipo <code>LaserDestructorDePlanetas</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 * @see <code>Componente</code>.
 * @see <code>Arma</code>.
 */

public class LaserDestructorDePlanetas extends Arma {
    
    /**
     * Constructor de un <code>LaserDestructorDePlanetas</code>.
     * Se concatenan o autosuman los valores referentes a este tipo de arma.
     */
    public LaserDestructorDePlanetas() {
        // Se inicializan los valores en general
		super();
		// Se modifican los valores relacionados al componente.
        super.nombre += "Laser Destructor de Planetas.";
        super.descripcion += "No hace falta explicar lo que hace, lo apodan "
            + " el Temor de Dios, apto para cualquiera que quiera desatar un"
            + " infierno. Por cuestiones legales no proporcionamos factura.";
        super.precio += 945785.99f;
        super.peso += 10000.52f;
        super.ataque += 50;
        super.defensa = 2;
    }
}
