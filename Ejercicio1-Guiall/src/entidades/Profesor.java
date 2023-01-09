package entidades;

public class Profesor extends Persona{

    protected String materia;

    public Profesor() {
    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Profesor(String nombre, String apellido, int edad, String materia) {
        super(nombre, apellido, edad);
        this.materia = materia;
    }

    @Override
    public void Accion() {
        System.out.println("Soy profesor y enseño la materia de " + materia);
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Mi  nombre es: " + nombre + " " + apellido + "\n" + "Mi edad: " + edad);
    }
}
