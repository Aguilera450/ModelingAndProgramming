/**
 * Clase abstracta Servicio, a partir de esta clase
 * van a heredar los servicios.
 * @author Adrian Aguilera
 * @author Marco Rivera
 * @author Diego Rosas
 * @version 1.0
 * @date 11/03/2021
 */

/* Paquetes importados */
import java.util.HashMap;
import java.util.Stack;

public abstract class Servicio{
    /* Atributos de la clase */
    public String nombre;
    private HashMap<String, Suscripcion> lista_suscripciones;
    private Stack<String> recomendaciones;
    private String mensaje_general;
    private String mensaje_bienvenida;
    private String mensaje_regreso;

    /* Metodos Getter */

    /**
     * Metodo que regresa
     * @return <code>HashMap<String, Suscripcion></code> -- suscripciones
     */    
    public HashMap<String, Suscripcion> suscripciones(){
        return lista_suscripciones;
    }
    
    /**
     * Metodo que regresa la pila de recomendaciones
     * @return <code>Stack<String></code> -- recomendaciones
     */
    public Stack<String> recomendaciones(){
        return recomendaciones;
    }

    /**
     * Metodo que regresa el mensaje general
     * @return <code>String</code> -- mensaje_general
     */
    public String mensaje(){
        return mensaje_general;
    }

    /**
     * Metodo que regresa el mensaje de bienvenida
     * @return <code>String</code> -- mensaje_bienvenida
     */
    public String bienvenida(){
        return mensaje_bienvenida;
    }

    /**
     * Metodo que regresa el mensaje de regreso
     * @return <code>String</code> -- mensaje_regreso
     */
    public String regreso(){
        return mensaje_regreso;
    }

    /**
     * Metodo para establecer una nueva lista de suscripciones
     * @param suscripciones HashMap<String, Suscripcion>
     * @return <code>HashMap<String, Suscripcion></code> Lista de suscripciones
     */
    public HashMap<String, Suscripcion> dar_suscripciones(HashMap<String, Suscripcion> lista_suscripciones){
        this.lista_suscripciones = lista_suscripciones;
        return lista_suscripciones;
    }

    /**
     * Metodo para establecer una nueva pila de recomendaciones
     * @param recomendaciones Stack<String>
     * @return <code>Stack<String></code> recomendaciones
     */
    public Stack<String> dar_recomendaciones(Stack<String> recomendaciones){
        this.recomendaciones = recomendaciones;
        return recomendaciones;
    }

    /**
     * Metodo para establecer un nuevo mensaje general
     * @param mensaje_general String
     * @return <code>String</code> Mensaje general
     */
    public String dar_mensaje(String mensaje_general){
        this.mensaje_general = mensaje_general;
        return mensaje_general;
    }

    /**
     * Metodo para establecer un nuevo mensaje de bienvenida
     * @param mensaje_bienvenida <code>String</code>
     * @return <code>String</code> Mensaje de bienvenida
     */
    public dar_bienvenida(String mensaje_bienvenida){
        this.mensaje_bienvenida = mensaje_bienvenida;
        return mensaje_bienvenida;
    }

    /**
     * Metodo para establecer un nuevo mensaje de regreso
     * @param mensaje_regreso <code>String</code>
     * @return <code>String</code> Mensaje de Regreso
     */
    public String dar_regreso(String mensaje_regreso ){
        this.mensaje_regreso = mensaje_regreso;
        return mensaje_regreso;
    }

    /**
     * Metodo que agrega una recomendacion a la pila de recomendaciones
     * @param recomendacion <code>String</code>
     * @return <code>String</code>
     */
    public String agregar_recomendacion(String recomendacion){
        recomendaciones.add(recomendacion);
        return recomendacion;
    }

    /**
     * Metodo para obtener una recomendacion de la pila de recomendacioens
     * @return <code>String</code>
     */
    public String obtener_recomendacion(){
        return recomendaciones.pop();
    }

    /**
     * Metodo abstracto para cobrar la suscripcion de un usuario
     * @param suscripcion Suscripcion
     */
    public abstract void cobrar_suscripcion(Suscripcion suscripcion);

    /**
     * Metodo abstracto para notificar suscripciones
     */
    public abstract void notificar_suscripciones();

    /**
     * Metodo para registrar una suscripcion
     * @param suscripcion <code>Suscripcion</code>
     */
    public abstract void registrar(Suscripcion suscripcion);

    /**
     * Metodo para remover una suscripcion
     * @param suscripcion <code>Suscripcion</code>
     */
    public abstract void remover(Suscripcion suscripcion);

    /**
     * Metdod para devolver notificacion
     */
    public abstract void notificar();
}