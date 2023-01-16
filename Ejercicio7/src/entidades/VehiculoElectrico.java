package entidades;

public class VehiculoElectrico extends Vehiculo {

    protected int potencia;

    public VehiculoElectrico() {
    }

    public VehiculoElectrico(int potencia) {
        this.potencia = potencia;
    }

    public VehiculoElectrico(String marca, int modelo, String color, int potencia) {
        super(marca, modelo, color);
        this.potencia = potencia;
    }

    @Override
    public void Vehiculo() {
        System.out.println("VEHICULO ELECTRICO");
    }

    @Override
    public void FichaTecnica() {
        if (modelo <= 2007) {
            System.out.println("No existe modelo para este año");
        } else {
            super.FichaTecnica();
            System.out.println("Potencia: " + potencia  + "\n" + "¡Es un auto de ultima tecnologia!");
        }
    }
}
