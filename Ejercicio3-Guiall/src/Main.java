import entidades.NoPerecedero;
import entidades.Perecedero;

public class Main {
    public static void main(String[] args) {

        Perecedero alimento1 = new Perecedero("Arroz", "Amanda", "Accesible", 200);
        alimento1.TipoAlimento();

        NoPerecedero alimento2 = new NoPerecedero("Muslo","Cofra","Accesible", 350);
        alimento2.TipoAlimento();
    }
}