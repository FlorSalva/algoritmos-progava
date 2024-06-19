import java.util.*;

public class Matula {
    public static ResultadoColoreo matula(Grafo grafo) {
        List<String> vertices = new ArrayList<>();
        Grafo tempGrafo = new Grafo();

        for (String vertice : grafo.obtenerVertices()) {
            tempGrafo.agregarVertice(vertice);
        }
        for (String vertice : grafo.obtenerVertices()) {
            for (String vecino : grafo.obtenerVecinos(vertice)) {
                tempGrafo.agregarArista(vertice, vecino);
            }
        }

        while (!tempGrafo.obtenerVertices().isEmpty()) {
            String verticeMenorGrado = null;
            int menorGrado = Integer.MAX_VALUE;

            for (String vertice : tempGrafo.obtenerVertices()) {
                int grado = tempGrafo.obtenerGrado(vertice);
                if (grado < menorGrado) {
                    menorGrado = grado;
                    verticeMenorGrado = vertice;
                }
            }

            if (verticeMenorGrado != null) {
                vertices.add(verticeMenorGrado);
                tempGrafo.removerVertice(verticeMenorGrado);
            }
        }

        Collections.reverse(vertices);

        Map<String, Integer> color = new HashMap<>();
        Map<Integer, List<String>> verticesPorColor = new HashMap<>();
        int colorActual = 0;

        for (String vertice : vertices) {
            Set<Integer> coloresUsadosSet = new HashSet<>();
            for (String vecino : grafo.obtenerVecinos(vertice)) {
                if (color.containsKey(vecino)) {
                    coloresUsadosSet.add(color.get(vecino));
                }
            }

            int colorAUsar = 1;
            while (coloresUsadosSet.contains(colorAUsar)) {
                colorAUsar++;
            }

            color.put(vertice, colorAUsar);

            if (!verticesPorColor.containsKey(colorAUsar)) {
                verticesPorColor.put(colorAUsar, new ArrayList<>());
            }
            verticesPorColor.get(colorAUsar).add(vertice);

            colorActual = Math.max(colorActual, colorAUsar);
        }

        Map<Integer, Integer> contadorColoresMap = new HashMap<>();
        for (int col : color.values()) {
            contadorColoresMap.put(col, contadorColoresMap.getOrDefault(col, 0) + 1);
        }

        return new ResultadoColoreo(colorActual, contadorColoresMap, verticesPorColor);
    }

}
