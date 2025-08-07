package fase3.paradigma.orientada.objetos;

/*
Objetivo: Sobrescribir toScring() para dar una representación textual util
de un objeto.

Crea una clase Estudiante (nombre, id, ArrayList<Double> calificaciones).
Sobrescribe @Override public String toString() para devolver algo legible.

Conceptos Reforzados:
@Override, toString(), ArrayList basico.
 */

import java.util.ArrayList;

public class N3_Estudiante {
    // Atributos
    private String nombre;
    private String id;
    private ArrayList<Double> calificaciones;

    // Constructor
    public N3_Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.calificaciones = new ArrayList<>();
    }

    // Metodo para agregar una calificacion
    public void agregarCalificacion(double nota) {
        calificaciones.add(nota);
    }

    // Sobrescribimos toString() para mostrar info util

    @Override
    public String toString() {
        return "Estudiante: " + nombre +
                "\nID: " + id +
                "\nCalificaciones: " + calificaciones.toString();
    }
}
