package src.fciencias.modelado;

import java.util.HashMap;
import java.util.Stack;


/**
 * Servicio HVOMax.
 * Esta clase se encarga de realizar los cobros de las suscripciones y definir los mensajes.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 */
public class HVOMax extends Servicio {

    /** Cobrador del servicio HVOMax encargado de realizar los cobros de suscripciones */
    private CobradorHVOMax cobrador;


    /**
     * Constructor del servicio HVOMax.
     * @param mensaje_general - mensaje general del servicio HVOMax.
     * @param mensaje_bienvenida - mensaje de bienvenida para las suscripciones nuevas de HVOMax.
     * @param mensaje_regreso - mensaje de regreso paras las suscripciones ya registradas en HVOMax que vuelven a pagar el servicio.
     */
    public HVOMax( String mensaje_general, String mensaje_bienvenida, String mensaje_regreso){
        dar_nombre("HVOMax");
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
    public CobradorHVOMax cobrador(){
        return cobrador;
    }

    /**
     * Método para cambiar el tipo de cobro, es decir, el cobrador.
     * @param cobro cobrador que se usará ahora.
     */
    private void cambiar_cobrador(CobradorHVOMax cobro){
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
        if(tipo.equals("HVOMax Normal")){
            cambiar_cobrador(new HVOMaxNormal());
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