//package src.fciencias.modelado;

import java.util.HashMap;
import java.util.Stack;


/**
 * Servicio Thisney.
 * Esta clase se encarga de realizar los cobros de las suscripciones y definir los mensajes.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 */
public class Thisney extends Servicio {

    /** Cobrador del servicio Thisney encargado de realizar los cobros de suscripciones */
    private CobradorThisney cobrador;


    /**
     * Constructor del servicio Thisney.
     * @param mensaje_general - mensaje general del servicio Thisney.
     * @param mensaje_bienvenida - mensaje de bienvenida para las suscripciones nuevas de Thisney.
     * @param mensaje_regreso - mensaje de regreso paras las suscripciones ya registradas en Thisney que vuelven a pagar el servicio.
     */
    public Thisney( String mensaje_general, String mensaje_bienvenida, String mensaje_regreso){
        dar_nombre("Thisney");
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
    public CobradorThisney cobrador(){
        return cobrador;
    }

    /**
     * Método para cambiar el tipo de cobro, es decir, el cobrador.
     * @param cobro cobrador que se usará ahora.
     */
    private void cambiar_cobrador(CobradorThisney cobro){
        cobrador = cobro;
    }

    /**
     * Metodo para cobrar una suscripción.
     * @param suscripcion Suscripción a cobrar.
     */
    public void cobrar_suscripcion(Suscripcion suscripcion){
        // Se define que tipo de cobro se usará acorde al tipo de suscripción
        String tipo = suscripcion.tipo();
        if(tipo.equals("Thisney Normal")){
            cambiar_cobrador(new ThisneyNormal());
        } else {
            System.out.println(nombre() + " no maneja este tipo de suscripción.");
            return;
        } 

        if(!cobrador.realizar_cobro(suscripcion)){
            // El cobro fue rechazado por falta de fondos
            suscripcion.cancelar_suscripcion();
            System.out.println(suscripcion.propietario().nombre()+ ", su suscripción de " + tipo + " fue cancelada.");
        }
    }
}