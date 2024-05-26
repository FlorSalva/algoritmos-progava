public class Main {
    public static Integer inf = 999;
    public static void main(String[] args) {
        int[][] matrizDistancias = {
                {inf, 10, inf, 30, 100},
                {inf, inf, 50, inf, inf},
                {inf, inf, inf, inf, 10},
                {inf, inf, 20, inf, 60},
                {inf, inf, inf, inf, inf}
        };
        int nodoInicial = 0;

        Dijkstra dijkstra = new Dijkstra(nodoInicial, matrizDistancias);
        dijkstra.calcularDistanciasMinimas();
        dijkstra.mostrarDistancias();
    }
}