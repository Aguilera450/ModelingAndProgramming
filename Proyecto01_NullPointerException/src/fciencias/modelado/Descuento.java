/**
 * Clase abstracta que implementa los métodos necesarios para realizar el
 * descuento a los productos que un <code>Usuario</code> agregue a su carrito.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @see <code>ProductoConDescuento</code>.
 * @version 1.0 - 06/05/2022
 */

public abstract class Descuento implements ProductoConDescuento {
    /** Producto al que se le aplica el descuento */
    protected ProductoConDescuento producto;

    /** Conjunto de descuentos disponibles */
    protected float[] descuentosDisponibles = {(float)0.2, (float)0.3, (float)0.4};

    /** Descuento partícular a aplicar */
    protected float descuentoAAplicar;
        
    /**
     * Constructor abstracto que obliga a las clases que hereden de esta a implementarlo.
     * @param <code>producto</code> -- al que se le aplica el
     *                                 descuento elegido acorde
     *                                 al pais del usuario.
     */
    public Descuento(ProductoConDescuento producto) {
        this.producto = producto;
        descuentoAAplicar = descuentosDisponibles[generaRandom(descuentosDisponibles.length)];
    }
    
    /**
     * Método que genera un número aleatorio del 0 a n, donde n es el parámetro recibido.
     * @param max - <code>int</code> con el valor máximo aleatorio.
     * @return <code>int</code> con un número aleatorio de 0 a n.
     */
    protected int generaRandom(int max) {
	    return (int) (Math.random() * max);
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
	    return producto.getPrecio(usuario);
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
    public String getCatalogInfo(Usuario usuario) {
	    return producto.getCatalogInfo(usuario);
    }
    
    /**
     *
     */
    @Override
    public String getCatalogInfo();
    
    /**
     * Método que devuelve el descuento que se aplica al producto
     * en cuestión.
     * @return <code>float</code> -- descuento en partícular a aplicar.
     */
    public float getDescuentoAAplicar() {
	    return descuentoAAplicar;
    }
    
    /**
     * Obtiene los descuentos disponibles.
     * @return <code>float[]</code> -- arreglo de descuentos.
     */
    public float[]  getDescuentosDisponibles() {
	    return descuentosDisponibles.clone();
    }
}
