import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
    public static void calcularDistanciasMinimas(int[][] matrizD, int inicio, int inf) {
        int n = matrizD.length;
        int[] distancias = new int[n];
        Arrays.fill(distancias, inf);
        distancias[inicio] = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(i -> distancias[i]));
        priorityQueue.add(inicio);

        while (!priorityQueue.isEmpty()) {
            int node = priorityQueue.poll();
            for (int i = 0; i < n; i++) {
                if (matrizD[node][i] != 0) {
                    int newDistance = distancias[node] + matrizD[node][i];
                    if (newDistance < distancias[i]) {
                        distancias[i] = newDistance;
                        priorityQueue.add(i);
                    }
                }
            }
        }

        // Muestra la menor distancia entre el nodo inicial y los demas nodos
        for (int i = 0; i < n; i++) {
            System.out.println("Shortest distance from node " + inicio + " to node " + i + " is: " + distancias[i]);
        }
    }
}
