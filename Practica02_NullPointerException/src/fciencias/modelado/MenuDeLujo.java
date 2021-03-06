import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Clase que simula un menú de lujo.
 * Este tipo de menú almacena sus elementos en un Hashtable.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 21/03/2022  
 */
public class MenuDeLujo extends Menu{

    /** Estructura que almacena los platillos del Menú de lujo
     * La llave de los platillos será su atributo id (identificador).
    */
    private Hashtable<Integer,Platillo> hamburguesas;

    /**
     * Constructor de un menú de lujo.
     * Además de asignar el nombre recibido, 
     * inicializa la estructura de platillos y agrega 3 platillos.
     * @param nombre Nombre del menú de lujo.
     */
    MenuDeLujo(String nombre){
        this.nombre = nombre;
        this.hamburguesas = new Hashtable<>();
        agregarPlatillo(new Mc3Queso());
        agregarPlatillo(new McJumbo());
        agregarPlatillo(new McVegExtraQueso());
    }

    /**
     * Nos permite obtener un Iterador con los platillos del menú de lujo.
     * @return Iterador de la estructura que guarda los platillos del menú de lujo.
     */
    @Override
    public Iterador crearIterador(){
        return new MenuDeLujoIterator(this.hamburguesas);
    }

    /**
     * Método para obtener un platillo en determinada posición.
     * @param posicion Posición del platillo buscado. La indexación comienza en 0.
     * @return El platillo con la posición recibida o null si la posición esta fuera de rango. Si no hay platillos regresa null.
     */
    @Override
    public Platillo obtenerPlatillo(int posicion){
        Set<Integer> claves = hamburguesas.keySet();
        Iterator<Integer> iterator = claves.iterator();

        if(posicion > (hamburguesas.size() - 1) || posicion < 0){
            return null;
        } else {
            // Usaremos posición para calcular cuando nos posicionaremos en el elemento.
            while(iterator.hasNext() && posicion > -1){
                // Cuando la posición sea 0, significa que ya llegamos al elemento.
                if(posicion == 0)
                    return hamburguesas.get(iterator.next());
                iterator.next();
                posicion--;
            }
	    return null;
        }
    }

    /**
     * Método para agregar un platillo al menú de lujo.
     * Si el platillo ya se encuentra no lo agregará nuevamente.
     * @param platillo Platillo a agregar.
     */
    @Override
    public void agregarPlatillo(Platillo platillo){
        if(!hamburguesas.contains(platillo.getId()))
            hamburguesas.put(platillo.getId(), platillo);
    }

    /**
     * Método para eliminar un platillo del menú de lujo.
     * Si el platillo no se encuentra no se hace nada.
     * @param platillo Platillo a eliminar.
     */
    @Override
    public void eliminarPlatillo(Platillo platillo){
        hamburguesas.remove(platillo.getId());
    }

    /**
     * Método para conocer la cantidad de elementos en el menú.
     * @return la longitud del menú, es decir, la cantidad de platillo en el.
     */
    @Override
    public int longitud() {
        return hamburguesas.size();
    }

}
