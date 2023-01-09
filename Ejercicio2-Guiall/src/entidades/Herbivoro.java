package entidades;

public class Herbivoro extends Animales{

    public Herbivoro() {
    }

    public Herbivoro(String animal, boolean peligro, int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void TipoAnimal() {
        System.out.println("HERBIVORO");
    }

    @Override
    public void Alimentacion() {
        System.out.println("Se alimenta de plantas silvestres");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Animal: " + animal + "\n" + "Peligro: " + peligro
                + "\n" + "Edad: " + edad);
    }
}
