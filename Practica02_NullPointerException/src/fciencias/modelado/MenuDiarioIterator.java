/**
 * Clase que nos sirve para iterar un menu de arreglo de platillos.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 20/03/2022
 */
public class MenuDiarioIterator implements Iterador{
    /** Arreglo de platillos que se va a recorrer. */
    private Platillo[] elementos;
    
    /** Posicion en la que se encuentra el iterador. */
    private int posicionArreglo;

    /**
     * Constructor del Iterador.
     * Tambien posiciona el iterador en la posición 0.
     * @param elementos Recibe un arreglo de platillos.
     */
    public MenuDiarioIterator(Platillo[] elementos){
        this.elementos = elementos;
        posicionArreglo = 0;
    }

    /**
     * Método para saber si hay un elemento siguiente.
     * @return True si hay elemento siguiente False en caso contrario.
     */
    @Override
    public boolean hasNext(){
        if(posicionArreglo < elementos.length){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que devuelve el objeto siguiente.
     * @return Devuelve el objeto siguiente.
     */
    @Override
    public Object next(){
        int posicion_a_devolver = posicionArreglo;
        posicionArreglo += 1;
        return elementos[posicion_a_devolver];
    }
}