/**
 * Clase que simula la fusión de las empresas de WaySub y Las Pizzas de Don Canrejo.
 * 
 * @author Adrian Aguilera Moreno - Aguiler450
 * @author Rosas Franco Diego Angel - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version 1.0 - 31/03/2022
 */
public class WaySubXLasPizzasDeDonCangrejo {
    private Platillo listaPizzas[];

    public WaySubXLasPizzasDeDonCangrejo(Queso queso, Carne carne, Masa masa){
        this.listaPizzas = new Platillo[3];

        // Se crean las Pizzas por defecto
        listaPizzas[0] = new AdapterPizza(new Pizza(new QuesoChedar(), new CarnePollo(), new MasaGruesa()));

        listaPizzas[1] = new AdapterPizza(new Pizza(new QuesoManchego(), new CarneJamon(), new MasaGruesa()));

        listaPizzas[2] = new AdapterPizza(new Pizza(new QuesoChedar(), new CarneSalchicha(), new MasaDelgada()));

    }

    public Platillo pedirBaguette(){

    }

}
