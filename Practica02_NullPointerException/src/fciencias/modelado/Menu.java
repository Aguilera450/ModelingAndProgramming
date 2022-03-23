/**
 * Clase abstracta que define los comportamientos base de un menú.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 20/03/2022
 */
public abstract class Menu {
    /** Nombre del menú */
    protected String nombre;

    /**
     * Método para conocer el nombre del menú.
     * @return Nombre del menú.
     */
    public String nombre(){
        return nombre;
    }

    /**
     * Nos permite obtener un Iterador con los platillos del menú.
     * @return Iterador de la estructura que guarda los platillos del menú.
     */
    abstract Iterador crearIterador();

    /**
     * Método abstracto para obtener un platillo en determinada posición.
     * @param posicion Posición del platillo buscado. La indexación comienza en 0.
     * @return El platillo con la posición recibida o null si la posición esta fuera de rango.
     */
    abstract Platillo obtenerPlatillo(int posicion);

    /**
     * Método abstracto para agregar un platillo al menú.
     * Si el platillo ya se encuentra no lo agregará nuevamente.
     * @param platillo Platillo a agregar.
     */
    abstract void agregarPlatillo(Platillo platillo);

    /**
     * Método abstracto para eliminar un platillo del menú.
     * Si el platillo no se encuentra no se hace nada.
     * @param platillo Platillo a eliminar.
     */
    abstract void eliminarPlatillo(Platillo platillo);

    /**
     * Método asbtracto para conocer la cantidad de elementos en el menú.
     * @return la longitud del menú, es decir, la cantidad de platillo en el.
     */
    abstract int longitud();
}   
