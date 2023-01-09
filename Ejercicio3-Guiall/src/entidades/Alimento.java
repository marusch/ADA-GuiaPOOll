package entidades;

public abstract class Alimento {

    protected String nombre;
    protected String marca;
    protected String rangoPrecio;

    public Alimento() {
    }

    public Alimento(String nombre, String marca, String rangoPrecio) {
        this.nombre = nombre;
        this.marca = marca;
        this.rangoPrecio = rangoPrecio;
    }

    public abstract void TipoAlimento();
}
