package entidades;

public class Alumno extends Persona{

    protected int añoAcademico;

    public Alumno() {
    }

    public Alumno(int añoAcademico) {
        this.añoAcademico = añoAcademico;
    }

    public Alumno(String nombre, String apellido, int edad, int añoAcademico) {
        super(nombre, apellido, edad);
        this.añoAcademico = añoAcademico;
    }

    @Override
    public void Accion() {
        System.out.println("Vengo a estudiar...");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("Mi  nombre es: " + nombre + " " + apellido + "\n" + "Mi edad: " + edad
        +"\n" + "Mi año academico: " + añoAcademico);
    }
}
