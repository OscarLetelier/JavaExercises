package fundamentos;

import java.util.Scanner;

public class N5_GeometriaSimpleCuadrado {
    public static void main(String[] args) {
        System.out.println("Calculo del Area de un Cuadrado");
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la medida de uno de " +
                "los lados del rectangulo");

        double lado = input.nextDouble();

        //Operacion
        double resultado = (lado * lado);

        //Resultado
        System.out.println("El area de un cuadrado es igual a : "+resultado);
    }
}
