/**
 * Clase abstracta que implementa los métodos necesarios para realizar el
 * descuento a los productos que un <code>Usuario</code> agregue a su carrito.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @see <code>ProductoConDescuento</code>.
 * @version 1.0 - 05/05/2022
 */

public abstract class Descuento implements ProductoConDescuento {
    /* Atributos de clase. */
    protected ProductoConDescuento producto;          // Producto al que se le aplica el descuento.
    protected float[] descuentosDisponibles           // Conjunto de descuentos disponibles.
	= {0.2, 0.3, 0.4};
    protected float descuentoAAplicar;               // descuento partícular a aplicar.
        
    /**
     * Constructor abstracto que obliga a las clases que hereden de esta a implementarlo.
     * @param <code>producto</code> -- al que se le aplica el
     *                                 descuento elegido acorde
     *                                 a la nacionalidad del usuario.
     */
    public void Descuento(Producto producto);
    
    /** @return <code>int</code> -- valor aleatorio en el rango [0,2]. */
    protected int generaRandom() {
	return (int) (Math.random() * (3));
    }
    
    /**
     * Método que devuelve el descuento que se aplica al producto
     * en cuestión.
     */
    public float getDescuentoAAplicar() {
	return descuentoAAplicar;
    }
    
    /**
     * Obtiene los descuentos disponibles.
     */
    public float[]  getDescuentosDisponibles() {
	return descuentosDisponibles;
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
	return producto.getPrecio();
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
	return producto.getCatalogInf();
    }
}
