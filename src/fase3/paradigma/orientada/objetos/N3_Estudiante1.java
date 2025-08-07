package fase3.paradigma.orientada.objetos;

public class N3_Estudiante1 {
    public static void main(String[] args) {
        N3_Estudiante estudiante1 = new N3_Estudiante("Oscar Letelier", "A001");

        // Agregar Calificaciones
        estudiante1.agregarCalificacion(9.5);
        estudiante1.agregarCalificacion(8.7);
        estudiante1.agregarCalificacion(10.0);

        // Mostar el objeto (se ejecuta toString automaticamente)
        System.out.println(estudiante1);
    }
}
