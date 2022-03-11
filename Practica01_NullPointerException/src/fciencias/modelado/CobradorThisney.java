package src.fciencias.modelado;

/**
 * Interfaz para el patrón Strategy en el servicio Thisney.
 * Distintos tipos de cobro para el servicio Thisney podran implementar esta interfaz.
 */
public interface CobradorThisney {
    /**
     * Realiza el cobro del servicio Thisney a la suscripción recibida.
     * @param suscripcion - suscripción a la que se le hará el cobro.
     * @return True si el cliente tiene fondos para pagar la suscripción, False si no pudo pagarla.
     */
    public boolean realizar_cobro(Suscripcion suscripcion);
}
