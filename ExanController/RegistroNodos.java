
import java.util.HashMap;
import java.util.Map;

class RegistroNodos {

    private Map<Integer, Nodo> nodos = new HashMap<>();

    public RegistroNodos() {
        nodos.put(1, new NodoInicio());
        nodos.put(2, new NodoOrganizado());
        nodos.put(3, new NodoCaotico());
    }

    public Nodo obtenerNodo(int id) {
        return nodos.get(id);
    }
}
