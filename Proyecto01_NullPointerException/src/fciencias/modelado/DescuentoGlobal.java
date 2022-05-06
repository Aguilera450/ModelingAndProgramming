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
public class DescuentoGlobal {
    
        
    /**
     *
     */
    public DescuentoGlobal(Producto producto) {
	super(producto);
    }
    
    /**
     *
     */
    public float getPrecio(Usuario usuario) {
	if(producto.getPrecio() > 0)
	    return producto.getPrecio()
		- producto.getPrecio()*producto.descuentoAAplicar;
	else
	    return producto.getPrecio();
    }
    
    /**
     *
     */
    public String getCatalogInf(Usuario usuario) {
	if(producto.getPrecio() > 0)
	    return producto.getCatalogInf()
		+ "\nSe anexa un descuento del "
		+ (producto.descuentoAAplicar * 100) + "%"
		+ " por la compra de este producto.";
	else
	    return producto.getCatalogInf();
    }
}
