package entidades;

public class Camion extends Vehiculo{

    protected int CargaMaxima;

    public Camion() {
    }

    public Camion(int cargaMaxima) {
        CargaMaxima = cargaMaxima;
    }

    public Camion(String marca, int modelo, String color, int cargaMaxima) {
        super(marca, modelo, color);
        CargaMaxima = cargaMaxima;
    }

    @Override
    public void Vehiculo() {
        System.out.println("CAMION");
    }

    @Override
    public void FichaTecnica() {
        if (CargaMaxima <= 100) {
            super.FichaTecnica();
            System.out.println("Carga Maxima: " + CargaMaxima);
            System.out.println("Para iniciar un negocio de flete, está muy bien este vehiculo");
        } else if (CargaMaxima >=101) {
            super.FichaTecnica();
            System.out.println("Carga Maxima: " + CargaMaxima);
            System.out.println("¡¡Tienes que usar este vehiculo en el campo, es una máquina de trabajo!!");
        }

    }
}
