package entidades;

import java.util.Scanner;

public abstract class Animales {

    protected String animal;
    protected boolean peligro = false; //inicializar el booleano en false
    protected int edad;
    protected char aux;

    public Animales(){

    }
    public Animales(String animal, boolean peligro, int edad) {
        this.animal = animal;
        this.peligro = peligro;
        this.edad = edad;
    }
    
    public void CrearAnimal(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Que animal es?");
        animal = input.nextLine();

        System.out.println("¿Cual es su edad?");
        edad = input.nextInt();

        System.out.println("De que se alimentaria: c = carnivoro o h = herbivoro");
        aux = input.next().charAt(0);

        if (aux == 'c') {
            peligro = true; //cambiar el valor para medir el peligro
            System.out.println("El animal es peligroso -" + peligro); //pueden quitar de aca la variable ya que es solo de prueba
        } else if (aux == 'h') {
            System.out.println("El animal no es peligroso -" + peligro);
        }
    }
    
    public abstract void TipoAnimal();
    public abstract void Alimentacion();
    public abstract void MostrarDatos();
}
