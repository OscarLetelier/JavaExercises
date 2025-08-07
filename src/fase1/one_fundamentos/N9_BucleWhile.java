package fase1.one_fundamentos;
/*
🎯 Objetivo Específico: Implementar bucles que se repiten mientras una condición sea verdadera.
💡 Por qué es importante: Perfecto cuando no sabes cuántas iteraciones, pero sí cuándo parar (ej: hasta input válido, mientras haya datos).
📝 Instrucciones: Pide N. Calcula la suma
 usando while. Necesitas contador y acumulador.
🔑 Conceptos Reforzados: Bucle while, contadores, acumuladores, condición de parada.
 */


import java.util.Scanner;

public class N9_BucleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrsa el numero N : ");
        int N = scanner.nextInt();

        int contador = 1; //Contador Inicia desde 1
        int suma = 0; // Acumulador que inicia en 0

        //Bucle mientra contador sea menor o igual a N
        while (contador <= N) {
            suma += contador;
            contador++;
        }

        System.out.println("La suma de 1 hasta " + N + " es : "+ suma);
    }
}