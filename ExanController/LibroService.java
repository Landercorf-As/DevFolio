
import java.util.ArrayList;

class LibroService {

    private ArrayList<Libro> libros;

    public LibroService() {
        libros = new ArrayList<>();
    }

    // Agregar libros
    public void agregarLibros(Libro libro) {
        libros.add(libro);
    }

    // Mostrar libros
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.titulo + "-" + libro.autor);
        }
    }

    // busrcar por titulo
    public Libro buscarTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(titulo)) {
                libros.remove(libro);
                return libro;
            }
        }
        return null;
    }

    // eliminar por titulo
    public boolean eliminarTitulo(String titulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).titulo.equals(titulo)) {
                libros.remove(i);
            }
        }
        return false;
    }

    // obtener libros mas largos
    public Libro libroMasLargo() {
        if (libros.isEmpty()) {
            return null;
        }

        Libro mayor = libros.get(0);

        for (Libro libro : libros) {
            if (libro.paginas > mayor.paginas) {
                mayor = libro;
            }
        }
        return mayor;
    }
}
