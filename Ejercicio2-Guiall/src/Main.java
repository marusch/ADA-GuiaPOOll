import entidades.Carnivoro;
import entidades.Herbivoro;

public class Main {
    public static void main(String[] args) {

        Carnivoro leon = new Carnivoro("Leon", true, 2);
        leon.TipoAnimal();
        leon.Alimentacion();
        leon.MostrarDatos();

        Herbivoro ardilla = new Herbivoro("Ardilla", false, 3);
        ardilla.TipoAnimal();
        ardilla.Alimentacion();
        ardilla.MostrarDatos();


    }
}