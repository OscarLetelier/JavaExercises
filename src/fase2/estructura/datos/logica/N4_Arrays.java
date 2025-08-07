package fase2.estructura.datos.logica;

/*
    Aprender a declarar, inicializar y recorrer arrays unidimensionales de tamaño fijo.
    Pide 5 enteros y guárdalos. Luego, muéstralos.
 */

import java.util.Scanner;

public class N4_Arrays {
    public static void main(String[] args) {

        //Declaracion y creacion del array de tamaño fijo 5
        int[] number = new int[5];

        // Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos: Pide 5 enteros
        System.out.println("Introduce 5 numeros Enteros");
        for (int i = 0; i < number.length; i++){
            System.out.println("Numero " + ( i + 1 ) + ": ");
            number[i] = scanner.nextInt(); // Guarda los numeros en el array
        }

        // Salida de datos: Mostrar los valores guardados en el array
        for (int i = 0; i < number.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " +number[i]);
        }

        scanner.close();
    }
}
