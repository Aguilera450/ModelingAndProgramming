package src.fciencias.modelado;

import java.util.HashMap;
import java.util.Stack;

/**
 * Servicio Spootify.
 * Esta clase se encarga de realizar los cobros de las suscripciones y definir los mensajes.
 */
public class Spootify extends Servicio {

    /** Cobrador del servicio Spootify encargado de realizar los cobros de suscripciones */
    private CobradorSpootify cobrador;


    /**
     * Constructor del servicio Spootify.
     * @param mensaje_general
     * @param mensaje_bienvenida
     * @param mensaje_regreso
     */
    public Spootify( String mensaje_general, String mensaje_bienvenida, String mensaje_regreso){
        dar_nombre("Spootify");
        lista_suscripciones = new HashMap<>();
        recomendaciones = new Stack<>();
        this.mensaje_general = mensaje_general;
        this.mensaje_bienvenida = mensaje_bienvenida;
        this.mensaje_regreso = mensaje_regreso;
    }

    public CobradorSpootify cobrador(){
        return cobrador;
    }

    private void cambiar_cobrador(CobradorSpootify cobro){
        cobrador = cobro;
    }

    // Métodos abstractos de Servicio
    /**
     * Metodo abstracto para cobrar la suscripcion de un usuario
     * @param suscripcion Suscripcion
     */
    public void cobrar_suscripcion(Suscripcion suscripcion){
        // Se define que tipo de cobro se usará acorde al tipo de suscripción
        String tipo = suscripcion.tipo();
        if(tipo.equals("Spootify Normal")){
            cambiar_cobrador(new SpootifyNormal());
        } else if(tipo.equals("Spootify Premium")){
            cambiar_cobrador(new SpootifyPremium());
        } else {
            System.out.println(nombre() + " no maneja este tipo de suscripción,");
            return;
        } 

        if(!cobrador.realizar_cobro(suscripcion)){
            suscripcion.cancelar_suscripcion();
            System.out.println(suscripcion.propietario()+ ", su suscripción de " + tipo + " fue cancelada.");
        }

    }

}
