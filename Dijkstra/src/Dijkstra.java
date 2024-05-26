import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
    private int[] distancias;
    private int nodoInicio;
    private int[][] matrizCostos;

    public Dijkstra(int nodoInicio, int[][] matrizCostos) {
        this.matrizCostos = matrizCostos;
        this.distancias = new int[matrizCostos.length];
        this.nodoInicio = nodoInicio;
    }

    public void calcularDistanciasMinimas() {
        Arrays.fill(distancias, Main.inf);
        distancias[nodoInicio] = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(i -> distancias[i]));
        priorityQueue.add(nodoInicio);

        while (!priorityQueue.isEmpty()) {
            int node = priorityQueue.poll();
            for (int i = 0; i < matrizCostos.length; i++) {
                if (matrizCostos[node][i] != 0) {
                    int newDistance = distancias[node] + matrizCostos[node][i];
                    if (newDistance < distancias[i]) {
                        distancias[i] = newDistance;
                        priorityQueue.add(i);
                    }
                }
            }
        }
    }

    public void mostrarDistancias() {
        for (int i = 1; i < matrizCostos.length; i++) {
            System.out.println("La distancia mas corta desde el nodo " + nodoInicio + " al nodo " + i
                             + " es: " + distancias[i]);
        }
    }
}
