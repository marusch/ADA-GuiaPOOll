package entidades;

public class Carnivoro extends Animales{

    public Carnivoro() {
    }

    public Carnivoro(String animal, boolean peligro, int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void TipoAnimal() {
        System.out.println("CARNIVORO");
    }

    @Override
    public void Alimentacion() {
        System.out.println("Se alimenta de carne");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Animal: " + animal + "\n" + "Peligro: " + peligro
                + "\n" + "Edad: " + edad);
    }
}
