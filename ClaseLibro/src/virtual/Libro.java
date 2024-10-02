package virtual;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private int cantidadCopiasDisponibles;

    // Constructor para inicializar un libro con todos los atributos
    public Libro(String isbn, String titulo, String autor, String editorial, int anioPublicacion, int cantidadCopiasDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.cantidadCopiasDisponibles = cantidadCopiasDisponibles;
    }

    // Métodos para prestar, devolver, consultar disponibilidad, etc.
    public boolean prestarLibro() {
        if (cantidadCopiasDisponibles > 0) {
            cantidadCopiasDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    public void devolverLibro() {
        cantidadCopiasDisponibles++;
    }

    public boolean hayCopiasDisponibles() {
        return cantidadCopiasDisponibles > 0;
    }
}
