package fundamentos.clasesdowhile;

import java.util.Scanner;

public class CelciusAFahrenheit {
    public static void ConversorDeCelciusAFahrenheit(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrsa Grados Celcius");
        double celcius = input.nextDouble();

        double resultado = ((celcius * 9.0 / 5.0) + 32);
        System.out.println("Los grados Fahrenheit son : "+resultado);
    }
}
