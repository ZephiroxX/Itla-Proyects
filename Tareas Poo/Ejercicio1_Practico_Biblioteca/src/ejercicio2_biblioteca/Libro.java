
package ejercicio2_biblioteca;


public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public Libro(String titulo, String autor) {
        this(titulo, autor, "S/N");
    }

    public boolean consultarDisponibilidad() {
        return disponible;
    }

    public void marcarComoPrestado() {
        this.disponible = false;
    }

    public void marcarComoDevuelto() {
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "'" + titulo + "' de " + autor + " [ISBN: " + isbn + "] - " + (disponible ? "Disponible" : "Prestado");
    }
}