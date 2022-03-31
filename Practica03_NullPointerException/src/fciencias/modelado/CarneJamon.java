/**
 * Clase Carne Jamon implementada a partir de la
 * interfaz Carne.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 29/03/2022
 */
public class CarneJamon implements Carne{
    /** Atributo privado con el nombre de la Carne. */
    private String nombre;

    /** Atributo privado con el precio de la Carne. */
    private float precio;

    /**
     * Constructor de la clase CarneJamon.
     * Establece el nombre y el precio.
     */
    public CarneJamon(){
        nombre = "Jamon";
        precio = 25.99f;
    }

    /**
     * Metodo Abstracto el cual nos devuelve el nombre
     * de la Carne.
     * @return Nombre del queso en tipo String.
     */
    @Override
    public String nombre(){
        return nombre;
    }

    /**
     * Metodo Abstracto que nos devuelve el precio del 
     * queso.
     * @return Precio de la carne en tipo float.
     */
    @Override
    public float precio(){
        return precio;
    }
}
