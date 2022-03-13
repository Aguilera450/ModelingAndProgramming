//package src.fciencias.modelado;

/**
 * Tipo de cobro para las suscripciones que contrataron el servicio de Memeflix para dos dispositivos.
 * Esta clase forma parte del patrón Strategy en la clase Memeflix.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 11/03/2022
 */
public class MemeflixDosDispositivos implements CobradorMemeflix{
    /** Precio asignado al servicio Memeflix para dos dispositivos */
    private final float precio = 170;

    /**
     * Realiza el cobro del servicio Memeflix para dos dispositivos a la suscripción recibida.
     * @param suscripcion - suscripción a la que se le hará el cobro.
     * @return True si el cliente tiene fondos para pagar la suscripción, False si no pudo pagarla.
     */
    @Override
    public boolean realizar_cobro(Suscripcion suscripcion){
        if(suscripcion.metodo_pago().saldo_disponible() >= precio){
            suscripcion.metodo_pago().cobrar(precio, "Servicio Memeflix para dos dispositivos");
            suscripcion.otro_mes_suscrito();
            return true;
        } else {
            return false;
        }
    }
    
}
