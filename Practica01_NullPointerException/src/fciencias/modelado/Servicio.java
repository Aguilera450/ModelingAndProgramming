package src.fciencias.modelado;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

/**
 * Clase abstracta que simula un Servicio. 
 * Esta clase forma parte del patrón Observer, donde tiene el papel de Sujeto y sus Observadores son objetos Suscripcion.
 * Esta clase se encarga de mandar mensajes a sus suscripciones y tambien de hacerles saber cuando deben pagar el servicio.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 12/03/2022
 */


public abstract class Servicio implements Sujeto{
    /* Atributos de la clase */
    /** Nombre del servicio */
    public String nombre;
    /** Lista de suscripciones registradas al servicio */
    protected HashMap<String, Suscripcion> lista_suscripciones;
    /** Lista de recomendaciones para las suscripciones registradas en lista_suscripciones */
    protected Stack<String> recomendaciones;
    /** Mensaje que se les estará enviando a todas las suscripciones por igual */
    protected String mensaje_general;
    /** Mensaje de bienvenida para las suscripciones que se incorporan por primera vez */
    protected String mensaje_bienvenida;
    /** Mensaje que se envía a las suscripciones que fueron canceladas y regresaron */
    protected String mensaje_regreso;


    /* Metodos Getter */

    /**
     * Metodo que regresa la lista de suscripciones del servicio.
     * @return la lista de suscripciones del servicio.
     */    
    public HashMap<String, Suscripcion> suscripciones(){
        return lista_suscripciones;
    }
    
    /**
     * Metodo que regresa las recomendaciones del servicio.
     * @return una pila con las recomendaciones del servicio.
     */
    public Stack<String> recomendaciones(){
        return recomendaciones;
    }

    /**
     * Metodo que regresa el mensaje general.
     * @return el mensaje general.
     */
    public String mensaje(){
        return mensaje_general;
    }

    /**
     * Metodo que regresa el mensaje de bienvenida.
     * @return el mensaje de bienvenida.
     */
    public String bienvenida(){
        return mensaje_bienvenida;
    }

    /**
     * Metodo que regresa el mensaje de regreso
     * @return el mensaje de regreso.
     */
    public String regreso(){
        return mensaje_regreso;
    }

    /**
     * Metodo para establecer una nueva lista de suscripciones.
     * @param suscripciones HasMap de suscripciones.
     * @return la lista de suscripciones.
     */
    public HashMap<String, Suscripcion> dar_suscripciones(HashMap<String, Suscripcion> lista_suscripciones){
        this.lista_suscripciones = lista_suscripciones;
        return this.lista_suscripciones;
    }

    /**
     * Metodo para establecer una nueva pila de recomendaciones.
     * @param recomendaciones una pila con las recomendaciones del servicio.
     * @return la pila de recomendaciones
     */
    public Stack<String> dar_recomendaciones(Stack<String> recomendaciones){
        this.recomendaciones = recomendaciones;
        return this.recomendaciones;
    }

    /**
     * Metodo para establecer un nuevo mensaje general.
     * @param mensaje_general mensaje general a establecer.
     * @return el mensaje general.
     */
    public String dar_mensaje(String mensaje_general){
        this.mensaje_general = mensaje_general;
        return this.mensaje_general;
    }

    /**
     * Metodo para establecer un nuevo mensaje de bienvenida.
     * @param mensaje_bienvenida nuevo mensaje de bienvenida.
     * @return el mensaje de bienvenida.
     */
    public String dar_bienvenida(String mensaje_bienvenida){
        this.mensaje_bienvenida = mensaje_bienvenida;
        return this.mensaje_bienvenida;
    }

    /**
     * Metodo para establecer un nuevo mensaje de regreso.
     * @param mensaje_regreso nuevo mensaje de regreso.
     * @return el mensaje de regreso.
     */
    public String dar_regreso(String mensaje_regreso ){
        this.mensaje_regreso = mensaje_regreso;
        return this.mensaje_regreso;
    }

    /**
     * Metodo que agrega una recomendación a la pila de recomendaciones.
     * @param recomendacion recomendación a agregar a la pila de recomendaciones. 
     * @return la recomendación agregada.
     */
    public String agregar_recomendacion(String recomendacion){
        recomendaciones.add(recomendacion);
        return recomendacion;
    }

    /**
     * Metodo para obtener una recomendacion de la pila de recomendaciones.
     * @return una recomendación.
     */
    public String obtener_recomendacion(){
        // TODO - Validar cuando se queda vacía la pila y regresar un String vacio. Y documentar este cambio en el javadoc
        return recomendaciones.pop();
    }

     /**
     * Método que se encarga de notificar a las suscripciones los mensajes establecidos para la relación Sujeto-Observador del patrón Observer.
     */
    public void notificar_suscripciones(){
        // TODO - Validaciones
        Suscripcion suscripcion;
        Set<String> keys = lista_suscripciones.keySet();
        for(String key:keys){
            suscripcion = lista_suscripciones.get(key);
            // Los mensajes establecidos se encuentran en actualizar de Suscripcion.
            suscripcion.actualizar();
        }
    }

    /**
     * Metodo para registrar una suscripción.
     * @param suscripcion suscripción a registrar.
     */
    @Override
    public void registrar(Suscripcion suscripcion){
        // Primero validamos que la suscripcion pertenezca al servicio actual.
        // Para eso vemos que el nombre del servicio al que pertenece sea el mismo que el actual.
        if(suscripcion.servicio().nombre.equals(this.nombre)){
            // Registramos la suscripcion en la lista.
            lista_suscripciones.put(suscripcion.correo_asociado(), suscripcion);
        }
    }

    /**
	 * Método para eliminar una suscripción.
	 * Ninguna suscripción se eliminará si no coincide con la recibida.
	 * @param suscripción a eliminar.
	 */
    @Override
    public void remover(Suscripcion suscripcion){
        lista_suscripciones.remove(suscripcion.correo_asociado());
    }

    /**
	 * Método para notificar a los Observadores.
	 */
    @Override
    public void notificar(){
        notificar_suscripciones();
    }

    /**
     * Metodo abstracto para cobrar una suscripcion.
     * @param suscripcion suscripción a la cual se le hará el cobro.
     */
    public abstract void cobrar_suscripcion(Suscripcion suscripcion);

}