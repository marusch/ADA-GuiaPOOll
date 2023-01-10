package entidades;

public class Herbivoros extends Animales{

    public Herbivoros() {
    }

    public Herbivoros(String animal, boolean peligro, int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void CrearAnimal() {
        super.CrearAnimal();
    }

    @Override
    public void TipoAnimal() {
        System.out.println("Es un animal herbivoro");
    }

    @Override
    public void Alimentacion() {
        System.out.println("Se alimentara de plantas");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Es un/a: " + animal + "\n" + "Peligro: " + peligro + "\n"
                + "Edad: " + edad);
    }
}
