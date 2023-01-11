package entidades;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de Whiskas");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("GATO: ");
        super.MostrarDatos();
    }
}
