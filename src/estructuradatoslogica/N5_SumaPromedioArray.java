package estructuradatoslogica;

/*
    Objetivo: Realizar calculos agregados (suma, promedio) sobre elementos de un array.
    Muy Comun para procesar colecciones y obtener estadisticas o resultados consolidados
    Dado un double[], calcula la suma total y el promedio
 */

import java.util.Scanner;

public class N5_SumaPromedioArray {
    public static void main(String[] args) {

        // Scanner para leer los datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        // Ingresar la cantidad de numeros a almacenar
        System.out.println("Ingrese la cantidad de numeros a almacenar: ");
        int cantidad = scanner.nextInt();

        // Validar si la cantidad es mayor que cero
        if (cantidad <= 0) {
            System.out.println("Cantidad no valida. Programa terminado");
            return;
        }

        // Creamos el array con el tamaño especificado
        double[] numbers = new double[cantidad];

        // Leemos los numeros y los guardamos dentro del array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calcular promedio y suma
        double suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }

        double promedio = suma / numbers.length;

        // Mostrar resultados
        System.out.println("\n Suma total: "+ suma);
        System.out.println("Promedio: "+ promedio);


        scanner.close();

    }
}
