package entidades;

public class Carnivoro extends Animales{

    public Carnivoro() {
    }

    public Carnivoro(String animal, boolean peligro, int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void CrearAnimal() {
        super.CrearAnimal();
    }

    @Override
    public void TipoAnimal() {
        System.out.println("Es un animal carnivoro");
    }

    @Override
    public void Alimentacion() {
        System.out.println("Se alimentara de carnes");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Tipo de animal: " + animal + "\n" + "Peligro: " + peligro + "\n"
        + "Edad: " + edad);
    }
}
