package fundamentos;

// Calcula el área de un círculo (πr2). Usa Math.PI y Math.pow().
import java.util.Scanner;

public class N5_GeometriaSimpleCirculo {
    public static void main(String[] args) {
        System.out.println("Calculo del Area de un Circulo");
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el Radio del Circulo");
        double radio = input.nextDouble();

        // Operación
        double resultado = (Math.PI * Math.pow(radio, 2));

        // Mostrar Resultado
        System.out.println("El area del Circulo de radio : "+radio+
                " es igual a : "+resultado);
    }
}
