package src.fciencias.modelado;

/**
 * Interfaz para el patrón Strategy en el servicio Momazon.
 * Distintos tipos de cobro para el servicio Momazon podran implementar esta interfaz.
 */
public interface CobradorMomazon {
   public boolean realizar_cobro(Suscripcion suscripcion);
}
