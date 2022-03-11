package src.fciencias.modelado;

/**
 * Tipo de cobro para las suscripciones que contrataron el servicio de Momazon Premium.
 * Esta clase forma parte del patrón Strategy en la clase Momazon.
 */
public class MomazonPremium {
    private final float precio = 150;

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
