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
    private String codigoBarras;
    private String nombreProducto;
    private String departamento;
    private float precio;
    
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
    
    /**
     * Método que nos regresa la información del producto que se
     * encuentra en el catálogo, con la anexión de su descuento.
     * @param <code>usuario</code> -- el usuario que esta realizando
     *                                la compra.
     * @return <code>String</code> -- Información del producto con
     *                                su respectivo descuento.
     */
    @Override
    public String getCatalogInf(Usuario usuario) {
	return codigoBarras + "\n"
	    + "Nombre del producto: " nombreProducto + "/n"
	    + "Departamento: " + departamento + "/n"
	    + "Precio: $" + precio;
    }
    
    /**
     * Método que nos regresa el precio.
     * @return <code>Float</code>  -- precio del producto.
     */
    public float getPrecio() {
	return precio;
    }
    
    /**
     * Método que nos regresa la información del producto que se
     * encuentra en el catálogo.
     * @return <code>String</code> -- Información del producto.
     */
    public String getCatalogInf() {
	return codigoBarras + "\n"
	    + "Nombre del producto: " nombreProducto + "/n"
	    + "Departamento: " + departamento + "/n"
	    + "Precio: $" + precio;
    }
    
    /** Método que nos regresa el código de barras de nuestro producto. */
    public String getCodigoBarras() {
	return codigoBarras;
    }
    
    /** Método que nos devuelve el nombre del producto. */
    public String getNombreProducto() {
	return nombreProducto;
    }
    
    /** Método que nos regresa el departamento del producto. */
    public String getDepartamento() {
	return departamento;
    }
    
    /** Método modificador que asigna un nuevo precio a nuestro producto. */
    public void setPrecio(Float precio) {
 	this.precio = precio;
    }
    
    /** Método modificador que asigna un código de barras nuevo a nuestro producto. */
    public void setCodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
    }
    
    /** Método modificador que asigna un nuevo departamento a nuestro producto. */
    public void setDepartamento(String departamento) {
	this.departamento = departamento;
    }
}
