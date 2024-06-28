import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {
    private final Map<String, List<String>> matrizDeAdyacencia;

    public Grafo() {
        matrizDeAdyacencia = new HashMap<>();
    }

    public void agregarVertice(String vertice) {
        matrizDeAdyacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    public void agregarArista(String vertice1, String vertice2) {
        matrizDeAdyacencia.get(vertice1).add(vertice2);
        matrizDeAdyacencia.get(vertice2).add(vertice1);
    }

    public List<String> obtenerVertices() {
        return new ArrayList<>(matrizDeAdyacencia.keySet());
    }

    public List<String> obtenerVecinos(String vertice) {
        return matrizDeAdyacencia.get(vertice);
    }

    public int obtenerGrado(String vertice) {
        return matrizDeAdyacencia.get(vertice).size();
    }

    public void removerVertice(String vertice) {
        matrizDeAdyacencia.remove(vertice);
        for (List<String> vecinos : matrizDeAdyacencia.values()) {
            vecinos.remove(vertice);
        }
    }
}