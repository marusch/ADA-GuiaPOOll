package entidades;

public class NoPerecedero extends Alimento{

    protected int precio;

    public NoPerecedero() {
    }

    public NoPerecedero(int precio) {
        this.precio = precio;
    }

    public NoPerecedero(String nombre, String marca, String rangoPrecio, int precio) {
        super(nombre, marca, rangoPrecio);
        this.precio = precio;
    }

    @Override
    public void TipoAlimento() {
        System.out.println("Producto: " + nombre + "\n" + "Marca: " + marca + "\n"
                + "Rango de precio: " + rangoPrecio + "\n" + "Precio: " + precio);
    }
}
