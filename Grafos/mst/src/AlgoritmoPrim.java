import java.util.*;

public class AlgoritmoPrim {
    public static List<Arista> prim(GrafoMST grafo, String inicio) {
        PriorityQueue<Arista> colaPrioridad = new PriorityQueue<>();
        Set<String> verticesVisitados = new HashSet<>();
        List<Arista> mst = new ArrayList<>();

        verticesVisitados.add(inicio);
        colaPrioridad.addAll(grafo.obtenerVecinos(inicio));

        while (!colaPrioridad.isEmpty() && verticesVisitados.size() < grafo.obtenerVertices().size()) {
            Arista aristaMin = colaPrioridad.poll();
            assert aristaMin != null;
            if (verticesVisitados.contains(aristaMin.vertice1) && verticesVisitados.contains(aristaMin.vertice2)) {
                continue;
            }

            mst.add(aristaMin);
            String nuevoVertice = verticesVisitados.contains(aristaMin.vertice1) ? aristaMin.vertice2 : aristaMin.vertice1;
            verticesVisitados.add(nuevoVertice);

            for (Arista arista : grafo.obtenerVecinos(nuevoVertice)) {
                if (!verticesVisitados.contains(arista.vertice2)) {
                    colaPrioridad.add(arista);
                }
            }
        }

        return mst;
    }
}
