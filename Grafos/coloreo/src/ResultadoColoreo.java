import java.util.List;
import java.util.Map;

public class ResultadoColoreo {
    private int numColores;
    private Map<Integer, Integer> contadorColores;
    private Map<Integer, List<String>> verticesPorColor;

    public ResultadoColoreo(int numColores, Map<Integer, Integer> contadorColores, Map<Integer, List<String>> verticesPorColor) {
        this.numColores = numColores;
        this.contadorColores = contadorColores;
        this.verticesPorColor = verticesPorColor;
    }

    public int getNumColores() {
        return numColores;
    }

    public Map<Integer, Integer> getContadorColores() {
        return contadorColores;
    }

    public Map<Integer, List<String>> getVerticesPorColor() {
        return verticesPorColor;
    }
}