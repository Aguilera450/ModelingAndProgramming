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
     * @param nombreUsuario - <code>String</code> con el usuario a validar si se encuentra en la BD.
     * @return - Una copia del <code>Usuario</code> en la BD.
     */
    @Override
    public Usuario validarUsuario(String nombreUsuario){
        return servidorReal.validarUsuario(nombreUsuario);
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
