package fase1.fundamentos;

import fase1.fundamentos.clasesdowhile.CelciusAFahrenheit;
import fase1.fundamentos.clasesdowhile.FahrenheitACelcius;
import fase1.fundamentos.clasesdowhile.GeometriaSimpleCirculo;
import fase1.fundamentos.clasesdowhile.GeometriaSimpleCuadrado;

import java.util.Scanner;

public class N10_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido a Menu de Funciones Basicas en Java");
            System.out.println("1. Calculo del Area de un Circulo");
            System.out.println("2. Calculo del Area de un Cuadrado");
            System.out.println("3. Calculo de Celcius a Fahrenheit");
            System.out.println("4. Calculo de Fahrenheit a Celcius");
            System.out.println("5. Salir de la Aplicación");

            System.out.println("Selecicona la opción que deseas utilizar: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al Calulo de Area de Circulo");
                    GeometriaSimpleCirculo.CalcularAreaCirculo();
                    break;

                case 2:
                    System.out.println("Bienvenido al Calculo de Area de Cuadrado");
                    GeometriaSimpleCuadrado.CalcularAreaCuadrado();
                    break;

                case 3:
                    System.out.println("Bienvenido al Calculo de Celcius a Fahrenheit");
                    CelciusAFahrenheit.ConversorDeCelciusAFahrenheit();
                    break;

                case 4:
                    System.out.println("Bienvenido al calculo de Fahrenheit a Celcius");
                    FahrenheitACelcius.ConversorDeFahretheitACelcius();
                    break;

                case 5:
                    System.out.println("Saliendo del Menu");
                    break;

                default:
                    System.out.println("La opcion indicada no es valida...");
                    break;
            }
        } while (opcion != 5);
    }
}
