
import java.util.Scanner;

class Nodo {

    int id;

    public Nodo(int id) {
        this.id = id;
    }

    public int ejecutar(Estado estado, Scanner sc) {

        if (id == 1) {
            System.out.println("Tienes varias tareas pendientes.");
            System.out.println("A: Organizar tareas");
            System.out.println("B: Empezar sin plan");

            String decision = sc.nextLine();

            if (decision.equalsIgnoreCase("A")) {
                estado.estado = "organizado";
                estado.tiempo -= 2;
                return 2;
            } else {
                estado.estado = "caotico";
                estado.tiempo -= 1;
                return 3;
            }
        }

        if (id == 2) {
            System.out.println("Estas organizado");
            System.out.println("A: Tarea importante");
            System.out.println("B: Tarea rapida");

            String decision = sc.nextLine();

            if (decision.equalsIgnoreCase("A")) {
                estado.progreso += 5;
                estado.tiempo -= 3;
            } else {
                estado.progreso += 2;
                estado.tiempo -= 1;
            }

            return 4;
        }

        if (id == 3) {
            System.out.println("Estas en caos");
            System.out.println("A: Reorganizar");
            System.out.println("B: Seguir asi");

            String decision = sc.nextLine();

            if (decision.equalsIgnoreCase("A")) {
                estado.estado = "organizado";
                estado.tiempo -= 2;
            } else {
                estado.progreso -= 1;
                estado.tiempo -= 2;
            }

            return 4;
        }

        return -1;
    }
}
