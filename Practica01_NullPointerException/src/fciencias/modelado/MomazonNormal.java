package src.fciencias.modelado;

/**
 * Tipo de cobro para las suscripciones que contrataron el servicio de Momazon Normal.
 * Esta clase forma parte del patrón Strategy en la clase Momazon.
 */
public class MomazonNormal implements CobradorMomazon{
    private final float precio = 110;

    @Override
    public boolean realizar_cobro(Suscripcion suscripcion){
        if(suscripcion.metodo_pago().saldo_disponible() >= precio){
            suscripcion.metodo_pago().cobrar(precio, "Servicio Momazon Normal");
            return true;
        } else {
            return false;
        }
    }
    
}
