//package src.fciencias.modelado;

/**
 * Clase que simula una suscripción de un servicio.
 * Esta clase forma parte del Patrón Observer junto con Servicio, donde Suscripción funge el papel de Observador.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 12/03/2022
 */
public class Suscripcion implements Observador{
    /** Usuario propietario de la suscripción */
    private Usuario usuario;
    /** Correo del usuario asociado a la suscripción */
    private String correo_asociado;
    /** Servicio al cual pertenece esta suscripción */
    private Servicio servicio;
    /** Método de pago al que se le realizarán los cargos de la suscripción */
    private CuentaBancaria metodo_pago;
    /** String con el tipo de suscripción que servirá para validaciones en Servicio */
    private String tipo_suscripcion;
    /** Meses que el usuario ha usado esta suscripción */
    private int meses_actividad;
    /** Nos permite saber si la suscripción esta activa o cancelada */
    private boolean activa;
    /** Aviso recibido por el Sujeto Servicio mediante Observer */
    private String aviso;

    /**
     * Constructor de una Suscripción.
     * @param tipo_suscripcion tipo del que será la suscripción.
     * @param servicio Servicio al cual pertenecerá la suscripción.
     * @param usuario usuario propietario de la suscripción.
     * @param correo correo que se asociará a la suscripción.
     * @param pago método de pago de la suscripción.
     */
    public Suscripcion(String tipo_suscripcion, Servicio servicio, Usuario usuario, String correo, CuentaBancaria pago){
        this.tipo_suscripcion = tipo_suscripcion;
        this.servicio = servicio;
        this.usuario = usuario;
        correo_asociado = correo;
        metodo_pago = pago;

        meses_actividad = 0;
        activa = true;
        aviso = "";
    }

    // Getters
    /**
     * Método para obtener el usuario propietario de la suscripción.
     * @return propietario de la suscripción.
     */
    public Usuario propietario(){
        return usuario;
    }

    /**
     * Método para obtener el correo asociado a la suscripción.
     * @return correo asociado a la suscripción.
     */
    public String correo_asociado(){
        return correo_asociado;
    }

    /**
     * Método para obtener el servicio al que pertenece la suscripción.
     * @return servicio al que pertenece la suscripción.
     */
    public Servicio servicio(){
        return servicio;
    }

    /**
     * Método para obtener el método de pago del usuario para la suscripción.
     * @return método de pago para pagar la suscripción.
     */
    public CuentaBancaria metodo_pago(){
        return metodo_pago;
    }

    /**
     * Método para conocer de que tipo es la suscripción.
     * @return tipo de la suscripción.
     */
    public String tipo(){
        return tipo_suscripcion;
    }

    /**
     * Método para conocer cuantos meses se lleva usando la suscripción.
     * @return meses que se lleva usando la suscripción.
     */
    public int meses_actividad(){
        return meses_actividad;
    }

    /**
     * Método para saber si la suscripción esta activa o ha sido cancelada.
     * @return True si esta activa, False si ha sido cancelada.
     */
    public boolean activa(){
        return activa;
    }

    /**
     * Método para obtener el aviso guardado en la suscripción.
     * @return aviso guardado en la suscripción.
     */
    public String mostrar_aviso(){
        return aviso;
    }


    // Setters

    /** Método para activar nuevamente la suscripción */
    public void suscribir_de_nuevo(){
        activa = true;
    }
    
    /**
     * Suma otro mes de actividad a la suscripción.
     */
    public void otro_mes_suscrito(){
        meses_actividad++;
    }

    /**
     * Método para asignar un usuario a la suscripción.
     * @param usuario usuario a asignar a la suscripción.
     * @return el usuario asignado a la suscripción.
     */
    public Usuario dar_usuario(Usuario usuario){
        this.usuario = usuario;
        return this.usuario;
    }

    /**
     * Método para asignar un correo asociado a la sucripción.
     * @param correo correo a asociar.
     * @return correo asociado.
     */
    public String dar_correo_asociado(String correo){
        this.correo_asociado = correo;
        return this.correo_asociado;
    }

    /**
     * Método para asignar el servicio al que pertenece la suscripción.
     * @param servicio servicio al que pertenecerá la suscripción.
     * @return servicio al que pertenece la suscripción actualmente.
     */
    public Servicio dar_servicio(Servicio servicio){
        this.servicio = servicio;
        return this.servicio;
    }

    /**
     * Método para asignar el método de pago con el que se pagará la suscripción.
     * @param cuenta método de pago con el que se pagará la suscripción.
     * @return método de pago de la suscripción.
     */
    public CuentaBancaria dar_metodo_pago(CuentaBancaria cuenta){
        this.metodo_pago = cuenta;
        return this.metodo_pago;
    }

    /**
     * Método para cambiar el tipo de suscripción.
     * @param tipo el nuevo tipo que tendrá la suscripción.
     * @return tipo de la suscripción.
     */
    public String cambiar_tipo(String tipo){
        this.tipo_suscripcion = tipo;
        return tipo_suscripcion;
    }
    

    // Métodos de la clase
    /**
     * Método para cancelar la suscripción.
     */
    public void cancelar_suscripcion(){
        activa = false;
    }

    /**
	 * Método que se encarga de actualizar al objeto Observador acorde al mensaje del Sujeto.
     * En este caso el Sujeto es el Servicio de la suscripción.
	 */
    @Override
    public void actualizar() {
        // El primer mensaje recibido es realizar el pago de la suscripción.
        servicio.cobrar_suscripcion(this);

        // Una vez pagada la suscripción, si esta no fue cancelada por falta de fondos,
        // se enviará la recomendación mensual.
        if(activa()){
            // Se le muestra al usuario cuantos meses lleva usando el servicio.
            System.out.println(propietario().nombre() + " llevas usando "+meses_actividad()+ " meses usando "+servicio().nombre());
            System.out.println(servicio.mensaje());
        }
    }
}
