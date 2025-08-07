package fase3.paradigma.orientada.objetos;

/*
Objetivo: Definir una clase simple con atributos y métodos, y crear instancias (objetos).
diferenciar clase (plano) y objeto (instancia)

Crea class Coche (marca, modelo, velActual) Metodos acelerar(), frenar(), obtenerVelocidad(), mostrarInfor(),
crear dos objetos Coche y sus metodos.

Conceptos reforzados class, atributos, metodos, constructor, new, this.

 */

public class N1_Coche {
    // Atributos
    String marca;
    String modelo;
    int velActual;

    // Constructor
    public N1_Coche(String marca, String modelo, int velActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velActual = velActual;
    }

    // Metodo para Acelerar el Coche
    public void acelerar(int incremento) {
        this.velActual += incremento;
        System.out.println("Acelerando " + incremento + " km/h.");
    }

    // Metodo para Frenar
    public void frenar(int decremento) {
        this.velActual -= decremento;
        if(this.velActual < 0) {
            this.velActual = 0;
        }
        System.out.println("Frenando " + decremento + " km/h.");
    }

    // Metodo apra obtener la velocidad actual
    public int obtenerVelocidad(){
        return this.velActual;
    }

    // Metodo para mostrar la informacion del coche
    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad Actual: " + this.velActual + " km/h");
    }
}
