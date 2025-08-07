package fase2.estructura.datos.logica;

/*
Objetivo: Implementar una busqueda lineal para encontrar la primera ocurrencia de un valor
dentro de un array

Pide un número, búscalo en un array predefinido, indica el índice si este se encuentra o
informa si este no se encuentra dentro del array pre establecido.

Conceptos: Busqueda Lineal, Recorrido, Breack
 */

import java.util.Scanner;

public class N7_EncontrarElementoArray {
    public static void main(String[] args){


        // Scanner para leer el numero ingresado por el usuario.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea buscar dentro del array");
        int number = scanner.nextInt();

        //Array Predefinido
        int[] numbers = {1, 2, 3, 4, 5};

        // Busqueda Lineal
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number) {
                System.out.println("Numero encontrado en el indice: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Numero no encontrado dentro del array");
        }

        scanner.close();
    }
}
