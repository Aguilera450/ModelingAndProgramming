/**
 * Clase Queso Chedar implementada a partir de la
 * interfaz Queso.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 29/03/2022
 */
public class QuesoChedar implements Queso{
    /** Atributo privado con el nombre del Queso. */
    private String nombre;

    /** Atributo privado con el precio del Queso. */
    private float precio;

    /**
     * Constructor de la clase QuesoChedar.
     * Establece el nombre y el precio.
     */
    public QuesoChedar(){
        nombre = "Queso Chedar";
        precio = 17.99f;
    }

    /**
     * Metodo Abstracto el cual nos devuelve el nombre
     * del queso.
     * @return Nombre del queso en tipo String.
     */
    @Override
    public String nombre(){
        return nombre;
    }

    /**
     * Metodo Abstracto que nos devuelve el precio del 
     * queso.
     * @return Precio del queso en tipo float.
     */
    @Override
    public float precio(){
        return precio;
    }
}
