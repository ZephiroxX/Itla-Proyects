
package ejercicio2_biblioteca;


import java.time.LocalDate;

public class Prestamo {
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fecha) {
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = fecha;
    }

    public Prestamo(Usuario usuario, Libro libro) {
        this(usuario, libro, LocalDate.now());
    }

    public void registrarPrestamo() {
        usuario.prestarLibro(libro);
    }

    public void registrarDevolucion() {
        usuario.devolverLibro(libro);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    
    public String toString() {
        return "Prestamo [" + fecha + "] -> Usuario: " + usuario.getNombre() + " | Libro: " + libro.getTitulo();
    }
}