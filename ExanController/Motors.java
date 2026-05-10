
import java.util.Scanner;

public class Motors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estados estado = new Estados(10, 0, 0, "hola"); //Recordar los parametros de la clase se definen corrctamente ->
        Estados intentosRepetidos = new Estados(3, 0, 0, ""); // ejemplo <-
        int progreso = 1;

        while (progreso != -1) {
            Nodos nodos = new Nodos(progreso);
            progreso = nodos.ejecutar(estado, intentosRepetidos, sc);
        }

        if (estado.getProgreso() >= 5 && estado.getEstado().equals("Organizado")) {
            System.out.println("Buen resultado");
        } else if (estado.getProgreso() > 0) {
            System.out.println("Resultado medio");
        } else {
            System.err.println("Mal resultado");
        }

        System.out.println("Proceso finalizado. Estado: " + estado.getEstado() + ", Progreso: " + estado.getProgreso());

        sc.close();
    }
}
