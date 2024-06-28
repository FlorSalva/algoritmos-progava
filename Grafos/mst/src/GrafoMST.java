import java.util.*;

public class GrafoMST {
    private final Map<String, List<Arista>> matrizDeAdyacencia;

    public GrafoMST() {
        matrizDeAdyacencia = new HashMap<>();
    }

    public void agregarVertice(String vertice) {
        matrizDeAdyacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    public void agregarArista(String vertice1, String vertice2, int peso) {
        matrizDeAdyacencia.get(vertice1).add(new Arista(vertice1, vertice2, peso));
        matrizDeAdyacencia.get(vertice2).add(new Arista(vertice2, vertice1, peso));
    }

    public List<String> obtenerVertices() {
        return new ArrayList<>(matrizDeAdyacencia.keySet());
    }

    public List<Arista> obtenerVecinos(String vertice) {
        return matrizDeAdyacencia.get(vertice);
    }
}
