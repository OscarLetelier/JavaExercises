package fase1.one_fundamentos.clasesdowhile;

import java.util.Scanner;

public class FahrenheitACelcius {
    public static void ConversorDeFahretheitACelcius(){
        Scanner input = new Scanner(System.in);

        final int CONVERSOR = 32;
        System.out.println("Ingrese Grados Fahrentheit");
        double fahrentheit = input.nextDouble();

        double resultado = (fahrentheit - CONVERSOR) * 5/9;
        System.out.println("El grado Fahrentheit a Celcius es : "+resultado);
    }
}
