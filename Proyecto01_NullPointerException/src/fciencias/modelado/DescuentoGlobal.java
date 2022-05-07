/**
 * Clase <code>DescuentoGlobal</code> que aplica el patrón decorator
 * para realizar los descuentos correspondientes a un <code>Producto</code> 
 * que contemple dicho descuento.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @see <code>ProductoConDescuento</code>.
 * @version 1.0 - 06/05/2022
 */
public class DescuentoGlobal extends Descuento {
    
        
    /**
     * Constructor por parámetros de un <code>DescuentoEspania</code>.
     * @param <code>producto</code> -- al cual se le aplica el descuento.
     */
    public DescuentoGlobal(ProductoConDescuento producto) {
	super(producto);
    }
    
    /**
     * Método que calcula el precio de nuestro producto después de aplcicar
     * el descuento correspondiente (que es elejido al azar).
     * @param <code>usuario</code> -- usuario que adquiere el producto,
     *                                este usuario sirve para cerciorarse
     *                                que pueda aplicar al descuento.
     * @return <code>float</code>  -- nuevo precio del producto, después de
     *                                aplicarse el descuento.
     */
    public float getPrecio(Usuario usuario) {
	return producto.getPrecio(super) - producto.getPrecio(super)*super.descuentoAAplicar;
    }
    
    /**
     * Método que nos regresa la información del <code>Producto</code> que adquiere
     * el <code>Usuario</code> con la anexión de su respectivo descuento.
     * @param <code>usuario</code> -- nos cercioramos que el descuento aplique para
     *                                este usuario en partícular.
     * @return <code>String</code> -- información del producto con la anexión de su
     *                                respectivo descuento.
     */
    public String getCatalogInfo(Usuario usuario) {
	return "\nSe anexa un descuento del "
	    + (super.descuentoAAplicar * 100) + "%."
	    + "\n" + producto.getCatalogInf(usuario);
    }
}
