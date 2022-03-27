import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que nos sirve para iterar un menu de ArrayList de platillos.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 20/03/2022
 */
public class MenuGeneralIterator implements Iterador{
    
    /** Iterador del menú general de platillos */
    private Iterator iterator;

    /**
     * Constructor de la clase.
     * Crea un iterador del ArrayList y lo guarda en el iterador actual.
     * @param elementos Estructura con los platillos a recorrer.
     */
    public MenuGeneralIterator(ArrayList<Platillo> elementos){
        iterator = elementos.iterator();
    }

    /**
     * Método que nos ayuda a saber si hay un elemento siguiente
     * en los elementos.
     * @return True si hay un elemento siguiente y False en caso contrario.
     */
    @Override
    public boolean hasNext(){
        return iterator.hasNext();
    }

    /**
     * Método que devuelve el objeto siguiente.
     * @return Devuelve el objeto siguiente.
     */
    @Override
    public Object next(){
        return iterator.next();
    }
}