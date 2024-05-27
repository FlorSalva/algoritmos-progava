public class FloydWarshall {
    private int[][] matDist;
    private int tamMat;

    public FloydWarshall(int[][] matDist) {
        this.matDist = matDist;
        this.tamMat = matDist.length;
    }

    public void calcularCostoMinimo() {
        for (int k = 0; k < tamMat; k++) {
            for (int i = 0; i < tamMat; i++) {
                for (int j = 0; j < tamMat; j++) {
                    int costoMin = matDist[i][k] + matDist[k][j];
                    // Actualizamos la matDistancia matDist[i][j] si el camino pasando por k es mas corto
                    if (costoMin < matDist[i][j]) {
                        matDist[i][j] = costoMin;
                    }
                }
            }
        }
    }

    void mostrarMatrizSolucion() {
        System.out.println("La matriz de matDistancias mas cortas entre cada par de vertices:");
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
