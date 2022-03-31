/**
 * Interfaz Queso a partir de la cual se crearan los 
 * diferentes tipos de queso.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 29/03/2022
 */
public interface Queso{

    /**
     * Metodo Abstracto el cual nos devuelve el nombre
     * del queso.
     * @return Nombre del queso en tipo String.
     */
    public String nombre();
    

    /**
     * Metodo Abstracto que nos devuelve el precio del 
     * queso.
     * @return Precio del queso en tipo float.
     */
    public float precio();
}