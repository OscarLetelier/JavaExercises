package fase1.fundamentos;

import java.util.Scanner;

public class N8_BucleFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de ciclos a Iterar : ");

        int i = scanner.nextInt();
        int j; // Iterador

        for(j = 1; j <= i; j++){
            System.out.println("Se muestra la cantidad de iteraciones deseadas : "+j);
        }
    }
}
