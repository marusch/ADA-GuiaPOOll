package entidades;
import java.util.Scanner;

public class CalcularArea extends FiguraGeometrica{

    public CalcularArea() {
    }

    public CalcularArea(String figura, int area, int base, int altura, double PI, int radio) {
        super(figura, area, base, altura, PI, radio);
    }

    public void Eleccion(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Que figura desea: 1-Triangulo, 2-Rectangulo, 3-Circulo, 4-Ninguna");
        int figura = input.nextInt();

        switch (figura){
            case 1 :
                System.out.println("Ingrese el valor de la base");
                base = input.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura = input.nextInt();

                System.out.println("Triangulo" +"\n" + "Los valores de la operacion son- base: " + base + " *" +
                        "valor de la altura: " + altura + " y /2");

                area = (base * altura)/2;
                break;

            case 2 :
                System.out.println("Ingrese el valor de la base");
                base = input.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura = input.nextInt();

                System.out.println("Rectangulo" + "\n" + "Los valores de la operacion son- base: " + base
                        + " * altura: " + altura);

                area = base * altura;
                break;

            case 3:
                System.out.println("Ingrese el valor del radio");
                radio = input.nextInt();

                System.out.println("Circulo" + "\n" + "Los valores de la operacion son- radio: " + radio +
                        " elevado al cuadrado, multiplicado por PI: " + PI);

                area = (int) (Math.pow(radio,2) * PI);

            case 4:
                System.out.println("Fin");
        }
    }

    @Override
    public void area() {
        System.out.println("El resultado del area es: " + area);
    }

}
