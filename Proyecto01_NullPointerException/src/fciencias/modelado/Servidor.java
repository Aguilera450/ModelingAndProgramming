import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

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
    
    /** "BD" de usuarios, en realidad es un HashMap que simula dicha BD, la clave es el nombre de usuario */
    private HashMap<String,Usuario> listaUsuarios;
    
    /** "BD" de los productos de la tienda, en realidad es un HashMap que separa por departamento (key) los productos(Lista de procuctos pertenecientes a ese departamento) */
    private HashMap< String, LinkedList<ProductoConDescuento> > catalogo;

    /** Departamentos actuales en la tienda. */
    private String[] departamentos = {"Electronica","Electrodomesticos","Alimentos"};

    
    /** 
     * Constructor de un Servidor.
     * Se inicializa cargando sus usuarios y catalogo.
    */
    public Servidor(){
        cargarUsuarios();
        cargarCatalogo();
    }

    /**
     * Método que valida que un usuario se encuentre en la BD del servidor.
     * @param nombreUsuario - <code>String</code> con el usuario a validar si se encuentra en la BD.
     * @return - Una copia del <code>Usuario</code> en la BD, regresa null en caso de no encontrarlo.
     */
    @Override
    public Usuario validarUsuario(String nombreUsuario){
        if(listaUsuarios.containsKey(nombreUsuario))
          return listaUsuarios.get(nombreUsuario);
        else
          return null;
    }

    /**
     *  Método que regresa el catálogo de la tienda.
     * @return - Un <code>String</code> con el catálogo.
     */
    @Override
    public String solicitarCatalogo(){
        String catalogoString = "\n";
        LinkedList<ProductoConDescuento> productos;
        for(String dpto: catalogo.keySet()){
            catalogoString += "\n\n###### " + dpto+ " #####";
            productos = catalogo.get(dpto);
            for(int i = 0; i < productos.size(); i++){
                catalogoString += "\n   " + productos.get(i).getCatalogInfo();
            }
        }
        return catalogoString;
    }

    /**
     * Método que regresa el catálogo adaptado al usuario que lo solicita.
     * En este caso, segun el país del usuario le regresa un catalogo con los descuentos a los que aplica.
     * @param usuario - <code>Usuario</code> que está solicitando el catalogo.
     * @return - Un <code>String</code> con el catálogo adaptado al usuario.
     */
    @Override
    public String solicitarCatalogo(Usuario usuario){
        String catalogoString = "\n";
        LinkedList<ProductoConDescuento> productos;
        for(String dpto: catalogo.keySet()){
            catalogoString += "\n\n###### " + dpto+ " #####";
            productos = catalogo.get(dpto);
            for(int i = 0; i < productos.size(); i++){
                catalogoString += "\n   " + productos.get(i).getCatalogInfo(usuario);
            }
        }
        return catalogoString;
    }

    private void cargarUsuarios(){

    }

    private void cargarCatalogo(){

    }

    /**
   * Metodo para guardar articulos.
   * @param art - Arreglo con articulos de un tipo a guardar.
   */
  public static void guardarUsuarios(HashMap<Long,Usuario> listaUsuarios ){
    String nombreArch = "BDUsuarios.txt";
    ObjectOutputStream escritor = null;
    try {
        escritor = new ObjectOutputStream(new FileOutputStream(nombreArch)); 
        escritor.writeObject(listaUsuarios);
    } catch(NotSerializableException e){
      System.out.println("El objeto a guardar no es serializable");
    } catch(FileNotFoundException e){
      System.out.println("El archivo para guardar no existe");
    } catch(IOException e){
      System.out.println("Surgió un error al guardar");
    } finally{
      if (escritor != null) {
        try {
          escritor.close();
        } catch (IOException e) {
        }
      }
    }
  }

  public void recuperarArticulos(){
    String ruta = "BDUsuarios.txt";
    ObjectInputStream lector = null;
    try{
      lector = new ObjectInputStream(new FileInputStream(ruta));
			Object objeto;
      int i = 0;
            objeto = lector.readObject();
            if (objeto != null){
                listaUsuarios = (HashMap<String,Usuario>) objeto;
    
    } catch(java.lang.ClassNotFoundException e){
    } catch(java.io.EOFException e){
		} catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		} finally{
      if(lector != null) {
        try {
          lector.close();
        } catch (IOException e) {}
      }
    }
  }

    /**
     * Nos permite consultar el identificador del servidor.
     * @return - Identificador de tipo <code>Long</code>.
     */
    public Long getId(){
        return id;
    }

    public String[] getDepartamentos(){
        return departamentos.clone();
    }

}
