package fundamentos;

import java.util.Scanner;

public class GeometriaSimpleRectangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el largo del rectangulo");
        double largo = input.nextDouble();

        System.out.println("Ingrese el ancho del rectangulo");
        double ancho = input.nextDouble();

        //Operacion,
        double resultado = (largo * ancho);

        //Mostrar Resultado
        System.out.println("El area del rectangulo es : "+resultado);
    }
}
