/**
 *
 */

public class DescuentoEspania extends Descuento {

    /**
     *
     */
    public Descuento(Producto producto) {
	super();
    }
    
    /**
     *
     */
    public float getPrecio(Usuario usuario) {
	if(usuario.getPais().equalsIgnoreCase("Espania"))
	    return producto.getPrecio()
		- producto.getPrecio()*producto.descuentoAAplicar;
	else
	    return producto.getPrecio();
    }
    
    /**
     *
     */
    public String getCatalogo(Usuario usuario) {
	if(usuario.getPais().equalsIgnoreCase("Espania"))
	    return producto.getCatalogo()
		+ "\nSe anexa un descuento del "
		+ (producto.descuentoAAplicar * 100) + "%"
		+ " por la compra de este producto.";
	else
	    return producto.getCatalogo();
    }
}
