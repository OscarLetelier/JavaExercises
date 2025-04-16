package Oscar.fundamentos;

import java.util.Scanner;

// Deteminar si la persona puede ingresar, o si debe ingresar junto a un adulto

public class OperadoresLogicos {
    public static void main(String[] args) {

        int edadMinima = 14;

        Scanner input = new Scanner(System.in);
        System.out.println("Sistema para Ingresar a Pelicula");
        System.out.println("Ingresa su Edad : ");
        int edad = input.nextInt();

        if (edad < edadMinima){
            System.out.println("No puede Ingresar");
        } else if (edad == edadMinima && edad <= edadMinima) {
            System.out.println("Ud. puede Ingresar Junto a un Adulto");
        } else {
            System.out.println("Ud. puede ingresar");
        }
    }
}
