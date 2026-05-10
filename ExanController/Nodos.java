
import java.util.Scanner;
import java.lang.reflect.Field;

class Nodos {

    int id;
    int cantidad = 3;

    public Nodos(int id) {
        this.id = id;
    }

    public int ejecutar(Estados estados, Estados intentosRepetidos, Scanner sc) {

        if (id == 1) {
            System.out.println("Tienes tareas pendientes.");
            System.out.println("A: Quemar todas las tareas");
            System.out.println("B: Emezar de manera desordenada");
            System.out.println("E: Terminar las tareas");

            String decision = sc.nextLine();

            if (decision.equalsIgnoreCase("E")) {
                setEstado(estados, "Organizado");
                modificarEntero(estados, "tiempo", -2);
                decrementoIntentosrepetidos(2);
                return 2;
            } else {
                setEstado(estados, "Caotico");
                modificarEntero(estados, "tiempo", -1);
                decrementoIntentosrepetidos(1);
                return 3;
            }
        }

        if (id == 2) {

            System.out.println("Estas organizado");
            System.out.println("A: Tarea importante");
            System.out.println("B: Tarea rapida");
            System.out.println("E: No hacer bada");

            String decision = sc.nextLine();

            if (decision.equalsIgnoreCase("A") || decision.equalsIgnoreCase("B") || decision.equalsIgnoreCase("E")) {
                setEstado(estados, "Eatas en Caos");
                modificarEntero(estados, "tiempo", -1);
                decrementoIntentosrepetidos(3);
            }
            return 4;
        }

        if (id == 3) {
            System.out.println("Estas en caos");
            System.out.println("A: Reorganizar");
            System.out.println("B: Seguir asi");
            System.out.println("E: Desatruir adsolutamente todo");

            String decision = sc.nextLine();

            if (decision.equalsIgnoreCase("A")) {
                setEstado(estados, "organizado");
                modificarEntero(estados, "tiempo", -2);
            } else {
                modificarEntero(estados, "progreso", -1);
                modificarEntero(estados, "tiempo", -2);
            }

            return 4;
        }
        return -1;
    }

    private void decrementoIntentosrepetidos(int amount) {
        cantidad -= amount;
    }

    private void setEstado(Estados estados, String nuevoEstado) {
        setField(estados, "estado", nuevoEstado);
    }

    private void modificarEntero(Estados estados, String nombreCampo, int delta) {
        try {
            Field field = estados.getClass().getDeclaredField(nombreCampo);
            field.setAccessible(true);
            int valorActual = field.getInt(estados);
            field.setInt(estados, valorActual + delta);
        } catch (ReflectiveOperationException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void setField(Estados estados, String nombreCampo, Object valor) {
        try {
            Field field = estados.getClass().getDeclaredField(nombreCampo);
            field.setAccessible(true);
            field.set(estados, valor);
        } catch (ReflectiveOperationException ex) {
            throw new RuntimeException(ex);
        }
    }
}
