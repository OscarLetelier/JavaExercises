package estructura.datos.logica;


/*
Objetivo: Manipular String para verificar si son palindromos comparando caracteres en ambos extremos.

Pide una palabra, verifica si es palindromo, Compara charAt(0) con charAt(n-1), etc.
Opcional: ignora mayúsculas/minúsculas (toLowerCase()).

Conceptos Reforzados: String, length(), charAt(), bucles, comparación.

 */

import java.util.Scanner;

public class N9_Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una Palabra:");
        String palabra = scanner.nextLine();

        // Convertimos la palabra a minusculas para ignorar mayusculas/minusculas
        palabra = palabra.toLowerCase();

        boolean esPalindromo = true;
        int n = palabra.length();

        // Comparamos caracteres desde ambos extremos hacia el centro
        for (int i = 0; i < n / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(n - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        // Mostrar Resultado
        if(esPalindromo){
            System.out.println("La palabra \"" + palabra + "\" es un palindromo." );
        } else {
            System.out.println("La palabra \"" + palabra + "\" no un palindromo." );
        }

        scanner.close();
    }
}
