public class Arista implements Comparable<Arista> {
    String vertice1;
    String vertice2;
    int peso;

    public Arista(String vertice1, String vertice2, int peso) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.peso = peso;
    }

    @Override
    public int compareTo(Arista otraArista) {
        return Integer.compare(this.peso, otraArista.peso);
    }
}
