import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Main {
    public static void main(String[] args) {

        //Declaracion del objeto PERRO
        Animal perro = new Perro("Jerry","Croquetas",2,"Pincher");
        perro.MostrarDatos();
        perro.Alimentarse();

        //Declaracion de otro objeto PERRO
        Perro perro1 = new Perro("Toddy", "Croquetas", 3, "Doberman");
        perro1.MostrarDatos();
        perro1.Alimentarse();

        //Declaracion del objeto GATO
        Animal gato = new Gato("Naranjoso", "Whiskas", 1, "Naranja");
        gato.MostrarDatos();
        gato.Alimentarse();

        //Declaracion del objeto CABALLO
        Animal caballo = new Caballo("Sparck","Pasto",25,"Fino");
        caballo.MostrarDatos();
        caballo.Alimentarse();

    }
}