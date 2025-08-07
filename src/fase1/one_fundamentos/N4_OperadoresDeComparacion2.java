package fase1.one_fundamentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4_OperadoresDeComparacion2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer valor a comparar");
        int num1 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el segundo valor a comparar");
        int num2 = Integer.parseInt(reader.readLine());

        // Comparaciones
        System.out.println("El numero 1 es menor que el numero 2 : "+(num1 < num2));
        System.out.println("El numero 1 es menor o igual que el numero 2 : "+(num1 <= num2));
        System.out.println("El numero 1 es mayor que el numero 2 : "+(num1 > num2));
        System.out.println("El numero 1 es mayor o igual que el numero 2 : "+(num1 >= num2));
        System.out.println("El numero 1 es igual que el numero 2: "+(num1 == num2));
        System.out.println("El numero 1 es distinto al numero 2: "+(num1 != num2));
    }
}
