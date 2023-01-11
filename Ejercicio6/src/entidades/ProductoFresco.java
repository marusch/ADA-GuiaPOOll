package entidades;

public class ProductoFresco extends Producto{

    protected String clase;

    public ProductoFresco() {
    }

    public ProductoFresco(String clase) {
        this.clase = clase;
    }

    public ProductoFresco(String marca, int stock, int ventas, String clase) {
        super(marca, stock, ventas);
        this.clase = clase;
    }

    @Override
    public void Informacion() {
        System.out.println("PRODUCTO FRESCO - Marca: " + marca + "\n" + "Stock: " + stock +
                "\n" + "Ventas:" + ventas + "\n" + "Clase: " + clase);
    }
}
