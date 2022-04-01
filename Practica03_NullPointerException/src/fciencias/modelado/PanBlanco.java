/**
 * Clase que simula un pan de baguette blanco.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 28/03/2022
 */
public class PanBlanco extends PanBaguette{
    /** Precio del pan de baguette blanco, o bien el precio inicial*/
    protected float precio;
    /** Tipo de pan */
    protected String tipoPan;

    public PanBlanco(){
        precio = 19.99f;
        tipoPan = "Pan Blanco";
    }
}