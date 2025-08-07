package fase1.one_fundamentos.clasesdowhile;

import java.util.Scanner;

public class GeometriaSimpleCirculo {
    public static void CalcularAreaCirculo(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el Radio del Circulo");
        double radio = input.nextDouble();

        double resultado = (Math.PI * Math.pow(radio, 2));

        System.out.println("El area del Circulo de radio : "+radio+" Es igual a : "+resultado);
    }
}
