package fase1.one_fundamentos;

import java.util.Scanner;

public class N5_GeometriaSimpleTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la base del Triangulo");
        double base = input.nextDouble();

        System.out.println("Ingrese la altura del Triangulo");
        double altura = input.nextDouble();

        //Operacion
        double resultado = ((base * altura)/2);

        System.out.println("El area del traigulo es : "+resultado);
    }
}
