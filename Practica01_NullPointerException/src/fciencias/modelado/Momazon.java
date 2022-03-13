package src.fciencias.modelado;

import java.util.HashMap;
import java.util.Stack;

/**
 * Servicio Momazon.
 * Esta clase se encarga de realizar los cobros de las suscripciones y definir los mensajes.
 */
public class Momazon extends Servicio {

    /** Cobrador del servicio Momazon encargado de realizar los cobros de suscripciones */
    private CobradorMomazon cobrador;


    /**
     * Constructor del servicio Momazon.
     * @param mensaje_general - mensaje general del servicio Momazon.
     * @param mensaje_bienvenida - mensaje de bienvenida para las suscripciones nuevas de Momazon.
     * @param mensaje_regreso - mensaje de regreso paras las suscripciones ya registradas en Momazon que vuelven a pagar el servicio.
     */
    public Momazon( String mensaje_general, String mensaje_bienvenida, String mensaje_regreso){
        dar_nombre("Momazon");
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
    public CobradorMomazon cobrador(){
        return cobrador;
    }

    /**
     * Método para cambiar el tipo de cobro, es decir, el cobrador.
     * @param cobro cobrador que se usará ahora.
     */
    private void cambiar_cobrador(CobradorMomazon cobro){
        cobrador = cobro;
    }

    /**
     * Metodo para cobrar una suscripción.
     * @param suscripcion Suscripción a cobrar.
     */
    public void cobrar_suscripcion(Suscripcion suscripcion){
        // Se define que tipo de cobro se usará acorde al tipo de suscripción
        String tipo = suscripcion.tipo();
        if(tipo.equals("Momazon Normal")){
            cambiar_cobrador(new MomazonNormal());
        } else if(tipo.equals("Momazon Premium")){
            cambiar_cobrador(new MomazonPremium());
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
