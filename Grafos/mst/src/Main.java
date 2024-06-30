import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear el grafo
        GrafoMST grafo = new GrafoMST();

        // Agregar vértices
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");

        // Agregar aristas con peso
        grafo.agregarArista("A", "B", 4);
        grafo.agregarArista("A", "C", 2);
        grafo.agregarArista("B", "C", 1);
        grafo.agregarArista("B", "D", 5);
        grafo.agregarArista("C", "D", 8);
        grafo.agregarArista("C", "E", 10);
        grafo.agregarArista("D", "E", 2);

        // Algoritmo de Prim
        List<Arista> mstPrim = AlgoritmoPrim.prim(grafo, "A");
        System.out.println("Árbol de expansión mínima (MST) utilizando Prim:");
        for (Arista arista : mstPrim) {
            System.out.println(arista.vertice1 + " - " + arista.vertice2 + " : " + arista.peso);
        }

        // Algoritmo de Kruskal
        List<Arista> mstKruskal = AlgoritmoKruskal.kruskal(grafo);
        System.out.println("\nÁrbol de expansión mínima (MST) utilizando Kruskal:");
        for (Arista arista : mstKruskal) {
            System.out.println(arista.vertice1 + " - " + arista.vertice2 + " : " + arista.peso);
        }
    }
}
