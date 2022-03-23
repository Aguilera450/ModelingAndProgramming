import java.util.ArrayList;

/**
 * Clase que simula un menú general, este menú es fijo y puede servirse en cualquier día del año.
 * Este tipo de menú almacena sus elementos en un ArrayList.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 22/03/2022
 */
public class MenuGeneral extends Menu{
    /** Estructura que almacena los platillos del Menú general */
    private ArrayList<Platillo> hamburguesas;

    /**
     * Constructor de un menú general.
     * Además de asignar el nombre recibido, 
     * inicializa la estructura de platillos y agrega 4 platillos.
     * @param nombre Nombre del menú general.
     */
    public MenuGeneral(String nombre){
        this.nombre = nombre;
        this.hamburguesas = new ArrayList<>();
	
	agregarPlatillo(new McChill());
	agregarPlatillo(new McVegetales());
	agregarPlatillo(new McLechugaYQueso());
	agregarPlatillo(new McNopalitoToreado());
	agregarPlatillo(new McEspeciasMexicanas());
    }

    /**
     * Nos permite obtener un Iterador con los platillos del menú general.
     * @return Iterador de la estructura que guarda los platillos del menú general.
     */
    @Override
    public Iterador crearIterador(){
        return (Iterador) new MenuGeneralIterator(this.hamburguesas);
    }

    /**
     * Método para obtener un platillo en determinada posición.
     * @param posicion Posición del platillo buscado. La indexación comienza en 0.
     * @return El platillo con la posición recibida o null si la posición esta fuera de rango.
     */
    @Override
    public Platillo obtenerPlatillo(int posicion){
        // TODO - Ver que si funcione
        if(posicion > (hamburguesas.size() - 1) || posicion < 0)
            return null;
        else
            return hamburguesas.get(posicion);
    }

    /**
     * Método para agregar un platillo al menú general.
     * Si el platillo ya se encuentra no lo agregará nuevamente.
     * @param platillo Platillo a agregar.
     */
    @Override
    public void agregarPlatillo(Platillo platillo){
        // TODO - Ver que si funcione
        // Si la hamburguesa ya existe no se agregará de nuevo.
        if(!hamburguesas.contains(platillo)){
            // Se agrega al final.
            hamburguesas.add(platillo);
        }
    }

    /**
     * Método para eliminar un platillo del menú de general.
     * Si el platillo no se encuentra no se hace nada.
     * @param platillo Platillo a eliminar.
     */
    @Override
    public void eliminarPlatillo(Platillo platillo){
        // TODO - Ver que si funcione
        hamburguesas.remove(platillo);
    }

    /**
     * Método para conocer la cantidad de elementos en el menú.
     * @return la longitud del menú, es decir, la cantidad de platillo en el.
     */
    @Override
    public int longitud(){
        return hamburguesas.size();
    }
}
