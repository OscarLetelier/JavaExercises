package fase1.one_fundamentos;

import java.util.Scanner;

public class N3_OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el primer Numero : ");
        int num1 = input.nextInt();

        System.out.println("Ingresa el Segundo numero :");
        int num2 = input.nextInt();

        // Operaciones
        System.out.println("Suma : "+(num1 + num2));
        System.out.println("Resta : "+(num1 - num2));
        System.out.println("Multiplicación : "+(num1 * num2));
        System.out.println("Division : "+(num1 / num2));
        System.out.println("Modulo : "+(num1 % num2));
    }
}
