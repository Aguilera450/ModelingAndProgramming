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
    private static HashMap<String,Usuario> listaUsuarios;
    
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
        int cont = 1;
        for(String dpto: catalogo.keySet()){
            catalogoString += "\n\n###### " + dpto+ " #####";
            productos = catalogo.get(dpto);
            for(int i = 0; i < productos.size(); i++){
                catalogoString += "\n" + (cont++) + ") " + productos.get(i).getCatalogInfo();
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
        int cont = 1;
        for(String dpto: catalogo.keySet()){
            catalogoString += "\n\n###### " + dpto+ " #####";
            productos = catalogo.get(dpto);
            for(int i = 0; i < productos.size(); i++){
                catalogoString += "\n" + (cont++) + ") " + productos.get(i).getCatalogInfo(usuario);
            }
        }
        return catalogoString;
    }

    /**
     *  Método que regresa el n-ésimo producto del catálogo de la tienda.
     * @return - El <code>ProductoConDescuento</code> en  la n-ésima posición o null si no existe.
     */
    public ProductoConDescuento solicitarProducto(int n){
      ProductoConDescuento producto = null;
      LinkedList<ProductoConDescuento> productos;
      int cont = 1;
      if(n >= 0){
        for(String dpto: catalogo.keySet()){
            productos = catalogo.get(dpto);
            for(int i = 0; i < productos.size(); i++){
              cont++;
              if(cont == n){
                return productos.get(cont);
              }
            }
        }
      }
      return producto;
    }

    private void cargarUsuarios(){

    }

    private void cargarCatalogo(){

    }

    /**
   * Metodo para guardar articulos.
   * @param art - Arreglo con articulos de un tipo a guardar.
   */
  public static void guardarUsuarios(HashMap<String,Usuario> listaUsuarios ){
    String nombreArch = "./BDUsuarios.ser";
    ObjectOutputStream escritor = null;
    try {
        escritor = new ObjectOutputStream(new FileOutputStream(nombreArch)); 
        escritor.writeObject(listaUsuarios);
        System.out.println("Se guardo el listado");
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

  @SuppressWarnings("unchecked")
  public static void recuperarArticulos(){
    String ruta = "BDUsuarios.ser";
    ObjectInputStream lector = null;
    try{
      lector = new ObjectInputStream(new FileInputStream(ruta));
			Object objeto;
      HashMap<String,Usuario> map = null;
      int i = 0;
            objeto = lector.readObject();
            if(objeto != null){
              map = (HashMap<String,Usuario>) objeto;
              listaUsuarios = map;
            }
    
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

    public static void main(String[] args) {
      Usuario ross = new Usuario("Ross", "Rosa Victoria Villa Padilla", "Zeldaqwerty",4510467245L, "Calle Olivos 145, Azulejos, Madrid", 0124317234L, "Espania");
      
      Usuario arturGod = new Usuario("arturGod", "Arturo Lemus Pablo", "Password",5512235681L, "5ta Avenida No 45, Chicago", 1234543210L, "Estados Unidos");
      
      Usuario fulano = new Usuario("fulano", "Fulano Federico Fernandez Tragedio", "diosEstaAqui123",5578551018L, "Calle Chongus 132, Colonia De las Tragedias", 0224716230L, "Mexico");
      
      listaUsuarios = new HashMap<>();
      listaUsuarios.put("Ross",ross);
      listaUsuarios.put("arturGod",arturGod);
      listaUsuarios.put("fulano",fulano);
      
      guardarUsuarios(listaUsuarios);

      Producto a1 = new Producto("182312394","La Costeña Chile Jalapeño Rajas 105 Gr", "Alimentos", 8.10);
      Producto a2 = new Producto("645120012","Atun Ancla En Agua Lata", "Alimentos",  12.70);
      Producto a3 = new Producto("199283431","Leche Evaporada Alpura", "Alimentos",  16.40);
      Producto a4 = new Producto("100230424","Galletas Gamesa Marias Rollo", "Alimentos",  12.70);
      Producto a5 = new Producto("834913234","Frijol Isadora Refrito Negro Bolsa", "Alimentos",  15.70);
      
      Producto e1 = new Producto("834913234", "Laptop HP 15-dw1085", "Electronicos", "8999.00");
      Producto e2 = new Producto("712731273", "TV Samsung 40 Pulgadas Full HD Smart TV LED UN40N5200AFXZX", "Electronicos", "5999.00");
      Producto e3 = new Producto("814729122", "TV JVC 32 Pulgadas HD LED SI32H", "Electronicos", "2999.00");
      Producto e4 = new Producto("928381288", "Smartphone Samsung Galaxy A52", "Electronicos", "7848.00");
      Producto e5 = new Producto("712361236", "Xiaomi Poco M4 Pro 5G", "Electronicos", "5449.00");

      Producto ed1 = new Producto("912931233", "Lavadora Mabe 21 Kg Blanca", "Electrodomesticos", "10490.00");
      Producto ed2 = new Producto("992320042", "Refrigerador 11 Pies Winia Cúbicos con Despachador Silver", "Electrodomesticos", "7490.00");
      Producto ed3 = new Producto("891231232", "Refrigerador 18 Pies Whirlpool Acero Inox", "Electrodomesticos", "14790.00");
      Producto ed4 = new Producto("772938233", "Frigobar Hisense 3.3 Pies Cúbicos Silver", "Electrodomesticos", "5390.00");
      Producto ed5 = new Producto("111284837", "Refrigerador Mabe Bottom Freezer 19 pies", "Electrodomesticos", "18490.00");

      LinkedList<ProductoConDescuento> electronica = new LinkedList<>();
      electronica.add(e1);
      electronica.add(e2);
      electronica.add(e3);
      electronica.add(e4);
      electronica.add(e5);
      LinkedList<ProductoConDescuento> electrodomesticos = new LinkedList<>();
      electrodomesticos.add(ed1);
      electrodomesticos.add(ed2);
      electrodomesticos.add(ed3);
      electrodomesticos.add(ed4);
      electrodomesticos.add(ed5);
      LinkedList<ProductoConDescuento> alimentos = new LinkedList<>();
      alimentos.add(a1);
      alimentos.add(a2);
      alimentos.add(a3);
      alimentos.add(a4);
      alimentos.add(a5);
      
      catalogo = new HashMap<>();
      catalogo.put("Alimentos", alimentos);
      catalogo.put("Electrodomesticos", electrodomesticos);
      catalogo.put("Electronica", electronica);
      
      /*
      recuperarArticulos();
      System.out.println(listaUsuarios.get("fulano").getNombreCompleto());
      */


      
    }

}
