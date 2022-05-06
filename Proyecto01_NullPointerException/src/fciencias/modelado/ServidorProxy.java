/**
 * Clase que simula un servidor proxy.
 * Se encarga de administrar peticiones del usuario hacia el servidor real.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/05/2022
 */
public class ServidorProxy implements InterfazServidor{
    /** Referencia al servidor real con el que tendrá comunicación el ServirdorProxy */
    private Servidor servidorReal;

    /**
     * Constructor de un Servidor Proxy.
     * @param servidorReal -  <code>Servidor</code> Real con el que se tendrá comunicación.
     */
    public ServidorProxy(Servidor servidorReal){
        this.servidorReal = servidorReal;
    }

    /**
     * Método que valida que un usuario se encuentre en la BD del servidor.
     * @param usuario - <code>Usuario</code> a validar si se encuentra en la BD.
      * @return - True si el usuario se encuentra en la BD.
     */
    @Override
    public boolean validarUsuario(Usuario usuario){
        return servidorReal.validarUsuario(usuario);
    }

    /**
     *  Método que regresa el catálogo de la tienda.
     * @return - Un <code>String</code> con el catálogo.
     */
    @Override
    public String solicitarCatalogo(){
        return servidorReal.solicitarCatalogo();
    }

    /**
     * Método que regresa el catálogo adaptado al usuario que lo solicita.
     * @param usuario - <code>Usuario</code> que está solicitando el catalogo.
     * @return - Un <code>String</code> con el catálogo adaptado al usuario.
     */
    @Override
    public String solicitarCatalogo(Usuario usuario){
        return servidorReal.solicitarCatalogo(usuario);
    }
    
}
