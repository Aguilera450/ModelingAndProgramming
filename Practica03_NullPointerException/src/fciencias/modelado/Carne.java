/**
 * Interfaz Carne a partir de la cual se crearan los 
 * diferentes tipos de carne.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 29/03/2022
 */
public interface Carne{

    /**
     * Metodo Abstracto que nos devuelve el nombre
     * de la carne.
     * @return Nombre de la carne en tipo String.
     */
    public String nombre();
    

    /**
     * Metodo Abstracto que nos devuelve el precio de 
     * la carne.
     * @return Precio de la carne en tipo float.
     */
    public float precio();
}