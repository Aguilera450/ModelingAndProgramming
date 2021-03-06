//package src.fciencias.modelado;

/**
 * Tipo de cobro para las suscripciones que contrataron el servicio de Spootify Normal o Grátis.
 * Esta clase forma parte del patrón Strategy en la clase Spootify.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 11/03/2022
 */
public class SpootifyNormal implements CobradorSpootify{
    /** Precio asignado al servicio Spootify Normal */
    private final float precio = 0f;

    /**
     * Realiza el cobro del servicio Spootify Normal a la suscripción recibida.
     * @param suscripcion suscripción a la que se le hará el cobro.
     * @return True si el cliente tiene fondos para pagar la suscripción, False si no pudo pagarla.
     */
    @Override
    public boolean realizar_cobro(Suscripcion suscripcion){
        if(suscripcion.metodo_pago().saldo_disponible() >= precio){
            suscripcion.metodo_pago().cobrar(precio, "Servicio Spootify Normal (Grátis)");
            suscripcion.otro_mes_suscrito();
            return true;
        } else {
            return false;
        }
    }
    
}
