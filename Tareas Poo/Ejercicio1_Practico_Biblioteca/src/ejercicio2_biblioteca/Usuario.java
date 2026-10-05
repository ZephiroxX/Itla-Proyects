
package ejercicio2_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String idUsuario;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    public Usuario(String nombre) {
        this(nombre, "PENDIENTE");
    }

    public boolean prestarLibro(Libro libro) {
        if (!libro.consultarDisponibilidad()) {
            System.out.println("No se pudo prestar: El libro '" + libro.getTitulo() + "' no esta disponible.");
            return false;
        }

        libro.marcarComoPrestado();
        librosPrestados.add(libro);
        System.out.println(" Libro '" + libro.getTitulo() + "' prestado exitosamente a " + nombre + ".");
        return true;
    }

    public boolean devolverLibro(Libro libro) {
        if (!librosPrestados.contains(libro)) {
            System.out.println("El usuario " + nombre + " no tiene registrado el libro '" + libro.getTitulo() + "'.");
            return false;
        }

        libro.marcarComoDevuelto();
        librosPrestados.remove(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' devuelto con exito por " + nombre + ".");
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void mostrarLibros() {
        System.out.println("\n--- Libros prestados a " + nombre + " ---");
        if (librosPrestados.isEmpty()) {
            System.out.println("(Ningun libro en posesion)");
        } else {
            for (Libro l : librosPrestados) {
                System.out.println("- " + l.getTitulo());
            }
        }
    }
}