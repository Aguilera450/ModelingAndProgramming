//package src.fciencias.modelado;

import java.util.ArrayList;

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
    /** Nombre del usuario */
    public String nombre;
    /** Cuenta bancaria donde el propietario es el usuario */
    private CuentaBancaria cuenta_bancaria;
    /** Lista de suscripciones activas y canceladas del usuario */
    private ArrayList<Suscripcion> lista_suscripciones;
    
    /**
     * Constructor de la clase Usuario.
     * A cada usuario se le creara una cuenta bancaria con los fondos ingresados
     * por parametro.
     * @param nombre nombre del usuario.
     * @param dinero dinero que tendra en su cuenta bancaria.
     */
    public Usuario(String nombre, float dinero){
        this.nombre = nombre;
        this.cuenta_bancaria = new CuentaBancaria(this, dinero);
        lista_suscripciones = new ArrayList<>();
    }

    /* Getters */
    /**
     * Nos permite saber el nombre del usuario.
     * @return nombre del usuario.
     */
    public String nombre(){
        return nombre;
    }

    public Suscripcion buscar_suscripcion(String correo, String tipo_suscripcion){
        for(int i = 0; i < lista_suscripciones.size(); i++){
            Suscripcion suscripcion_actual = lista_suscripciones.get(i);
            if(suscripcion_actual.correo_asociado().equals(correo) && suscripcion_actual.tipo().equals(tipo_suscripcion)){
                return suscripcion_actual;
            }
        }
        return null;
    }

    /**
     * Metodo que ayuda al usuario a contratar un servicio.
     * @param tipo_suscripcion Versión del servicio a contratar.
     * @param correo Correo del usuario, es único.
     * @param servicio El servicio que contrata.
     * @return Regresa la suscripcion que resulta de contratar el servicio.
     */
    public Suscripcion contratar_servicio(String tipo_suscripcion, Servicio servicio, String correo) {
        Suscripcion nueva_suscripcion = new Suscripcion(tipo_suscripcion, servicio, this, correo, this.cuenta_bancaria);
        // Se registra formalmente con el servicio.
        servicio.registrar(nueva_suscripcion);
        // Guarda la suscripción en su listado personal.
        lista_suscripciones.add(nueva_suscripcion);

        return nueva_suscripcion;
    }
    
    /**
     * Metodo que cancela la suscripción del usuario.
     * @param suscripcion suscripción a cancelar.
     * @return Suscripción cancelada.
     */
    public Suscripcion cancelar_suscripcion(Suscripcion suscripcion) {
        if(suscripcion.activa()){
            // Si la suscripción a cancelar si esta activa...
            if(lista_suscripciones.contains(suscripcion)){
                // Y existe en nuestro listado...
                // El servicio se encargara de desactivar la suscripción del usuario.
                suscripcion.servicio().remover(suscripcion);
                return suscripcion;
            }
        }
        return null;
    }

    /**
     * Metodo para cambiar el tipo de una suscripcion.
     * @param suscripcion Suscripcion a la cual se le cambiara el tipo.
     * @param nuevo_tipo Nuevo tipo que tendra la suscripcion.
     * @return Suscripcion actualizada. Si la suscripcion es de otro usuario regresara null.
     */
    public Suscripcion cambiar_suscripcion(Suscripcion suscripcion, String nuevo_tipo){
        if(lista_suscripciones.contains(suscripcion)){
            // Esta suscripcion si le pertenece al usuario.
            suscripcion.cambiar_tipo(nuevo_tipo);
            return suscripcion;
        } else {
            return null;
        }
    }
}
