public class Main {
    final static int INF = 99999;
    public static void main(String[] args) {
        int matGrafos[][] = {
                {0, 8, 5},
                {3, 0, INF},
                {INF, 2, 0},
        };
        FloydWarshall fw = new FloydWarshall(matGrafos, matGrafos.length);
        fw.calcularCostoMinimo();
        fw.mostrarMatrizSolucion();
    }
}