//package src.fciencias.modelado;

import java.util.EmptyStackException;
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
 * @version 1.0 - 12/03/2022
 */
public abstract class Servicio implements Sujeto{
    /* Atributos de la clase */
    /** Nombre del servicio */
    private String nombre;
    /** Lista de suscripciones registradas al servicio */
    protected HashMap<String, Suscripcion> lista_suscripciones;
    /** Lista de recomendaciones para las suscripciones registradas en lista_suscripciones */
    protected Stack<String> recomendaciones;
    /** Mensaje que se les estará enviando a todas las suscripciones por igual */
    protected String mensaje_general;
    /** Mensaje de bienvenida para las suscripciones que se incorporan por primera vez al servicio*/
    protected String mensaje_bienvenida;
    /** Mensaje que se envía a las suscripciones que fueron canceladas y regresaron */
    protected String mensaje_regreso;


    /* Métodos Getter */

    /**
     * Método que regresa el nombre del servicio.
     * @return nombre del servicio.
     */
    public String nombre(){
        return nombre;
    }
    
    /**
     * Método que regresa la lista de suscripciones del servicio.
     * @return la lista de suscripciones del servicio.
     */    
    public HashMap<String, Suscripcion> suscripciones(){
        HashMap<String, Suscripcion> copia_lista_suscripciones = this.lista_suscripciones;
        return copia_lista_suscripciones;
    }
    
    /**
     * Método que regresa las recomendaciones del servicio.
     * @return una pila con las recomendaciones del servicio.
     */
    public Stack<String> recomendaciones(){
        Stack<String> copia_recomendaciones = this.recomendaciones;
        return copia_recomendaciones;
    }

    /**
     * Método que regresa el mensaje general.
     * @return el mensaje general.
     */
    public String mensaje(){
        mensaje_general = obtener_recomendacion();
        return mensaje_general;
    }

    /**
     * Método que regresa el mensaje de bienvenida.
     * @return el mensaje de bienvenida.
     */
    public String bienvenida(){
        return mensaje_bienvenida;
    }

    /**
     * Método que regresa el mensaje de regreso.
     * @return el mensaje de regreso.
     */
    public String regreso(){
        return mensaje_regreso;
    }



    // Métodos Setter
    /**
     * Método para asignar un nombre al servicio.
     * @param nombre nombre del servicio.
     * @return nombre asignado.
     */
    protected String dar_nombre(String nombre){
        this.nombre = nombre;
        return this.nombre;
    }

    /**
     * Método para establecer una nueva lista de suscripciones.
     * @param suscripciones HasMap de suscripciones.
     * @return la lista de suscripciones.
     */
    protected HashMap<String, Suscripcion> dar_suscripciones(HashMap<String, Suscripcion> suscripciones){
        this.lista_suscripciones = suscripciones;
        return this.lista_suscripciones;
    }

    /**
     * Método para establecer una nueva pila de recomendaciones.
     * @param recomendaciones una pila con las recomendaciones del servicio.
     * @return la pila de recomendaciones
     */
    protected Stack<String> dar_recomendaciones(Stack<String> recomendaciones){
        this.recomendaciones = recomendaciones;
        return this.recomendaciones;
    }

    /**
     * Método para establecer un nuevo mensaje general.
     * @param mensaje mensaje general a establecer.
     * @return el mensaje general.
     */
    protected String dar_mensaje(String mensaje){
        this.mensaje_general = mensaje;
        return this.mensaje_general;
    }

    /**
     * Método para establecer un nuevo mensaje de bienvenida.
     * @param bienvenida nuevo mensaje de bienvenida.
     * @return el mensaje de bienvenida.
     */
    protected String dar_bienvenida(String bienvenida){
        this.mensaje_bienvenida = bienvenida;
        return this.mensaje_bienvenida;
    }

    /**
     * Método para establecer un nuevo mensaje de regreso.
     * @param mensaje_regreso nuevo mensaje de regreso.
     * @return el mensaje de regreso.
     */
    protected String dar_regreso(String regreso ){
        this.mensaje_regreso = regreso;
        return this.mensaje_regreso;
    }

    /**
     * Método que agrega una recomendación a la pila de recomendaciones.
     * @param recomendacion recomendación a agregar a la pila de recomendaciones. 
     * @return la recomendación agregada.
     */
    public String agregar_recomendacion(String recomendacion){
        recomendaciones.add(recomendacion);
        return recomendacion;
    }

    /**
     * Método para obtener una recomendacion de la pila de recomendaciones.
     * @return una recomendación.
     */
    protected String obtener_recomendacion(){
        String recomendacion_mensual;
        try {
            recomendacion_mensual = recomendaciones.pop();
        } catch (EmptyStackException e) {
            recomendacion_mensual = "En este momento estamos trabajando en recomendaciones más acertadas para usted, disculpe los inconvenientes que pudimos causar.";
        }
        return recomendacion_mensual;
    }

    /**
     * Método abstracto para cobrar una suscripcion.
     * @param suscripcion suscripción a la cual se le hará el cobro.
     */
    public abstract void cobrar_suscripcion(Suscripcion suscripcion);
    
     /**
     * Método que se encarga de notificar a las suscripciones los mensajes establecidos para la relación Sujeto-Observador del patrón Observer.
     */
    public void notificar_suscripciones(){
        // Suscripcion que cambiara de acuerdo a la suscripcion que se le este notificando.
        Suscripcion suscripcion;
        // Recorremos nuestras suscripciones y les enviamos la notificación.
        Set<String> keys = lista_suscripciones.keySet();
        for(String key:keys){
            suscripcion = lista_suscripciones.get(key);
            // Los mensajes establecidos de la notificación se encuentran en actualizar de Suscripcion.
            suscripcion.actualizar();
        }
    }

    /**
     * Método para registrar una suscripción.
     * @param suscripcion suscripción a registrar.
     */
    @Override
    public void registrar(Suscripcion suscripcion){
        // Primero validamos que la suscripcion pertenezca al servicio actual.
        // Para eso vemos que el nombre del servicio al que pertenece sea el mismo que el actual.
        if(suscripcion.servicio().nombre().equals(this.nombre)){

            // Validamos si ya existía esta suscripción para darle su mensaje de regreso.
            if(lista_suscripciones.containsKey(suscripcion.correo_asociado())){
                suscripcion.suscribir_de_nuevo();
                System.out.println(suscripcion.propietario().nombre() + " " + regreso());
            } else {
                // Si no existía, registramos la suscripcion en la lista.
                lista_suscripciones.put(suscripcion.correo_asociado(), suscripcion);
                System.out.println(suscripcion.propietario().nombre() + " " + bienvenida());
            }
        }
    }

    /**
	 * Método para eliminar una suscripción.
	 * Ninguna suscripción se eliminará si no coincide con la recibida.
	 * @param suscripción a eliminar.
	 */
    @Override
    public void remover(Suscripcion suscripcion){
        Suscripcion elimna_suscripcion = lista_suscripciones.get(suscripcion.correo_asociado());
        if(elimna_suscripcion != null){
            elimna_suscripcion.cancelar_suscripcion();
            System.out.println(suscripcion.propietario().nombre() + ", lamentamos que dejes el servicio.");
        }
    }

    /**
	 * Método para notificar a los Observadores.
	 */
    @Override
    public void notificar(){
        notificar_suscripciones();
    }

}