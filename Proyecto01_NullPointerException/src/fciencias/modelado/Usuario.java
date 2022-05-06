import java.util.Iterator;
import java.util.Stack;

/**
 * Clase que simula un Usuario.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/05/2022
 */
public class Usuario {
    /** Identificador del usuario */
    private Long id;
    /** Nickname del usuario */
    private String nombreUsuario;
    /** Nombre real completo del usuario */
    private String nombreCompleto;
    /** Contraseña del usuario */
    private String contrasena;
    /** Telefono del usuario */
    private int telefono;
    /** Dirección del usuario */
    private String direccion;
    /** Número de cuenta bancaria del usuario */
    private int cuentaBancaria;
    /** País al que pertenece el usuario */
    private String pais;

    /** Carrito de compras del usuario */
    private Stack<ProductoConDescuento> carrito;

    /**
     * Método que muestra los articulos en el carrito del usuario.
     * Si alguno de los articulos tiene descuento, este se verá reflejado en este listado.
     * @return - <code>String</code> con los articulos en el carrito del usuario.
     */
    public String mostrarCarrito(){
        String carritoStr = "\n";
        Iterator carritoIt = carrito.iterator();
        while(carritoIt.hasNext()){
            carritoStr += carritoIt.next().getCatalogInfo(this);
        }
        return carritoStr;
    }

    /**
     * Agrega un producto al carrito del usuario.
     * @param producto - <code>ProductoConDescuento</code> a agregar al carrito.
     */
    public void agregarAlCarrito(ProductoConDescuento producto){
        carrito.push(producto);
    }

    /**
     * Método para obtener el identificador del usuario.
     * @return - <code>Long</code> con el identificador del usuario.
     */
    public Long getId(){
        return id;
    }

    /**
     * Método para obtener el nombre de usuario.
     * @return - <code>String</code> con el nombre de usuario.
     */
    public String getNombreUsuario(){
        return nombreUsuario;
    }

    /**
     * Método para obtener el nombre real y completo del usuario.
     * @return - <code>String</code> con el nombre real del usuario.
     */
    public String getNombreCompleto(){
        return nombreCompleto;
    }

    /**
     * Método para obtener el telefono del usuario.
     * @return - <code>int</code> con el telefono del usuario.
     */
    public int getTelefono(){
        return telefono;
    }

    /**
     * Método para obtener la dirección del usuario.
     * @return - <code>String</code> con la dirección del usuario.
     */
    public String getDireccion(){
        return direccion;
    }

    /**
     * Método para obtener la cuenta bancaria del usuario.
     * @return - <code>int</code> con la cuenta bancaria del usuario.
     */
    public int getCuentaBancaria(){
        return cuentaBancaria;
    }

    /**
     * Método para obtener el país del usuario.
     * @return - <code>String</code> con el país del usuario.
     */
    public String getPais(){
        return pais;
    }
    
}