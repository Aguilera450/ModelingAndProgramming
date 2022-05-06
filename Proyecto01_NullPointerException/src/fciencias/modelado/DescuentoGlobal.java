/**
 *
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
