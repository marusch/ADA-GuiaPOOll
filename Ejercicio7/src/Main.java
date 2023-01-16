import entidades.Camion;
import entidades.Vehiculo;
import entidades.VehiculoDeportivo;
import entidades.VehiculoElectrico;

public class Main {
    public static void main(String[] args) {

        Vehiculo depor = new VehiculoDeportivo("Mercedes-Benz",2019,"Negro", 601);
        depor.Vehiculo();
        depor.FichaTecnica();

        System.out.println();

        Vehiculo electrico = new VehiculoElectrico("Tesla Model 3",2021,"Blanco", 222);
        electrico.Vehiculo();
        electrico.FichaTecnica();

        System.out.println();

        Vehiculo camion = new Camion("IVECO",2018,"Amarillo", 101);
        camion.Vehiculo();
        camion.FichaTecnica();

    }
}


