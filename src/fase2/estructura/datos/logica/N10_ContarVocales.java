package fase2.estructura.datos.logica;

/*
Objetivo: Recorrer un String y contar ocurrencias de ciertos caracteres (vocales)
utilizando condicionales

Pide una frase, cuenta las vocales (a, e, i, o, u, mayusculas y mininusculas).
para esto puedes usa switch o un if con ||.

Conceptos Reforzados: String, charAt(), bucles, switch o if-else if, contadores.

 */

import java.util.Scanner;


public class N10_ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir una frase al usuario
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        //Contadores para cada vocal
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        //Recorrer la frase carácter por carácter
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i); // Obtener el caracter en la posicion i

            // Compara usando if-else if con ||
            if (c == 'a' || c == 'A') {
                contadorA++;
            } else if (c == 'e' || c == 'E') {
                contadorE++;
            } else if (c == 'i' || c == 'I') {
                contadorI++;
            } else if (c == 'o' || c == 'O') {
                contadorO++;
            } else if (c == 'u' || c == 'U') {
                contadorU++;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de Vocales: ");
        System.out.println("A/a: " + contadorA);
        System.out.println("E/e: " + contadorE);
        System.out.println("I/i: " + contadorI);
        System.out.println("O/o: " + contadorO);
        System.out.println("U/u: " + contadorU);

        scanner.close();
    }
}
