package src.fciencias.modelado;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que simula un usuario que puede estar suscrito
 * a varios servicios y que además pude tener una cuenta
 * bancaria de la clase <code>CuentaBancaria</code>.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 11/03/2022
 */
public class Usuario {
    
    /* Atributos de clase. */
    public String nombre;
    private cuenta_bancaria CuentaBancaria;
    private HashMap<String, Suscripcion> lista_suscripciones = new HashMap<>();
    

    /* Getters */
    /**
     * Nos permite saber el nombre del usuario.
     * @return nombre del usuario.
     */
    public String nombre(){
        return nombre;
    }

    /**
     * Método que ayuda al usuario a contratar un servicio.
     * @param <code>tipo_servicio</code> -- Versión del servicio a contratar.
     * @param <code>correo</code>        -- Correo del usuario, es único.
     * @param <code>servicio</code>      -- El servicio que contrata.
     * @return <code>Suscripcion</code>  -- Regrsa la suscripcion que resulta de
     *                                      contratar el servicio.
     * @trhows <code>NullPointerException</code>.
     */
    public Suscripcion contratar_servicio(String tipo_servicio, String correo,
					  Servicio servicio) throws NullPointerException {
        if(servicio == null || correo == null || tipo_servicio == null)
            throw new NullPointerException("Debes introducir datos no nulos.");
            
        Suscripcion nueva_suscripcion
            = new Suscripcion(tipo_servicio, this, correo, servicio);
        
        lista_suscripciones.put(servicio, nueva_suscripcion);
        return nueva_suscripcion;
    }
    
    /**
     * Método que cancela la suscripción del usuario.
     * @param <code>suscripcion</code>  -- servicio a cancelar.
     * @return <code>Suscripcion</code> -- Suscripción cancelada.
     * @throws <code>NullPointerException</code>.
     */
    public Suscripcion cancelar_suscripcion(Servicio suscripcion) {
        if(!lista_suscripciones.containsKey(suscripcion))
            throw new NullPointerException("No existe la suscripción.");
        
        Suscripcion suscripcion_a_cancelar
            = lista_suscripciones.get(suscripcion);
        
        if(!suscripcion_a_cancelar.activa())
            throw new NullPointerException("No se puede cancelar esta"
                        + " suscripción, pues no está"
                        + " activa.");
        
        return suscripcion_a_cancelar.cancelar_suscripcion();
    }
}
