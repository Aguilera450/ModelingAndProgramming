/**
 * Clase que simula un <code>Laser Destructor De Planetas</code>
 * en la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Armas</code>.
 */

public class abstract LaserDestructorDePlanetas extends Armas {
    
    /**
     * Constructor por omisión de una <code>Armas</code>
     * de tipo <code>Laser Destructor De Planetas</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de armas en específico, al constructor
     *  general hecho en la clase <code>Armas</code>.</p>
     */
    public class LaserDestructorDePlanetas() {
	    super();
        super.nombre += "Laser Destructor de Planetas.";
        super.descripcion += "No hace falta explicar lo que hace, lo apodan "
            + " el Temor de Dios, apto para cualquiera que quiera desatar un"
            + " infierno. Por cuestiones legales no proporcionamos factura.";
        super.precio += 100000.12f;
        super.peso += 750000.29f;
        super.ataque += 45;
    }
}
