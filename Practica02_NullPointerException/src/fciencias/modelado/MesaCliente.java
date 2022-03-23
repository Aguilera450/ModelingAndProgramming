/**
 * Clase que simula una mesa con un cliente. 
 * @author Adrian Aguilera Moreno - Aguiler450
 * @author Rosas Franco Diego Angel - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 22/03/2022
 */
public class MesaCliente {

    /** Nombre del cliente sentado en la mesa */
    private String nombreCliente;
    /** Robot que está atendiendo la mesa */
    private Robot robotAsignado;

    /**
     * Constructor de una mesa con un cliente.
     * @param nombreCliente nombre del cliente que ocupará la mesa.
     */
    MesaCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    /**
     * Método para conocer el cliente que ocupa la mesa.
     * @return nombre del cliente que ocupa la mesa.
     */
    public String nombreCliente(){
        return nombreCliente;
    }

    /**
     * Método para concer el robot que está atendiendo la mesa.
     * @return Robot que está atendiendo la mesa.
     */
    public Robot robotAsignado(){
        return robotAsignado;
    }

    /**
     * Método que sirve para iniciar un proceso de orden con un robot.
     * @param robot Robot que queremos que atienda la mesa. En caso de que el Robot esté atendiendo otra mesa no se hará nada
     */
    public void pedirPlatillo(Robot robot){
        // Si el robot recibido no está atendiendo a otra mesa.
        if(!robot.getAtencionMesaCliente()){
            // Asignamos al robot recibido a nuestra mesa
            robotAsignado = robot;
            robotAsignado.asignarMesaAAtender(this);
            // Y damos inicio al proceso de orden
            robotAsignado.caminar();
        } else {
            System.out.println("El Robot no puede ser solicitado ahora.");
        }
    }
}
