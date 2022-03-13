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
     * @param mensaje_general mensaje general del servicio Spootify.
     * @param mensaje_bienvenida mensaje de bienvenida para las suscripciones nuevas de Spootify.
     * @param mensaje_regreso mensaje de regreso paras las suscripciones ya registradas en Spootify que vuelven a pagar el servicio.
     */
    public Spootify( String mensaje_general, String mensaje_bienvenida, String mensaje_regreso){
        dar_nombre("Spootify");
        lista_suscripciones = new HashMap<>();
        recomendaciones = new Stack<>();
        this.mensaje_general = mensaje_general;
        this.mensaje_bienvenida = mensaje_bienvenida;
        this.mensaje_regreso = mensaje_regreso;
    }

    /**
     * Método para obtener al cobrador actual.
     * @return cobrador actual.
     */
    public CobradorSpootify cobrador(){
        return cobrador;
    }

    /**
     * Método para cambiar el tipo de cobro, es decir, el cobrador.
     * @param cobro cobrador que se usará ahora.
     */
    private void cambiar_cobrador(CobradorSpootify cobro){
        cobrador = cobro;
    }

    /**
     * Metodo para cobrar una suscripción.
     * @param suscripcion Suscripción a cobrar.
     */
    public void cobrar_suscripcion(Suscripcion suscripcion){
        // Se define que tipo de cobro se usará acorde al tipo de suscripción
        String tipo = suscripcion.tipo();
        if(tipo.equals("Spootify Normal")){
            cambiar_cobrador(new SpootifyNormal());
        } else if(tipo.equals("Spootify Premium")){
            cambiar_cobrador(new SpootifyPremium());
        } else {
            System.out.println(nombre() + " no maneja este tipo de suscripción.");
            return;
        } 

        if(!cobrador.realizar_cobro(suscripcion)){
            // El cobro fue rechazado por falta de fondos
            suscripcion.cancelar_suscripcion();
            System.out.println(suscripcion.propietario()+ ", su suscripción de " + tipo + " fue cancelada.");
        }

    }

}
