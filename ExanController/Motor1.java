
import java.util.Scanner;

public class Motor1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estado estado = new Estado(10, 0, "neutro");

        RegistroNodos registro = new RegistroNodos();

        int nodoActual = 1;

        while (estado.tiempo > 0 && nodoActual != -1) {

            Nodo nodo = registro.obtenerNodo(nodoActual);

            if (nodo == null) {
                System.out.println("Nodo no encontrado");
                break;
            }

            nodoActual = nodo.ejecutar(estado, sc);
        }

        System.out.println("Fin del escenario");
        sc.close();
    }
}
