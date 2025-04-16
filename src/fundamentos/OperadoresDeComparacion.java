package fundamentos;

import java.util.Scanner;

public class OperadoresDeComparacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese Primer numero a Comparar : ");
        int num1 = input.nextInt();

        System.out.println("Ingrese Segundo numero a Comparar : ");
        int num2 = input.nextInt();

        // Comparacion
        System.out.println("El numero 1 es menor que el numero 2 : "+(num1 < num2));
        System.out.println("El numero 1 es menor o igual que el numero 2 : "+(num1 <= num2));
        System.out.println("El numero 1 es mayor que el numero 2 : "+(num1 > num2));
        System.out.println("El numero 1 es mayor o igual que el numero 2 : "+(num1 >= num2));
        System.out.println("El numero 1 es igual que el numero 2: "+(num1 == num2));
        System.out.println("El numero 1 es distinto al numero 2: "+(num1 != num2));
    }
}
