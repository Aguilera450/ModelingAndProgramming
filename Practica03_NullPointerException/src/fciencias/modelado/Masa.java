/**
 * Interfaz Masa a partir de la cual se crearan los 
 * diferentes tipos de masa.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 29/03/2022
 */
public interface Masa{

    /**
     * Metodo Abstracto que nos devuelve el nombre
     * de la masa.
     * @return Nombre de la masa en tipo String.
     */
    public String nombre();
    

    /**
     * Metodo Abstracto que nos devuelve el precio de
     * la masa.
     * @return Precio de la masa en tipo float.
     */
    public float precio();
}