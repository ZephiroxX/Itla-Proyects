
package ejercicio2_biblioteca;


public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "978-0132350884");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupery"); // Usa la sobrecarga

        Usuario usuario1 = new Usuario("Wilkin Matos", "U-101");

        System.out.println("=== ESTADO INICIAL DE LOS LIBROS ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println();

        System.out.println("=== PROCESANDO PRESTAMOS ===");
        Prestamo p1 = new Prestamo(usuario1, libro1);
        p1.registrarPrestamo();

        Prestamo p2 = new Prestamo(usuario1, libro1);
        p2.registrarPrestamo();

        usuario1.mostrarLibros();

        System.out.println("\n=== PROCESANDO DEVOLUCION ===");
        p1.registrarDevolucion();

        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Disponibilidad de " + libro1.getTitulo() + ": " + libro1.consultarDisponibilidad());
        usuario1.mostrarLibros();
    }
}