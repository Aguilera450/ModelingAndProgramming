/**
 *
 */

public class DescuentoGlobal {
    
        
    /**
     *
     */
    public DescuentoGlobal(Producto producto) {
	super();
    }
    
    /**
     *
     */
    public float getPrecio(Usuario usuario) {
	return producto.getPrecio()
	    - producto.getPrecio()*producto.descuentoAAplicar;
    }
    
    /**
     *
     */
    public String getCatalogo(Usuario usuario) {
	return producto.getCatalogo()
	    + "\nSe anexa un descuento del "
	    + (producto.descuentoAAplicar * 100) + "%"
	    + " por la compra de este producto.";
    }
}
