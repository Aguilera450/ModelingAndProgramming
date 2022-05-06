/**
 * Clase que simula un servidor.
 * Se encarga de almacenar a los usuarios, el catálogo de una tienda, y operaciones sobre estas dos entidades.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 06/05/2022
 */
public class Servidor implements InterfazServidor{

    /** Identificador del Servidor */
    private Long id;
    
    /** "BD" de usuarios, en realidad es un HashMap que simula dicha BD */
    private HashMap<Long,Usuario> listaUsuarios;
    
    /** "BD" de los productos de la tienda, en realidad es un HashMap que separa por departamento (key) los productos(Lista de procuctos pertenecientes a ese departamento) */
    private HashMap<String,List<ProductoConDescuento>> catalogo;

    /** Departamentos actuales en la tienda. */
    private String[] departamentos = {""};

    
    /**
     * Método que valida que un usuario se encuentre en la BD del servidor.
     * @param usuario - <code>Usuario</code> a validar si se encuentra en la BD.
      * @return - True si el usuario se encuentra en la BD.
     */
    @Override
    public boolean validarUsuario(Usuario usuario){
        return listaUsuarios.containsKey(usuario.getId());
    }

    /**
     *  Método que regresa el catálogo de la tienda.
     * @return - Un <code>String</code> con el catálogo.
     */
    @Override
    public String solicitarCatalogo(){
        for(ProductoConDescuento departamento : catalogo) {
            if(usersByCountry.containsKey(user.getCountry())) {
                //Add to existing list
                usersByCountry.get(user.getCountry()).add(user);
        
            } else {
                //Create new list
                List<User> users = new ArrayList<User>(1);
                users.add(user);
                usersByCountry.put(user.getCountry(), users);
            }
        }
    }

    /**
     * Método que regresa el catálogo adaptado al usuario que lo solicita.
     * En este caso, segun el país del usuario le regresa un catalogo con los descuentos a los que aplica.
     * @param usuario - <code>Usuario</code> que está solicitando el catalogo.
     * @return - Un <code>String</code> con el catálogo adaptado al usuario.
     */
    @Override
    public String solicitarCatalogo(Usuario usuario){

    }

    
    /**
     * Nos permite consultar el identificador del servidor.
     * @return - Identificador de tipo <code>Long</code>.
     */
    public Long getId(){
        return id;
    }

}
