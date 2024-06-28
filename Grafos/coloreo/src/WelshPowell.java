import java.util.*;

public class WelshPowell {
    public static ResultadoColoreo welshPowell(GrafoColoreo grafoColoreo) {
        List<String> vertices = grafoColoreo.obtenerVertices();

        // Hacemos un shuffle (mezcla) de los vertices para que el resultado no sea siempre el mismo
        Collections.shuffle(vertices);

        // Mezclamos los vertices segun su grado en orden descendente
        vertices.sort((v1, v2) -> Integer.compare(grafoColoreo.obtenerGrado(v2), grafoColoreo.obtenerGrado(v1)));

        Map<String, Integer> colorMap = new HashMap<>();
        Map<Integer, List<String>> verticesPorColor = new HashMap<>();
        int colorActual = 0;

        for (String vertex : vertices) {
            if (!colorMap.containsKey(vertex)) {
                colorActual++;
                colorMap.put(vertex, colorActual);

                if (!verticesPorColor.containsKey(colorActual)) {
                    verticesPorColor.put(colorActual, new ArrayList<>());
                }
                verticesPorColor.get(colorActual).add(vertex);

                for (String v : vertices) {
                    if (!colorMap.containsKey(v)) {
                        boolean puedeUsarColor = true;
                        for (String vecino : grafoColoreo.obtenerVecinos(v)) {
                            if (colorMap.getOrDefault(vecino, -1) == colorActual) {
                                puedeUsarColor = false;
                                break;
                            }
                        }
                        if (puedeUsarColor) {
                            colorMap.put(v, colorActual);
                            verticesPorColor.get(colorActual).add(v);
                        }
                    }
                }
            }
        }

        Map<Integer, Integer> contadorColorMap = new HashMap<>();
        for (int col : colorMap.values()) {
            contadorColorMap.put(col, contadorColorMap.getOrDefault(col, 0) + 1);
        }

        return new ResultadoColoreo(colorActual, contadorColorMap, verticesPorColor);
    }
}