public class FloydWarshall {
    private int[][] matDist;
    private int tamMat;

    public FloydWarshall(int[][] matDist, int tamMat) {
        this.matDist = matDist;
        this.tamMat = tamMat;
    }

    public void calcularCostoMinimo() {
        for (int k = 0; k < tamMat; k++) {
            for (int i = 0; i < tamMat; i++) {
                for (int j = 0; j < tamMat; j++) {
                    // Actualizamos la matDistancia matDist[i][j] si el camino pasando por k es más corto
                    if (matDist[i][k] + matDist[k][j] < matDist[i][j]) {
                        matDist[i][j] = matDist[i][k] + matDist[k][j];
                    }
                }
            }
        }
    }

    void mostrarMatrizSolucion() {
        System.out.println("La matriz de matDistancias más cortas entre cada par de vértices:");
        for (int i = 0; i < tamMat; i++) {
            for (int j = 0; j < tamMat; j++) {
                if (matDist[i][j] == Main.INF)
                    System.out.print("INF ");
                else
                    System.out.print(matDist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
