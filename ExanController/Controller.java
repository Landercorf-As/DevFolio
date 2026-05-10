
class Controller {

    public static void main(String[] args) {

        LibroService controlle = new LibroService();

        controlle.agregarLibro(new Libro("Spirit", "altoro", 89));
        controlle.agregarLibro(new Libro("Sinval", "benjamuis", 63));
        controlle.agregarLibro(new Libro("runnig", "corrintaru", 1233));
        controlle.agregarLibro(new Libro("themost", "alverto oliva", 203));

        controlle.mostrarLibros();

        Libro encontrado = controlle.buscarTitulo("Spirit");
        if (encontrado != null) {
            System.out.println("Encontrar: " + encontrado.titulo);
        }

        controlle.eliminarTitulo("El principito");

        Libro mayor = controlle.libroMasLargo();
        if (mayor != null) {
            System.out.println("Mas largo: " + mayor.titulo);
        }
    }
}
