package estructura.datos.logica;

/*
    Pide un número. Determina si es primo (Solo es divisible por 1
    y por sí mismo). Usa un bucle para probar divisores y una variable boolean
 */


import java.util.Scanner;

public class N2_NumeroPrimo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean esPrimo = true;

        System.out.println("Ingresa un numero : ");
        int N = input.nextInt();


        if (N <= 0) {
            esPrimo = false;
        } else {
            for (int i = 2; i < N; i++ ) {
                if (N % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero "+ N + " es primo");
        } else {
            System.out.println("El numero "+ N + " no es primo");
        }

    }
}
