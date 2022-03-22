import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que nos sirve para iterar un menu de ArrayList de platillos.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 20/03/2022
 */
public class MenuGeneralIterator implements Iterador,Iterator{
    
    /** ArrayList con los elementos platillo que se van a recorrer. */
    private ArrayList<Platillo> elementos;

    /** Iterador del ArrayList de platillos */
    private Iterator iterator;

    /**
     * Constructor de la clase.
     * Asigna los elementos del parametro a nuestro arraylist y
     * crea un iterador de ArrayList.
     * @param elementos
     */
    public MenuGeneralIterator(ArrayList<Platillo> elementos){
        this.elementos = elementos;
        iterator = elementos.iterator();
    }

    /**
     * Metodo que nos ayuda a saber si hay un elemento siguiente
     * en los elementos.
     * @return True si hay un elemento siguiente y False en caso contrario.
     */
    @Override
    public boolean hasNext(){
        if (iterator.hasNext()){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que devuelve el objeto siguiente.
     * @return Devuelve el objeto siguiente.
     */
    @Override
    public Object next(){
        return iterator.next();
    }
}