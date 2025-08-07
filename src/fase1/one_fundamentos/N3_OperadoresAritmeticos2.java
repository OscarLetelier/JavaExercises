package fase1.one_fundamentos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class N3_OperadoresAritmeticos2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el Primer Numero");
        int num1 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el Segundo Numero");
        int num2 = Integer.parseInt(reader.readLine());

        //Operaciones
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + ((num2 != 0) ? (num1 / num2) : "No se puede dividir entre cero"));
        System.out.println("Módulo: " + ((num2 != 0) ? (num1 % num2) : "No se puede obtener módulo de cero"));

    }
}
