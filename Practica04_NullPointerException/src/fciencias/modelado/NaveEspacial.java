/**
 * Clase que simula una Nave Espacial.
 * Cada nave poseé 4 tipos de componentes: Un sistema de propulsion,
 * un blindaje, una cabina y un tipo de armas.
 * Además cada uno de estos componentes le brindan un extra al 
 * precio, ataque, defensa, velocidad y peso de la nave.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 08/04/2022
 */
public class NaveEspacial {
    /** Sistema de propulsion de la nave */
    private SistemaPropulsion sistemaPropulsion;
    /** Blindaje de la nave */
    private Blindaje blindaje;
    /** Cabina de la nave */
    private Cabina cabina;
    /** Armas de la nave */
    private Arma armas;
    /** Precio total de la nave considerando sus componentes */
    private float precio;
    /** Ataque total de la nave considerando sus componentes*/
    private float ataque;
    /** Defensa total de la nave considerando sus componentes*/
    private float defensa;
    /** Velocidad total de la nave considerando sus componentes*/
    private float velocidad;
    /** Peso total de la nave considerando sus componentes*/
    private float peso;

    /**
     * Método para obtener los sistemas de propulsion de la nave.
     * @return <code>SistemasPropulsion</code> -- Sistemas de propulsion de la nave.
     */
    public SistemaPropulsion sistemaPropulsion(){
        return sistemaPropulsion;
    }

    /**
     * Método para obtener el blindaje de la nave.
     * @return <code>Blindaje</code> -- Blindaje de la nave.
     */
    public Blindaje blindaje(){
        return blindaje;
    }

    /**
     * Método para obtener la cabina de la nave.
     * @return <code>Cabina</code> -- Cabina de la nave.
     */
    public Cabina cabina(){
        return cabina;
    }

    /**
     * Método para obtener las armas de la nave.
     * @return <code>Arma</code> -- Armas de la nave.
     */
    public Arma armas(){
        return armas;
    }

    /**
     * Método para obtener el precio total de la nave considerando sus componentes.
     * @return <code>float</code> -- Precio total de la nave.
     */
    public float precio(){
        return precio;
    }

    /**
     * Método para obtener el ataque total de la nave considerando sus componentes.
     * @return <code>float</code> -- Ataque total de la nave.
     */
    public float ataque(){
        return ataque;
    }

    /**
     * Método para obtener la defensa total de la nave considerando sus componentes.
     * @return <code>float</code> -- Defensa total de la nave.
     */
    public float defensa(){
        return defensa;
    }

    /**
     * Método para obtener la velocidad total de la nave considerando sus componentes.
     * @return <code>float</code> -- Velocidad total de la nave.
     */
    public float velocidad(){
        return velocidad;
    }

    /**
     * Método para obtener el peso total de la nave considerando sus componentes.
     * @return <code>float</code> -- Peso total de la nave.
     */
    public float peso(){
        return peso;
    }

    /**
     * Método para asignar el sistema de propulsion de la nave.
     * @param sistemaPropulsion -- Sistema de propulsion de la nave.
     */
    public void darSistemasPropulsion(SistemaPropulsion sistemaPropulsion){
        this.sistemaPropulsion = sistemaPropulsion;
    }

    /**
     * Método para asignar el blindaje de la nave.
     * @param blindaje -- Blindaje de la nave.
     */
    public void darBlindaje(Blindaje blindaje){
        this.blindaje = blindaje;
    }

    /**
     * Método para asginar la cabina de la nave.
     * @param cabina -- Cabina de la nave.
     */
    public void darCabina(Cabina cabina){
        this.cabina = cabina;
    }

    /**
     * Método apra asignar las armas de la nave.
     * @param armas -- Armas de la nave.
     */
    public void darArmas(Arma armas){
        this.armas = armas;
    }

    @Override
    public String toString(){
        return sistemaPropulsion.nombre()
            + "\n" + armas.nombre()
            + "\n" + cabina.nombre()
            + "\n" + blindaje.nombre()
            + "\nAtaque: " +ataque
            + "\nDefensa: " +defensa
            + "\nVelocidad: " +velocidad
            + "\nPeso: " +peso
            + "\nPrecio: " +precio;
    }

}
