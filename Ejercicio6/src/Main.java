import entidades.Producto;
import entidades.ProductoEnvasado;
import entidades.ProductoFresco;

public class Main {
    public static void main(String[] args) {

        //Delcaracion del objeto Producto1 - Envasado
        Producto producto1 = new ProductoEnvasado("Natura",200,99,"Aceite");
        producto1.Informacion();

        //Delcaracion del objeto Producto2 - Fresco
        Producto producto2 = new ProductoFresco("Paulina", 140, 22, "Pastas");
        producto2.Informacion();

    }
}