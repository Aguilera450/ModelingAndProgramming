package src.fciencias.modelado;

/**
 * Tipo de cobro para las suscripciones que contrataron el servicio de Momazon Premium.
 * Esta clase forma parte del patrón Strategy en la clase Momazon.
 */
public class MomazonPremium implements CobradorMomazon {
    /** Precio asignado al servicio Momazon Premium */
    private final float precio = 150;

    /**
     * Realiza el cobro del servicio Momazon Premium a la suscripción recibida.
     * @param suscripcion - suscripción a la que se le hará el cobro.
     * @return True si el cliente tiene fondos para pagar la suscripción, False si no pudo pagarla.
     */
    @Override
    public boolean realizar_cobro(Suscripcion suscripcion){
        if(suscripcion.metodo_pago().saldo_disponible() >= precio){
            suscripcion.metodo_pago().cobrar(precio, "Servicio Momazon Premium");
            return true;
        } else {
            return false;
        }
    }
    
}
