package entidades;

public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de pasto");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("CABALLO: ");
        super.MostrarDatos();
    }
}
