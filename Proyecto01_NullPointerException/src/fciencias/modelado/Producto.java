/**
 * Clase que simula un <code>Producto</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @see <code>ProductoConDescuento</code>.
 * @version 1.0 - 04/05/2022
 */

public class Producto implements ProductoConDescuento {
    /* Atributos de clase. */
    /** Código de barras para un producto. */
    private String codigoBarras;
    /** Nombre del producto. */
    private String nombreProducto;
    /** Clasificación de los productos. */
    private String departamento;
    /** Costo del producto. */
    private float precio;             
    
    /**
     * Constructor de uso exclusivo del sistema de un producto.
     * @param cB - <code>String</code> Codigo de barras.
     * @param nP - <code>String</code> Nombre del producvto.
     * @param dep - <code>String</code> Departamento del producto.
     * @param p - <code>float</code> Precio del producto.
     */
    public Producto(String cB, String nP, String dep, float p){
        codigoBarras = cB;
        nombreProducto = nP;
        departamento = dep;
        precio = p;
    }

    /**
     * Método que nos regresa el precio del producto después
     * de aplicar el descuento, siempre que el usuario tenga
     * este producto en su carrito.
     * @param <code>usuario</code> -- el usuario que esta realizando
     *                                la compra.
     * @return <code>Float</code>  -- precio del producto después de
     *                                que se aplica el descuento.
     */
    @Override
    public float getPrecio(Usuario usuario) {
        return precio;
    }
    

    public String getCatalogInfo(Usuario usuario) {
        return getDescuentos(usuario);
    }

    
    public String getDescuentos(Usuario usuario) {
        return codigoBarras + "\n"
            + "Nombre del producto: " + nombreProducto + "\n"
            + "Departamento: " + departamento + "\n";
        }
    
    /**
     * Método que nos regresa la información del producto que se
     * encuentra en el catálogo.
     * @return <code>String</code> -- Información del producto.
     */
    public String getCatalogInfo() {
	return codigoBarras + "\n"
	    + "Nombre del producto: " + nombreProducto + "\n"
	    + "Departamento: " + departamento
        + "Precio: $" + precio;
	    
    }
    
    /**
     * Método que nos regresa el código de barras de nuestro producto. 
     * @return <code>String</code> -- el código de barras correspondiente
     *                                al producto.
     */
    public String getCodigoBarras() {
	    return codigoBarras;
    }
    
    /** 
     * Método que nos devuelve el nombre del producto. 
     * @return <code>String</code> -- nombre del producto.
     */
    public String getNombreProducto() {
	    return nombreProducto;
    }
    
    /** 
     * Método que nos regresa el departamento del producto. 
     * @return <code>String</code> -- deparamento al que pertenece
     *                                el producto.
     */
    @Override
    public String getDepartamento() {
	    return departamento;
    }
    
    /** 
     * Método modificador que asigna un nuevo precio a nuestro producto.
     * @param <code>precio</code> -- precio del producto.
     */
    public void setPrecio(float precio) {
 	    this.precio = precio;
    }
    
    /** 
     * Método modificador que asigna un código de barras nuevo a nuestro producto.
     *  @param <code>codigoBarras</code> -- código de barras correspondiente al
     *                                      producto.
     */
    public void setCodigoBarras(String codigoBarras) {
	    this.codigoBarras = codigoBarras;
    }
    
    /** 
     * Método modificador que asigna un nuevo departamento a nuestro producto.
     * @param <code>depertamento</code> -- clasificación del producto.
     */
    public void setDepartamento(String departamento) {
	    this.departamento = departamento;
    }
}
