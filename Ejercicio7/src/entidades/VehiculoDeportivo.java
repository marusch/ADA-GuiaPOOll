package entidades;

public class VehiculoDeportivo extends Vehiculo{

    protected int rpm;

    public VehiculoDeportivo() {
    }

    public VehiculoDeportivo(int rpm) {
        this.rpm = rpm;
    }

    public VehiculoDeportivo(String marca, int modelo, String color, int rpm) {
        super(marca, modelo, color);
        this.rpm = rpm;
    }

    @Override
    public void Vehiculo() {
        System.out.println("VEHICULO DEPORTIVO");
    }

    @Override
    public void FichaTecnica() {
        if (rpm == 0 || rpm <=50) {
            super.FichaTecnica();
            System.out.println("Rpm: " + rpm);
            System.out.println("El auto es muy bonito, pero solo sirve para salir a pasear");
        } else if (rpm ==51 || rpm<=300) {
            super.FichaTecnica();
            System.out.println("Rpm: " + rpm);
            System.out.println("Con este auto puedes desafiar a cualquiera en la pista");
        } else if (rpm == 301 || rpm <= 600) {
            super.FichaTecnica();
            System.out.println("Rpm: " + rpm);
            System.out.println("Si tienes este auto, debe considerar participar en NASCAR");
        } else if (rpm<=601) {
            super.FichaTecnica();
            System.out.println("Rpm: " + rpm);
            System.out.println("¿Eres parte del elenco de rápidos y furiosos?");
        }
    }
}
