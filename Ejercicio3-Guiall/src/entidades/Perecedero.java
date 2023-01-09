package entidades;

public class Perecedero extends Alimento{

    protected int precio;

    public Perecedero() {
    }

    public Perecedero(int precio) {
        this.precio = precio;
    }

    public Perecedero(String nombre, String marca, String rangoPrecio, int precio) {
        super(nombre, marca, rangoPrecio);
        this.precio = precio;
    }

    @Override
    public void TipoAlimento() {
        System.out.println("Producto: " + nombre + "\n" + "Marca: " + marca + "\n"
                + "Rango de precio: " + rangoPrecio + "\n" + "Precio: " + precio);
    }
}
