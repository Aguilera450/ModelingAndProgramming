/**
 * Clase que simula una <code>Cabina de Un</code>
 * <code>Piloto</code> en la nave espacial.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/04/2022
 * @see <code>Componentes</code>.
 * @see <code>Cabina</code>.
 */

public abstract class CabinaUnPiloto extends Cabina {
    
    /**
     * Constructor por omisión de una <code>Cabina</code>
     * de tipo <code>Cabina Un Piloto</code>.
     * <p> Se concatenan o autosuman los valores referentes
     *  a este tipo de cabina en específico, al constructor
     *  general hecho en la clase <code>Cabina</code>.</p>
     */
    public CabinaUnPiloto() {
        super();
        super.nombre += "Cabina de un piloto.";
        super.descripcion += "La cabina de nave más popular,  "
            + "barata y confiable, adecuada para cualquier tipo de nave "
            + "pero si necesitas más pasajeros hay mejores opciones.";
        super.precio += 1200.99f;
        super.peso += 8300.10f;
        super.defensa += 1;
    }
}
