package entidades;

public class ProductoEnvasado extends Producto{

    protected String tipo;

    public ProductoEnvasado() {
    }

    public ProductoEnvasado(String tipo) {
        this.tipo = tipo;
    }

    public ProductoEnvasado(String marca, int stock, int ventas, String tipo) {
        super(marca, stock, ventas);
        this.tipo = tipo;
    }

    @Override
    public void Informacion() {
        System.out.println("PRODUCTO ENVASADO - Marca: " + marca + "\n" + "Stock: " + stock + "\n"
                + "Ventas: " + ventas + "\n" + "Tipo: " + tipo);
    }
}
