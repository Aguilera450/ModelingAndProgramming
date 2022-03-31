/**
 * Clase Masa Delgada implementada a partir de la
 * interfaz Masa.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 29/03/2022
 */
public class MasaDelgada implements Masa{
    /** Atributo privado con el nombre de la Masa. */
    private String nombre;

    /** Atributo privado con el precio de la Masa. */
    private float precio;

    /**
     * Constructor de la clase MasaDelgada.
     * Establece el nombre y el precio.
     */
    public MasaDelgada(){
        nombre = "Masa Delgada";
        precio = 10.20f;
    }

    /**
     * Metodo Abstracto que nos devuelve el nombre
     * de la Masa.
     * @return Nombre del queso en tipo String.
     */
    @Override
    public String nombre(){
        return nombre;
    }

    /**
     * Metodo Abstracto que nos devuelve el precio del 
     * queso.
     * @return Precio de la masa en tipo float.
     */
    @Override
    public float precio(){
        return precio;
    }
}
