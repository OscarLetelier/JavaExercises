package fundamentos;

import java.util.Scanner;

public class FahrenheitACelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int CONVERSOR = 32;

        System.out.println("Ingrese Grados Fahrentheit");
        double fahrenheit = input.nextDouble();

        double resultado = (fahrenheit - CONVERSOR) * 5/9;
        System.out.println("El grado fahrenheit a celsius es : "+resultado);
    }
}
