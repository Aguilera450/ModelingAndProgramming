/**
 *
 */

public class DescuentoMexico extends Descuento {
    
    /**
     *
     */
    public Descuento(Producto producto) {
	super(producto);
    }
    
    /**
     *
     */
    public float getPrecio(Usuario usuario) {
	if(usuario.getPais().equalsIgnoreCase("Mexico") && producto.getPrecio())
	    return producto.getPrecio()
		- producto.getPrecio()*producto.descuentoAAplicar;
	else
	    return producto.getPrecio();
    }
    
    /**
     *
     */
    public String getCatalogInf(Usuario usuario) {
	if(usuario.getPais().equalsIgnoreCase("Mexico") && producto.getPrecio())
	    return producto.getCatalogInf()
		+ "\nSe anexa un descuento del "
		+ (producto.descuentoAAplicar * 100) + "%"
		+ " por la compra de este producto.";
	else
	    return producto.getCatalogInf();
    }
}
