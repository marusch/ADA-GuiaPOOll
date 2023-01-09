package entidades;

public abstract class Animales {

    protected String animal;
    protected boolean peligro;
    protected int edad;

    public Animales() {
    }

    public Animales(String animal, boolean peligro, int edad) {
        this.animal = animal;
        this.peligro = peligro;
        this.edad = edad;
    }

    public abstract void TipoAnimal();
    public abstract void Alimentacion();
    public abstract void MostrarDatos();
}
