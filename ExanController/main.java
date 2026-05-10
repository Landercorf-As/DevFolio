
class Main {

    public static void main(String[] args) {

        LibroController controller = new LibroController();

        controller.crearLibro("Spirit", "altoro", 829);
        controller.crearLibro("vanguardias", "altoro", 189);
        controller.crearLibro("conguest", "altoro", 849);
        controller.crearLibro("El principito", "altoro", 1889);

        controller.listarLibros();

        controller.buscarLibro("1984");

        controller.eliminarLibro("El principito");

        controller.mostrarLibroMasLargo();
    }
}
