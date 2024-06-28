public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");
        grafo.agregarVertice("F");
        grafo.agregarVertice("G");
        grafo.agregarVertice("H");
        grafo.agregarVertice("I");
        grafo.agregarVertice("J");

        grafo.agregarArista("A", "B");
        grafo.agregarArista("A", "F");
        grafo.agregarArista("B", "E");
        grafo.agregarArista("C", "F");
        grafo.agregarArista("C", "G");
        grafo.agregarArista("D", "E");
        grafo.agregarArista("D", "H");
        grafo.agregarArista("E", "I");
        grafo.agregarArista("F", "G");
        grafo.agregarArista("F", "J");
        grafo.agregarArista("G", "J");
        grafo.agregarArista("H", "I");
        grafo.agregarArista("I", "J");

        ResultadoColoreo welshPowellResultado = WelshPowell.welshPowell(grafo);
        System.out.println("Welsh-Powell cantidad de colores usados: " + welshPowellResultado.getNumColores());
        System.out.println("Welsh-Powell cantidad de nodos de cada color: " + welshPowellResultado.getContadorColores());
        System.out.println("Welsh-Powell vertices en cada color: " + welshPowellResultado.getVerticesPorColor());

        ResultadoColoreo matulaResultado = Matula.matula(grafo);
        System.out.println("Matula cantidad de colores usados: " + matulaResultado.getNumColores());
        System.out.println("Matula cantidad de nodos de cada color: " + matulaResultado.getContadorColores());
        System.out.println("Matula vertices en cada color: " + matulaResultado.getVerticesPorColor());
    }
}