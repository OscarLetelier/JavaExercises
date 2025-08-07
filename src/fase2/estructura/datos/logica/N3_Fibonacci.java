package fase2.estructura.datos.logica;

/*
   Genera los primeros N números de Fibonacci (0, 1, 1, 2, 3, 5...).
   Necesitas variables para guardar los dos números anteriores.
 */

import java.util.Scanner;

public class N3_Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Cuántos términos de Fibonacci quieres generar? ");
            int N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("Por favor, ingresa un número positivo.");
                return;
            }

            int a = 0, b = 1;

            System.out.println("Secuencia Fibonacci:");
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    System.out.print(a + " ");
                } else if (i == 1) {
                    System.out.print(b + " ");
                } else {
                    int siguiente = a + b;
                    System.out.print(siguiente + " ");
                    a = b;          // Actualizar estado
                    b = siguiente;  // para la siguiente iteración
                }
            }

            scanner.close();
        }
}

