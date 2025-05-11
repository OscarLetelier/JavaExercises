package estructuradatoslogica;

/*
Objetivo: Implementar un algoritmo simple para encontrar los valores extremos maximo y
minimo dentro de un array.

Encuentra el número más grande y más pequeño en un int[].
Guarda el max/min encontrado hasta ahora.

Conceptos: Recorrido, Comparación, Actualización Condicional.
 */

import java.util.Scanner;

public class N6_MaximoMinimoArray {
    public static void main(String[] args){

        // Scanner para leer los datos ingresados por el usuario.
        Scanner scanner = new Scanner(System.in);

        // Cantidad de números a almacenar
        System.out.println("Ingrese cuantos numeros desea almacenar: ");
        int amount = scanner.nextInt();

        // Validar si la cantidad es mayor que cero
        if (amount <= 0) {
            System.out.println("Cantidad no Valida, Debe Ingresar Valores Mayor o Igual a 0");
            System.out.println("Programa Terminado");
            return;
        }
        // Creamos Array con el tamaño especificado por el Usuario
        double[] numbers = new double[amount];

        // Leemos los numeros y los guardamos dentro del array creado
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numero " +(i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Se inicializa el minimo y el maximo con el primer valor del array
        double maximo = numbers[0];
        double minimo = numbers[0];

        // Se recorre el array para encontrar el maximo y minimo
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximo) {
                maximo = numbers[i];
            }
            if (numbers[i] < minimo) {
                minimo = numbers[i];
            }
        }

        System.out.println("El numero Maximo del Array Creado es: " + maximo);
        System.out.println("El numero Minimo del Array Creado es: " + minimo);
    }
}
