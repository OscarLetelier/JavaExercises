package fase1.fundamentos;

import java.util.Scanner;

public class N6_CelciusAFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese Grados Celcius");
        double celcius = input.nextDouble();

        double resultado = ((celcius * 9.0 / 5.0) + 32);
        System.out.println("Los grados Fahrenheit son : "+resultado);
    }
}
