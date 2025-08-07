package fase1.fundamentos.clasesdowhile;

import java.util.Scanner;

public class GeometriaSimpleCuadrado {
    public static void CalcularAreaCuadrado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrse la medida de uno de los lados del rectangulo : ");

        double lado = input.nextDouble();

        double resultado = (lado * lado);

        System.out.println("El area de un cuadrado es igual a : "+resultado);
    }
}
