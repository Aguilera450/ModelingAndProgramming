/**
 * Clase Carne Pollo implementada a partir de la
 * interfaz Carne.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 29/03/2022
 */
public class CarnePollo implements Carne{
    /** Atributo privado con el nombre de la Carne. */
    private String nombre;

    /** Atributo privado con el precio de la Carne. */
    private float precio;

    /**
     * Constructor de la clase CarnePollo.
     * Establece el nombre y el precio.
     */
    public CarnePollo(){
        nombre = "Salchicha";
        precio = 20.20f;
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
