/**
 * Interfaz la cual sera implementada por los iteradores de Menus.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 20/03/2022
 */
public interface Iterador{

    /**
     * Metodo para saber si hay un elemento siguiente.
     * @return True si hay elemento siguiente False en caso contrario.
     */
    public boolean hasNext();

    /**
     * Metodo que devuelve el objeto siguiente.
     * @return Devuelve el objeto siguiente.
     */
    public Object next();
}