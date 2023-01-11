package entidades;

public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de croquetas");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("PERRO: ");
        super.MostrarDatos();
    }
}
