package estructura.datos.logica;

import java.util.Scanner;

public class N10_ContarVocales2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la frase al usuario
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Contadores para cada vocal
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        // Recorrer la frase letra por letra
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Evaluar cada carácter usando switch
            switch (c) {
                case 'a':
                case 'A':
                    contadorA++;
                    break;
                case 'e':
                case 'E':
                    contadorE++;
                    break;
                case 'i':
                case 'I':
                    contadorI++;
                    break;
                case 'o':
                case 'O':
                    contadorO++;
                    break;
                case 'u':
                case 'U':
                    contadorU++;
                    break;
                default:
                    // No hacer nada si no es vocal
                    break;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de vocales encontradas:");
        System.out.println("A/a: " + contadorA);
        System.out.println("E/e: " + contadorE);
        System.out.println("I/i: " + contadorI);
        System.out.println("O/o: " + contadorO);
        System.out.println("U/u: " + contadorU);

        scanner.close();
    }
}
