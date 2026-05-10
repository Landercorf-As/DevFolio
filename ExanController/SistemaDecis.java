
import java.util.Scanner;

public class SistemaDecis {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int tiempo = 10;
            int nodoActual = 1;
            int progreso = 0;
            String estado = "neutro";
            String decision;

            while (tiempo > 0) {
                switch (nodoActual) {
                    case 1 -> {

                        System.out.println("");
                        System.out.println("");
                        System.out.println("");

                        decision = sc.nextLine();

                        if (decision.equalsIgnoreCase("A")) {
                            estado = "organizado";
                            nodoActual = 2;
                            tiempo -= 2;
                        } else {
                            estado = "caotico";
                            nodoActual = 3;
                            tiempo -= 1;
                        }
                    }
                    case 2 -> {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");

                        decision = sc.nextLine();

                        if (decision.equalsIgnoreCase("A")) {
                            progreso += 5;
                            tiempo -= 3;
                        } else {
                            progreso += 2;
                            tiempo -= 1;
                        }
                        nodoActual = 4;
                    }
                    case 3 -> {
                        System.out.println("Estas en caos, elige:");
                        System.out.println("A: Reorganizar");
                        System.out.println("B: Seguir asi");

                        decision = sc.nextLine();

                        if (decision.equalsIgnoreCase("A")) {
                            estado = "caotico";
                            tiempo -= 2;
                        } else {
                            estado = "caotico";
                            progreso -= 1;
                            tiempo -= 2;
                            nodoActual = 4;
                        }
                    }

                    case 4 -> {
                        break;
                    }
                    default -> {
                    }
                }
            }

            if (progreso >= 5 && estado.equals("organizado")) {
                System.out.println("buen resultado");
            } else if (progreso > 0) {
                System.out.println("Resultado medio");
            } else {
                System.out.println("Mal resultado");
            }
            sc.close();
        }
    }
}
