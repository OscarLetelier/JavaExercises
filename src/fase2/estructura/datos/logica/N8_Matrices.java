package fase2.estructura.datos.logica;

/*
Objetivo: Trabajar con arrays de dos dimensiones (matrices) para representar datos tabulares y operar con ellos.

Crea dos matrices int[3][3]. Llenalas, Calcula la matriz suma (Cij = Aij + Bij). Muestra el resultado

Conceptos Reforzados: Arrays Bidimensionales, bucles anidados, acceso MATRIZ[FILA][COLUMNA]
 */

import java.util.Scanner;

public class N8_Matrices {
    public static void main(String[] args){

        // Creamos dos Matrices
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];

        // Scanner para llenar las matrices
        Scanner number = new Scanner(System.in);

        // Llamado a la Matriz A
        System.out.println("Introduce los valores para la matriz A: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = number.nextInt();
            }
        }


        // LLamado a la Matriz B
        System.out.println("\nIntroduce los valores para la matriz B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = number.nextInt();
            }
        }

        // Calcular la Matriz Suma C
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }


        // Mostrar la Matriz
        System.out.println("\nMatriz suma C:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        number.close();
    }
}
