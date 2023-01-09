import entidades.Alumno;
import entidades.Persona;
import entidades.Profesor;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Maru", "Schuindt", 28, 2022);
        alumno.MostrarDatos();
        alumno.Accion();

        Profesor profesor = new Profesor("Fer", "Silvero", 28, "Ingles");
        profesor.MostrarDatos();
        profesor.Accion();

    }
}