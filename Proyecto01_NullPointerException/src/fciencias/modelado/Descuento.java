/**
 * Clase abstracta que implementa los métodos necesarios para realizar el
 * descuento a los productos que un <code>Usuario</code> agregue a su carrito.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @see <code>ProductoConDescuento</code>.
 * @version 1.0 - 05/05/2022
 */

import java.util.ArrayList;

public abstract class Descuento implements ProductoConDescuento {
    /* Atributos de clase. */
    protected ProductoConDescuento producto;          // Producto al que se le aplica el descuento.
    protected ArrayList<Float> descuentosDisponibles  // Conjunto de descuentos disponibles.
	= new ArrayList<>();
    private float descuentoAAplicar;                 // descuento partícular a aplicar.
    
    /* Se asignan descuentos por omisión. */
    descuentosDisponibles.add(0.20);
    descuentosDisponibles.add(0.30);
    descuentosDisponibles.add(0.40);
    
    /**
     * Constructor abstracto que obliga a las clases que hereden de esta a implementarlo.
     * @param <code>producto</code> -- al que se le aplica el
     *                                 descuento elegido acorde
     *                                 a la nacionalidad del usuario.
     */
    public void Descuento(Producto producto);
    
    /**
     * Método que asigna el descuento a aplicar.
     */
    private void setDescuentoAAplicar(Float descuento) {
	descuentoAAplicar = descuento;
    }
    
    /**
     * Método que devuelve el descuento que se aplica al producto
     * en cuestión.
     */
    public Float getDescuentoAAplicar() {
	return descuentoAAplicar;
    }
    
    /**
     * Obtiene los descuentos disponibles.
     */
    public ArrayList<Float> getDescuentosDisponibles() {
	return descuentosDisponibles;
    }
    
    /**
     * Modificador de descuentos que añade un descuento nuevo.
     * En caso de existir el descuento, no se debe agregar.
     */
    protected void addDescuento(Float descuento);
    
    /**
     * Modificador de descuentos que elimina un descuento existente.
     * En caso de no existir el descuento, no se elimina nada.
     */
    protected void removeDescuento(Float descuento);

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
    public Float getPrecio(Usuario usuario) {
	for(ProductoConDescuento elem : usuario.getCarrito())
	    if(producto.equals(elem))
		return elem.getPrecio();
	return (Float) - 1.0;
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
	for(ProductoConDescuento elem : usuario.getCarrito())
	    if(producto.equals(elem))
		return producto.getCatalogInf();
	return "Este producto no ha sido anexado al carrito.";
    }
}
