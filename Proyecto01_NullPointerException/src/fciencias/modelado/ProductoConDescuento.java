/**
 * Interfaz <code>ProductoConDescuento</code> a partir de la cual se
 * implementaran los distintos descuentos hechos por regiones (países).
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 04/05/2022
 */

public interface ProductoConDescuento {
    
    /**
     * Método abstracto que nos devuelve el precio del producto después
     *  de aplicarle un descuento.
     * @param <code>usuario</code> -- usuario al cual se le aplica
     *                                el descuento en la compra que
     *                                este esté efectuando.
     * @return <code>float</code>  -- precio después de aplicarle el
     *                                descuento.
     *                                e.g. (15% de descuento): 
     *                                    precio - 0.15*precio.
     */
    public float getPrecio(Usuario usuario);

    /**
     * Método abstracto que nos regresa la información del catálogo
     * con los respectivos descuentos.
     * @param <code>usuario</code> -- usuario que requiere que le muestren
     *                                el catálogo.
     * @return <code>String</code> -- catálogo con las ofertas incluidas,
     *                                con referente a su nacionalidad.
     */
    public String getCatalogInfo(Usuario usuario);
    
    /**
     * Método que devuelve la información de un <code>Producto</code>
     *  sin restricción de usuario.
     * @return <code>String</code> -- información del producto.
     */
    public String getCatalogInfo();

    /**
     * Método que devuelve el departamento de un <code>Producto</code>
     *  sin restricción de usuario.
     * @return <code>String</code> -- información del departamento.
     */
    public String getDepartamento();

}
