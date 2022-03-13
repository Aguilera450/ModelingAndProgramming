package src.fciencias.modelado;

/**
 * Tipo de cobro para las suscripciones que contrataron el servicio de HVOMax Normal.
 * Esta clase forma parte del patrón Strategy en la clase HVOMax.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 11/03/2022
 */
public class HVOMaxNormal implements CobradorHVOMax{
    /** Precio de promoción para los primeros n meses, donde  n =  meses_promocion*/
    private final float precio_promocion = 0;
    /** Meses que dura el precio promoción del servicio */
    private final int meses_promocion = 3;
    /** Precio asignado al servicio HVOMax Normal */
    private final float precio = 140;

    /**
     * Realiza el cobro del servicio HVOMax Normal a la suscripción recibida.
     * @param suscripcion suscripción a la que se le hará el cobro.
     * @return True si el cliente tiene fondos para pagar la suscripción, False si no pudo pagarla.
     */
    @Override
    public boolean realizar_cobro(Suscripcion suscripcion){
        if(suscripcion.metodo_pago().saldo_disponible() >= precio){
            // Se valida cuántos meses lleva suscrito el usuario
            if(suscripcion.meses_actividad() > meses_promocion) // Ya expiró su periodo de promoción
                suscripcion.metodo_pago().cobrar(precio, "Servicio HVOMax Normal");
            else
                suscripcion.metodo_pago().cobrar(precio_promocion, "Servicio HVOMax Normal");
            suscripcion.otro_mes_suscrito();
            return true;
        } else {
            return false;
        }
    }
}
