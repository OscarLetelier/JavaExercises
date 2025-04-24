package estructuradatoslogica;
/*
    Calcular N! = N * (N-1) x...x1 Pide N al usuario.
    Usando un bucle for o while. considera el caso base (0! = 1).

    Este caso de utilizacion for
 */

import java.util.Scanner;

public class N1_CalculosRecursivos2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero para realizar su calculo factorial");
        int N = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de : "+ N +" es: "+ factorial);
    }
}
