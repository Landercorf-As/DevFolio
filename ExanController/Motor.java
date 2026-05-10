
import java.util.Scanner;

public class Motor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estado estado = new Estado(10, 0, "neutro");
        int nodoActualR = 1;

        while (estado.tiempo > 0 && nodoActualR != -1) {

            Nodo nodo = new Nodo(nodoActualR);
            nodoActualR = nodo.ejecutar(estado, sc);
        }

        // Resultado final
        if (estado.progreso >= 5 && estado.estado.equals("organizado")) {
            System.out.println("Buen resultado");
        } else if (estado.progreso > 0) {
            System.out.println("Resultado medio");
        } else {
            System.out.println("Mal resultado");
        }

        sc.close();
    }
}
