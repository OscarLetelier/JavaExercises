package paradigma.orientada.objetos;

public class N1_Coche1 {
    public static void main(String [] args) {
        // Crear dos objetos (instancias) de coche
        N1_Coche coche1 = new N1_Coche("Toyota", "Corolla", 0);
        N1_Coche coche2 = new N1_Coche("Ford", "Mustang", 10);

        // Utilizar Metodos para el primer coche
        coche1.mostrarInfo();
        coche1.acelerar(50);
        coche1.frenar(20);
        System.out.println("Velocidad actual del coche1: " + coche1.obtenerVelocidad());

        // Utilizar Metodos para el segundo coche
        coche2.mostrarInfo();
        coche2.acelerar(70);
        coche2.frenar(30);
        System.out.println("Velocidad actual del coche2: " + coche2.obtenerVelocidad());

    }
}
