/**
 * Interfaz perteneciente el patrón PROXY.
 * Indica las acciones que nos intereza que el objeto Proxy realice y comunique al objeto Real.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/05/2022
 */
public interface InterfazServidor {
    /**
     * Método que valida que un usuario se encuentre en la BD del servidor.
     * @param usuario - <code>Usuario</code> a validar si se encuentra en la BD.
      * @return - True si el usuario se encuentra en la BD.
     */
    public boolean validarUsuario(Usuario usuario);

    /**
     *  Método que regresa el catálogo de la tienda.
     * @return - Un <code>String</code> con el catálogo.
     */
    public String solicitarCatalogo();

    /**
     * Método que regresa el catálogo adaptado al usuario que lo solicita.
     * @param usuario - <code>Usuario</code> que está solicitando el catalogo.
     * @return - Un <code>String</code> con el catálogo adaptado al usuario.
     */
    public String solicitarCatalogo(Usuario usuario);

}
