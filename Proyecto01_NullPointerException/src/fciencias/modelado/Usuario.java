import java.io.Serializable;
import java.util.Iterator;
import java.util.Stack;

/**
 * Clase que simula un Usuario.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/05/2022
 */
@SuppressWarnings("serial")
public class Usuario implements Serializable{
    /** Nickname del usuario que servirá como identificador único */
    private String nombreUsuario;
    /** Nombre real completo del usuario */
    private String nombreCompleto;
    /** Contraseña del usuario */
    private String contrasena;
    /** Telefono del usuario */
    private long telefono;
    /** Dirección del usuario */
    private String direccion;
    /** Número de cuenta bancaria del usuario */
    private long cuentaBancaria;
    /** País al que pertenece el usuario */
    private String pais;

    /** Carrito de compras del usuario */
    private Stack<ProductoConDescuento> carrito;

    /**
     * Constructor de uso exclusivo del sistema para un Usuario.
     * @param nU - <code>String</code> Nombre de usuario.
     * @param nC - <code>String</code> Nombre completo y real del usuario-
     * @param psw - <code>String</code> Contraseña del usuario.
     * @param t - <code>long</code> Telefono del usuario.
     * @param dir - <code>String</code> Dirección del usuario.
     * @param cB - <code>long</code> Cuenta bancaria del usuario.
     * @param p - <code>String</code> País del usuario.
     */
    public Usuario(String nU, String nC, String psw, long t, String dir, long cB, String p){
        nombreUsuario = nU;
        nombreCompleto = nC;
        contrasena = psw;
        telefono = t;
        direccion = dir;
        cuentaBancaria = cB;
        pais = p;
        carrito = new Stack<>();
    }
    
    /**
     * Método que muestra los articulos en el carrito del usuario.
     * Si alguno de los articulos tiene descuento, este se verá reflejado en este listado.
     * @return - <code>String</code> con los articulos en el carrito del usuario.
     */
    public String mostrarCarrito(){
        String carritoStr = "\n";
        Iterator<ProductoConDescuento> carritoIt = carrito.iterator();
        ProductoConDescuento producto;
        while(carritoIt.hasNext()){
            producto = carritoIt.next();
            carritoStr += producto.getCatalogInfo(this);
        }
        return carritoStr;
    }

    /**
     * Método que calcula el precio total de los articulos del carrito
     * @return - <code>float</float> con el precio total de los articulos del carrito.
     */
    public float totalCarrito(){
        float total = 0f;
        Iterator<ProductoConDescuento> carritoIt = carrito.iterator();
        ProductoConDescuento producto;
        while(carritoIt.hasNext()){
            producto = carritoIt.next();
            total += producto.getPrecio(this);
        }
        return total;
    }

    /**
     * Agrega un producto al carrito del usuario.
     * @param producto - <code>ProductoConDescuento</code> a agregar al carrito.
     */
    public void agregarAlCarrito(ProductoConDescuento producto){
        carrito.push(producto);
    }

    /**
     * Método que permite saber si una contrasena coincide con la del usuario.
     * @param contrasena - <code>String</code> con la contrasena a comprar.
     * @return - <code>True</code> si son iguales.
     */
    public boolean coincideContrasena(String contrasena){
        return contrasena.equals(this.contrasena);
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
     * @return - <code>long</code> con el telefono del usuario.
     */
    public long getTelefono(){
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
     * @return - <code>long</code> con la cuenta bancaria del usuario.
     */
    public long getCuentaBancaria(){
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
