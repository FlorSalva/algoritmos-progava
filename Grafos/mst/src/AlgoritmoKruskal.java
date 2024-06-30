import java.util.*;

public class AlgoritmoKruskal {
    private static class UnionFind {
        private final Map<String, String> padre;
        private final Map<String, Integer> rango;

        public UnionFind(List<String> vertices) {
            padre = new HashMap<>();
            rango = new HashMap<>();
            for (String vertice : vertices) {
                padre.put(vertice, vertice);
                rango.put(vertice, 0);
            }
        }

        public String find(String vertice) {
            if (!padre.get(vertice).equals(vertice)) {
                padre.put(vertice, find(padre.get(vertice)));
            }
            return padre.get(vertice);
        }

        public void union(String vertice1, String vertice2) {
            String raiz1 = find(vertice1);
            String raiz2 = find(vertice2);

            if (!raiz1.equals(raiz2)) {
                if (rango.get(raiz1) > rango.get(raiz2)) {
                    padre.put(raiz2, raiz1);
                } else if (rango.get(raiz1) < rango.get(raiz2)) {
                    padre.put(raiz1, raiz2);
                } else {
                    padre.put(raiz2, raiz1);
                    rango.put(raiz1, rango.get(raiz1) + 1);
                }
            }
        }
    }

    public static List<Arista> kruskal(GrafoMST grafo) {
        List<Arista> aristas = new ArrayList<>();
        List<String> vertices = grafo.obtenerVertices();

        for (String vertice : vertices) {
            for (Arista arista : grafo.obtenerVecinos(vertice)) {
                if (vertice.compareTo(arista.vertice2) < 0) {
                    aristas.add(arista);
                }
            }
        }

        Collections.sort(aristas);
        UnionFind unionFind = new UnionFind(vertices);
        List<Arista> mst = new ArrayList<>();

        for (Arista arista : aristas) {
            if (unionFind.find(arista.vertice1).equals(unionFind.find(arista.vertice2))) {
                continue;
            }

            mst.add(arista);
            unionFind.union(arista.vertice1, arista.vertice2);
        }

        return mst;
    }
}
