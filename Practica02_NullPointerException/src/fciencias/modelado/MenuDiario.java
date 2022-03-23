/**
 * Clase que simula un menú diario, este menú cambiará día con día (a futuro).
 * Este tipo de menú almacena sus elementos en un Arreglo.
 * El menú tiene un máximo de 10 platillos.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 21/03/2022
 */
public class MenuDiario extends Menu{
    /** Estructura que almacena los platillos del Menu diario */
    private Platillo hamburguesas[];

    /** Referencia a la posición del último elemento */
    private int ultimo;

    /**
     * Constructor de un menú diario.
     * Además de asignar el nombre recibido, 
     * inicializa la estructura de platillos y agrega 4 platillos.
     * @param nombre Nombre del menú diario.
     */
    public MenuDiario(String nombre){
        this.nombre = nombre;
        this.hamburguesas = new Platillo[10];
        this. ultimo = -1;
        agregarPlatillo(new McVerde());
	    agregarPlatillo(new McKongFrijoles());
        agregarPlatillo(new McPolloQueso());
	    agregarPlatillo(new McPepinillos());
    }

    /**
     * Nos permite obtener un Iterador con los platillos del menú de lujo.
     * @return Iterador de la estructura que guarda los platillos del menú de lujo.
     */
    @Override
    public Iterador crearIterador(){
        return new MenuDiarioIterator(this.hamburguesas);
    }

    /**
     * Método para obtener un platillo en determinada posición.
     * @param posicion Posición del platillo buscado. La indexación comienza en 0.
     * @return El platillo con la posición recibida o null si la posición esta fuera de rango. Si no hay platillos regresa null.
     */
    @Override
    public Platillo obtenerPlatillo(int posicion){
        if(posicion > (hamburguesas.length - 1) || posicion < 0)
            return null;
        else
            return hamburguesas[posicion];
    }

    /**
     * Método para saber si un elemento existe en la estructura.
     * @param platillo Elemento a buscar.
     * @return Regresa True si el elemento existe, False si no fue encontrado.
     */
    public boolean contienePlatillo(Platillo platillo){
        for (int i = 0; i < hamburguesas.length ; i++) {
            try {
                if(hamburguesas[i].equals(platillo))
                    return true;
            } catch (NullPointerException e) {
                // Si captura esta excepción es que llegamos a la parte donde no hay elementos
                break;
            }
        }    
        return false;
    }

    /**
     * Método para agregar un platillo al menú diario.
     * Si el platillo ya se encuentra no lo agregará nuevamente.
     * En caso de el menú ya esté lleno no se agregará el platillo.
     * @param platillo Platillo a agregar.
     */
    @Override
    public void agregarPlatillo(Platillo platillo){
        // Se valida que el elemento a agregar tenga lugar en el menú.
        if(ultimo + 1 <= hamburguesas.length - 1){
            // Si hay espacio, y el platillo no existe ya, se agrega.
            if(!contienePlatillo(platillo)){
                hamburguesas[ultimo + 1] = platillo;
                // Se actualiza la posición del último elemento
                ultimo++;
            }
        }
    }

    /**
     * Método para eliminar un platillo del menú de lujo.
     * Si el platillo no se encuentra no se hace nada.
     * @param platillo Platillo a eliminar.
     */
    @Override
    public void eliminarPlatillo(Platillo platillo){
        boolean encontrado = false;
        // Se recorren los platillos en busca del platillo a eliminar.
        for (int i = 0; i < hamburguesas.length ; i++) {
            // Si es encontrado procedemos a "recorrer" los platillos.
            if(hamburguesas[i].equals(platillo) || encontrado){
                encontrado = true;
                hamburguesas[i] = null;
                // Vemos si hay elementos por recorrer
                if(i + 1 != hamburguesas.length)
                    hamburguesas[i] = hamburguesas[i+1];
            }                
        }
    }

    /**
     * Método para conocer la cantidad de elementos en el menú.
     * @return la longitud del menú, es decir, la cantidad de platillo en el.
     */
    @Override
    public int longitud() {
        return ultimo + 1;
    }
}
