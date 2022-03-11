package src.fciencias.modelado;

/**
 * Interfaz para el patrón Strategy en el servicio HVOMax.
 * Distintos tipos de cobro para el servicio HVOMax podran implementar esta interfaz.
 */
public interface CobradorHVOMax {
    /**
     * Realiza el cobro del servicio Thisney a la suscripción recibida.
     * @param suscripcion - suscripción a la que se le hará el cobro.
     * @return True si el cliente tiene fondos para pagar la suscripción, False si no pudo pagarla.
     */
   public boolean realizar_cobro(Suscripcion suscripcion);
}
