public class Main {
    private static Integer inf = 999;
    public static void main(String[] args) {
        int[][] matrizDistancias = {
                {inf, 10, inf, 30, 200},
                {inf, inf, 50, inf, inf},
                {inf, inf, inf, inf, 10},
                {inf, inf, 20, inf, 60},
                {inf, inf, inf, inf, inf}
        };

        Dijkstra.calcularDistanciasMinimas(matrizDistancias, 0, inf);
    }
}