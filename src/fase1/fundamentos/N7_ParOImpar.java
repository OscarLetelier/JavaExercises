package fase1.fundamentos;

import java.util.Scanner;

public class N7_ParOImpar {
    public static void main(String[] args) {
        System.out.println("Ingresa un Numero para Deteminar si este es Par o Impar : ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " El valor es Par");
        } else {
            System.out.println(number + " El valor es Impar");
        }
    }
}
