
package sistema.de.calificaciones_matriz;


public class SistemaDeCalificaciones_Matriz{
    public static void main(String[] args) {
        // Matriz: [estudiantes][asignaturas]
        String[] estudiantes = {"Ana", "Carlos", "Maria", "Juan"};
        String[] asignaturas = {"Matematicas", "Fisica", "Quimica"};

        double[][] calificaciones = {
            {85.5, 90.0, 88.5}, // Ana
            {78.0, 82.5, 80.0}, // Carlos
            {92.0, 95.5, 93.0}, // Maria
            {88.5, 85.0, 87.5}  // Juan
        };

        System.out.println("=== REPORTE DE CALIFICACIONES ===\n");

        // Encabezado
        System.out.printf("%-10s", "Estudiante");
        for (String asignatura : asignaturas) {
            System.out.printf("%15s", asignatura);
        }
        System.out.printf("%15s%n", "Promedio");
        System.out.println("------------------------------------------------------------------");

        // Datos de cada estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("%-10s", estudiantes[i]);
            double suma = 0;
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.printf("%15.1f", calificaciones[i][j]);
                suma += calificaciones[i][j];
            }
            double promedio = suma / asignaturas.length;
            System.out.printf("%15.1f%n", promedio);
        }

        // Promedios por asignatura
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s", "Promedio");
        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;
            for (int i = 0; i < estudiantes.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / estudiantes.length;
            System.out.printf("%15.1f", promedio);
        }
        System.out.println();
    }
}