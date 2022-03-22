import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Clase que nos sirve para iterar un menu de HashTable de platillos.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 20/03/2022
 */
public class MenuDeLujoIterator implements Iterator{
    /**
     * Elementos que vamos a recorrer en tipo Hashtable<Integer, Platillo>.
     */
    private Hashtable<Integer,Platillo> elementos;

    /** Conjunto de claves del HashTable. */
    private Set<Integer> conjuntoClaves;

    /** Iterador con el que vamos a recorrer el HashTable. */
    private Iterator<Integer> iterator;

    /**
     * Constructor de la clase.
     * Se encargara de asignar los elementos y darnos un iterador.
     * @param elementos Recibe un Hashtable de elementos (Platillos).
     */
    public MenuDeLujoIterator(Hashtable<Integer,Platillo> elementos){
        this.elementos = elementos;
        conjuntoClaves = elementos.keySet();
        iterator = conjuntoClaves.iterator();
    }

    /**
     * Metodo que nos ayuda a saber si hay un elemento siguiente
     * en los elementos.
     * @return True si hay un elemento siguiente y False en caso contrario.
     */
    @Override
    public boolean hasNext(){
        if(iterator.hasNext()){
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
        int clave = iterator.next();
        return elementos.get(clave);
    }
}