package entidades;

public abstract class Animal {

    protected String nombre;
    protected String comida;
    protected int edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String comida, int edad, String raza) {
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
        this.raza = raza;
    }

    public abstract void Alimentarse();

    public void MostrarDatos(){
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad+ "\n" + "Raza: " + raza);
    }
}
