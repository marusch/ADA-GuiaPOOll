import entidades.Carnivoro;
import entidades.Herbivoros;

public class Main {
    public static void main(String[] args) {

        Carnivoro leon = new Carnivoro();
        leon.CrearAnimal();
        leon.Alimentacion();
        leon.TipoAnimal();
        leon.MostrarDatos();


        Herbivoros ardilla = new Herbivoros();
        ardilla.CrearAnimal();
        ardilla.Alimentacion();
        ardilla.TipoAnimal();
        ardilla.MostrarDatos();
    }
}